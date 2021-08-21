package com.cjcj55.chrispymod.objects.items;

import com.cjcj55.chrispymod.itemgroups.ChrispyModItemGroup;

import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class ChrispyItemFood extends Item {
	
	public ChrispyItemFood(String name, int hunger, float saturation)
	{
	    super(new Properties().tab(ChrispyModItemGroup.instance).food(new Food.Builder().saturationMod(saturation).nutrition(hunger).build()));
	    //this.setRegistryName(new ResourceLocation(ChrispyMod.MOD_ID, name));
	}

}