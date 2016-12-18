package link1234gamer.fnafmod.client.render.entity;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import link1234gamer.fnafmod.common.entity.EntityBonnie;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderBonnie extends RenderLiving{

	public RenderBonnie(ModelBase parModelBase, float parShadowSize) {
		super(parModelBase, parShadowSize);
	}

	public static final ResourceLocation textureLocation = new ResourceLocation("fnafmod:textures/entity/bonnie/bonnie.png");

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return textureLocation;
	}

}

