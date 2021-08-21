package com.cjcj55.chrispymod.objects.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

public class FlameSwordItem extends SwordItem
{

	public FlameSwordItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}
	
	public boolean onLeftClickEntity(ItemStack stack, PlayerEntity player, Entity entity) 
	{ 
		entity.setSecondsOnFire(4);
		return false; 
	}

}
