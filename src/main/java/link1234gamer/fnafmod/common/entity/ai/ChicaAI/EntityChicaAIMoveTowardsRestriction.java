package link1234gamer.fnafmod.common.entity.ai.ChicaAI;

import java.util.Map;

import com.google.common.collect.Maps;

import link1234gamer.fnafmod.common.entity.EntityChica;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.Vec3;

public class EntityChicaAIMoveTowardsRestriction extends EntityAIBase
{
    private EntityChica theEntity;
    private double movePosX;
    private double movePosY;
    private double movePosZ;
    private double movementSpeed;
    
    private Map<String, Integer> ticksPlayerIsSeen = Maps.newHashMap();
    
    public EntityChicaAIMoveTowardsRestriction(EntityChica p_i2347_1_, double p_i2347_2_)
    {
        this.theEntity = p_i2347_1_;
        this.movementSpeed = p_i2347_2_;
        this.setMutexBits(1);
    }
    
    public boolean shouldExecute()
    {
        if (this.theEntity.isWithinHomeDistanceCurrentPosition())
        {
            return false;
        }
        else
        {
            ChunkCoordinates chunkcoordinates = this.theEntity.getHomePosition();
            Vec3 vec3 = RandomPositionGenerator.findRandomTargetBlockTowards(this.theEntity, 16, 7, Vec3.createVectorHelper((double)chunkcoordinates.posX, (double)chunkcoordinates.posY, (double)chunkcoordinates.posZ));

            if (vec3 == null)
            {
                return false;
            }
            else
            {
                this.movePosX = vec3.xCoord;
                this.movePosY = vec3.yCoord;
                this.movePosZ = vec3.zCoord;
                return true;
            }
        }
    }
    
    public boolean continueExecuting()
    {
        return !this.theEntity.getNavigator().noPath();
    }
    
    public void startExecuting()
    {
        this.theEntity.getNavigator().tryMoveToXYZ(this.movePosX, this.movePosY, this.movePosZ, this.movementSpeed);
    }
    
    public int getTicksPlayerIsSeen(EntityPlayer player)
    {
		return ticksPlayerIsSeen.get(player.getUniqueID().toString()) == null ? 0 : ticksPlayerIsSeen.get(player.getUniqueID().toString());
	}
    
    public void setTicksPlayerIsSeen(EntityPlayer player, int i)
    {
		this.ticksPlayerIsSeen.put(player.getUniqueID().toString(), i);
	}
    
    public void updateTask()
    {
    	theEntity.setAttackTarget(null);
    	theEntity.getNavigator().tryMoveToXYZ(0, 0, 0, movementSpeed);
//    	EntityLivingBase entitylivingbase = this.theEntity.getAttackTarget();
    	boolean shouldAttack = true;
//    	
//    	if (entitylivingbase instanceof EntityPlayer)
//        {
//        	EntityPlayer player = (EntityPlayer)entitylivingbase;
//        	
//        	if (theEntity.getEntitySenses().canSee(player) && !(player.getHeldItem() != null && player.getHeldItem().getItem() instanceof ItemFreddyHead && player.getItemInUseDuration() >= 3))
//        	{
//        		setTicksPlayerIsSeen(player, getTicksPlayerIsSeen(player) + 1);
//        	}
//        	
//    		int i = (4 - theEntity.worldObj.difficultySetting.getDifficultyId()) * 5;
//            shouldAttack = getTicksPlayerIsSeen(player) >= i;
//        }
    }
}