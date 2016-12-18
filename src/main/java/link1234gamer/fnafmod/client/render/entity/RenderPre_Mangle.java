package link1234gamer.fnafmod.client.render.entity;

import org.lwjgl.opengl.GL11;

import link1234gamer.fnafmod.client.model.entity.ModelPre_Mangle;
import link1234gamer.fnafmod.common.entity.EntityPre_Mangle;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderPre_Mangle extends RenderLiving{

	public RenderPre_Mangle(ModelBase parModelBase, float parShadowSize) {
		super(parModelBase, parShadowSize);
	}

	public static final ResourceLocation textureLocation = new ResourceLocation("fnafmod:textures/entity/ffoxy/funtimefoxy1.png");

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return textureLocation;
	}

}