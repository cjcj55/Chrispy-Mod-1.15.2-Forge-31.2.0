package com.cjcj55.chrispymod.init;
/*package com.cjcj55.chrispymod.init;

import com.cjcj55.chrispymod.ChrispyMod;
import com.cjcj55.chrispymod.itemgroups.ChrispyModItemGroup;
import com.cjcj55.chrispymod.objects.blocks.CustomLampBlock;
import com.cjcj55.chrispymod.objects.blocks.ModDoorBlock;
import com.cjcj55.chrispymod.objects.blocks.ModOreBlock;

import net.minecraft.block.Block;
import net.minecraft.block.LogBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(ChrispyMod.MOD_ID)
@Mod.EventBusSubscriber(modid = ChrispyMod.MOD_ID, bus = Bus.MOD)
public class BlockInit 
{
	public static final Block ruby_block = null;
	public static final Block ruby_ore = null;
	public static final Block ruby_ore_nether = null;
	public static final Block opal_block = null;
	public static final Block opal_ore = null;
	public static final Block tangerine_block = null;
	public static final Block tangerine_ore = null;
	public static final Block cobalt_block = null;
	public static final Block cobalt_ore = null;
	public static final Block blue_emerald_block = null;
	public static final Block paryth_block = null;
	public static final Block paryth_ore = null;
	public static final Block lightning_block = null;
	public static final Block flame_block = null;
	public static final Block flame_ore_nether = null;
	public static final Block hardened_redstone_block = null;
	public static final Block skinny_slanted_bricks = null;
	public static final Block slanted_bricks = null;
	public static final Block skinny_bricks = null;
	public static final Block circular_bricks = null;
	public static final Block cracked_bricks = null;
	public static final Block encased_bricks = null;
	public static final Block mosaic_bricks = null;
	public static final Block ornate_bricks = null;
	public static final Block road_bricks = null;
	public static final Block solid_bricks = null;
	public static final Block weaver_bricks = null;
	public static final Block sugar_block = null;
	public static final Block bamboo_block = null;
	public static final StairsBlock bamboo_stairs = null;
	public static final SlabBlock bamboo_slab = null;
	public static final WallBlock bamboo_wall = null;
	public static final Block sugar_cane_block = null;
	public static final Block black_redstone_lamp = null;
	public static final Block blue_redstone_lamp = null;
	public static final Block brown_redstone_lamp = null;
	public static final Block cyan_redstone_lamp = null;
	public static final Block gray_redstone_lamp = null;
	public static final Block green_redstone_lamp = null;
	public static final Block light_blue_redstone_lamp = null;
	public static final Block light_gray_redstone_lamp = null;
	public static final Block lime_redstone_lamp = null;
	public static final Block magenta_redstone_lamp = null;
	public static final Block orange_redstone_lamp = null;
	public static final Block pink_redstone_lamp = null;
	public static final Block purple_redstone_lamp = null;
	public static final Block red_redstone_lamp = null;
	public static final Block white_redstone_lamp = null;
	public static final Block yellow_redstone_lamp = null;
	public static final Block bamboo_door = null;
	public static final Block hellfire_ore_nether = null;
	public static final Block white_dwarf_star_ore = null;
	public static final Block natural_essence_ore = null;

	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event)
	{	
	// BLOCKS (from ore)
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.1f, 31.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL).harvestLevel(2)).setRegistryName("ruby_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(4.5f, 31.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL).harvestLevel(2)).setRegistryName("opal_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.3f, 31.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL).harvestLevel(2)).setRegistryName("tangerine_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(6.0f, 45.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL).harvestLevel(3)).setRegistryName("cobalt_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(9.0f, 50.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL).harvestLevel(3)).setRegistryName("blue_emerald_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.6f, 35.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL).harvestLevel(2)).setRegistryName("paryth_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.GLASS, MaterialColor.SAND).hardnessAndResistance(8.5f, 40.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL).harvestLevel(2).lightValue(200)).setRegistryName("lightning_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.GLASS, MaterialColor.SAND).hardnessAndResistance(5.1f, 40.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL).harvestLevel(2).lightValue(20)).setRegistryName("flame_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.2f, 18.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL).harvestLevel(2)).setRegistryName("hardened_redstone_block"));
	//ORES		
		event.getRegistry().register(new ModOreBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 15.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(2)).setRegistryName("ruby_ore"));
		event.getRegistry().register(new ModOreBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.8f, 12.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(1)).setRegistryName("opal_ore"));
		event.getRegistry().register(new ModOreBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(5.5f, 25.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(2)).setRegistryName("tangerine_ore"));
		event.getRegistry().register(new ModOreBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(6.5f, 35.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(3)).setRegistryName("cobalt_ore"));
		event.getRegistry().register(new ModOreBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(5.5f, 35.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(2)).setRegistryName("paryth_ore"));
		event.getRegistry().register(new ModOreBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(6.0f, 200.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(2)).setRegistryName("white_dwarf_star_ore"));
		event.getRegistry().register(new ModOreBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 8.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(2)).setRegistryName("natural_essence_ore"));

	//NETHER ORES
		event.getRegistry().register(new ModOreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.2f, 62.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(2)).setRegistryName("ruby_ore_nether"));
		event.getRegistry().register(new ModOreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.2f, 62.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(2)).setRegistryName("flame_ore_nether"));			
		event.getRegistry().register(new ModOreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(4.5f, 80.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(2)).setRegistryName("hellfire_ore_nether"));
	//BRICKS
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 30.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(1)).setRegistryName("skinny_slanted_bricks"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 30.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(1)).setRegistryName("slanted_bricks"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 30.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(1)).setRegistryName("skinny_bricks"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 30.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(1)).setRegistryName("circular_bricks"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 30.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(1)).setRegistryName("cracked_bricks"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 30.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(1)).setRegistryName("encased_bricks"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 30.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(1)).setRegistryName("mosaic_bricks"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 30.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(1)).setRegistryName("ornate_bricks"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 30.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(1)).setRegistryName("road_bricks"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 30.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(1)).setRegistryName("solid_bricks"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 30.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(1)).setRegistryName("weaver_bricks"));
	//MISC BLOCKS		
		event.getRegistry().register(new Block(Block.Properties.create(Material.CAKE).hardnessAndResistance(1.0f, 8.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.SWEET_BERRY_BUSH).harvestLevel(0)).setRegistryName("sugar_block"));
		
		event.getRegistry().register(new LogBlock(MaterialColor.GREEN, Block.Properties.create(Material.BAMBOO).hardnessAndResistance(1.5f, 12.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.BAMBOO).harvestLevel(0)).setRegistryName("bamboo_block"));
		event.getRegistry().register(new StairsBlock(() -> bamboo_block.getDefaultState(), Block.Properties.create(Material.BAMBOO).hardnessAndResistance(1.5f, 12.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.BAMBOO).harvestLevel(0)).setRegistryName("bamboo_stairs"));
		event.getRegistry().register(new SlabBlock(Block.Properties.create(Material.BAMBOO).hardnessAndResistance(1.5f, 12.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.BAMBOO).harvestLevel(0)).setRegistryName("bamboo_slab"));
		event.getRegistry().register(new WallBlock(Block.Properties.create(Material.BAMBOO).hardnessAndResistance(1.5f, 12.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.BAMBOO).harvestLevel(0)).setRegistryName("bamboo_wall"));
		event.getRegistry().register(new ModDoorBlock(Block.Properties.create(Material.BAMBOO).hardnessAndResistance(1.5f, 12.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.BAMBOO).harvestLevel(0).notSolid()).setRegistryName("bamboo_door"));

		event.getRegistry().register(new LogBlock(MaterialColor.GREEN, Block.Properties.create(Material.BAMBOO).hardnessAndResistance(1.2f, 10.0f).harvestTool(ToolType.PICKAXE).sound(SoundType.CROP).harvestLevel(0)).setRegistryName("sugar_cane_block"));

	//REDSTONE LAMPS
		event.getRegistry().register(new CustomLampBlock("black_redstone_lamp"));
		event.getRegistry().register(new CustomLampBlock("blue_redstone_lamp"));
		event.getRegistry().register(new CustomLampBlock("brown_redstone_lamp"));
		event.getRegistry().register(new CustomLampBlock("cyan_redstone_lamp"));
		event.getRegistry().register(new CustomLampBlock("gray_redstone_lamp"));
		event.getRegistry().register(new CustomLampBlock("green_redstone_lamp"));
		event.getRegistry().register(new CustomLampBlock("light_blue_redstone_lamp"));
		event.getRegistry().register(new CustomLampBlock("light_gray_redstone_lamp"));
		event.getRegistry().register(new CustomLampBlock("lime_redstone_lamp"));
		event.getRegistry().register(new CustomLampBlock("magenta_redstone_lamp"));
		event.getRegistry().register(new CustomLampBlock("orange_redstone_lamp"));
		event.getRegistry().register(new CustomLampBlock("pink_redstone_lamp"));
		event.getRegistry().register(new CustomLampBlock("purple_redstone_lamp"));
		event.getRegistry().register(new CustomLampBlock("red_redstone_lamp"));
		event.getRegistry().register(new CustomLampBlock("white_redstone_lamp"));
		event.getRegistry().register(new CustomLampBlock("yellow_redstone_lamp"));

	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event)
	{	
	// BLOCKS
		event.getRegistry().register(new BlockItem(ruby_block, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("ruby_block"));
		event.getRegistry().register(new BlockItem(opal_block, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("opal_block"));
		event.getRegistry().register(new BlockItem(tangerine_block, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("tangerine_block"));
		event.getRegistry().register(new BlockItem(cobalt_block, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("cobalt_block"));
		event.getRegistry().register(new BlockItem(blue_emerald_block, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("blue_emerald_block"));
		event.getRegistry().register(new BlockItem(paryth_block, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("paryth_block"));
		event.getRegistry().register(new BlockItem(lightning_block, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("lightning_block"));
		event.getRegistry().register(new BlockItem(flame_block, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("flame_block"));
		event.getRegistry().register(new BlockItem(hardened_redstone_block, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("hardened_redstone_block"));
					
		event.getRegistry().register(new BlockItem(sugar_block, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("sugar_block"));
					
					
	// ORES
		event.getRegistry().register(new BlockItem(ruby_ore, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("ruby_ore"));
		event.getRegistry().register(new BlockItem(opal_ore, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("opal_ore"));
		event.getRegistry().register(new BlockItem(tangerine_ore, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("tangerine_ore"));
		event.getRegistry().register(new BlockItem(cobalt_ore, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("cobalt_ore"));
		event.getRegistry().register(new BlockItem(paryth_ore, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("paryth_ore"));
		event.getRegistry().register(new BlockItem(white_dwarf_star_ore, new Item.Properties().group(ChrispyModItemGroup.instance).rarity(Rarity.EPIC)).setRegistryName("white_dwarf_star_ore"));
		event.getRegistry().register(new BlockItem(natural_essence_ore, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("natural_essence_ore"));
					
	// NETHER ORES
		event.getRegistry().register(new BlockItem(ruby_ore_nether, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("ruby_ore_nether"));
		event.getRegistry().register(new BlockItem(flame_ore_nether, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("flame_ore_nether"));
		event.getRegistry().register(new BlockItem(hellfire_ore_nether, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("hellfire_ore_nether"));

	// BRICKS			
		event.getRegistry().register(new BlockItem(skinny_slanted_bricks, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("skinny_slanted_bricks"));
		event.getRegistry().register(new BlockItem(slanted_bricks, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("slanted_bricks"));
		event.getRegistry().register(new BlockItem(skinny_bricks, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("skinny_bricks"));
		event.getRegistry().register(new BlockItem(circular_bricks, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("circular_bricks"));
		event.getRegistry().register(new BlockItem(cracked_bricks, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("cracked_bricks"));
		event.getRegistry().register(new BlockItem(encased_bricks, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("encased_bricks"));
		event.getRegistry().register(new BlockItem(mosaic_bricks, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("mosaic_bricks"));
		event.getRegistry().register(new BlockItem(ornate_bricks, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("ornate_bricks"));
		event.getRegistry().register(new BlockItem(road_bricks, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("road_bricks"));
		event.getRegistry().register(new BlockItem(solid_bricks, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("solid_bricks"));
		event.getRegistry().register(new BlockItem(weaver_bricks, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("weaver_bricks"));
		
	// BAMBOO
		event.getRegistry().register(new BlockItem(bamboo_block, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("bamboo_block"));
		event.getRegistry().register(new BlockItem(bamboo_stairs, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("bamboo_stairs"));
		event.getRegistry().register(new BlockItem(bamboo_slab, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("bamboo_slab"));
		event.getRegistry().register(new BlockItem(bamboo_wall, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("bamboo_wall"));
		event.getRegistry().register(new BlockItem(bamboo_door, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("bamboo_door"));
		
		event.getRegistry().register(new BlockItem(sugar_cane_block, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("sugar_cane_block"));
		
	// REDSTONE LAMPS
		event.getRegistry().register(new BlockItem(black_redstone_lamp, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("black_redstone_lamp"));
		event.getRegistry().register(new BlockItem(blue_redstone_lamp, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("blue_redstone_lamp"));
		event.getRegistry().register(new BlockItem(brown_redstone_lamp, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("brown_redstone_lamp"));
		event.getRegistry().register(new BlockItem(cyan_redstone_lamp, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("cyan_redstone_lamp"));
		event.getRegistry().register(new BlockItem(gray_redstone_lamp, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("gray_redstone_lamp"));
		event.getRegistry().register(new BlockItem(green_redstone_lamp, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("green_redstone_lamp"));
		event.getRegistry().register(new BlockItem(light_blue_redstone_lamp, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("light_blue_redstone_lamp"));
		event.getRegistry().register(new BlockItem(light_gray_redstone_lamp, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("light_gray_redstone_lamp"));
		event.getRegistry().register(new BlockItem(lime_redstone_lamp, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("lime_redstone_lamp"));
		event.getRegistry().register(new BlockItem(magenta_redstone_lamp, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("magenta_redstone_lamp"));
		event.getRegistry().register(new BlockItem(orange_redstone_lamp, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("orange_redstone_lamp"));
		event.getRegistry().register(new BlockItem(pink_redstone_lamp, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("pink_redstone_lamp"));
		event.getRegistry().register(new BlockItem(purple_redstone_lamp, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("purple_redstone_lamp"));
		event.getRegistry().register(new BlockItem(red_redstone_lamp, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("red_redstone_lamp"));
		event.getRegistry().register(new BlockItem(white_redstone_lamp, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("white_redstone_lamp"));
		event.getRegistry().register(new BlockItem(yellow_redstone_lamp, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("yellow_redstone_lamp"));
	}
}
*/