package link1234gamer.fnafmod.common.entity.ai.WFreddyAI;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import link1234gamer.fnafmod.common.entity.EntityWFreddy;
import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class EntityWFreddyAINearestAttackableTarget extends EntityWFreddyAITarget
{
	private final Class targetClass;
	private final int targetChance;
	private final EntityWFreddyAINearestAttackableTarget.Sorter theNearestAttackableTargetSorter;
	private final IEntitySelector targetEntitySelector;
	private EntityLivingBase targetEntity;

	public EntityWFreddyAINearestAttackableTarget(EntityWFreddy entity, Class p_i1663_2_, int p_i1663_3_, boolean p_i1663_4_)
	{
		this(entity, p_i1663_2_, p_i1663_3_, p_i1663_4_, false);
	}

	public EntityWFreddyAINearestAttackableTarget(EntityWFreddy p_i1664_1_, Class targetClass, int p_i1664_3_, boolean p_i1664_4_, boolean p_i1664_5_)
	{
		this(p_i1664_1_, targetClass, p_i1664_3_, p_i1664_4_, p_i1664_5_, (IEntitySelector)null);
	}

	public EntityWFreddyAINearestAttackableTarget(EntityWFreddy p_i1665_1_, Class p_i1665_2_, int p_i1665_3_, boolean p_i1665_4_, boolean p_i1665_5_, final IEntitySelector p_i1665_6_)
	{
		super(p_i1665_1_, p_i1665_4_, p_i1665_5_);
		this.targetClass = p_i1665_2_;
		this.targetChance = p_i1665_3_;
		this.theNearestAttackableTargetSorter = new EntityWFreddyAINearestAttackableTarget.Sorter(p_i1665_1_);
		this.setMutexBits(1);
		this.targetEntitySelector = new IEntitySelector()
		{
			public boolean isEntityApplicable(Entity p_82704_1_)
			{
				return !(p_82704_1_ instanceof EntityLivingBase) ? false : (p_i1665_6_ != null && !p_i1665_6_.isEntityApplicable(p_82704_1_) ? false : EntityWFreddyAINearestAttackableTarget.this.isSuitableTarget((EntityLivingBase)p_82704_1_, false));
			}
		};
	}
	
	public boolean shouldExecute()
	{
		if (taskOwner.isAgressive())
		{
			if (this.targetChance > 0 && this.taskOwner.getRNG().nextInt(this.targetChance) != 0)
			{
				return false;
			}
			else
			{
				double d0 = this.getTargetDistance();
				List list = this.taskOwner.worldObj.selectEntitiesWithinAABB(this.targetClass, this.taskOwner.boundingBox.expand(d0, 4.0D, d0), this.targetEntitySelector);
				Collections.sort(list, this.theNearestAttackableTargetSorter);

				if (list.isEmpty())
				{
					return false;
				}
				else
				{
					this.targetEntity = (EntityLivingBase)list.get(0);
					return true;
				}
			}
		}
		
		return false;
	}
	
	public void startExecuting()
	{
		if (taskOwner.isAgressive())
		{
			this.taskOwner.setAttackTarget(this.targetEntity);
			super.startExecuting();
		}
	}
	
	public boolean continueExecuting()
	{
		if (taskOwner.isAgressive())
		{
			return super.continueExecuting();
		}
		return false;
	}

	public static class Sorter implements Comparator
	{
		private final Entity theEntity;
		
		public Sorter(Entity p_i1662_1_)
		{
			this.theEntity = p_i1662_1_;
		}

		public int compare(Entity p_compare_1_, Entity p_compare_2_)
		{
			double d0 = this.theEntity.getDistanceSqToEntity(p_compare_1_);
			double d1 = this.theEntity.getDistanceSqToEntity(p_compare_2_);
			return d0 < d1 ? -1 : (d0 > d1 ? 1 : 0);
		}

		public int compare(Object p_compare_1_, Object p_compare_2_)
		{
			return this.compare((Entity)p_compare_1_, (Entity)p_compare_2_);
		}
	}
}