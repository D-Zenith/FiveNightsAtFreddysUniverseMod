package link1234gamer.fnafmod.client.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCamera extends ModelBase {

	    public ModelRenderer CameraBody;
	    public ModelRenderer CameraHoister;
	    public ModelRenderer CameraWallHolder;
	    public ModelRenderer CameraLens;

	    public ModelCamera() {
	        this.textureWidth = 64;
	        this.textureHeight = 32;
	        this.CameraLens = new ModelRenderer(this, 11, 17);
	        this.CameraLens.setRotationPoint(0.5F, 5.7F, 0.5F);
	        this.CameraLens.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
	        this.CameraWallHolder = new ModelRenderer(this, 0, 17);
	        this.CameraWallHolder.setRotationPoint(-1.0F, 17.0F, 7.0F);
	        this.CameraWallHolder.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
	        this.CameraBody = new ModelRenderer(this, 9, 7);
	        this.CameraBody.setRotationPoint(-1.0F, 13.7F, 5.5F);
	        this.CameraBody.addBox(0.0F, 0.0F, 0.0F, 2, 6, 2, 0.1F);
	        this.setRotateAngle(CameraBody, -1.2292353921796064F, 0.0F, 0.0F);
	        this.CameraHoister = new ModelRenderer(this, 0, 8);
	        this.CameraHoister.setRotationPoint(-0.5F, 15.8F, 4.2F);
	        this.CameraHoister.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, -0.1F);
	        this.setRotateAngle(CameraHoister, 0.7853981633974483F, 0.0F, 0.0F);
	        this.CameraBody.addChild(this.CameraLens);
	    }

	    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
	   
	        this.CameraBody.render(f5);
	        this.CameraWallHolder.render(f5);
	        this.CameraHoister.render(f5);
	}
	    
	    public void setCameraRotation(float rotation) {
	        this.CameraBody.rotateAngleY = rotation;
	    }
	    
	    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
	        modelRenderer.rotateAngleX = x;
	        modelRenderer.rotateAngleY = y;
	        modelRenderer.rotateAngleZ = z;
	    }
	}