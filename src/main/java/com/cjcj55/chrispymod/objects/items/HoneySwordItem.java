package com.cjcj55.chrispymod.objects.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class HoneySwordItem extends SwordItem
{

	public HoneySwordItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}
	
	public boolean onLeftClickEntity(ItemStack stack, PlayerEntity player, Entity entity) 
	{ 
		if (entity instanceof LivingEntity) {
            ((LivingEntity)entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, 60));     
         }
		return false; 		
	}

}
