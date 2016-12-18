package link1234gamer.fnafmod.common.entity;

import link1234gamer.fnafmod.FNAFMod;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityNightMarionne extends EntityMob {

	public EntityNightMarionne(World world) {
		super(world);
		this.setSize(0.9F, 2.8F);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIBreakDoor(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
//      this.tasks.addTask(9, new EntityFredbearAIStare(this, EntityPlayer.class, 3.0F));
        this.tasks.addTask(10, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, true));
        
	}
	
	protected boolean canDespawn()
	{
		return false;
	}
	
	public boolean isAIEnabled()
	{
		return true;
	}
	
	protected String getLivingSound()
	{
	    return FNAFMod.MODID + ":mob.fredbear.laugh";	
	}
	
	protected String getHurtSound()
	{
		return FNAFMod.MODID + ":mob.animatronic.hurt";
	}
	
	protected String getDeathSound()
	{
		return FNAFMod.MODID + ":mob.animatronic.hurt";
	}
	
//    protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_)
//    {
//        this.playSound("fnafmod:mob.animatronic.step", 0.15F, 1.0F);
//    }

	protected void dropFewItems(boolean par1, int par2)
	{
		super.dropFewItems(par1, par2);
		dropItem(Items.string, 5 + rand.nextInt(10));
	}	
	
    protected Entity findPlayerToAttack()
    {
        float f = this.getBrightness(1.0F);

        if (f < 0.5F)
        {
            double d0 = 16.0D;
            return this.worldObj.getClosestVulnerablePlayerToEntity(this, d0);
        }
        else
        {
            return null;
        }
    }
    
    protected void attackEntity(Entity p_70785_1_, float p_70785_2_)
    {
        float f1 = this.getBrightness(1.0F);

        if (f1 > 0.5F && this.rand.nextInt(100) == 0)
        {
            this.entityToAttack = null;
        }
        else
        {
            if (p_70785_2_ > 2.0F && p_70785_2_ < 6.0F && this.rand.nextInt(10) == 0)
            {
                if (this.onGround)
                {
                    double d0 = p_70785_1_.posX - this.posX;
                    double d1 = p_70785_1_.posZ - this.posZ;
                    float f2 = MathHelper.sqrt_double(d0 * d0 + d1 * d1);
                    this.motionX = d0 / (double)f2 * 0.5D * 0.800000011920929D + this.motionX * 0.20000000298023224D;
                    this.motionZ = d1 / (double)f2 * 0.5D * 0.800000011920929D + this.motionZ * 0.20000000298023224D;
                    this.motionY = 0.4000000059604645D;
                }
            }
            else
            {
                super.attackEntity(p_70785_1_, p_70785_2_);
            }
        }
    }
	
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(32.0F);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.2D);
		this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1000F);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(64.0F);	
    }
}