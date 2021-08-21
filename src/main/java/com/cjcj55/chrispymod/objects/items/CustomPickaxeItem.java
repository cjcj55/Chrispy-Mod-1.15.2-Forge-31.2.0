package com.cjcj55.chrispymod.objects.items;

import com.cjcj55.chrispymod.ChrispyMod;

import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.ResourceLocation;

public class CustomPickaxeItem extends PickaxeItem
{

	public CustomPickaxeItem(String name, IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) 
	{
		
		super(tier, attackDamageIn, attackSpeedIn, builder);
		this.setRegistryName(new ResourceLocation(ChrispyMod.MOD_ID, name));
	}
	

}
