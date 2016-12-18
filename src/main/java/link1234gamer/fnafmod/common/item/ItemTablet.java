package link1234gamer.fnafmod.common.item;

import link1234gamer.fnafmod.FNAFMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTablet extends Item {
	
	public ItemTablet()
	{
	this.setMaxDamage(512);
	this.setCreativeTab(FNAFMod.tabFNAF);
    }

public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
{
	return p_77659_1_;
}

public void registerIcons(IIconRegister par1IIconRegister)
{
	itemIcon = par1IIconRegister.registerIcon(FNAFMod.MODID + ":" + getUnlocalizedName().substring(5));
}
}
