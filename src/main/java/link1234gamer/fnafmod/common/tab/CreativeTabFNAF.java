package link1234gamer.fnafmod.common.tab;

import link1234gamer.fnafmod.FNAFMod;
import link1234gamer.fnafmod.common.block.FNAF_Blocks;
import link1234gamer.fnafmod.common.item.FNAFItems;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabFNAF extends CreativeTabs
{
	public CreativeTabFNAF()
	{
		super(getNextID(), FNAFMod.MODID);
	}

	@Override
	public Item getTabIconItem() {
		return FNAFItems.tablet;
	}
	
}