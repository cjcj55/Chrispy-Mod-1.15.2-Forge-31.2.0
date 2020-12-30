package com.cjcj55.chrispymod.objects.items;

import com.cjcj55.chrispymod.itemgroups.ChrispyModItemGroup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class HellfireBurnableItem extends Item
{
	public HellfireBurnableItem(Properties properties)
	{
	    super(new Item.Properties().group(ChrispyModItemGroup.instance));
	    //this.setRegistryName(new ResourceLocation(ChrispyMod.MOD_ID, name));
	}
	
	@Override
	public int getBurnTime(ItemStack itemStack) 
	{
		return 2400;
	}
}
