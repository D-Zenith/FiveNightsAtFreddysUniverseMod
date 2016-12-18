package link1234gamer.fnafmod.common.entity.ai.FuntimeFreddyAI;

import java.util.Random;

import link1234gamer.fnafmod.common.entity.EntityFuntimeFreddy;
import net.minecraft.block.Block;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;

public class EntityFuntimeFreddyAICrawlThroughVent extends EntityAIBase
{
    private EntityFuntimeFreddy entity;
    private double movePosX;
    private double movePosY;
    private double movePosZ;
    private double movementSpeed;
            
    public EntityFuntimeFreddyAICrawlThroughVent(EntityFuntimeFreddy entity, double speed)
    {
        this.entity = entity;
        this.movementSpeed = speed;
        this.setMutexBits(1);
    }
    
    public boolean shouldExecute()
    {
    	return true;
    }
    
    public boolean continueExecuting()
    {
    	return true;
    }
    
    public void startExecuting()
    {
    }
    
    public void updateTask()
    {
    	super.updateTask();
    	
    	if (entity.isAgressive())
    	{	
        	try
        	{
        		float range = 64;
        		EntityPlayer player = entity.worldObj.getClosestVulnerablePlayerToEntity(entity, range);
        		
        		if (player != null)
        		{
        			entity.setAttackTarget(player);
        		}
        	}
        	catch (Exception e)
        	{
        	}
        	
//        	if (entity.onGround && entity.isCrawling())
        	{
        		if (entity.motionX != 0 || entity.motionZ != 0)
        		{
        			Random rand = new Random();
        			
        			if (rand.nextInt(20) == 0)
        			{
        				Block up = entity.worldObj.getBlock((int)entity.posX - 1, (int)entity.posY + 1, (int)entity.posZ);
        				Block down = entity.worldObj.getBlock((int)entity.posX - 1, (int)entity.posY - 1, (int)entity.posZ);
        				Block positiveX = entity.worldObj.getBlock((int)entity.posX - 1 + 1, (int)entity.posY, (int)entity.posZ);
        				Block negativeX = entity.worldObj.getBlock((int)entity.posX - 1 - 1, (int)entity.posY, (int)entity.posZ);
        				Block positiveZ = entity.worldObj.getBlock((int)entity.posX - 1, (int)entity.posY, (int)entity.posZ + 1);
        				Block negativeZ = entity.worldObj.getBlock((int)entity.posX - 1, (int)entity.posY, (int)entity.posZ - 1);        				
        				entity.playSound("dig." + up.stepSound.soundName, up.stepSound.getVolume(), up.stepSound.getPitch());
        				entity.playSound("dig." + down.stepSound.soundName, down.stepSound.getVolume(), down.stepSound.getPitch());
        				float pitch = 0.5F + rand.nextFloat() / 5;
        				
        			}
        		}
        	}
    	}
    	
//    	entity.setSize(0.5F, 0.9F, false);
    }
}