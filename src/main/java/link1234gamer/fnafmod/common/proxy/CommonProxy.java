package link1234gamer.fnafmod.common.proxy;

import link1234gamer.fnafmod.common.item.FNAFItems;
import net.minecraft.entity.player.EntityPlayer;

public class CommonProxy {
	
	public void registerRenderers()
	{
		
	}
	
	public void preInit()
	{
		FNAFItems.load();
	}
	
	public void init()
	{
		
	}

	public EntityPlayer getPlayer() {
		return null;
	}

}	