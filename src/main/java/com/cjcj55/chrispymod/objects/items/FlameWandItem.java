package com.cjcj55.chrispymod.objects.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class FlameWandItem extends Item
{
	public FlameWandItem(Item.Properties builder) 
	{
		super(builder);
	}

	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
      ItemStack itemstack = playerIn.getHeldItem(handIn);
      worldIn.playSound((PlayerEntity)null, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), SoundEvents.ENTITY_GHAST_SHOOT, SoundCategory.NEUTRAL, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
      Vec3d looking = playerIn.getLookVec();
        FireballEntity fireballentity = new FireballEntity(worldIn, playerIn.getPosX() + looking.x * 4.0d, playerIn.getPosYEye(), playerIn.getPosZ() + looking.z * 4.0d, looking.x, looking.y, looking.z);
        fireballentity.accelerationX = looking.x;
        fireballentity.accelerationY = looking.y;
        fireballentity.accelerationZ = looking.z;

        fireballentity.explosionPower = 1;
        worldIn.addEntity(fireballentity);
    	  
      
      playerIn.addStat(Stats.ITEM_USED.get(this));
      if (!playerIn.abilities.isCreativeMode) {
         itemstack.damageItem(1, playerIn, (p_219998_1_) -> {
                  p_219998_1_.sendBreakAnimation(handIn);
               });
      }

      return ActionResult.resultSuccess(itemstack);
   }	
} 