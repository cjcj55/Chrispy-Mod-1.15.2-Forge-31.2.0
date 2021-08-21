package com.cjcj55.chrispymod;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class ChrispyModRegistries
{
	public static final String MODID = ChrispyMod.MOD_ID;
	
	/*@SubscribeEvent
	public static void registerBiomes(final RegistryEvent.Register<Biome> event)
	{
		event.getRegistry().registerAll
		(
				ChrispyBiomes.extreme_desert_biome = new ExtremeDesertBiome(),
				ChrispyBiomes.dense_oak_forest_biome = new DenseOakForestBiome()
		);
		ChrispyBiomes.registerBiomes();
	}*/
	
	public static ResourceLocation location(String name)
	{
		return new ResourceLocation(MODID, name);
	}
}
