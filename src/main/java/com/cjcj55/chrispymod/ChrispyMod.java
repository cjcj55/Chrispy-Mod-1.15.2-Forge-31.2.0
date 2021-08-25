package com.cjcj55.chrispymod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cjcj55.chrispymod.init.BlockRegistry;
import com.cjcj55.chrispymod.init.ItemRegistry;
import com.cjcj55.chrispymod.init.PaintingRegistry;
import com.cjcj55.chrispymod.itemgroups.ChrispyModItemGroup;
import com.cjcj55.chrispymod.util.OreGeneration;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@Mod("chrispymod")
@EventBusSubscriber(modid = ChrispyMod.MOD_ID, bus = Bus.MOD)
public class ChrispyMod
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "chrispymod";
    public static ChrispyMod instance;

    public ChrispyMod() 
    {        
    	final IEventBus chrispyModEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	
    	chrispyModEventBus.addListener(this::setup);
    	chrispyModEventBus.addListener(this::doClientStuff);
    	
    	ItemRegistry.ITEMS.register(chrispyModEventBus);   	
    	BlockRegistry.BLOCKS.register(chrispyModEventBus);   
    	PaintingRegistry.PAINTING_TYPES.register(chrispyModEventBus);
        
    	instance = this;
    	
    	MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOresOverworld);;
    	
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    @SubscribeEvent
	public static void createBlockItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();

		BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
					final Item.Properties properties = new Item.Properties().tab(ChrispyModItemGroup.instance);
					final BlockItem blockItem = new BlockItem(block, properties);
					blockItem.setRegistryName(block.getRegistryName());
					registry.register(blockItem);
				});

		LOGGER.debug("Registered BlockItems!");
	}

    private void setup(final FMLCommonSetupEvent event)
    {
    	
    }

    private void doClientStuff(final FMLClientSetupEvent event) 
    {
        RenderTypeLookup.setRenderLayer(BlockRegistry.BAMBOO_DOOR.get(), RenderType.cutout());
    }
    
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) 
    {
    	
    }
}
