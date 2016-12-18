package link1234gamer.fnafmod.common.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import link1234gamer.fnafmod.FNAFMod;
import link1234gamer.fnafmod.common.tileentity.TileEntityCamera;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import static net.minecraftforge.common.util.ForgeDirection.EAST;
import static net.minecraftforge.common.util.ForgeDirection.NORTH;
import static net.minecraftforge.common.util.ForgeDirection.SOUTH;
import static net.minecraftforge.common.util.ForgeDirection.WEST;

public class BlockCamera extends BlockContainer{

	public BlockCamera()
    {
        super(Material.iron);
        this.setCreativeTab(FNAFMod.tabFNAF);
//      this.setBlockBounds(0.275F, 0.250F, 0.000F, 0.700F, 0.800F, 0.850F);
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
	public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side)
	{
		return false;
	}
	
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4){
		return null;
	}
	public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9){
        int k1 = par9 & 8;
        byte b0 = -1;

        if(par5 == 2 && par1World.isSideSolid(par2, par3, par4 + 1, NORTH)){
            b0 = 4;
        }

        if(par5 == 3 && par1World.isSideSolid(par2, par3, par4 - 1, SOUTH)){
            b0 = 3;
        }

        if(par5 == 4 && par1World.isSideSolid(par2 + 1, par3, par4, WEST)){
            b0 = 2;
        }

        if(par5 == 5 && par1World.isSideSolid(par2 - 1, par3, par4, EAST)){
            b0 = 1;
        }

        return b0 + k1;
    }

    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, Block par5Block) {    			
    	int metadata = par1World.getBlockMetadata(par2, par3, par4);
    	
    	if(metadata == 1) {
    		if(!par1World.isSideSolid(par2 - 1, par3, par4, EAST)) {
//    			BlockUtils.destroyBlock(par1World, par2, par3, par4, true);
	}
    	}else if(metadata == 2) {
    		if(!par1World.isSideSolid(par2 + 1, par3, par4, WEST)) {
 //   			BlockUtils.destroyBlock(par1World, par2, par3, par4, true);
    		}
  	}else if(metadata == 3) {
  		if(!par1World.isSideSolid(par2, par3, par4 - 1, SOUTH)) {
//    			BlockUtils.destroyBlock(par1World, par2, par3, par4, true);
    		}
    	}else if(metadata == 4) {
    		if(!par1World.isSideSolid(par2, par3, par4 + 1, NORTH)) {
//    			BlockUtils.destroyBlock(par1World, par2, par3, par4, true);
    		}
    	}
    }
	
    public boolean canPlaceBlockOnSide(World par1World, int par2, int par3, int par4, int par5){
		
        ForgeDirection dir = ForgeDirection.getOrientation(par5);
        return (dir == NORTH && par1World.isSideSolid(par2, par3, par4 + 1, NORTH)) ||
               (dir == SOUTH && par1World.isSideSolid(par2, par3, par4 - 1, SOUTH)) ||
               (dir == WEST  && par1World.isSideSolid(par2 + 1, par3, par4, WEST )) ||
               (dir == EAST  && par1World.isSideSolid(par2 - 1, par3, par4, EAST ));
    }

    public boolean canPlaceBlockAt(World world, int x, int y, int z)
    {
        return !world.getBlock(x, y, z).isReplaceable(world, x, y, z) ^ //exclusive or
        		(world.isSideSolid(x - 1, y, z, EAST) ||
        		world.isSideSolid(x + 1, y, z, WEST) ||
        		world.isSideSolid(x, y, z - 1, SOUTH) ||
        		world.isSideSolid(x, y, z + 1, NORTH));
    }
    
    public boolean canProvidePower() {
		return true;
	}

	
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int x, int y, int z){
		int meta = par1IBlockAccess.getBlockMetadata(x, y, z);

		if(meta == 3  || meta == 7){
			this.setBlockBounds(0.275F, 0.250F, 0.000F, 0.700F, 0.800F, 0.850F);
		}else if(meta == 4 || meta == 8){
			this.setBlockBounds(0.275F, 0.250F, 0.150F, 0.700F, 0.800F, 1.000F);
		}else if(meta == 2 || meta == 6){
			this.setBlockBounds(0.125F, 0.250F, 0.275F, 1.000F, 0.800F, 0.725F);
		}else{
			this.setBlockBounds(0.000F, 0.250F, 0.275F, 0.850F, 0.800F, 0.725F);
		}
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
		TileEntityCamera tile = (TileEntityCamera)world.getTileEntity(x, y, z);
	}
	
    public TileEntity createNewTileEntity(World world, int metadata)
	{
		return new TileEntityCamera();
	}
    
    @Override
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(FNAFMod.MODID + ":" + getUnlocalizedName().substring(5));
    }
}