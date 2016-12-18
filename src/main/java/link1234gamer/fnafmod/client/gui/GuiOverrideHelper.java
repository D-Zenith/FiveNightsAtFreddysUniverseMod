package link1234gamer.fnafmod.client.gui;

import java.util.Map;

import com.google.common.collect.Maps;

import link1234gamer.fnafmod.client.sound.FNAFSoundHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.client.event.GuiScreenEvent.DrawScreenEvent;

public class GuiOverrideHelper
{
	private static Map<Class, GuiScreen> overrides = Maps.newHashMap();
	
	public static long initialTime = System.nanoTime();
	public static final double timeU = 1000000000 / 20;
	public static double deltaU = 0;
	public static int ticks = 0;
	public static long timer = System.currentTimeMillis();
	
	public static void addOverride(Class<? extends GuiScreen> clazz, GuiScreen gui)
	{
		overrides.put(clazz, gui);
	}
	
	public static Map<Class, GuiScreen> getOverrides()
	{
		return overrides;
	}

	public static void draw(DrawScreenEvent.Post event)
	{
		if (!(event.gui instanceof GuiMainMenu))
		{
//			Minecraft.getMinecraft().getSoundHandler().stopSound(FNAFSoundHandler.getMenuMusic());
		}
		
		for (Map.Entry<Class, GuiScreen> e : GuiOverrideHelper.getOverrides().entrySet())
		{
			if (event.gui.getClass() == e.getKey())
			{
				GuiOverride gui = (GuiOverride)e.getValue();
				long currentTime = System.nanoTime();
		        deltaU += (currentTime - initialTime) / timeU;
		        initialTime = currentTime;

		        if (deltaU >= 1)
		        {
		        	gui.updateScreen();
		            ticks++;
		            deltaU--;
		        }

		        if (System.currentTimeMillis() - timer > 1000)
		        {
		            ticks = 0;
		            timer += 1000;
		        }
				
		        gui.width = event.gui.width;
				gui.height = event.gui.height;
				gui.overriddenScreen = event.gui;
				gui.drawScreen(event.mouseX, event.mouseY, event.renderPartialTicks);
			}
		}
	}
}