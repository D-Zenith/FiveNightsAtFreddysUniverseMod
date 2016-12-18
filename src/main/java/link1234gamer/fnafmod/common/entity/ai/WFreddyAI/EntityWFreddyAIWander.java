package link1234gamer.fnafmod.common.entity.ai.WFreddyAI;

import link1234gamer.fnafmod.common.entity.EntityWFreddy;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.util.Vec3;

public class EntityWFreddyAIWander extends EntityAIBase
{
    private EntityCreature entity;
    private double xPosition;
    private double yPosition;
    private double zPosition;
    private double speed;
    private static final String __OBFID = "CL_00001608";

    public EntityWFreddyAIWander(EntityCreature p_i1648_1_, double p_i1648_2_)
    {
        this.entity = p_i1648_1_;
        this.speed = p_i1648_2_;
        this.setMutexBits(1);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
    	if (((EntityWFreddy)entity).isAgressive())
    	{
    		if (this.entity.getAge() >= 100)
    		{
    			return false;
    		}
    		else if (this.entity.getRNG().nextInt(120) != 0)
    		{
    			return false;
    		}
    		else
    		{
    			Vec3 vec3 = RandomPositionGenerator.findRandomTarget(this.entity, 10, 7);

    			if (vec3 == null)
    			{
    				return false;
    			}
    			else
    			{
    				this.xPosition = vec3.xCoord;
    				this.yPosition = vec3.yCoord;
    				this.zPosition = vec3.zCoord;
    				return true;
    			}
    		}
    	}
    	return false;
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean continueExecuting()
    {
    	if (((EntityWFreddy)entity).isAgressive())
    	{
    		return !this.entity.getNavigator().noPath();
    	}
    	return false;
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
    	if (((EntityWFreddy)entity).isAgressive())
    	{
    		this.entity.getNavigator().tryMoveToXYZ(this.xPosition, this.yPosition, this.zPosition, this.speed);
    	}
    }
}