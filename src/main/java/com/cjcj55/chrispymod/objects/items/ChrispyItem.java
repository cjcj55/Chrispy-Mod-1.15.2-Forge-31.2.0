package com.cjcj55.chrispymod.objects.items;

import com.cjcj55.chrispymod.itemgroups.ChrispyModItemGroup;

import net.minecraft.item.Item;

public class ChrispyItem extends Item
{
	public ChrispyItem(Properties properties)
	{
	    super(new Item.Properties().group(ChrispyModItemGroup.instance));
	    //this.setRegistryName(new ResourceLocation(ChrispyMod.MOD_ID));
	}
}
