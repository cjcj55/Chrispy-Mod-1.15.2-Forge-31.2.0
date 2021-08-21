package com.cjcj55.chrispymod.itemgroups;

import com.cjcj55.chrispymod.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ChrispyModItemGroup extends ItemGroup {
	public static final ChrispyModItemGroup instance = new ChrispyModItemGroup(ItemGroup.TABS.length, "chrispytab");
	
	private ChrispyModItemGroup(int index, String label) {
		super(index, label);
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}

	@Override
	public ItemStack makeIcon() {
		return new ItemStack(ItemInit.BLUE_EMERALD.get());
	}
}