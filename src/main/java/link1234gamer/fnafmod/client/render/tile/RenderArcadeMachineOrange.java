package link1234gamer.fnafmod.client.render.tile;

import org.lwjgl.opengl.GL11;

import link1234gamer.fnafmod.FNAFMod;
import link1234gamer.fnafmod.client.model.tile.ModelArcadeMachineOrange;
import link1234gamer.fnafmod.common.tileentity.TileEntityArcadeMachineOrange;
import link1234gamer.fnafmod.common.tileentity.TileEntityArcadeMachineYellow;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderArcadeMachineOrange extends TileEntitySpecialRenderer{
	
	
	private ModelArcadeMachineOrange model = new ModelArcadeMachineOrange();
	
    public void render(TileEntityArcadeMachineOrange tileentity, double x, double y, double z, float partialTicks)
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
    	
    	bindTexture(new ResourceLocation(FNAFMod.MODID, "textures/models/OrangeMachine.png"));

    	if (metadata % 8 >= 4)
    	{
    		GL11.glTranslatef(0, 1, 0);
    		model.renderArcade();
    	}
    	
    	GL11.glPopMatrix();
    }
    
    public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f)
    {
    	render((TileEntityArcadeMachineOrange)tileentity, d, d1, d2, f);
    } 
}