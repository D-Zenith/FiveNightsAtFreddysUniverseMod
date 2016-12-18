package link1234gamer.fnafmod.client.render.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderToyBonnie extends RenderLiving{

	public RenderToyBonnie(ModelBase parModelBase, float parShadowSize) {
		super(parModelBase, parShadowSize);
	}

	public static final ResourceLocation textureLocation = new ResourceLocation("fnafmod:textures/entity/toys/toybonnie.png");

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return textureLocation;
	}

}

