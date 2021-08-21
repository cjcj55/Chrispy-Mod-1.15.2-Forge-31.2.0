package com.cjcj55.chrispymod.init;

import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.cjcj55.chrispymod.ChrispyMod.MODID;

import com.cjcj55.chrispymod.objects.items.DistancePickaxe;

public class ItemInit {
	
	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
	
	public static void itemInit() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	public static final RegistryObject<Item> DISTANCE_PICK = ITEMS.register("distancepick", () -> new DistancePickaxe(new Item.Properties()));
}
