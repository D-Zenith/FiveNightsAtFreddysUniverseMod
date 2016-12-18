package link1234gamer.fnafmod.common.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import link1234gamer.fnafmod.client.gui.GuiFNAFGameOver;
import link1234gamer.fnafmod.client.gui.GuiOverrideHelper;
import link1234gamer.fnafmod.client.sound.FNAFSoundHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiGameOver;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.GuiScreenEvent.DrawScreenEvent;
import net.minecraftforge.client.event.sound.PlaySoundEvent17;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

@SideOnly(Side.CLIENT)
public class ClientEventHandler extends Gui
{
	private Minecraft mc = Minecraft.getMinecraft();
	
	@SubscribeEvent
	public void onLivingUpdate(LivingUpdateEvent event)
	{
		if (event.entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)event.entity;
			ItemStack itemstack = player.getHeldItem();
			
			if (player.ticksExisted % 2 == 0)
			{
				if (mc.getSoundHandler().isSoundPlaying(FNAFSoundHandler.deathStatic) && !(mc.currentScreen instanceof GuiGameOver))
				{
					mc.getSoundHandler().stopSound(FNAFSoundHandler.deathStatic);
				}
			}
		}
	}
	
	@SubscribeEvent
	public void onGuiOpen(GuiOpenEvent event)
	{
//		if (event.gui instanceof GuiMainMenu)
//		{	
//			{
//				
//			}
//		}
		if (event.gui instanceof GuiGameOver)
		{
			GuiFNAFGameOver.ticksElapsed = 0;
			mc.getSoundHandler().stopSounds();
			
			if (!mc.getSoundHandler().isSoundPlaying(FNAFSoundHandler.deathStatic))
			{
				mc.getSoundHandler().playSound(FNAFSoundHandler.deathStatic);
			}
		}
	}
	
	@SubscribeEvent
    public void onPlaySound(PlaySoundEvent17 event)
    {
        if (mc.currentScreen instanceof GuiGameOver)
        {
        	if (!event.name.equals("static"))
        	{
        		event.result = null;
        	}
        }
 //     else if (mc.currentScreen instanceof GuiMonitor)
//        {
 //       	if (event.name.equals("gui.button.press"))
  //      	{
   //     		event.result = null;
    //    	}
    //    }
    }
	@SubscribeEvent
	public void onDrawScreen(DrawScreenEvent.Post event)
	{
		GuiOverrideHelper.draw(event);
	}
}