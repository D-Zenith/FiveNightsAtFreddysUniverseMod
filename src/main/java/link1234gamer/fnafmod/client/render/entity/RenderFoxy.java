package link1234gamer.fnafmod.client.render.entity;

import link1234gamer.fnafmod.FNAFMod;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderFoxy extends RenderLiving{

	public RenderFoxy(ModelBase parModelBase, float parShadowSize) {
		super(parModelBase, parShadowSize);
		
	}

	public static final ResourceLocation textureLocation = new ResourceLocation("fnafmod:textures/entity/foxy/foxy.png");

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return textureLocation;
	}

}