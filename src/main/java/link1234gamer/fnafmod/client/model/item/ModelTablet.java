package link1234gamer.fnafmod.client.model.item;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

/**
 * Camera Tablet V2 - _ShadowLink_
 * Created using Tabula 4.1.1
 */
public class ModelTablet extends ModelBase {
    public ModelRenderer Tabstand;
    public ModelRenderer Screen;
    public ModelRenderer Tabtop;
    public ModelRenderer Tableft;
    public ModelRenderer Tabright;
    public ModelRenderer Tabbottom;

    public ModelTablet() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Screen = new ModelRenderer(this, 19, 8);
        this.Screen.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Screen.addBox(0.0F, 0.0F, 0.0F, 7, 5, 0, 0.0F);
        this.Tabtop = new ModelRenderer(this, 0, 16);
        this.Tabtop.setRotationPoint(0.0F, -0.5F, 1.4F);
        this.Tabtop.addBox(0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F);
        this.setRotateAngle(Tabtop, 0.0F, 1.5707963267948966F, 0.0F);
        this.Tabstand = new ModelRenderer(this, 0, 7);
        this.Tabstand.setRotationPoint(3.7F, 0.5F, 0.5F);
        this.Tabstand.addBox(0.0F, 0.0F, 0.0F, 7, 5, 1, -0.2F);
        this.setRotateAngle(Tabstand, 3.4906585039886593E-4F, -3.141592653589793F, 0.0F);
        this.Tabbottom = new ModelRenderer(this, 17, 16);
        this.Tabbottom.setRotationPoint(0.0F, 4.2F, 0.4F);
        this.Tabbottom.addBox(0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F);
        this.setRotateAngle(Tabbottom, 0.0F, 1.5707963267948966F, 0.0F);
        this.Tabright = new ModelRenderer(this, 34, 17);
        this.Tabright.setRotationPoint(-0.5F, -0.1F, 1.4F);
        this.Tabright.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(Tabright, 0.0F, 1.5707963267948966F, 0.0F);
        this.Tableft = new ModelRenderer(this, 14, 14);
        this.Tableft.setRotationPoint(6.5F, -0.1F, 0.4F);
        this.Tableft.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.Tabstand.addChild(this.Screen);
        this.Tabstand.addChild(this.Tabtop);
        this.Screen.addChild(this.Tabbottom);
        this.Tabstand.addChild(this.Tabright);
        this.Tabstand.addChild(this.Tableft);
    }

    public void render()
    { 
    	float f5 = 0.0625F;
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Tabstand.offsetX, this.Tabstand.offsetY, this.Tabstand.offsetZ);
        GL11.glTranslatef(this.Tabstand.rotationPointX * f5, this.Tabstand.rotationPointY * f5, this.Tabstand.rotationPointZ * f5);
//      GL11.glScaled(0.5D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.Tabstand.offsetX, -this.Tabstand.offsetY, -this.Tabstand.offsetZ);
        GL11.glTranslatef(-this.Tabstand.rotationPointX * f5, -this.Tabstand.rotationPointY * f5, -this.Tabstand.rotationPointZ * f5);
        this.Tabstand.render(f5);
        GL11.glPopMatrix();

    }
    

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
