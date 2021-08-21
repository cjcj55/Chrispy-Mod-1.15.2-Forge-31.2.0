package com.cjcj55.chrispymod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cjcj55.chrispymod.init.ItemInit;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ChrispyMod.MODID)
public class ChrispyMod {
	
	public static final String MODID = "chrispymod";
	
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public ChrispyMod() {
    	ItemInit.itemInit();
    	
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        // Register the setup method for modloading
    	bus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        
    }
}
