package link1234gamer.fnafmod.common.entity.ai.Pre_MangleAI;

import link1234gamer.fnafmod.common.entity.EntityPre_Mangle;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathPoint;
import net.minecraft.util.MathHelper;

public class EntityPre_MangleAIBreakDoor extends EntityAIBase
{
    protected EntityPre_Mangle entity;
    protected int doorPosX;
    protected int doorPosY;
    protected int doorPosZ;
    protected BlockDoor door;
    boolean hasStoppedDoorInteraction;
    float entityPositionX;
    float entityPositionZ;
    
    public EntityPre_MangleAIBreakDoor(EntityPre_Mangle animatronic)
    {
        this.entity = animatronic;
    }
    
    public boolean shouldExecute()
    {
////        if (!this.entity.isCollidedHorizontally)
////        {
////            return false;
////        }
////        else
//        {
//            PathNavigate pathnavigate = this.entity.getNavigator();
//            PathEntity pathentity = pathnavigate.getPath();
//
//            if (pathentity != null && !pathentity.isFinished())
//            {
//                for (int i = 0; i < Math.min(pathentity.getCurrentPathIndex() + 2, pathentity.getCurrentPathLength()); ++i)
//                {
//                    PathPoint pathpoint = pathentity.getPathPointFromIndex(i);
//                    this.doorPosX = pathpoint.xCoord;
//                    this.doorPosY = pathpoint.yCoord + 1;
//                    this.doorPosZ = pathpoint.zCoord;
//
//                    if (this.entity.getDistanceSq((double)this.doorPosX, this.entity.posY, (double)this.doorPosZ) <= 2.25D)
//                    {
//                        this.door = this.getDoorObject(this.doorPosX, this.doorPosY, this.doorPosZ);
//                        
//                        if (this.door != null)
//                        {
//                            return true;
//                        }
//                    }
//                }
//
//                this.doorPosX = MathHelper.floor_double(this.entity.posX);
//                this.doorPosY = MathHelper.floor_double(this.entity.posY + 1.0D);
//                this.doorPosZ = MathHelper.floor_double(this.entity.posZ);
//                this.door = this.getDoorObject(this.doorPosX, this.doorPosY, this.doorPosZ);
//                return this.door != null;
//            }
//            else
//            {
//                return false;
//            }
//        }
    	return true;
    }
    
    public boolean continueExecuting()
    {
//        return !this.hasStoppedDoorInteraction;
    	return true;
    }
    
    public void startExecuting()
    {
        this.hasStoppedDoorInteraction = false;
        this.entityPositionX = (float)((double)((float)this.doorPosX + 0.5F) - this.entity.posX);
        this.entityPositionZ = (float)((double)((float)this.doorPosZ + 0.5F) - this.entity.posZ);
    }
    
    public void updateTask()
    {
//        float f = (float)((double)((float)this.entityPosX + 0.5F) - this.entity.posX);
//        float f1 = (float)((double)((float)this.entityPosZ + 0.5F) - this.entity.posZ);
//        float f2 = this.entityPositionX * f + this.entityPositionZ * f1;
//
//        if (f2 < 0.0F)
//        {
//            this.hasStoppedDoorInteraction = true;
//        }
    	
    	PathNavigate pathnavigate = this.entity.getNavigator();
        PathEntity pathentity = pathnavigate.getPath();

        if (pathentity != null && !pathentity.isFinished())
        {
            for (int i = 0; i < Math.min(pathentity.getCurrentPathIndex() + 2, pathentity.getCurrentPathLength()); ++i)
            {
                PathPoint pathpoint = pathentity.getPathPointFromIndex(i);
                this.doorPosX = pathpoint.xCoord;
                this.doorPosY = pathpoint.yCoord + 1;
                this.doorPosZ = pathpoint.zCoord;

                if (this.entity.getDistanceSq((double)this.doorPosX, this.entity.posY, (double)this.doorPosZ) <= 2.25D)
                {
                    this.door = this.getDoorObject(this.doorPosX, this.doorPosY, this.doorPosZ);
                }
            }

            this.doorPosX = MathHelper.floor_double(this.entity.posX);
            this.doorPosY = MathHelper.floor_double(this.entity.posY + 1.0D);
            this.doorPosZ = MathHelper.floor_double(this.entity.posZ);
            this.door = this.getDoorObject(this.doorPosX, this.doorPosY, this.doorPosZ);
        }
    	
    	if (door != null)
    	{
    		entity.worldObj.playAuxSFX(2001, doorPosX, doorPosY, doorPosZ, Block.getIdFromBlock(door));
    		entity.worldObj.setBlockToAir(doorPosX, doorPosY, doorPosZ);
    		door = null;
    	}
    }

    private BlockDoor getDoorObject(int x, int y, int z)
    {
        Block block = entity.worldObj.getBlock(x, y, z);
        return !(block instanceof BlockDoor) ? null : (BlockDoor)block;
    }
}