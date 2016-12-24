package link1234gamer.fnafmod.client.gui;

import java.util.Hashtable;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import link1234gamer.fnafmod.FNAFMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.event.world.NoteBlockEvent.Play;

public class GoldenFreddyJumpscare extends Gui{
private static ResourceLocation GoldenFreddyOverlay = new ResourceLocation("fnafmod:textures/gui/GoldenFreddyOverlay.png");
private static Minecraft mc = Minecraft.getMinecraft();
public static GoldenFreddyJumpscare instance = new GoldenFreddyJumpscare();
public void RenderGameOverlayEvent(net.minecraftforge.client.event.RenderGameOverlayEvent event){
	ScaledResolution sr = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
	int Width = sr.getScaledWidth();
	int Height = sr.getScaledHeight();
	this.drawTexturedModalRect(0, 0, 0, 0, 0, 0);
	this.mc.renderEngine.bindTexture(GoldenFreddyOverlay);
}
}