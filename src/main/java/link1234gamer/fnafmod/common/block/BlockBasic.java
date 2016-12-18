package link1234gamer.fnafmod.common.block;

import java.util.Random;

import link1234gamer.fnafmod.FNAFMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class BlockBasic extends Block
{
    public BlockBasic(Material material)
    {
        super(material);
        this.setCreativeTab(FNAFMod.tabFNAF);
    }
    
    public Block setHarvestLvl(String tool, int level)
    {
    	this.setHarvestLevel(tool, level);
    	return this;
    }
    
    public Item getItemDropped(int p_149650_1_, Random rand, int p_149650_3_)
    {
        return Item.getItemFromBlock(this);
    }
    
    @Override
    public void registerBlockIcons(IIconRegister iconRegister)
    {
    	blockIcon = iconRegister.registerIcon(FNAFMod.MODID + ":" + getUnlocalizedName().substring(5));
    }
}