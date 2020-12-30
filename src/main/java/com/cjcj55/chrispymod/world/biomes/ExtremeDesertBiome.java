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

public class ExtremeDesertBiome extends Biome
{
	// Biomes.BADLANDS

	public ExtremeDesertBiome()
	{
		super((new Biome.Builder()																							// First Block is top block, Second block is ~3 blocks below top, Third block is below water level 
				.surfaceBuilder(new ConfiguredSurfaceBuilder<SurfaceBuilderConfig>(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.SAND.getDefaultState(), Blocks.SANDSTONE.getDefaultState(), Blocks.STONE.getDefaultState()))))
				.precipitation(RainType.NONE)
				.category(Category.DESERT)
				.downfall(0.0F)  // How much it rains in the biome
				.depth(0.2F) // Height of biome.  Lower # is more level biome.
				.temperature(1000.0F)  // Affects temp & how fast snow melts & if ice spawns in biome.
				.scale(0.3F)  // How large the biome is.
				.waterColor(0xe8ddaf) //Add 0x before 6digit color code!
				.waterFogColor(0xeae0b7)
				.parent(null)); // If biome is a variant of another biome.
		
		DefaultBiomeFeatures.addCarvers(this);  // Creates caves and canyons.
		DefaultBiomeFeatures.addDeadBushes(this);
		DefaultBiomeFeatures.addDesertFeatures(this);
		DefaultBiomeFeatures.addExtraEmeraldOre(this);
		DefaultBiomeFeatures.addFossils(this);
		DefaultBiomeFeatures.addMonsterRooms(this);
		DefaultBiomeFeatures.addDesertLakes(this);
		
		// Entity, how common to spawn, min spawn group, max spawn group.
		this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.SKELETON, 100, 1, 4));
		this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.SKELETON_HORSE, 100, 1, 4));
		this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.HUSK, 100, 1, 4));
		
		this.setRegistryName(ChrispyModRegistries.location("extreme_desert_biome"));	
	}

}*/
