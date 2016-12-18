package link1234gamer.fnafmod.client.render.tile;

import org.lwjgl.opengl.GL11;

import link1234gamer.fnafmod.FNAFMod;
import link1234gamer.fnafmod.client.model.tile.ModelGuitarStand;
import link1234gamer.fnafmod.common.tileentity.TileEntityCupcake;
import link1234gamer.fnafmod.common.tileentity.TileEntityGuitarStand;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderGuitarStand extends TileEntitySpecialRenderer{
	
    private ResourceLocation texture = new ResourceLocation(FNAFMod.MODID + ":textures/models/guitarstand.png");
    private ModelGuitarStand model = new ModelGuitarStand();
    
    public void render(TileEntityGuitarStand tileentity, double x, double y, double z, float partialTicks)
    {
    	int metadata = 0;
    	
    	if (tileentity.getWorldObj() != null)
    	{
    		metadata = tileentity.getBlockMetadata();
    	}
    	
    	GL11.glPushMatrix();
    	GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
    	GL11.glScalef(1.0F, -1F, -1F);
    	GL11.glRotatef(metadata * 90, 0.0F, 1.0F, 0.0F);
    	bindTexture(texture);
        model.RenderStand();
    	
    	GL11.glPopMatrix();
    }
    

    public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f)
    {
    	render((TileEntityGuitarStand)tileentity, d, d1, d2, f);
    } 
}