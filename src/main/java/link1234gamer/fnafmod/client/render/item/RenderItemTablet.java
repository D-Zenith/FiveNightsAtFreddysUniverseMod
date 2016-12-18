package link1234gamer.fnafmod.client.render.item;

import org.lwjgl.opengl.GL11;

import link1234gamer.fnafmod.FNAFMod;
import link1234gamer.fnafmod.client.model.item.ModelTablet;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

public class RenderItemTablet extends ItemRenderer implements IItemRenderer
{
	protected ModelTablet model = new ModelTablet();
	protected final ResourceLocation texture = new ResourceLocation(FNAFMod.MODID, "textures/models/tablet.png");

	public RenderItemTablet()
	{
		super(Minecraft.getMinecraft());
	}

	public boolean handleRenderType(ItemStack item, ItemRenderType type) 
	{
		return type == ItemRenderType.EQUIPPED || type == ItemRenderType.EQUIPPED_FIRST_PERSON;
	}

	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) 
	{
		return false;
	}

	public void renderItem(ItemRenderType type, ItemStack item, Object... data) 
	{
		Minecraft.getMinecraft().renderEngine.bindTexture(texture);
		
		if (type == ItemRenderType.EQUIPPED)
		{
			GL11.glPushMatrix();
			GL11.glRotatef(-55, 0.0F, 0.0F, 1.0F);
			GL11.glRotatef(5, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(90, 0.0F, 1.0F, 0.0F);
			GL11.glTranslatef(0.080F, 0.637F, 0.22F);
			
			float f = 3.0F;
			GL11.glScalef(f, f, f);
			model.render();
			GL11.glPopMatrix();
		}
		else if (type == ItemRenderType.EQUIPPED_FIRST_PERSON)
		{
			GL11.glPushMatrix();
			GL11.glTranslatef(0.3F, 0.4F, -0.3F);
			GL11.glRotatef(0, 0.0F, 0.0F, 1.5F);
			GL11.glRotatef(70, 0.0F, 1.5F, 0.0F);
			GL11.glRotatef(0, 1.5F, 0.0F, 0.0F);
			
			float f = 2.0F;
			GL11.glScalef(f, f, f);
			
			model.render();
			GL11.glPopMatrix();
		}
	}
}