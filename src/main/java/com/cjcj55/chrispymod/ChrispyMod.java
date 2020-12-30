package com.cjcj55.chrispymod;

import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cjcj55.chrispymod.init.BlockInit;
import com.cjcj55.chrispymod.init.ItemInit;
import com.cjcj55.chrispymod.init.PaintingInit;
import com.cjcj55.chrispymod.itemgroups.ChrispyModItemGroup;
import com.cjcj55.chrispymod.util.GenerationUtil;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
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

// The value here should match an entry in the META-INF/mods.toml file
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
    	
    	ItemInit.ITEMS.register(chrispyModEventBus);   	
    	BlockInit.BLOCKS.register(chrispyModEventBus);   
    	PaintingInit.PAINTING_TYPES.register(chrispyModEventBus);
        
    	instance = this;
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    @SubscribeEvent
	public static void createBlockItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();

		BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
					final Item.Properties properties = new Item.Properties().group(ChrispyModItemGroup.instance);
					final BlockItem blockItem = new BlockItem(block, properties);
					blockItem.setRegistryName(block.getRegistryName());
					registry.register(blockItem);
				});

		LOGGER.debug("Registered BlockItems!");
	}

    private void setup(final FMLCommonSetupEvent event)
    {
    	//int vein_size, int chunk_amount, int min_height, int max_height_base, int max_height
        GenerationUtil.generateOreBiomeArray(FillerBlockType.NATURAL_STONE, BlockInit.COBALT_ORE.get().getDefaultState(), 4, 2, 0, 0, 16);
        GenerationUtil.generateOreBiomeArray(FillerBlockType.NATURAL_STONE, BlockInit.OPAL_ORE.get().getDefaultState(), 6, 4, 24, 0, 64);
        GenerationUtil.generateOreBiomeArray(FillerBlockType.NATURAL_STONE, BlockInit.PARYTH_ORE.get().getDefaultState(), 5, 3, 6, 0, 48);
        GenerationUtil.generateOreBiomeArray(FillerBlockType.NATURAL_STONE, BlockInit.RUBY_ORE.get().getDefaultState(), 5, 2, 0, 0, 24);
        GenerationUtil.generateOreBiomeArray(FillerBlockType.NETHERRACK, BlockInit.RUBY_ORE_NETHER.get().getDefaultState(), 5, 2, 0, 0, 256);
        GenerationUtil.generateOreBiomeArray(FillerBlockType.NETHERRACK, BlockInit.FLAME_ORE_NETHER.get().getDefaultState(), 4, 2, 0, 0, 64);
        GenerationUtil.generateOreBiomeArray(FillerBlockType.NATURAL_STONE, BlockInit.TANGERINE_ORE.get().getDefaultState(), 5, 2, 0, 0, 32);
        GenerationUtil.generateOreBiomeArray(FillerBlockType.NETHERRACK, BlockInit.HELLFIRE_ORE_NETHER.get().getDefaultState(), 6, 4, 0, 0, 128);
        GenerationUtil.generateOreBiomeArray(FillerBlockType.NATURAL_STONE, BlockInit.WHITE_DWARF_STAR_ORE.get().getDefaultState(), 5, 2, 0, 0, 12);
        GenerationUtil.generateOreBiomeArray(FillerBlockType.NATURAL_STONE, BlockInit.NATURAL_ESSENCE_ORE.get().getDefaultState(), 6, 3, 0, 0, 48);
        GenerationUtil.generateOreBiomeArray(FillerBlockType.NATURAL_STONE, BlockInit.EXPERIENCE_ORE.get().getDefaultState(), 4, 3, 0, 0, 48);
    }

    private void doClientStuff(final FMLClientSetupEvent event) 
    {
        RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_DOOR.get(), RenderType.getCutout());
    }
    
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) 
    {
    	
    }
}
