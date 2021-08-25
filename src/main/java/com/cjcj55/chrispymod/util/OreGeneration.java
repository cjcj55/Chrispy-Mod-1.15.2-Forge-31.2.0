package com.cjcj55.chrispymod.util;

import com.cjcj55.chrispymod.init.BlockRegistry;

import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGeneration  {	
	@SuppressWarnings("unused")
	private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int minHeight, int maxHeight, int amount) {
		settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
				Feature.ORE.configured(new OreFeatureConfig(fillerType, state, veinSize))
						.decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
						.squared().count(amount));
	}
	
	public static void generateOresOverworld(final BiomeLoadingEvent event) {
		if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.COBALT_ORE.get().defaultBlockState(), 4, 0, 30, 2);
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.OPAL_ORE.get().defaultBlockState(), 6, 24, 64, 4);
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.PARYTH_ORE.get().defaultBlockState(), 5, 0, 48, 3);
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.RUBY_ORE.get().defaultBlockState(), 5, 0, 24, 2);
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.TANGERINE_ORE.get().defaultBlockState(), 5, 0, 32, 2);
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.WHITE_DWARF_STAR_ORE.get().defaultBlockState(), 5, 0, 12, 1);
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.NATURAL_ESSENCE_ORE.get().defaultBlockState(), 6, 0, 48, 3);
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.EXPERIENCE_ORE.get().defaultBlockState(), 4, 0, 48, 3);
		}
	}
	
	public static void generateOresNether(final BiomeLoadingEvent event) {
		if (!(event.getCategory().equals(Biome.Category.NONE) || event.getCategory().equals(Biome.Category.THEEND))) {
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.RUBY_ORE_NETHER.get().defaultBlockState(), 5, 0, 256, 4);
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.FLAME_ORE_NETHER.get().defaultBlockState(), 4, 0, 64, 3);
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.HELLFIRE_ORE_NETHER.get().defaultBlockState(), 6, 0, 128, 4);
		}
	}
}