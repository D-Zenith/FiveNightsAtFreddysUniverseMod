package link1234gamer.fnafmod.common.block;

import java.util.Random;

import link1234gamer.fnafmod.FNAFMod;
import link1234gamer.fnafmod.common.tileentity.TileEntityArcadeMachineYellow;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockArcadeMachineYellow extends BlockContainer{

    public BlockArcadeMachineYellow()
    {
        super(Material.iron);
        float f = 0.0625F;
        this.setCreativeTab(FNAFMod.tabFNAF);
        setBlockBounds(f, 0.0F, f, f * 15, 1.0F, f * 15);
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
	
	public void onNeighborBlockChange(World world, int x, int y, int z, Block block)
    {
		int metadata = world.getBlockMetadata(x, y, z);
		
		if (metadata % 8 >= 4)
		{
			if (world.getBlock(x, y - 1, z) != FNAF_Blocks.Arcade_Machine_Yellow)
			{
				world.setBlockToAir(x, y, z);
			}
		}
		else
		{
			if (world.getBlock(x, y + 1, z) != FNAF_Blocks.Arcade_Machine_Yellow)
			{
				world.setBlockToAir(x, y, z);
			}
		}
    }
	
	public boolean canPlaceBlockAt(World world, int x, int y, int z)
    {
        return y >= world.getHeight() - 1 ? false : super.canPlaceBlockAt(world, x, y, z) && super.canPlaceBlockAt(world, x, y + 1, z);
    }
	
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemstack)
	{
		int rotation = MathHelper.floor_double((double)((entity.rotationYaw * 4F) / 360F) + 2.5D) & 3;
		int i = new Random().nextInt(4) * 8;
		
		world.setBlockMetadataWithNotify(x, y, z, rotation + i, 2);
		world.setBlock(x, y + 1, z, this);
		world.setBlockMetadataWithNotify(x, y + 1, z, rotation + 4 + i, 2);
	}
    
    public TileEntity createNewTileEntity(World world, int metadata)
	{
		return new TileEntityArcadeMachineYellow();
	}
    
    @Override
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(FNAFMod.MODID + ":" + getUnlocalizedName().substring(5));
    }
}
