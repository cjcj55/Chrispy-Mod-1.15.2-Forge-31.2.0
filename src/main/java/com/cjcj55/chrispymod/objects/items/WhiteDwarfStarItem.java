package com.cjcj55.chrispymod.objects.items;

import com.cjcj55.chrispymod.itemgroups.ChrispyModItemGroup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;

public class WhiteDwarfStarItem extends Item
{
	public WhiteDwarfStarItem(Properties properties)
	{
	    super(new Item.Properties().tab(ChrispyModItemGroup.instance).rarity(Rarity.EPIC));
	}
	
	public boolean hasEffect(ItemStack stack) 
	{
		return true;
	}
}
