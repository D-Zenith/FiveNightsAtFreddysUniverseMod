package link1234gamer.fnafmod.common.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import link1234gamer.fnafmod.FNAFMod;
import link1234gamer.fnafmod.common.entity.ai.WFreddyAI.EntityWFreddyAIAttackOnCollide;
import link1234gamer.fnafmod.common.entity.ai.WFreddyAI.EntityWFreddyAILookIdle;
import link1234gamer.fnafmod.common.entity.ai.WFreddyAI.EntityWFreddyAIMoveTowardsRestriction;
import link1234gamer.fnafmod.common.entity.ai.WFreddyAI.EntityWFreddyAINearestAttackableTarget;
import link1234gamer.fnafmod.common.entity.ai.WFreddyAI.EntityWFreddyAIWander;
import link1234gamer.fnafmod.common.entity.ai.WFreddyAI.EntityWFreddyAIWatchClosest;
import net.minecraft.block.Block;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityWFreddy extends EntityMob{

	public EntityWFreddy(World world) {
		super(world);
		this.setSize(0.9F, 2.5F);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIBreakDoor(this));
        this.tasks.addTask(2, new EntityWFreddyAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        this.tasks.addTask(3, new EntityWFreddyAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(4, new EntityWFreddyAIWander(this, 1.0D));
        this.tasks.addTask(5, new EntityWFreddyAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityWFreddyAILookIdle(this));
        this.targetTasks.addTask(1, new EntityWFreddyAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.targetTasks.addTask(2, new EntityWFreddyAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		
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
		return isAgressive() ? livingSound() : null;
	}
	
	protected String livingSound()
	{
	    return null /*FNAFMod.MODID + ":mob.bonnie.moan"*/;	
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

	protected void dropFewItems(boolean par1, int par2)
	{
		super.dropFewItems(par1, par2);
		dropItem(Items.iron_ingot, 5 + rand.nextInt(10));
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
