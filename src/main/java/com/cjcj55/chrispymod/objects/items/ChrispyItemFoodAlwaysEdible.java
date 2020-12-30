package com.cjcj55.chrispymod.objects.items;

import com.cjcj55.chrispymod.itemgroups.ChrispyModItemGroup;

import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class ChrispyItemFoodAlwaysEdible extends Item {
	
	public ChrispyItemFoodAlwaysEdible(String name, int hunger, float saturation, boolean alwaysEdible)
	{
	    super(new Properties().group(ChrispyModItemGroup.instance).food(new Food.Builder().saturation(saturation).hunger(hunger).setAlwaysEdible().build()));
	    //this.setRegistryName(new ResourceLocation(ChrispyMod.MOD_ID, name));
	}

}