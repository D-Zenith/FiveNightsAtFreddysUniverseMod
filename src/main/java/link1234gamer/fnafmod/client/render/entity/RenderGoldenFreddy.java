package link1234gamer.fnafmod.client.render.entity;

import link1234gamer.fnafmod.FNAFMod;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderGoldenFreddy extends RenderLiving{
	
	public RenderGoldenFreddy(ModelBase parModelBase, float parShadowSize) {
		super(parModelBase, parShadowSize);
	}

	public static final ResourceLocation textureLocation = new ResourceLocation("fnafmod:textures/entity/gfreddy/goldenfreddy.png");

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return textureLocation;
	}

}