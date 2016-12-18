package link1234gamer.fnafmod.common.item;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemRegistry
{
    public static void registerItem(Item item, String name)
    {
        String s = name.toLowerCase().replace(' ', '_').replace("'", "");
        item.setTextureName(s);
        item.setUnlocalizedName(s);
        GameRegistry.registerItem(item, s);
    }
    
    public static void registerIngot(Item item, String name, String oreDictName)
    {
        registerItem(item, name);
        OreDictionary.registerOre(oreDictName, item);
    }
}