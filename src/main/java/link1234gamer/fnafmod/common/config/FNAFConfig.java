package link1234gamer.fnafmod.common.config;

import net.minecraftforge.common.config.Configuration;

public class FNAFConfig
{
	public static int gameMenu;
	
	public static void load(Configuration config)
	{
		gameMenu = config.getInt("Game Menu", "Misc", 1, 1, 2, "Decides which menu to use for the title screen. Setting the value to 1 will give you the menu of the first game, 2 as the second game, etc.");
	}
}