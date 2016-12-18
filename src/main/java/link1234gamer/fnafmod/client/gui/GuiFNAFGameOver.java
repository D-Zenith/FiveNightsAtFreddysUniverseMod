package link1234gamer.fnafmod.client.gui;

import org.lwjgl.opengl.GL11;

import link1234gamer.fnafmod.FNAFMod;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;

public class GuiFNAFGameOver extends GuiOverride
{
	public static int ticksElapsed;

	private void renderBackground()
	{
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
        GL11.glDepthMask(false);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glColor4f(0.0F, 0.0F, 0.0F, 1.0F);
        GL11.glDisable(GL11.GL_ALPHA_TEST);
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
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	}

	private void renderStatic()
	{
		GL11.glDisable(GL11.GL_DEPTH_TEST);
        GL11.glDepthMask(false);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.3F + rand.nextFloat() / 3);
        GL11.glDisable(GL11.GL_ALPHA_TEST);
        this.mc.getTextureManager().bindTexture(new ResourceLocation(FNAFMod.MODID, "textures/menu/static" + (rand.nextInt(7) + 1) + ".png"));
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
	
	public void updateScreen()
	{
		++ticksElapsed;
	}
	
	public void drawScreen(int mouseX, int mouseY, float partalTicks)
	{
        renderBackground();
        
        if (ticksElapsed > 35)
        {
            drawGradientRect(0, 0, width, height, 1615855616, -1602211792);
            GL11.glPushMatrix();
            GL11.glScalef(2.0F, 2.0F, 2.0F);
            boolean flag = mc.theWorld.getWorldInfo().isHardcoreModeEnabled();
            String s = flag ? I18n.format("deathScreen.title.hardcore", new Object[0]) : I18n.format("deathScreen.title", new Object[0]);
            drawCenteredString(mc.fontRenderer, s, width / 2 / 2, 30, 16777215);
            GL11.glPopMatrix();

            if (flag)
            {
                drawCenteredString(mc.fontRenderer, I18n.format("deathScreen.hardcoreInfo", new Object[0]), width / 2, 144, 16777215);
            }

            drawCenteredString(mc.fontRenderer, I18n.format("deathScreen.score", new Object[0]) + ": " + EnumChatFormatting.YELLOW + mc.thePlayer.getScore(), width / 2, 100, 16777215);
            super.drawScreen(mouseX, mouseY, partalTicks);
        }
        else
        {
        	renderStatic();
        }
	}
}