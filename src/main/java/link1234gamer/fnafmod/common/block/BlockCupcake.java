package link1234gamer.fnafmod.common.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import link1234gamer.fnafmod.FNAFMod;
import link1234gamer.fnafmod.common.tileentity.TileEntityCupcake;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class BlockCupcake extends BlockContainer{

	public BlockCupcake()
    {
        super(Material.cake);
        this.setCreativeTab(FNAFMod.tabFNAF);
        this.setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public int getRenderType()
    {
        return -1;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean hasTileEntity()
    {
        return true;
    }
    
    public void onBlockClicked(World p_149699_1_, int p_149699_2_, int p_149699_3_, int p_149699_4_, EntityPlayer p_149699_5_)
    {
        this.func_150036_b(p_149699_1_, p_149699_2_, p_149699_3_, p_149699_4_, p_149699_5_);
    }

    private void func_150036_b(World p_150036_1_, int p_150036_2_, int p_150036_3_, int p_150036_4_, EntityPlayer p_150036_5_)
    {
        if (p_150036_5_.canEat(false))
        {
            p_150036_5_.getFoodStats().addStats(2, 0.1F);
            int l = p_150036_1_.getBlockMetadata(p_150036_2_, p_150036_3_, p_150036_4_) + 1;

            if (l >= 6)
            {
                p_150036_1_.setBlockToAir(p_150036_2_, p_150036_3_, p_150036_4_);
            }
            else
            {
                p_150036_1_.setBlockMetadataWithNotify(p_150036_2_, p_150036_3_, p_150036_4_, l, 2);
            }
        }
    }
    
    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block)
    {
    	
    }

	public void onBlockAdded(World world, int x, int y, int z)
	{
		super.onBlockAdded(world, x, y, z);
	}
	
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemstack)
	{
		int rotation = MathHelper.floor_double((double)((entity.rotationYaw * 4F) / 360F) + 2.5D) & 3;
		world.setBlockMetadataWithNotify(x, y, z, rotation, 2);
	}

	public MovingObjectPosition collisionRayTrace(World world, int x, int y, int z, Vec3 p_149731_5_, Vec3 p_149731_6_)
	{
		float f = 0.0625F;
		
		return super.collisionRayTrace(world, x, y, z, p_149731_5_, p_149731_6_);
	}
	
	@SideOnly(Side.CLIENT)
	public void breakBlock(World world, int x, int y, int z, Block block, int metadata)
	{
		Minecraft mc = Minecraft.getMinecraft();
		TileEntityCupcake tile = (TileEntityCupcake)world.getTileEntity(x, y, z);
	}
	
    public TileEntity createNewTileEntity(World world, int metadata)
	{
		return new TileEntityCupcake();
	}
    
    @Override
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(FNAFMod.MODID + ":" + getUnlocalizedName().substring(5));
    }
}
