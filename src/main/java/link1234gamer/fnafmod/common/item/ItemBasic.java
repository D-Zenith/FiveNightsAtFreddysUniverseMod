package link1234gamer.fnafmod.common.item;

import link1234gamer.fnafmod.FNAFMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemBasic extends Item
{
	public ItemBasic()
	{
		super();
		this.setCreativeTab(FNAFMod.tabFNAF);
	}
	
	public void registerIcons(IIconRegister par1IIconRegister)
	{
		itemIcon = par1IIconRegister.registerIcon(FNAFMod.MODID + ":" + getUnlocalizedName().substring(5));
	}
}