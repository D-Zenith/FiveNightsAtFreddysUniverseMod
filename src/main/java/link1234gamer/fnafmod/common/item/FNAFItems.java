package link1234gamer.fnafmod.common.item;

import net.minecraft.item.Item;

public class FNAFItems
{
	public static Item tablet;
	
	public static void load()
	{
		tablet = new ItemTablet();		
		
		ItemRegistry.registerItem(tablet, "Security_Tablet");
	}
}