package com.cjcj55.chrispymod.objects.items;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ToolItem;

public class IcePickaxeItem extends ToolItem {
	
	public IcePickaxeItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Set<Block> effectiveBlocksIn, Properties builder)
	{
		super(attackSpeedIn, attackDamageIn, tier, effectiveBlocksIn, builder);
	}
}