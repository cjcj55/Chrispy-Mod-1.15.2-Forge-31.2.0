package com.cjcj55.chrispymod.datagen;

import com.cjcj55.chrispymod.ChrispyMod;
import com.cjcj55.chrispymod.init.ItemInit;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class Items extends ItemModelProvider {
	
	
	
	public Items(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, ChrispyMod.MODID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		singleTexture(
				ItemInit.DISTANCE_PICK.get().getRegistryName().getPath(), 
				new ResourceLocation("item/handheld"), 
				"layer0",
				new ResourceLocation(ChrispyMod.MODID, "item/distancepick"));
	}
}
