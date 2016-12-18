package link1234gamer.fnafmod.client.gui;

import java.util.List;

import org.lwjgl.opengl.GL11;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import link1234gamer.fnafmod.FNAFMod;
import link1234gamer.fnafmod.common.config.FNAFConfig;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;

public class GuiFNAFMainMenu extends GuiOverride
{
	private static final ResourceLocation minecraftTitleTextures = new ResourceLocation("textures/gui/title/minecraft.png");
	
	public static float renderTimer;
	public Integer[] picture = {1, 1};
	public Integer[] nextPictureTimer = {0, 0};
	
	private void renderBackground()
	{
		ResourceLocation background1 = new ResourceLocation(FNAFMod.MODID, "textures/menu/freddy" + picture[0]/*(rand.nextInt(30) == 0 ? 2 : (rand.nextInt(30) == 1 ? 3 : 1))*/ + ".png");
		ResourceLocation background2 = new ResourceLocation(FNAFMod.MODID, "textures/menu/fnaf2_" + picture[0] + ".png");
//		ResourceLocation background = new ResourceLocation[] {background1, background2}[FNAFConfig.gameMenu - 1];		
		
		GL11.glDisable(GL11.GL_DEPTH_TEST);
        GL11.glDepthMask(false);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(GL11.GL_ALPHA_TEST);
        mc.getTextureManager().bindTexture(background1);
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(0.0D, (double)height, -90.0D, 0.0D, 1.0D);
        tessellator.addVertexWithUV((double)width, (double)height, -90.0D, 1.0D, 1.0D);
        tessellator.addVertexWithUV((double)width, 0.0D, -90.0D, 1.0D, 0.0D);
        tessellator.addVertexWithUV(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
        tessellator.draw();
        GL11.glDepthMask(true);
        GL11.glEnable(GL11.GL_DEPTH_TEST);
        GL11.glEnable(GL11.GL_ALPHA_TEST);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	}
	
	private void renderStatic()
	{
		GL11.glDisable(GL11.GL_DEPTH_TEST);
        GL11.glDepthMask(false);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.3F + rand.nextFloat() / 3);
        GL11.glDisable(GL11.GL_ALPHA_TEST);
        mc.getTextureManager().bindTexture(new ResourceLocation(FNAFMod.MODID, "textures/menu/static" + (rand.nextInt(7) + 1) + ".png"));
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(0.0D, (double)height, -90.0D, 0.0D, 1.0D);
        tessellator.addVertexWithUV((double)width, (double)height, -90.0D, 1.0D, 1.0D);
        tessellator.addVertexWithUV((double)width, 0.0D, -90.0D, 1.0D, 0.0D);
        tessellator.addVertexWithUV(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
        tessellator.draw();
        GL11.glDepthMask(true);
        GL11.glEnable(GL11.GL_DEPTH_TEST);
        GL11.glEnable(GL11.GL_ALPHA_TEST);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	}
	
	private void renderStaticRendering()
	{
		int size = 0;
		double x = 0;
		double y = (renderTimer + 36) % height;
		
		mc.getTextureManager().bindTexture(new ResourceLocation(FNAFMod.MODID, "textures/menu/render1.png"));
		Tessellator tessellator = Tessellator.instance;
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
		GL11.glDepthMask(false);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.2F);
		GL11.glDisable(GL11.GL_ALPHA_TEST);
		tessellator.startDrawingQuads();
		tessellator.addVertexWithUV(-size + x, (double)height + y + size / 2, -90.0D, 0.0D, 1.0D);
		tessellator.addVertexWithUV((double)width + size + x, (double)height + y + size / 2, -90.0D, 1.0D, 1.0D);
		tessellator.addVertexWithUV((double)width + size + x, -size + y + size / 2, -90.0D, 1.0D, 0.0D);
		tessellator.addVertexWithUV(-size + x, -size + y + size / 2, -90.0D, 0.0D, 0.0D);
		tessellator.draw();
		GL11.glDepthMask(true);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		GL11.glEnable(GL11.GL_ALPHA_TEST);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		
		if (picture[1] != 0)
		{
			ResourceLocation resource = new ResourceLocation(FNAFMod.MODID, "textures/menu/render" + (picture[1]) + ".png");
			GL11.glDisable(GL11.GL_DEPTH_TEST);
	        GL11.glDepthMask(false);
	        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
	        GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.4F);
	        GL11.glDisable(GL11.GL_ALPHA_TEST);
	        mc.getTextureManager().bindTexture(resource);
	        tessellator.startDrawingQuads();
	        tessellator.addVertexWithUV(0.0D, (double)height, -90.0D, 0.0D, 1.0D);
	        tessellator.addVertexWithUV((double)width, (double)height, -90.0D, 1.0D, 1.0D);
	        tessellator.addVertexWithUV((double)width, 0.0D, -90.0D, 1.0D, 0.0D);
	        tessellator.addVertexWithUV(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
	        tessellator.draw();
	        GL11.glDepthMask(true);
	        GL11.glEnable(GL11.GL_DEPTH_TEST);
	        GL11.glEnable(GL11.GL_ALPHA_TEST);
	        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
	}

	public void updateScreen()
	{
		renderTimer += 0.02F * height / 10;
				
		for (int i = 0; i < 2; ++i)
		{
			if (nextPictureTimer[i] > 0)
			{
				--nextPictureTimer[i];
			}
			
			if (nextPictureTimer[i] == 0)
			{
				if (i == 0)
				{
					if (rand.nextInt(10) == 0)
					{
						picture[0] = rand.nextInt(4) + 1;
					}
					else
					{
						picture[0] = 1;
					}
				}
				else if (i == 1)
				{
					if (rand.nextInt(5) == 0)
					{
						picture[1] = rand.nextInt(5) + 2;
					}
					else
					{
						picture[1] = 0;
					}
				}
				
				nextPictureTimer[i] = 2;
			}
		}
	}
	
	public void drawScreen(int mouseX, int mouseY, float partialTicks)
	{
		renderBackground();
        drawString(mc.fontRenderer, "WARNING: Contains loud noises!", 5, 5, 0xFF0000);
        
        short short1 = 274;
        int k = width / 2 - short1 / 2;
        byte b0 = 30;
        mc.getTextureManager().bindTexture(minecraftTitleTextures);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        
        if ((double)(Float)ObfuscationReflectionHelper.getPrivateValue(GuiMainMenu.class, (GuiMainMenu)overriddenScreen, "updateCounter", "field_73974_b") < 1.0E-4D)
        {
            drawTexturedModalRect(k + 0, b0 + 0, 0, 0, 99, 44);
            drawTexturedModalRect(k + 99, b0 + 0, 129, 0, 27, 44);
            drawTexturedModalRect(k + 99 + 26, b0 + 0, 126, 0, 3, 44);
            drawTexturedModalRect(k + 99 + 26 + 3, b0 + 0, 99, 0, 26, 44);
            drawTexturedModalRect(k + 155, b0 + 0, 0, 45, 155, 44);
        }
        else
        {
            drawTexturedModalRect(k + 0, b0 + 0, 0, 0, 155, 44);
            drawTexturedModalRect(k + 155, b0 + 0, 0, 45, 155, 44);
        }
        
        GL11.glPushMatrix();
        GL11.glScalef(2.0F, 2.0F, 2.0F);
        String s2 = "FNaF Universe Mod-v1.0";
        drawCenteredString(mc.fontRenderer, s2, width / 2 / 2, 30, 16777215);
        GL11.glPopMatrix();
        
        String s = "Minecraft 1.7.10";

        if (mc.isDemo())
        {
            s = s + " Demo";
        }

        List<String> brandings = Lists.reverse(FMLCommonHandler.instance().getBrandings(true));
        for (int i = 0; i < brandings.size(); i++)
        {
            String brd = brandings.get(i);
            if (!Strings.isNullOrEmpty(brd))
            {
                drawString(mc.fontRenderer, brd, 2, height - ( 10 + i * (mc.fontRenderer.FONT_HEIGHT + 1)), 16777215);
            }
        }
        
        String s1 = "FNaF U' v1.0, Copyright Mojang AB. Do not distribute!";
        drawString(mc.fontRenderer, s1, width - mc.fontRenderer.getStringWidth(s1) - 2, height - 10, -1);
        
        super.drawScreen(mouseX, mouseY, partialTicks);
        renderStatic();
        renderStaticRendering();
	}
}