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
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class FlameWandItem extends Item
{
	public FlameWandItem(Item.Properties builder) 
	{
		super(builder);
	}

	public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
		ItemStack itemstack = playerIn.getItemInHand(handIn);
		
		//playerIn.getCooldowns().addCooldown(this, 10);
        worldIn.playSound((PlayerEntity)null, playerIn.getX(), playerIn.getY(), playerIn.getZ(), SoundEvents.GHAST_SHOOT, SoundCategory.NEUTRAL, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
        Vector3d looking = playerIn.getLookAngle();
        FireballEntity fireballEntity = new FireballEntity(worldIn, playerIn.getX() + looking.x * 4.0d, playerIn.getY(), playerIn.getZ() + looking.z * 4.0d, looking.x, looking.y, looking.z);
        //fireballEntity.setPos(playerIn.getX() + looking.x * 4.0D, playerIn.getY(0.5D) + 0.5D, fireballEntity.getZ() + looking.z * 4.0D);
        fireballEntity.explosionPower = 1;
        worldIn.addFreshEntity(fireballEntity);

        playerIn.awardStat(Stats.ITEM_USED.get(this));
        if (!playerIn.abilities.mayfly) {
        	itemstack.hurtAndBreak(1, playerIn, (p_219998_1_) -> {
                p_219998_1_.broadcastBreakEvent(handIn);;
            });
        }
    

      return ActionResult.success(itemstack);
   }	
} 