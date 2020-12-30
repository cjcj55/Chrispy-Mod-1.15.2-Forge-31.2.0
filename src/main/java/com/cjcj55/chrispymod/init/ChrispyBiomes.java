package com.cjcj55.chrispymod.init;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class ChrispyBiomes
{
	public static Biome extreme_desert_biome;
	public static Biome dense_oak_forest_biome;
	
	public static void registerBiomes()
	{
		registerBiome(extreme_desert_biome, Type.DEAD, Type.DRY, Type.HOT, Type.SANDY);
		registerBiome(dense_oak_forest_biome, Type.DENSE, Type.LUSH, Type.MAGICAL, Type.SPOOKY);
	}
	
	public static void registerBiome(Biome biome, Type... types)
	{
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addSpawnBiome(biome);
	}
}
