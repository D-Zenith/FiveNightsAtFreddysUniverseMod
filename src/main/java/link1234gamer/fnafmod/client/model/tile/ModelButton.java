package link1234gamer.fnafmod.client.model.tile;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelButton extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape2;

    public ModelButton() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(-2.0F, 13.0F, 7.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 5, 5, 1, 0.0F);
        this.shape2 = new ModelRenderer(this, 0, 8);
        this.shape2.setRotationPoint(-1.6F, 13.4F, 6.6F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
    }

    public void render() { 
    	float f5 = 0.0625F;
        GL11.glPushMatrix();
        GL11.glTranslatef(this.shape1.offsetX, this.shape1.offsetY, this.shape1.offsetZ);
        GL11.glTranslatef(this.shape1.rotationPointX * f5, this.shape1.rotationPointY * f5, this.shape1.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.03D, 1.0D);
        GL11.glTranslatef(-this.shape1.offsetX, -this.shape1.offsetY, -this.shape1.offsetZ);
        GL11.glTranslatef(-this.shape1.rotationPointX * f5, -this.shape1.rotationPointY * f5, -this.shape1.rotationPointZ * f5);
        this.shape1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.shape2.offsetX, this.shape2.offsetY, this.shape2.offsetZ);
        GL11.glTranslatef(this.shape2.rotationPointX * f5, this.shape2.rotationPointY * f5, this.shape2.rotationPointZ * f5);
        GL11.glScaled(1.4D, 2.0D, 0.5D);
        GL11.glTranslatef(-this.shape2.offsetX, -this.shape2.offsetY, -this.shape2.offsetZ);
        GL11.glTranslatef(-this.shape2.rotationPointX * f5, -this.shape2.rotationPointY * f5, -this.shape2.rotationPointZ * f5);
        this.shape2.render(f5);
        GL11.glPopMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

