package link1234gamer.fnafmod.client.gui;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

@SideOnly(Side.CLIENT)
public class GuiOverlay extends Gui
{
//	private ResourceLocation freddyHeadTexture = new ResourceLocation(FNAF.modid, "textures/misc/freddy_blur.png");
	
	private Minecraft mc;
    private RenderItem itemRenderer;
    
    public GuiOverlay(Minecraft mc)
    {
        super();
        this.mc = mc;
        this.itemRenderer = new RenderItem();
    }
    
	@SubscribeEvent
	public void onRender(RenderGameOverlayEvent.Pre event)
	{
		int width = event.resolution.getScaledWidth();
        int height = event.resolution.getScaledHeight();
        EntityPlayer player = mc.thePlayer;
        
        renderTime(event, width, height, player);
        
        mc.getTextureManager().bindTexture(icons);
	}
	
	public void renderTime(RenderGameOverlayEvent.Pre event, int width, int height, EntityPlayer player)
	{
		GL11.glPushMatrix();
		float scale = 2.0F;
		GL11.glScalef(scale, scale, scale);
		long time = player.worldObj.getWorldTime() % 24000;
		int hours = (int)time / 1000 + 6 > 24 ? (int)time / 1000 + 6 - 24 : (int)time / 1000 + 6;
		String AM = hours + (hours == 12 ? " PM" : " AM");
		String PM = hours - 12 + (hours - 12 == 12 ? " AM" : " PM");
		String s = hours > 12 ? PM :AM;
		drawString(mc.fontRenderer, s, (int)(width / scale - mc.fontRenderer.getStringWidth(s) - 2), 2, 0xffffff);
		float scale1 = 0.75F;
		GL11.glScalef(scale1, scale1, scale1);
		int day = (int)player.worldObj.getWorldTime() / 24000 + 1;
//		String s1 = (hours == 24 || hours < 6 ? "Night" : "Day") + " " + day;
//		drawString(mc.fontRenderer, s1, (int)(width / scale / scale1 - mc.fontRenderer.getStringWidth(s1) - 2), 15, 0xffffff);
		GL11.glPopMatrix();
	}
	

			
			
//			float f = (float)DataManager.getEquipHeadTimer(player);
//			ResourceLocation headTexture = new ResourceLocation(FNAF.modid, "textures/misc/freddyHead" + ((int)f + 1) + ".png");
//			
//			if (f > 0 && mc.gameSettings.thirdPersonView == 0 && DataManager.getJumpscareTimer(player) == 0)
//			{
//				Minecraft.getMinecraft().getTextureManager().bindTexture(headTexture);
//				int size = 50;
//				double d = -height + (f * 100 < height ? f * 100 : height);
//				double x = Math.cos((double)player.ticksExisted / 10) * 5 + -Math.sin((double)player.ticksExisted / 10) * 2;
//				double y = -Math.cos((double)player.ticksExisted / 10) * 5 + -Math.sin((double)player.ticksExisted / 10) * 2;
//				
//				Tessellator tessellator = Tessellator.instance;
//				GL11.glEnable(GL11.GL_BLEND);
//				GL11.glDisable(GL11.GL_DEPTH_TEST);
//				GL11.glDepthMask(false);
//				GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
//				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
//				GL11.glDisable(GL11.GL_ALPHA_TEST);
//				tessellator.startDrawingQuads();
//				tessellator.addVertexWithUV(-size + x, (double)height + y + size / 2, -90.0D, 0.0D, 1.0D);
//				tessellator.addVertexWithUV((double)width + size + x, (double)height + y + size / 2, -90.0D, 1.0D, 1.0D);
//				tessellator.addVertexWithUV((double)width + size + x, -size + y + size / 2, -90.0D, 1.0D, 0.0D);
//				tessellator.addVertexWithUV(-size + x, -size + y + size / 2, -90.0D, 0.0D, 0.0D);
//				tessellator.draw();
//				GL11.glDepthMask(true);
//				GL11.glEnable(GL11.GL_DEPTH_TEST);
//				GL11.glEnable(GL11.GL_ALPHA_TEST);
//				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
//			}
			
//			int i = (5 - DataManager.getEquipHeadTimer(player)) * 64;
//			int size = 0;
//			double x = -i / 6;
//			double y = -i / 9;
//			int xPosStart = width / 2 - 177;
//			int yPosStart = height - 229;
//			int xPosEnd = xPosStart + 512;
//			int yPosEnd = yPosStart + 512;
//			Random rand = new Random();
//			Tessellator tessellator = Tessellator.instance;
//			
//			mc.getTextureManager().bindTexture(new ResourceLocation(FNAF.modid, "textures/gui/monitor.png"));
//			
//			GL11.glPushMatrix();
//			GL11.glEnable(GL11.GL_BLEND);
//			GL11.glDisable(GL11.GL_DEPTH_TEST);
//			GL11.glDepthMask(false);
//			GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
//			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
//			GL11.glDisable(GL11.GL_ALPHA_TEST);
//			tessellator.startDrawingQuads();
//			tessellator.addVertexWithUV(-size + x + xPosStart, (double)yPosEnd + y + size / 2 - i, -90.0D, 0.0D, 1.0D);
//			tessellator.addVertexWithUV((double)xPosEnd + size + x, (double)yPosEnd + y + size / 2 - i, -90.0D, 1.0D, 1.0D);
//			tessellator.addVertexWithUV((double)xPosEnd + size + x - i / 2, -size + y + yPosStart + size / 2 + i, -90.0D, 1.0D, 0.0D);
//			tessellator.addVertexWithUV(-size + x + xPosStart + i / 2, -size + y + yPosStart + size / 2 + i, -90.0D, 0.0D, 0.0D);
//			tessellator.draw();
//			GL11.glDepthMask(true);
//			GL11.glEnable(GL11.GL_DEPTH_TEST);
//			GL11.glEnable(GL11.GL_ALPHA_TEST);
//			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
//			GL11.glPopMatrix();
		
}