package link1234gamer.fnafmod.client.render.tile;

import org.lwjgl.opengl.GL11;

import link1234gamer.fnafmod.FNAFMod;
import link1234gamer.fnafmod.client.model.tile.ModelArcadeMachineCyan;
import link1234gamer.fnafmod.common.tileentity.TileEntityArcadeMachineCyan;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderArcadeMachineCyan extends TileEntitySpecialRenderer
{
	private ModelArcadeMachineCyan model = new ModelArcadeMachineCyan();
	
    public void render(TileEntityArcadeMachineCyan tileentity, double x, double y, double z, float partialTicks)
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
    	
    	bindTexture(new ResourceLocation(FNAFMod.MODID, "textures/models/CyanMachine.png"));

    	if (metadata % 8 >= 4)
    	{
    		GL11.glTranslatef(0, 1, 0);
    		model.renderArcadeBlue();
    	}
    	
    	GL11.glPopMatrix();
    }
    
    public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f)
    {
    	render((TileEntityArcadeMachineCyan)tileentity, d, d1, d2, f);
    } 
}