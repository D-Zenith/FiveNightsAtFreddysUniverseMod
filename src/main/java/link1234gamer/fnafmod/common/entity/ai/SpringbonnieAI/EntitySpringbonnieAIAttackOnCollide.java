package link1234gamer.fnafmod.common.entity.ai.SpringbonnieAI;

import java.util.Map;

import com.google.common.collect.Maps;

import link1234gamer.fnafmod.common.entity.EntitySpringbonnie;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;


public class EntitySpringbonnieAIAttackOnCollide extends EntityAIBase
{
    World worldObj;
    EntitySpringbonnie attacker;
    int attackTick;
    double speedTowardsTarget;
    boolean longMemory;
    PathEntity entityPathEntity;
    Class classTarget;
    private int field_75445_i;
    private double field_151497_i;
    private double field_151495_j;
    private double field_151496_k;
    
    private Map<String, Integer> ticksPlayerIsSeen = Maps.newHashMap();
    private Map<String, Integer> playerMemory = Maps.newHashMap();
    
    private int failedPathFindingPenalty;

    public EntitySpringbonnieAIAttackOnCollide(EntitySpringbonnie p_i1635_1_, Class p_i1635_2_, double p_i1635_3_, boolean p_i1635_5_)
    {
        this(p_i1635_1_, p_i1635_3_, p_i1635_5_);
        this.classTarget = p_i1635_2_;
    }

    public EntitySpringbonnieAIAttackOnCollide(EntitySpringbonnie p_i1636_1_, double p_i1636_2_, boolean p_i1636_4_)
    {
        this.attacker = p_i1636_1_;
        this.worldObj = p_i1636_1_.worldObj;
        this.speedTowardsTarget = p_i1636_2_;
        this.longMemory = p_i1636_4_;
        this.setMutexBits(3);
    }
    
    public boolean shouldExecute()
    {
        EntityLivingBase entitylivingbase = this.attacker.getAttackTarget();

        if (entitylivingbase == null)
        {
            return false;
        }
        else if (!entitylivingbase.isEntityAlive())
        {
            return false;
        }
        else if (this.classTarget != null && !this.classTarget.isAssignableFrom(entitylivingbase.getClass()))
        {
            return false;
        }
        else
        {
            if (-- this.field_75445_i <= 0)
            {
                this.entityPathEntity = this.attacker.getNavigator().getPathToEntityLiving(entitylivingbase);
               this.field_75445_i = 4 + this.attacker.getRNG().nextInt(7);
                return this.entityPathEntity != null;
            }
            else
            {
                return true;
            }
        }
    }
    
    public boolean continueExecuting()
    {
        EntityLivingBase entitylivingbase = this.attacker.getAttackTarget();
        return entitylivingbase == null ? false : (!entitylivingbase.isEntityAlive() ? false : (!this.longMemory ? !this.attacker.getNavigator().noPath() : this.attacker.isWithinHomeDistance(MathHelper.floor_double(entitylivingbase.posX), MathHelper.floor_double(entitylivingbase.posY), MathHelper.floor_double(entitylivingbase.posZ))));
    }
    
    public void startExecuting()
    {
        this.attacker.getNavigator().setPath(this.entityPathEntity, this.speedTowardsTarget);
        this.field_75445_i = 0;
    }
    
    public void resetTask()
    {
//        this.attacker.getNavigator().clearPathEntity();
    }
    
    public int getTicksPlayerIsSeen(EntityPlayer player)
    {
		return ticksPlayerIsSeen.get(player.getUniqueID().toString()) == null ? 0 : ticksPlayerIsSeen.get(player.getUniqueID().toString());
	}
    
    public void setTicksPlayerIsSeen(EntityPlayer player, int i)
    {
		this.ticksPlayerIsSeen.put(player.getUniqueID().toString(), i);
	}
    
    public int getPlayerMemory(EntityPlayer player)
    {
		return ticksPlayerIsSeen.get(player.getUniqueID().toString()) == null ? 0 : ticksPlayerIsSeen.get(player.getUniqueID().toString());
	}
    
    public void setPlayerMemory(EntityPlayer player, int i)
    {
		this.ticksPlayerIsSeen.put(player.getUniqueID().toString(), i);
	}
    
    public void updateTask()
    {
//    	attacker.setSize(0.5F, 0.9F, false);
//   	attacker.getNavigator().setSpeed(this.speedTowardsTarget * (attacker.isCrawling() ? 0.8D : 1));
    	
    	if (this.attacker.isAgressive())
    	{
    		EntityLivingBase entitylivingbase = this.attacker.getAttackTarget();
            this.attacker.getLookHelper().setLookPositionWithEntity(entitylivingbase, 30.0F, 30.0F);
            double d0 = this.attacker.getDistanceSq(entitylivingbase.posX, entitylivingbase.boundingBox.minY, entitylivingbase.posZ);
            double d1 = (double)(this.attacker.width * 2.0F * this.attacker.width * 2.0F + entitylivingbase.width);
            boolean shouldAttack = true;
            --this.field_75445_i;
            
            // TODO: Fix memory leaks with AI
//            this.attacker.getNavigator().tryMoveToEntityLiving(entitylivingbase, this.speedTowardsTarget / (attacker.isCrawling() ? 2 : 1));
            
            if (entitylivingbase instanceof EntityPlayer)
            {
            	EntityPlayer player = (EntityPlayer)entitylivingbase;
            	
//            	if (attacker.getEntitySenses().canSee(player) && !(player.getHeldItem() != null && player.getHeldItem().getItem() instanceof ItemFreddyHead && player.getItemInUseDuration() >= 3))
            	{
            		setTicksPlayerIsSeen(player, getTicksPlayerIsSeen(player) + 1);
            		setPlayerMemory(player, 40);
            	}
            	
//                shouldAttack = getTicksPlayerIsSeen(player) >= attacker.getAnimatronic().getFreddyHeadTolerance(attacker);
            }
            
            for (Object obj : worldObj.playerEntities)
            {
            	EntityPlayer player = (EntityPlayer)obj;
            	int memory = getPlayerMemory(player);
            	
            	if (!attacker.getEntitySenses().canSee(player) && memory > 0)
            	{
            		setPlayerMemory(player, memory - 1);
            	}
            	
            	if (memory == 0)
            	{
            		setTicksPlayerIsSeen(player, 0);
            	}
            }
            
//            if (shouldAttack || !attacker.getAnimatronic().isFooledByFreddyHead())
            {
                this.attackTick = Math.max(this.attackTick - 1, 0);

                if (d0 <= d1 && this.attackTick <= 20)
                {
                    this.attackTick = 20;

                    if (this.attacker.getHeldItem() != null)
                    {
                        this.attacker.swingItem();
                    }

                    this.attacker.attackEntityAsMob(entitylivingbase);
                }
            }
    	}
    }
}