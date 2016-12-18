package link1234gamer.fnafmod.client.render.tile;

import org.lwjgl.opengl.GL11;

import link1234gamer.fnafmod.FNAFMod;
import link1234gamer.fnafmod.client.model.tile.ModelF_Plushie;
import link1234gamer.fnafmod.common.tileentity.TileEntityArcadeMachineOrange;
import link1234gamer.fnafmod.common.tileentity.TileEntityF_Plushie;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderF_Plushie extends TileEntitySpecialRenderer{
	
    private ResourceLocation texture = new ResourceLocation(FNAFMod.MODID + ":textures/models/fplush.png");
    private ModelF_Plushie model = new ModelF_Plushie();
    
    public void render(TileEntityF_Plushie tileentity, double x, double y, double z, float partialTicks)
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
        model.RenderPlushie();
    	
    	GL11.glPopMatrix();
    }
    

    public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f)
    {
    	render((TileEntityF_Plushie)tileentity, d, d1, d2, f);
    } 
}

//    public void renderModelAt(TileEntityF_Plushie displayPillar, double x, double y, double z, float f)
//    {    
//       GL11.glPushMatrix();
//        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
//        GL11.glScalef(1.0F, -1F, -1F);
//        bindTexture(texture);
//        model.RenderPlushie();

//        GL11.glPopMatrix();
//    }    

//    public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float partialTicks)
//    {   
    	
//        renderModelAt((TileEntityF_Plushie)tileentity, x, y, z, partialTicks);
//    }
//}