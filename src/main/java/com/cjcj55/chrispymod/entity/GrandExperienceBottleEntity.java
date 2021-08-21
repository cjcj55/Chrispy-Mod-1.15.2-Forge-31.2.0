/**package com.cjcj55.chrispymod.entity;

import com.cjcj55.chrispymod.init.ItemInitDeferred;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ExperienceBottleEntity;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class GrandExperienceBottleEntity extends ProjectileItemEntity
{
	public GrandExperienceBottleEntity(EntityType<? extends ExperienceBottleEntity> p_i50152_1_, World p_i50152_2_) 
	{
      super(p_i50152_1_, p_i50152_2_);
    }

   public GrandExperienceBottleEntity(World worldIn, LivingEntity throwerIn) {
      super(EntityType.EXPERIENCE_BOTTLE, throwerIn, worldIn);
   }

   public GrandExperienceBottleEntity(World worldIn, double x, double y, double z) {
      super(EntityType.EXPERIENCE_BOTTLE, x, y, z, worldIn);
   }

   protected Item getDefaultItem() {
      return ItemInitDeferred.grand_experience_bottle;
   }

   
    // Gets the amount of gravity to apply to the thrown entity with each tick.
    
   protected float getGravityVelocity() {
      return 0.07F;
   }

   
    // Called when this EntityThrowable hits a block or entity.
    
   protected void onImpact(RayTraceResult result) {
      if (!this.world.isRemote) {
         this.world.playEvent(2002, new BlockPos(this), PotionUtils.getPotionColor(Potions.WATER));
         int i = 3 + this.world.rand.nextInt(5) + this.world.rand.nextInt(5);

         while(i > 0) {
            int j = ExperienceOrbEntity.getXPSplit(i);
            i -= j;
            this.world.addEntity(new ExperienceOrbEntity(this.world, this.getPosX(), this.getPosY(), this.getPosZ(), j));
         }

         this.remove();
      }

   }
}*/

