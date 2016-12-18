package link1234gamer.fnafmod.common.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import link1234gamer.fnafmod.FNAFMod;
import link1234gamer.fnafmod.common.tileentity.TileEntityGuitarStand;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class BlockGuitarStand extends BlockContainer{

	public BlockGuitarStand()
    {
        super(Material.iron);
        this.setCreativeTab(FNAFMod.tabFNAF);
        this.setBlockBounds(0.25F, 0.0F, 0.25F, 1.0F, 2.5F, 0.80F);
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
		TileEntityGuitarStand tile = (TileEntityGuitarStand)world.getTileEntity(x, y, z);
	}
	
    public TileEntity createNewTileEntity(World world, int metadata)
	{
		return new TileEntityGuitarStand();
	}
    
    @Override
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(FNAFMod.MODID + ":" + getUnlocalizedName().substring(5));
    }
}
