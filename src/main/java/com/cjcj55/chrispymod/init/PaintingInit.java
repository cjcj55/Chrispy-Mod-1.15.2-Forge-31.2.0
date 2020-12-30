package com.cjcj55.chrispymod.init;

import com.cjcj55.chrispymod.ChrispyMod;

import net.minecraft.entity.item.PaintingType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class PaintingInit 
{
	public static final DeferredRegister<PaintingType> PAINTING_TYPES = new DeferredRegister<PaintingType>(ForgeRegistries.PAINTING_TYPES, ChrispyMod.MOD_ID);

	public static final RegistryObject<PaintingType> MOUNTAIN = PAINTING_TYPES.register("mountain", () -> new PaintingType(64, 48));
}
