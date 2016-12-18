package link1234gamer.fnafmod.client.model.entity;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelSpringtrap extends ModelBase {
	    public double[] modelScale = new double[] { 1.4D, 1.4D, 1.4D };
	    public ModelRenderer Body;
	    public ModelRenderer RightLeg1;
	    public ModelRenderer LeftLeg1;
	    public ModelRenderer Hips;
	    public ModelRenderer Body2;
	    public ModelRenderer ShoulderBase;
	    public ModelRenderer Neck1;
	    public ModelRenderer RightArm1;
	    public ModelRenderer LeftArm1;
	    public ModelRenderer RightArmCover1;
	    public ModelRenderer RightArm2;
	    public ModelRenderer RightShoulder;
	    public ModelRenderer RightArmCover2;
	    public ModelRenderer RightHand;
	    public ModelRenderer RightThumb;
	    public ModelRenderer RightFingers1;
	    public ModelRenderer RightFingers2;
	    public ModelRenderer Rightfingers3;
	    public ModelRenderer Rightfingers4;
	    public ModelRenderer LeftArmCover1;
	    public ModelRenderer LeftArm2;
	    public ModelRenderer LeftShoulder;
	    public ModelRenderer LeftArmCover2;
	    public ModelRenderer LeftHand;
	    public ModelRenderer LeftThumb;
	    public ModelRenderer LeftFingers1;
	    public ModelRenderer LeftFingers2;
	    public ModelRenderer Leftfingers3;
	    public ModelRenderer Head;
	    public ModelRenderer Mask1;
	    public ModelRenderer RightEye;
	    public ModelRenderer RightEyelid;
	    public ModelRenderer LeftEyelid;
	    public ModelRenderer LeftEye;
	    public ModelRenderer Mask2;
	    public ModelRenderer LowerJaw1;
	    public ModelRenderer LeftEar1;
	    public ModelRenderer RightEar1;
	    public ModelRenderer Mask3;
	    public ModelRenderer UpperJaw;
	    public ModelRenderer Nose;
	    public ModelRenderer LowerJaw2;
	    public ModelRenderer LowerJaw3;
	    public ModelRenderer LeftEar2;
	    public ModelRenderer LeftEarCover1;
	    public ModelRenderer LeftEarCover2;
	    public ModelRenderer RightEarCover;
	    public ModelRenderer RightLegCover1;
	    public ModelRenderer RightLeg2;
	    public ModelRenderer RightKnee;
	    public ModelRenderer RightLegCover2;
	    public ModelRenderer RightFeet;
	    public ModelRenderer LeftLegCover1;
	    public ModelRenderer LeftLeg2;
	    public ModelRenderer LeftKnee;
	    public ModelRenderer LeftLegCover2;
	    public ModelRenderer LeftFeet;

	    public ModelSpringtrap() {
	        this.textureWidth = 128;
	        this.textureHeight = 128;
	        this.LeftArmCover2 = new ModelRenderer(this, 69, 35);
	        this.LeftArmCover2.setRotationPoint(0.0F, 0.2F, 0.0F);
	        this.LeftArmCover2.addBox(-2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F);
	        this.LeftThumb = new ModelRenderer(this, 88, 52);
	        this.LeftThumb.setRotationPoint(0.0F, 1.0F, -2.0F);
	        this.LeftThumb.addBox(-1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
	        this.setRotateAngle(LeftThumb, -0.27314402793711257F, 0.36425021489121656F, 0.091106186954104F);
	        this.RightFeet = new ModelRenderer(this, 43, 40);
	        this.RightFeet.setRotationPoint(0.0F, 12.0F, 0.0F);
	        this.RightFeet.addBox(-2.5F, 0.0F, -5.0F, 5, 2, 7, 0.0F);
	        this.setRotateAngle(RightFeet, -0.06300638599699529F, 0.0F, -0.045553093477052F);
	        this.RightArm2 = new ModelRenderer(this, 0, 54);
	        this.RightArm2.setRotationPoint(0.0F, 10.0F, 0.0F);
	        this.RightArm2.addBox(-1.5F, 0.0F, -1.5F, 3, 9, 3, 0.0F);
	        this.setRotateAngle(RightArm2, -0.5009094953223726F, -0.18203784098300857F, 0.0F);
	        this.LeftLegCover2 = new ModelRenderer(this, 96, 105);
	        this.LeftLegCover2.setRotationPoint(0.0F, 1.2F, 0.0F);
	        this.LeftLegCover2.addBox(-2.5F, 0.0F, -2.5F, 5, 8, 5, 0.0F);
	        this.RightEarCover = new ModelRenderer(this, 90, 40);
	        this.RightEarCover.setRotationPoint(0.0F, 0.0F, 0.0F);
	        this.RightEarCover.addBox(-1.5F, -3.1F, -1.0F, 3, 3, 2, 0.0F);
	        this.LowerJaw2 = new ModelRenderer(this, 27, 120);
	        this.LowerJaw2.setRotationPoint(0.0F, 0.5F, -1.5F);
	        this.LowerJaw2.addBox(-4.5F, 0.0F, -6.0F, 9, 2, 5, 0.0F);
	        this.LeftFeet = new ModelRenderer(this, 43, 40);
	        this.LeftFeet.setRotationPoint(0.0F, 12.0F, 0.0F);
	        this.LeftFeet.addBox(-2.5F, 0.0F, -5.0F, 5, 2, 7, 0.0F);
	        this.setRotateAngle(LeftFeet, -0.06300638599699529F, 0.0F, 0.045553093477052F);
	        this.Leftfingers3 = new ModelRenderer(this, 95, 79);
	        this.Leftfingers3.setRotationPoint(0.0F, 1.0F, 0.0F);
	        this.Leftfingers3.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 4, 0.0F);
	        this.setRotateAngle(Leftfingers3, 0.0F, 0.0F, 0.27314402793711257F);
	        this.Head = new ModelRenderer(this, 0, 84);
	        this.Head.setRotationPoint(0.0F, -3.0F, -1.0F);
	        this.Head.addBox(-4.0F, -7.0F, -4.0F, 8, 8, 8, 0.0F);
	        this.setRotateAngle(Head, 0.03490658503988659F, 0.0F, 0.0F);
	        this.RightLeg1 = new ModelRenderer(this, 14, 37);
	        this.RightLeg1.setRotationPoint(-3.7F, 7.7F, 0.1F);
	        this.RightLeg1.addBox(-1.5F, 0.0F, -1.5F, 3, 12, 3, 0.0F);
	        this.setRotateAngle(RightLeg1, -0.02809980095710871F, 0.045553093477052F, 0.045553093477052F);
	        this.RightEye = new ModelRenderer(this, 35, 106);
	        this.RightEye.setRotationPoint(-2.0F, -5.0F, -3.6F);
	        this.RightEye.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
	        this.Hips = new ModelRenderer(this, 0, 25);
	        this.Hips.setRotationPoint(0.0F, 0.0F, 0.0F);
	        this.Hips.addBox(-5.5F, -2.0F, -4.0F, 11, 4, 8, 0.0F);
	        this.Neck1 = new ModelRenderer(this, 49, 101);
	        this.Neck1.setRotationPoint(0.0F, -17.5F, 0.0F);
	        this.Neck1.addBox(-2.0F, -6.0F, -2.0F, 4, 7, 4, 0.0F);
	        this.LeftArmCover1 = new ModelRenderer(this, 68, 18);
	        this.LeftArmCover1.setRotationPoint(0.0F, 0.8F, 0.0F);
	        this.LeftArmCover1.addBox(-2.5F, 0.0F, -2.5F, 5, 9, 5, 0.0F);
	        this.Body = new ModelRenderer(this, 94, 0);
	        this.Body.setRotationPoint(0.0F, 5.7F, 0.0F);
	        this.Body.addBox(-4.5F, -17.0F, -3.0F, 9, 18, 6, 0.0F);
	        this.LeftArm2 = new ModelRenderer(this, 0, 54);
	        this.LeftArm2.setRotationPoint(0.0F, 10.0F, 0.0F);
	        this.LeftArm2.addBox(-1.5F, 0.0F, -1.5F, 3, 9, 3, 0.0F);
	        this.setRotateAngle(LeftArm2, -0.5009094953223726F, 0.18203784098300857F, 0.0F);
	        this.RightLegCover1 = new ModelRenderer(this, 72, 87);
	        this.RightLegCover1.setRotationPoint(0.0F, 0.0F, 0.0F);
	        this.RightLegCover1.addBox(-3.0F, 0.0F, -3.0F, 6, 10, 6, 0.0F);
	        this.RightLeg2 = new ModelRenderer(this, 26, 51);
	        this.RightLeg2.setRotationPoint(0.0F, 12.0F, 0.0F);
	        this.RightLeg2.addBox(-1.5F, 0.0F, -1.5F, 3, 12, 3, 0.0F);
	        this.setRotateAngle(RightLeg2, 0.091106186954104F, 0.0F, 0.0F);
	        this.RightKnee = new ModelRenderer(this, 78, 120);
	        this.RightKnee.setRotationPoint(0.0F, 11.2F, -1.5F);
	        this.RightKnee.addBox(-2.0F, -1.0F, -1.0F, 4, 3, 2, 0.0F);
	        this.LeftEye = new ModelRenderer(this, 35, 106);
	        this.LeftEye.setRotationPoint(2.0F, -5.0F, -3.6F);
	        this.LeftEye.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
	        this.LeftEyelid = new ModelRenderer(this, 0, 113);
	        this.LeftEyelid.setRotationPoint(2.0F, -5.8F, -3.0F);
	        this.LeftEyelid.addBox(-1.5F, -1.0F, -2.0F, 3, 1, 2, 0.0F);
	        this.RightThumb = new ModelRenderer(this, 77, 52);
	        this.RightThumb.setRotationPoint(0.0F, 1.0F, -2.0F);
	        this.RightThumb.addBox(0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
	        this.setRotateAngle(RightThumb, -0.27314402793711257F, -0.36425021489121656F, -0.091106186954104F);
	        this.Mask1 = new ModelRenderer(this, 0, 71);
	        this.Mask1.setRotationPoint(0.0F, -2.2F, 0.0F);
	        this.Mask1.addBox(-5.0F, -6.5F, 1.5F, 10, 7, 3, 0.0F);
	        this.setRotateAngle(Mask1, -0.045553093477052F, 0.0F, 0.0F);
	        this.LeftEarCover2 = new ModelRenderer(this, 108, 27);
	        this.LeftEarCover2.setRotationPoint(0.0F, 0.0F, 0.0F);
	        this.LeftEarCover2.addBox(-1.5F, -5.5F, -1.4F, 3, 6, 2, 0.0F);
	        this.Rightfingers4 = new ModelRenderer(this, 72, 78);
	        this.Rightfingers4.setRotationPoint(0.0F, 0.0F, 0.0F);
	        this.Rightfingers4.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 1, 0.0F);
	        this.LeftLeg1 = new ModelRenderer(this, 14, 37);
	        this.LeftLeg1.setRotationPoint(3.7F, 7.7F, 0.1F);
	        this.LeftLeg1.addBox(-1.5F, 0.0F, -1.5F, 3, 12, 3, 0.0F);
	        this.setRotateAngle(LeftLeg1, -0.02809980095710871F, -0.045553093477052F, -0.045553093477052F);
	        this.Mask2 = new ModelRenderer(this, 27, 68);
	        this.Mask2.setRotationPoint(0.0F, -6.5F, 1.5F);
	        this.Mask2.addBox(-5.0F, 0.0F, -5.0F, 10, 8, 5, 0.0F);
	        this.LeftFingers1 = new ModelRenderer(this, 97, 61);
	        this.LeftFingers1.setRotationPoint(0.5F, 4.0F, 0.0F);
	        this.LeftFingers1.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 4, 0.0F);
	        this.setRotateAngle(LeftFingers1, 0.0F, 0.0F, 0.091106186954104F);
	        this.RightShoulder = new ModelRenderer(this, 77, 0);
	        this.RightShoulder.setRotationPoint(0.5F, -2.1F, 0.0F);
	        this.RightShoulder.addBox(-3.0F, 0.0F, -2.0F, 4, 2, 4, 0.0F);
	        this.setRotateAngle(RightShoulder, 0.0F, 0.0F, -0.27314402793711257F);
	        this.LeftShoulder = new ModelRenderer(this, 73, 9);
	        this.LeftShoulder.setRotationPoint(-0.5F, -2.1F, 0.0F);
	        this.LeftShoulder.addBox(-1.0F, 0.0F, -2.0F, 4, 2, 4, 0.0F);
	        this.setRotateAngle(LeftShoulder, 0.0F, 0.0F, 0.27314402793711257F);
	        this.RightLegCover2 = new ModelRenderer(this, 73, 105);
	        this.RightLegCover2.setRotationPoint(0.0F, 1.2F, 0.0F);
	        this.RightLegCover2.addBox(-2.5F, 0.0F, -2.5F, 5, 8, 5, 0.0F);
	        this.LeftLeg2 = new ModelRenderer(this, 26, 51);
	        this.LeftLeg2.setRotationPoint(0.0F, 12.0F, 0.0F);
	        this.LeftLeg2.addBox(-1.5F, 0.0F, -1.5F, 3, 12, 3, 0.0F);
	        this.setRotateAngle(LeftLeg2, 0.091106186954104F, 0.0F, 0.0F);
	        this.Mask3 = new ModelRenderer(this, 33, 82);
	        this.Mask3.setRotationPoint(0.0F, 5.0F, -5.0F);
	        this.Mask3.addBox(-4.5F, -6.0F, -1.0F, 9, 9, 9, 0.0F);
	        this.Nose = new ModelRenderer(this, 19, 106);
	        this.Nose.setRotationPoint(0.0F, 0.1F, -1.4F);
	        this.Nose.addBox(-1.5F, -0.5F, -1.0F, 3, 2, 2, 0.0F);
	        this.setRotateAngle(Nose, -0.091106186954104F, 0.0F, -0.05619960191421742F);
	        this.ShoulderBase = new ModelRenderer(this, 36, 0);
	        this.ShoulderBase.setRotationPoint(0.0F, -15.5F, 0.0F);
	        this.ShoulderBase.addBox(-8.0F, -1.5F, -1.5F, 16, 3, 3, 0.0F);
	        this.LeftHand = new ModelRenderer(this, 96, 51);
	        this.LeftHand.setRotationPoint(0.0F, 9.0F, 0.0F);
	        this.LeftHand.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 4, 0.0F);
	        this.setRotateAngle(LeftHand, 0.0F, 0.22759093446006054F, 0.045553093477052F);
	        this.LowerJaw1 = new ModelRenderer(this, 0, 119);
	        this.LowerJaw1.setRotationPoint(0.0F, 1.0F, 3.0F);
	        this.LowerJaw1.addBox(-4.5F, -1.5F, -2.5F, 9, 4, 4, 0.0F);
	        this.setRotateAngle(LowerJaw1, 0.045553093477052F, 0.0F, 0.0F);
	        this.LeftEar1 = new ModelRenderer(this, 119, 76);
	        this.LeftEar1.setRotationPoint(3.0F, -7.5F, 0.0F);
	        this.LeftEar1.addBox(-1.0F, -6.0F, -0.5F, 2, 6, 1, 0.0F);
	        this.setRotateAngle(LeftEar1, 0.22759093446006054F, -0.36425021489121656F, 0.136659280431156F);
	        this.Body2 = new ModelRenderer(this, 0, 0);
	        this.Body2.setRotationPoint(0.0F, -11.0F, 0.4F);
	        this.Body2.addBox(-6.0F, -6.5F, -5.5F, 12, 15, 10, 0.0F);
	        this.LeftKnee = new ModelRenderer(this, 97, 120);
	        this.LeftKnee.setRotationPoint(0.0F, 11.2F, -1.5F);
	        this.LeftKnee.addBox(-2.0F, -1.0F, -1.0F, 4, 3, 2, 0.0F);
	        this.LowerJaw3 = new ModelRenderer(this, 59, 121);
	        this.LowerJaw3.setRotationPoint(0.0F, 0.0F, -6.0F);
	        this.LowerJaw3.addBox(-3.0F, 0.0F, -2.0F, 6, 2, 2, 0.0F);
	        this.RightArmCover2 = new ModelRenderer(this, 46, 25);
	        this.RightArmCover2.setRotationPoint(0.0F, 0.2F, 0.0F);
	        this.RightArmCover2.addBox(-2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F);
	        this.RightArmCover1 = new ModelRenderer(this, 46, 9);
	        this.RightArmCover1.setRotationPoint(0.0F, 0.8F, 0.0F);
	        this.RightArmCover1.addBox(-2.5F, 0.0F, -2.5F, 5, 9, 5, 0.0F);
	        this.LeftEarCover1 = new ModelRenderer(this, 108, 40);
	        this.LeftEarCover1.setRotationPoint(0.0F, 0.0F, 0.0F);
	        this.LeftEarCover1.addBox(-1.5F, -5.1F, -1.0F, 3, 5, 2, 0.0F);
	        this.RightFingers2 = new ModelRenderer(this, 64, 70);
	        this.RightFingers2.setRotationPoint(0.0F, 1.0F, 0.0F);
	        this.RightFingers2.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 4, 0.0F);
	        this.setRotateAngle(RightFingers2, 0.0F, 0.0F, -0.27314402793711257F);
	        this.LeftLegCover1 = new ModelRenderer(this, 101, 87);
	        this.LeftLegCover1.setRotationPoint(0.0F, 0.0F, 0.0F);
	        this.LeftLegCover1.addBox(-3.0F, 0.0F, -3.0F, 6, 10, 6, 0.0F);
	        this.Rightfingers3 = new ModelRenderer(this, 63, 79);
	        this.Rightfingers3.setRotationPoint(0.0F, 1.0F, 0.0F);
	        this.Rightfingers3.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
	        this.setRotateAngle(Rightfingers3, 0.0F, 0.0F, -0.27314402793711257F);
	        this.RightArm1 = new ModelRenderer(this, 0, 38);
	        this.RightArm1.setRotationPoint(-8.0F, 0.0F, 0.0F);
	        this.RightArm1.addBox(-1.5F, 0.0F, -1.5F, 3, 10, 3, 0.0F);
	        this.setRotateAngle(RightArm1, 0.136659280431156F, -0.136659280431156F, 0.18203784098300857F);
	        this.LeftArm1 = new ModelRenderer(this, 0, 38);
	        this.LeftArm1.setRotationPoint(8.0F, 0.0F, 0.0F);
	        this.LeftArm1.addBox(-1.5F, 0.0F, -1.5F, 3, 10, 3, 0.0F);
	        this.setRotateAngle(LeftArm1, 0.136659280431156F, 0.136659280431156F, -0.18203784098300857F);
	        this.RightHand = new ModelRenderer(this, 62, 51);
	        this.RightHand.setRotationPoint(0.0F, 9.0F, 0.0F);
	        this.RightHand.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 4, 0.0F);
	        this.setRotateAngle(RightHand, 0.0F, -0.22759093446006054F, -0.045553093477052F);
	        this.RightFingers1 = new ModelRenderer(this, 64, 61);
	        this.RightFingers1.setRotationPoint(-0.5F, 4.0F, 0.0F);
	        this.RightFingers1.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 4, 0.0F);
	        this.setRotateAngle(RightFingers1, 0.0F, 0.0F, -0.091106186954104F);
	        this.LeftFingers2 = new ModelRenderer(this, 96, 70);
	        this.LeftFingers2.setRotationPoint(0.0F, 1.0F, 0.0F);
	        this.LeftFingers2.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 4, 0.0F);
	        this.setRotateAngle(LeftFingers2, 0.0F, 0.0F, 0.27314402793711257F);
	        this.RightEar1 = new ModelRenderer(this, 110, 77);
	        this.RightEar1.setRotationPoint(-3.0F, -7.5F, 0.0F);
	        this.RightEar1.addBox(-1.0F, -3.0F, -0.5F, 2, 3, 1, 0.0F);
	        this.setRotateAngle(RightEar1, 0.22759093446006054F, 0.36425021489121656F, -0.136659280431156F);
	        this.RightEyelid = new ModelRenderer(this, 0, 113);
	        this.RightEyelid.setRotationPoint(-2.0F, -5.8F, -3.0F);
	        this.RightEyelid.addBox(-1.5F, -1.0F, -2.0F, 3, 1, 2, 0.0F);
	        this.LeftEar2 = new ModelRenderer(this, 119, 66);
	        this.LeftEar2.setRotationPoint(0.0F, -6.0F, 0.0F);
	        this.LeftEar2.addBox(-1.0F, -5.0F, -0.5F, 2, 5, 1, 0.0F);
	        this.setRotateAngle(LeftEar2, 0.6373942428283291F, -0.045553093477052F, 0.0F);
	        this.UpperJaw = new ModelRenderer(this, 0, 105);
	        this.UpperJaw.setRotationPoint(0.0F, 0.0F, -1.0F);
	        this.UpperJaw.addBox(-3.0F, 0.0F, -2.0F, 6, 3, 2, 0.0F);
	        this.LeftArm2.addChild(this.LeftArmCover2);
	        this.LeftHand.addChild(this.LeftThumb);
	        this.RightLeg2.addChild(this.RightFeet);
	        this.RightArm1.addChild(this.RightArm2);
	        this.LeftLeg2.addChild(this.LeftLegCover2);
	        this.RightEar1.addChild(this.RightEarCover);
	        this.LowerJaw1.addChild(this.LowerJaw2);
	        this.LeftLeg2.addChild(this.LeftFeet);
	        this.LeftFingers2.addChild(this.Leftfingers3);
	        this.Neck1.addChild(this.Head);
	        this.Head.addChild(this.RightEye);
	        this.Body.addChild(this.Hips);
	        this.Body.addChild(this.Neck1);
	        this.LeftArm1.addChild(this.LeftArmCover1);
	        this.LeftArm1.addChild(this.LeftArm2);
	        this.RightLeg1.addChild(this.RightLegCover1);
	        this.RightLeg1.addChild(this.RightLeg2);
	        this.RightLeg1.addChild(this.RightKnee);
	        this.Head.addChild(this.LeftEye);
	        this.Head.addChild(this.LeftEyelid);
	        this.RightHand.addChild(this.RightThumb);
	        this.Head.addChild(this.Mask1);
	        this.LeftEar2.addChild(this.LeftEarCover2);
	        this.Rightfingers3.addChild(this.Rightfingers4);
	        this.Mask1.addChild(this.Mask2);
	        this.LeftHand.addChild(this.LeftFingers1);
	        this.RightArm1.addChild(this.RightShoulder);
	        this.LeftArm1.addChild(this.LeftShoulder);
	        this.RightLeg2.addChild(this.RightLegCover2);
	        this.LeftLeg1.addChild(this.LeftLeg2);
	        this.Mask2.addChild(this.Mask3);
	        this.UpperJaw.addChild(this.Nose);
	        this.Body.addChild(this.ShoulderBase);
	        this.LeftArm2.addChild(this.LeftHand);
	        this.Mask1.addChild(this.LowerJaw1);
	        this.Mask1.addChild(this.LeftEar1);
	        this.Body.addChild(this.Body2);
	        this.LeftLeg1.addChild(this.LeftKnee);
	        this.LowerJaw2.addChild(this.LowerJaw3);
	        this.RightArm2.addChild(this.RightArmCover2);
	        this.RightArm1.addChild(this.RightArmCover1);
	        this.LeftEar1.addChild(this.LeftEarCover1);
	        this.RightFingers1.addChild(this.RightFingers2);
	        this.LeftLeg1.addChild(this.LeftLegCover1);
	        this.RightFingers2.addChild(this.Rightfingers3);
	        this.ShoulderBase.addChild(this.RightArm1);
	        this.ShoulderBase.addChild(this.LeftArm1);
	        this.RightArm2.addChild(this.RightHand);
	        this.RightHand.addChild(this.RightFingers1);
	        this.LeftFingers1.addChild(this.LeftFingers2);
	        this.Mask1.addChild(this.RightEar1);
	        this.Head.addChild(this.RightEyelid);
	        this.LeftEar1.addChild(this.LeftEar2);
	        this.Mask3.addChild(this.UpperJaw);
	    }

	    @Override
	    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
	    	
	    	/* Animation Start (Head) */
	    	
	  		float prog1 = 0.9F;
	  		Head.rotateAngleY = f3 / (180F / (float)Math.PI);
	  		Head.rotateAngleX = f4 / (180F / (float)Math.PI);
	    	
	    	
	    	/* Animation Start (Arms) */
	    	float prog = 0.1F;
	    	
	    	
	    	this.RightArm1.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
			this.LeftArm1.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
			
	    	

			this.RightArm1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
			this.LeftArm1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
	    	

	    	/* Animation Start (Legs) */
			
			this.LeftLeg1.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
			this.RightLeg1.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
			
	    	

			this.LeftLeg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
			this.RightLeg1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
	    	
	        GL11.glPushMatrix();
	        GL11.glScaled(1D / modelScale[0], 1D / modelScale[1], 1D / modelScale[2]);
	        this.RightLeg1.render(f5);
	        this.Body.render(f5);
	        this.LeftLeg1.render(f5);
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