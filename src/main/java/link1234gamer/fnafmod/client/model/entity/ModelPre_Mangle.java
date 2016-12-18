package link1234gamer.fnafmod.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

/**
 * FuntimeFoxy - Either Mojang or a mod author
 * Created using Tabula 4.1.1
 */
public class ModelPre_Mangle extends ModelBase {
public double[] modelScale = new double[] { 0.9D, 0.9D, 0.9D };
public ModelRenderer RightArm;
public ModelRenderer Body;
public ModelRenderer LeftArm;
public ModelRenderer RightLeg;
public ModelRenderer LeftLeg;
public ModelRenderer Head;
public ModelRenderer RightUnderArm;
public ModelRenderer RightUpperArm;
public ModelRenderer Hookpart1;
public ModelRenderer Hookpart2;
public ModelRenderer hookHandChildChild;
public ModelRenderer hookHandChildChildChild;
public ModelRenderer hookHandChildChildChildChild;
public ModelRenderer hookHandChildChildChildChildChild;
public ModelRenderer Panties;
public ModelRenderer Neck;
public ModelRenderer Middelcrouch;
public ModelRenderer TopChest;
public ModelRenderer LeftUpperArm;
public ModelRenderer LeftUnderArm;
public ModelRenderer LeftArmFingers;
public ModelRenderer LeftArmThumb;
public ModelRenderer RightKnee;
public ModelRenderer RightUnderLeg;
public ModelRenderer Rightfoot;
public ModelRenderer RightToe2;
public ModelRenderer RightToe1;
public ModelRenderer RightToe3;
public ModelRenderer LeftUnderLeg;
public ModelRenderer LeftKnee;
public ModelRenderer LeftFeet;
public ModelRenderer LeftToe1;
public ModelRenderer LeftToe3;
public ModelRenderer LeftToe2;
public ModelRenderer Jaw1;
public ModelRenderer Snout;
public ModelRenderer Leftcheekpart;
public ModelRenderer Rightcheekpart;
public ModelRenderer Head2;
public ModelRenderer Righteye;
public ModelRenderer Lefteye;
public ModelRenderer Rightpupil;
public ModelRenderer Leftpupil;
public ModelRenderer Tophead;
public ModelRenderer Leftearpart;
public ModelRenderer Rightearpart;
public ModelRenderer Jaw2;
public ModelRenderer Jaw3;
public ModelRenderer Snout2;
public ModelRenderer Snout3;
public ModelRenderer Nose;
public ModelRenderer Leftearpart2;
public ModelRenderer Leftearpart3;
public ModelRenderer Leftearpart4;
public ModelRenderer Rightearpart2;
public ModelRenderer Rightearpart3;
public ModelRenderer Rightearpart4;

public ModelPre_Mangle() {
    this.textureWidth = 128;
    this.textureHeight = 64;
    this.LeftLeg = new ModelRenderer(this, 0, 34);
    this.LeftLeg.setRotationPoint(2.2F, 9.0F, 0.5F);
    this.LeftLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 5, 3, 0.0F);
    this.setRotateAngle(LeftLeg, 0.0F, 0.0F, -0.045553093477052F);
    this.Panties = new ModelRenderer(this, 0, 53);
    this.Panties.setRotationPoint(-0.5F, 7.47F, 0.0F);
    this.Panties.addBox(-3.5F, 0.0F, -2.5F, 8, 2, 5, 0.0F);
    this.TopChest = new ModelRenderer(this, 5, 1);
    this.TopChest.setRotationPoint(-3.0F, -2.3F, -1.9F);
    this.TopChest.addBox(0.0F, 0.0F, 0.0F, 6, 3, 4, 0.0F);
    this.Head2 = new ModelRenderer(this, 50, 44);
    this.Head2.setRotationPoint(0.0F, 1.17F, 0.9F);
    this.Head2.addBox(-3.0F, -6.0F, -4.0F, 6, 4, 5, 0.0F);
    this.Righteye = new ModelRenderer(this, 42, 46);
    this.Righteye.mirror = true;
    this.Righteye.setRotationPoint(0.0F, -3.0F, -3.1F);
    this.Righteye.addBox(-2.47F, -1.0F, -0.13F, 2, 2, 1, 0.0F);
    this.hookHandChildChildChildChild = new ModelRenderer(this, 0, 5);
    this.hookHandChildChildChildChild.setRotationPoint(0.0F, 1.7000000476837158F, 0.10000000149011612F);
    this.hookHandChildChildChildChild.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
    this.setRotateAngle(hookHandChildChildChildChild, -0.9599310755729675F, 0.0F, 0.0F);
    this.Tophead = new ModelRenderer(this, 50, 38);
    this.Tophead.setRotationPoint(0.0F, 1.37F, 1.0F);
    this.Tophead.addBox(-2.5F, -7.0F, -3.5F, 5, 1, 4, 0.0F);
    this.LeftUpperArm = new ModelRenderer(this, 47, 5);
    this.LeftUpperArm.mirror = true;
    this.LeftUpperArm.setRotationPoint(0.5F, 0.8F, -0.5F);
    this.LeftUpperArm.addBox(0.0F, 0.53F, -1.0F, 2, 5, 2, 0.0F);
    this.Leftearpart = new ModelRenderer(this, 20, 9);
    this.Leftearpart.setRotationPoint(2.0F, -4.0F, -0.05F);
    this.Leftearpart.addBox(-1.0F, -2.0F, -1.0F, 2, 1, 1, 0.0F);
    this.setRotateAngle(Leftearpart, 0.0F, 0.0F, 0.8726646259971648F);
    this.Jaw3 = new ModelRenderer(this, 0, 9);
    this.Jaw3.setRotationPoint(0.0F, 0.45F, 0.33F);
    this.Jaw3.addBox(-1.5F, 0.1F, -9.0F, 3, 1, 1, 0.0F);
    this.setRotateAngle(Jaw3, -0.0651007810993885F, 0.0F, 0.0F);
    this.Hookpart1 = new ModelRenderer(this, 51, 24);
    this.Hookpart1.setRotationPoint(-0.4F, 5.0F, 0.0F);
    this.Hookpart1.addBox(-1.6F, -0.67F, -1.5F, 3, 2, 3, 0.0F);
    this.Leftcheekpart = new ModelRenderer(this, 30, 44);
    this.Leftcheekpart.setRotationPoint(2.77F, -0.5F, -1.5F);
    this.Leftcheekpart.addBox(0.0F, -1.0F, -1.5F, 2, 1, 3, 0.0F);
    this.setRotateAngle(Leftcheekpart, 0.0F, 0.0F, 0.22759093446006054F);
    this.Rightpupil = new ModelRenderer(this, 73, 46);
    this.Rightpupil.mirror = true;
    this.Rightpupil.setRotationPoint(0.0F, -3.0F, -3.1F);
    this.Rightpupil.addBox(-1.7F, -0.1F, -0.2F, 1, 1, 1, 0.0F);
    this.Jaw1 = new ModelRenderer(this, 66, 56);
    this.Jaw1.setRotationPoint(0.0F, 0.0F, 1.0F);
    this.Jaw1.addBox(-2.5F, 0.1F, -6.0F, 5, 1, 6, 0.0F);
    this.setRotateAngle(Jaw1, 0.08726646259971647F, 0.0F, 0.0F);
    this.LeftUnderArm = new ModelRenderer(this, 21, 43);
    this.LeftUnderArm.mirror = true;
    this.LeftUnderArm.setRotationPoint(1.1F, 5.6F, -0.5F);
    this.LeftUnderArm.addBox(-0.5F, 0.53F, -0.9F, 2, 5, 2, 0.0F);
    this.setRotateAngle(LeftUnderArm, -0.18203784098300857F, 0.0F, 0.19949113350295186F);
    this.LeftToe3 = new ModelRenderer(this, 87, 26);
    this.LeftToe3.setRotationPoint(0.7F, 10.62F, -1.9F);
    this.LeftToe3.addBox(0.0F, 0.0F, -3.0F, 1, 2, 2, 0.0F);
    this.setRotateAngle(LeftToe3, 0.0F, -0.18203784098300857F, 0.045553093477052F);
    this.Nose = new ModelRenderer(this, 36, 17);
    this.Nose.setRotationPoint(0.0F, -1.83F, -9.07F);
    this.Nose.addBox(-1.0F, -1.5F, -0.5F, 2, 1, 1, 0.0F);
    this.setRotateAngle(Nose, -0.3665191429188092F, 0.0F, 0.0F);
    this.LeftArmFingers = new ModelRenderer(this, 59, 31);
    this.LeftArmFingers.setRotationPoint(0.6F, 6.6F, 0.6F);
    this.LeftArmFingers.addBox(0.0F, -1.57F, -1.63F, 1, 3, 2, 0.0F);
    this.setRotateAngle(LeftArmFingers, -0.091106186954104F, 0.0F, 0.136659280431156F);
    this.Snout3 = new ModelRenderer(this, 36, 20);
    this.Snout3.setRotationPoint(0.0F, 0.05F, 0.33F);
    this.Snout3.addBox(-1.5F, -3.0F, -9.0F, 3, 2, 3, 0.0F);
    this.Rightearpart3 = new ModelRenderer(this, 20, 9);
    this.Rightearpart3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Rightearpart3.addBox(-1.0F, -6.0F, -1.0F, 2, 1, 1, 0.0F);
    this.Lefteye = new ModelRenderer(this, 42, 46);
    this.Lefteye.mirror = true;
    this.Lefteye.setRotationPoint(0.0F, -3.0F, -3.1F);
    this.Lefteye.addBox(0.5F, -1.0F, -0.13F, 2, 2, 1, 0.0F);
    this.hookHandChildChildChildChildChild = new ModelRenderer(this, 0, 5);
    this.hookHandChildChildChildChildChild.setRotationPoint(0.0F, 1.7000000476837158F, 0.10000000149011612F);
    this.hookHandChildChildChildChildChild.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
    this.setRotateAngle(hookHandChildChildChildChildChild, -0.9599310755729675F, 0.0F, 0.0F);
    this.LeftUnderLeg = new ModelRenderer(this, 0, 18);
    this.LeftUnderLeg.setRotationPoint(-1.0F, 5.5F, -1.2F);
    this.LeftUnderLeg.addBox(-0.5F, 0.0F, -0.7F, 3, 6, 3, 0.0F);
    this.setRotateAngle(LeftUnderLeg, 0.045553093477052F, 0.0F, 0.0F);
    this.RightToe3 = new ModelRenderer(this, 74, 31);
    this.RightToe3.setRotationPoint(1.24F, 10.45F, -4.8F);
    this.RightToe3.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
    this.setRotateAngle(RightToe3, 0.0F, -0.18203784098300857F, -0.045553093477052F);
    this.LeftArmThumb = new ModelRenderer(this, 51, 32);
    this.LeftArmThumb.setRotationPoint(-0.9F, 6.1F, 0.6F);
    this.LeftArmThumb.addBox(0.0F, -0.97F, -1.63F, 1, 2, 2, 0.0F);
    this.setRotateAngle(LeftArmThumb, -0.045553093477052F, 0.0F, 0.045553093477052F);
    this.Neck = new ModelRenderer(this, 18, 19);
    this.Neck.setRotationPoint(0.0F, -2.23F, 0.3F);
    this.Neck.addBox(-1.0F, -2.5F, -1.0F, 2, 3, 2, 0.0F);
    this.LeftFeet = new ModelRenderer(this, 48, 13);
    this.LeftFeet.setRotationPoint(-2.0F, 10.5F, -3.1F);
    this.LeftFeet.addBox(0.0F, 0.0F, 0.0F, 4, 2, 5, 0.0F);
    this.setRotateAngle(LeftFeet, 0.0F, 0.0F, 0.045553093477052F);
    this.Rightearpart4 = new ModelRenderer(this, 12, 9);
    this.Rightearpart4.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Rightearpart4.addBox(-0.5F, -7.0F, -1.0F, 1, 1, 1, 0.0F);
    this.Hookpart2 = new ModelRenderer(this, 67, 24);
    this.Hookpart2.setRotationPoint(0.0F, 4.8F, 0.0F);
    this.Hookpart2.addBox(-1.5F, 1.43F, -1.0F, 2, 1, 2, 0.0F);
    this.Snout2 = new ModelRenderer(this, 18, 14);
    this.Snout2.setRotationPoint(0.0F, 0.05F, -0.07F);
    this.Snout2.addBox(-2.0F, -3.0F, -6.0F, 4, 2, 2, 0.0F);
    this.Middelcrouch = new ModelRenderer(this, 28, 55);
    this.Middelcrouch.setRotationPoint(-0.5F, 6.87F, -0.3F);
    this.Middelcrouch.addBox(-2.5F, 0.0F, -1.6F, 6, 1, 4, 0.0F);
    this.Rightfoot = new ModelRenderer(this, 48, 13);
    this.Rightfoot.setRotationPoint(-2.0F, 10.6F, -3.1F);
    this.Rightfoot.addBox(0.0F, 0.0F, 0.0F, 4, 2, 5, 0.0F);
    this.setRotateAngle(Rightfoot, 0.0F, 0.0F, -0.04153883619746504F);
    this.RightLeg = new ModelRenderer(this, 7, 43);
    this.RightLeg.setRotationPoint(-2.2F, 9.0F, 0.5F);
    this.RightLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 5, 3, 0.0F);
    this.setRotateAngle(RightLeg, -0.0F, 0.0F, 0.045553093477052F);
    this.RightUpperArm = new ModelRenderer(this, 47, 5);
    this.RightUpperArm.setRotationPoint(-0.5F, 0.8F, -0.5F);
    this.RightUpperArm.addBox(-2.0F, 0.53F, -1.0F, 2, 5, 2, 0.0F);
    this.LeftToe2 = new ModelRenderer(this, 80, 25);
    this.LeftToe2.setRotationPoint(0.3F, 10.6F, -2.0F);
    this.LeftToe2.addBox(-2.0F, 0.0F, -3.0F, 1, 2, 2, 0.0F);
    this.setRotateAngle(LeftToe2, 0.0F, 0.18203784098300857F, 0.045553093477052F);
    this.RightUnderArm = new ModelRenderer(this, 71, 39);
    this.RightUnderArm.setRotationPoint(-1.1F, 5.6F, -0.5F);
    this.RightUnderArm.addBox(-1.5F, 0.53F, -1.0F, 2, 4, 2, 0.0F);
    this.setRotateAngle(RightUnderArm, -0.136659280431156F, -0.045553093477052F, -0.18203784098300857F);
    this.LeftToe1 = new ModelRenderer(this, 83, 34);
    this.LeftToe1.setRotationPoint(0.52F, 10.61F, -1.8F);
    this.LeftToe1.addBox(-1.5F, 0.0F, -3.0F, 2, 2, 2, 0.0F);
    this.setRotateAngle(LeftToe1, 0.0F, 0.0F, 0.045553093477052F);
    this.LeftKnee = new ModelRenderer(this, 57, 1);
    this.LeftKnee.setRotationPoint(-1.0F, 4.3F, -1.2F);
    this.LeftKnee.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
    this.Rightearpart2 = new ModelRenderer(this, 37, 3);
    this.Rightearpart2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Rightearpart2.addBox(-1.5F, -5.0F, -1.0F, 3, 3, 1, 0.0F);
    this.Head = new ModelRenderer(this, 51, 56);
    this.Head.setRotationPoint(0.0F, -4.5F, 0.1F);
    this.Head.addBox(-2.0F, -0.8F, -1.2F, 4, 2, 3, 0.0F);
    this.Leftearpart2 = new ModelRenderer(this, 34, 11);
    this.Leftearpart2.setRotationPoint(0.1F, 0.0F, 0.0F);
    this.Leftearpart2.addBox(-1.5F, -5.0F, -1.0F, 3, 3, 1, 0.0F);
    this.hookHandChildChild = new ModelRenderer(this, 13, 16);
    this.hookHandChildChild.setRotationPoint(-0.5F, 6.3F, -0.4F);
    this.hookHandChildChild.addBox(-0.5F, 0.1F, -0.5F, 1, 3, 1, 0.0F);
    this.setRotateAngle(hookHandChildChild, 0.31869712141416456F, 0.0F, 0.0F);
    this.Rightcheekpart = new ModelRenderer(this, 30, 44);
    this.Rightcheekpart.setRotationPoint(-2.77F, -0.5F, -1.5F);
    this.Rightcheekpart.addBox(-2.0F, -1.0F, -1.5F, 2, 1, 3, 0.0F);
    this.setRotateAngle(Rightcheekpart, 0.0F, 0.0F, -0.22759093446006054F);
    this.Leftpupil = new ModelRenderer(this, 73, 46);
    this.Leftpupil.mirror = true;
    this.Leftpupil.setRotationPoint(0.0F, -3.0F, -3.1F);
    this.Leftpupil.addBox(0.7F, -0.1F, -0.2F, 1, 1, 1, 0.0F);
    this.RightToe2 = new ModelRenderer(this, 80, 25);
    this.RightToe2.setRotationPoint(0.3F, 10.49F, -2.0F);
    this.RightToe2.addBox(-2.0F, 0.0F, -3.0F, 1, 2, 2, 0.0F);
    this.setRotateAngle(RightToe2, 0.0F, 0.18203784098300857F, -0.045553093477052F);
    this.RightUnderLeg = new ModelRenderer(this, 0, 18);
    this.RightUnderLeg.setRotationPoint(-1.0F, 5.5F, -1.2F);
    this.RightUnderLeg.addBox(-0.5F, 0.0F, -0.7F, 3, 6, 3, 0.0F);
    this.setRotateAngle(RightUnderLeg, 0.045553093477052F, 0.0F, 0.0F);
    this.Rightearpart = new ModelRenderer(this, 20, 9);
    this.Rightearpart.setRotationPoint(-2.0F, -4.0F, 0.0F);
    this.Rightearpart.addBox(-1.0F, -2.0F, -1.0F, 2, 1, 1, 0.0F);
    this.setRotateAngle(Rightearpart, 0.0F, 0.0F, -0.8726646259971648F);
    this.Leftearpart4 = new ModelRenderer(this, 12, 9);
    this.Leftearpart4.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Leftearpart4.addBox(-0.5F, -7.0F, -1.0F, 1, 1, 1, 0.0F);
    this.Jaw2 = new ModelRenderer(this, 0, 13);
    this.Jaw2.setRotationPoint(0.0F, 0.2F, 0.13F);
    this.Jaw2.addBox(-2.0F, 0.1F, -8.0F, 4, 1, 2, 0.0F);
    this.setRotateAngle(Jaw2, -0.035255650890285456F, 0.0F, 0.0F);
    this.Body = new ModelRenderer(this, 19, 26);
    this.Body.setRotationPoint(0.0F, -0.2F, 0.0F);
    this.Body.addBox(-3.5F, 0.0F, -2.47F, 7, 7, 5, 0.0F);
    this.RightToe1 = new ModelRenderer(this, 83, 34);
    this.RightToe1.setRotationPoint(-0.95F, 10.55F, -4.9F);
    this.RightToe1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
    this.setRotateAngle(RightToe1, 0.0F, 0.0F, -0.045553093477052F);
    this.LeftArm = new ModelRenderer(this, 26, 2);
    this.LeftArm.setRotationPoint(2.7F, -2.4F, 0.5F);
    this.LeftArm.addBox(-1.0F, 0.0F, -1.5F, 3, 2, 2, 0.0F);
    this.setRotateAngle(LeftArm, 0.0F, 0.0F, -0.22759093446006054F);
    this.RightArm = new ModelRenderer(this, 26, 2);
    this.RightArm.setRotationPoint(-2.7F, -2.4F, 0.5F);
    this.RightArm.addBox(-2.0F, 0.0F, -1.5F, 3, 2, 2, 0.0F);
    this.setRotateAngle(RightArm, -0.0F, -0.026703537555513242F, 0.22759093446006054F);
    this.Snout = new ModelRenderer(this, 81, 44);
    this.Snout.setRotationPoint(0.0F, 1.0F, 0.9F);
    this.Snout.addBox(-5.0F, -2.0F, -4.0F, 10, 1, 3, 0.0F);
    this.hookHandChildChildChild = new ModelRenderer(this, 0, 5);
    this.hookHandChildChildChild.setRotationPoint(0.0F, 2.700000047683716F, 0.10000000149011612F);
    this.hookHandChildChildChild.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
    this.setRotateAngle(hookHandChildChildChild, -0.8726646304130553F, 0.0F, 0.0F);
    this.Leftearpart3 = new ModelRenderer(this, 20, 9);
    this.Leftearpart3.setRotationPoint(0.1F, 0.0F, 0.0F);
    this.Leftearpart3.addBox(-1.0F, -6.0F, -1.0F, 2, 1, 1, 0.0F);
    this.RightKnee = new ModelRenderer(this, 57, 7);
    this.RightKnee.setRotationPoint(-1.0F, 4.3F, -1.2F);
    this.RightKnee.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
    this.Body.addChild(this.Panties);
    this.Body.addChild(this.TopChest);
    this.Head.addChild(this.Head2);
    this.Head.addChild(this.Righteye);
    this.hookHandChildChildChild.addChild(this.hookHandChildChildChildChild);
    this.Head.addChild(this.Tophead);
    this.LeftArm.addChild(this.LeftUpperArm);
    this.Head.addChild(this.Leftearpart);
    this.Jaw1.addChild(this.Jaw3);
    this.RightUnderArm.addChild(this.Hookpart1);
    this.Head.addChild(this.Leftcheekpart);
    this.Head.addChild(this.Rightpupil);
    this.Head.addChild(this.Jaw1);
    this.LeftArm.addChild(this.LeftUnderArm);
    this.LeftLeg.addChild(this.LeftToe3);
    this.Snout.addChild(this.Nose);
    this.LeftUnderArm.addChild(this.LeftArmFingers);
    this.Snout.addChild(this.Snout3);
    this.Rightearpart.addChild(this.Rightearpart3);
    this.Head.addChild(this.Lefteye);
    this.hookHandChildChildChildChild.addChild(this.hookHandChildChildChildChildChild);
    this.LeftLeg.addChild(this.LeftUnderLeg);
    this.RightLeg.addChild(this.RightToe3);
    this.LeftUnderArm.addChild(this.LeftArmThumb);
    this.Body.addChild(this.Neck);
    this.LeftLeg.addChild(this.LeftFeet);
    this.Rightearpart.addChild(this.Rightearpart4);
    this.RightUnderArm.addChild(this.Hookpart2);
    this.Snout.addChild(this.Snout2);
    this.Body.addChild(this.Middelcrouch);
    this.RightLeg.addChild(this.Rightfoot);
    this.RightArm.addChild(this.RightUpperArm);
    this.LeftLeg.addChild(this.LeftToe2);
    this.RightArm.addChild(this.RightUnderArm);
    this.LeftLeg.addChild(this.LeftToe1);
    this.LeftLeg.addChild(this.LeftKnee);
    this.Rightearpart.addChild(this.Rightearpart2);
    this.Leftearpart.addChild(this.Leftearpart2);
    this.RightUnderArm.addChild(this.hookHandChildChild);
    this.Head.addChild(this.Rightcheekpart);
    this.Head.addChild(this.Leftpupil);
    this.RightLeg.addChild(this.RightToe2);
    this.RightLeg.addChild(this.RightUnderLeg);
    this.Head.addChild(this.Rightearpart);
    this.Leftearpart.addChild(this.Leftearpart4);
    this.Jaw1.addChild(this.Jaw2);
    this.RightLeg.addChild(this.RightToe1);
    this.Head.addChild(this.Snout);
    this.hookHandChildChild.addChild(this.hookHandChildChildChild);
    this.Leftearpart.addChild(this.Leftearpart3);
    this.RightLeg.addChild(this.RightKnee);
}

@Override
public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
	
	/* Animation Start (Head) */
	
    float prog1 = 0.9F;
	Head.rotateAngleY = f3 / (180F / (float)Math.PI);
	Head.rotateAngleX = f4 / (180F / (float)Math.PI);
	
	
	/* Animation Start (Arms) */
	float prog = 0.1F;
	
	
	this.RightArm.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
	this.LeftArm.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
	
	

	this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
	this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
	

	/* Animation Start (Legs) */
	
	this.LeftLeg.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
	this.RightLeg.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
	
	

	this.LeftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
	this.RightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
	
	
    GL11.glPushMatrix();
    GL11.glScaled(1D / modelScale[0], 1D / modelScale[1], 1D / modelScale[2]);
    this.LeftLeg.render(f5);
    this.RightLeg.render(f5);
    this.Head.render(f5);
    this.Body.render(f5);
    this.LeftArm.render(f5);
    this.RightArm.render(f5);
    GL11.glPopMatrix();
}

public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
    modelRenderer.rotateAngleX = x;
    modelRenderer.rotateAngleY = y;
    modelRenderer.rotateAngleZ = z;
}
}

