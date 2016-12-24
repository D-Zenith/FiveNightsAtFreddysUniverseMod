package link1234gamer.fnafmod.common.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import link1234gamer.fnafmod.FNAFMod;
import link1234gamer.fnafmod.client.gui.GoldenFreddyJumpscare;
import link1234gamer.fnafmod.common.entity.ai.GoldenFreddyAI.EntityGoldenFreddyAIMoveTowardsRestriction;
import link1234gamer.fnafmod.common.entity.ai.GoldenFreddyAI.EntityGoldenFreddyAIStare;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathPoint;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent;
import scala.tools.nsc.transform.patmat.ScalaLogic.TreesAndTypesDomain.Var;

	public class EntityGoldenFreddy extends EntityMob{
		private float eyeHeight = 1.8F;
		private int stareTimer;
		private boolean isAggressive;
		private double EntityPosX;
		private double EntityPosY;
		private double EntityPosZ; 
		private static Minecraft mc = Minecraft.getMinecraft();
//		private static final String __OBFID = "CL_00001685";
		private static final String Golden_Freddy_Scream = ("fnafmod:sounds/Golden_Freddy_Scream");

		public EntityGoldenFreddy(World world) {
			super(world);
			this.setSize(0.9F, 1.9F);
		
		this.tasks.addTask(1, new EntityAIBreakDoor(this));
		this.tasks.addTask(2, new EntityGoldenFreddyAIStare(this, EntityPlayer.class, 32.0F));
		this.tasks.addTask(5, new EntityGoldenFreddyAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityVillager.class, 1.0D, true));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, false));
		
	}
	protected boolean canDespawn()
	{
		return false;
	}
		
	public Vec3 getLookVec()
        {
                return this.getLook(1.0F);
        }
	
	public boolean isAIEnabled()
	{
		return true;
	}
			
	protected String getLivingSound()
	{
		return null;
	}
	
	public void onUpdate()
	{
		super.onUpdate();
		
		if (!isDead)
		{
			if (rand.nextInt(1000) == 0)
			{
				playSound(FNAFMod.MODID + ":mob.gfreddy.say", 1, 1);
			}
		}
	}
	
	 @SideOnly(Side.CLIENT)
	    public Vec3 getPosition(float p_70666_1_)
	    {
	        if (p_70666_1_ == 1.0F)
	        {
	            return Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
	        }
	        else
	        {
	            double d0 = this.prevPosX + (this.posX - this.prevPosX) * (double)p_70666_1_;
	            double d1 = this.prevPosY + (this.posY - this.prevPosY) * (double)p_70666_1_;
		    double d2 = this.prevPosZ + (this.posZ - this.prevPosZ) * (double)p_70666_1_;
	            return Vec3.createVectorHelper(d0, d1, d2);
	        }
	    }
	
    public boolean canEntityBeSeen(Entity p_70685_1_){
        return this.worldObj.rayTraceBlocks(Vec3.createVectorHelper(this.EntityPosX, this.EntityPosY + (double)this.getEyeHeight(), this.EntityPosZ), Vec3.createVectorHelper(p_70685_1_.posX, p_70685_1_.posY + (double)p_70685_1_.getEyeHeight(), p_70685_1_.posZ)) == null;
    }
    
    public boolean shouldJumpscarePlayer(EntityPlayer p_70821_1_){
    	  {
    	        ItemStack itemstack = p_70821_1_.inventory.armorInventory[3];

    	        if (itemstack != null && itemstack.getItem() == Item.getItemFromBlock(null))
    	        {
    	            return false;
    	        }
    	        else
    	        {
	  Vec3 vec3 = p_70821_1_.getLook(1.0F).normalize();
      Vec3 vec31 = Vec3.createVectorHelper(this.posX - p_70821_1_.posX, this.boundingBox.minY + (double)(this.height / 2.0F) - (p_70821_1_.posY + (double)p_70821_1_.getEyeHeight()), this.posZ - p_70821_1_.posZ);
      double d0 = vec31.lengthVector();
      vec31 = vec31.normalize();
      double d1 = vec3.dotProduct(vec31);
      return d1 > 1.0D - 0.025D / d0 && p_70821_1_.canEntityBeSeen(this);
    	        }
    	  }
    }
   

	protected String getJumpscareSound()
	{
		return FNAFMod.MODID + ":sounds/Golden_Freddy_Scream";
	}
	
	protected String getHurtSound()
	{
		return FNAFMod.MODID + ":mob.animatronic.hurt";
	}
	
	protected String getDeathSound()
	{
		return FNAFMod.MODID + ":mob.animatronic.hurt";
	}
	
    protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_)
    {
        this.playSound("fnafmod:mob.animatronic.step", 0.15F, 1.0F);
    }
    
	public boolean isAgressive()
	{
        long time = worldObj.getWorldTime() % 24000;
		int hours = (int)time / 1000 + 6 > 24 ? (int)time / 1000 + 6 - 24 : (int)time / 1000 + 6;
		return hours >= 19 || hours < 6;
	}
    public void setJumpscarePlayer(boolean p_70819_1_)
    {
        this.dataWatcher.updateObject(18, Byte.valueOf((byte)(p_70819_1_ ? 1 : 0)));
    }
    
    {

	 if (this.shouldJumpscarePlayer(attackingPlayer) && !this.isAggressive && this.rand.nextInt(100) == 0)
	    {
	        this.setJumpscarePlayer(false);
	        }
	    if (this.shouldJumpscarePlayer(attackingPlayer) && this.isAggressive && this.rand.nextInt(100) == 0){	   	
	    	worldObj.playSoundEffect(this.EntityPosX, this.EntityPosY, this.EntityPosZ, Golden_Freddy_Scream, 1.0F, 1.0F);
		   	 }
	    }{
     if (this.shouldJumpscarePlayer(attackingPlayer) && this.isAggressive){
	 new GoldenFreddyJumpscare();
	 }
	    }
	    
	    {
     if (this.shouldJumpscarePlayer(attackingPlayer)&& this.isAggressive){
	 mc.thePlayer.setHealth(0);
	 }
 }
	protected void dropFewItems(boolean par1, int par2)
	{
		super.dropFewItems(par1, par2);
		dropItem(Items.iron_ingot, 5 + rand.nextInt(10));
	}	
	
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(32.0F);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0D);
		this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1000F);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(0F);	
	}

	@SideOnly(Side.CLIENT)
    public int getBrightnessForRender(float p_70070_1_)
	{
		int i = MathHelper.floor_double(this.posX);
        int j = MathHelper.floor_double(this.posZ);

        if (this.worldObj.blockExists(i, 0, j))
        {
            int k = MathHelper.floor_double(this.posY);
            return this.worldObj.getLightBrightnessForSkyBlocks(i, k, j, 0);
        }
        else
        {
            return 0;
        }
    }
}
