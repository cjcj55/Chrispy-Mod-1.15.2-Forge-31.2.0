/*package com.cjcj55.chrispymod.world.biomes;

import com.cjcj55.chrispymod.ChrispyModRegistries;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class DenseOakForestBiome extends Biome
{
	 // Biomes.BADLANDS

	public DenseOakForestBiome()
	{
		super((new Biome.Builder()																							// First Block is top block, Second block is ~3 blocks below top, Third block is below water level 
				.surfaceBuilder(new ConfiguredSurfaceBuilder<SurfaceBuilderConfig>(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.COARSE_DIRT.getDefaultState(), Blocks.STONE.getDefaultState(), Blocks.STONE.getDefaultState()))))
				.precipitation(RainType.RAIN)
				.category(Category.FOREST)
				.downfall(0.0F)  // How much it rains in the biome
				.depth(0.2F) // Height of biome.  Lower # is more level biome.
				.temperature(65.0F)  // Affects temp & how fast snow melts & if ice spawns in biome.
				.scale(0.1F)  // How large the biome is.
				.waterColor(0x000099) //Add 0x before 6digit color code!
				.waterFogColor(0x0000ff)
				.parent(null)); // If biome is a variant of another biome.
		
		DefaultBiomeFeatures.addCarvers(this);  // Creates caves and canyons.
		DefaultBiomeFeatures.addExtraEmeraldOre(this);
		DefaultBiomeFeatures.addMonsterRooms(this);
		DefaultBiomeFeatures.addForestTrees(this);
		DefaultBiomeFeatures.addGrass(this);
		DefaultBiomeFeatures.addStoneVariants(this);
		DefaultBiomeFeatures.addForestTrees(this);
		
		// Entity, how common to spawn, min spawn group, max spawn group.
		this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.SKELETON, 100, 1, 4));
		this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.ZOMBIE, 100, 1, 4));
		this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.CREEPER, 100, 1, 4));
		
		this.setRegistryName(ChrispyModRegistries.location("dense_oak_forest_biome"));	
	}

}*/
