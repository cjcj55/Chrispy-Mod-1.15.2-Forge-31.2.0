package com.cjcj55.chrispymod.init;

import com.cjcj55.chrispymod.ChrispyMod;
import com.cjcj55.chrispymod.objects.blocks.BlockFromOreItem;
import com.cjcj55.chrispymod.objects.blocks.CustomLampBlock;
import com.cjcj55.chrispymod.objects.blocks.ModDoorBlock;
import com.cjcj55.chrispymod.objects.blocks.ModOreBlock;
import com.cjcj55.chrispymod.objects.blocks.ModStairsBlock;

import net.minecraft.block.Block;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry 
{
		public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ChrispyMod.MOD_ID);
	
	// BLOCKS (FROM ORE)
		public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", () -> new BlockFromOreItem(Block.Properties.of(Material.METAL).strength(5.1f, 31.0f).harvestLevel(2).sound(SoundType.METAL)));
		public static final RegistryObject<Block> OPAL_BLOCK = BLOCKS.register("opal_block", () -> new BlockFromOreItem(Block.Properties.of(Material.METAL).strength(4.5f, 31.0f).harvestLevel(2).sound(SoundType.METAL)));
		public static final RegistryObject<Block> TANGERINE_BLOCK = BLOCKS.register("tangerine_block", () -> new BlockFromOreItem(Block.Properties.of(Material.METAL).strength(5.3f, 31.0f).harvestLevel(2).sound(SoundType.METAL)));
		public static final RegistryObject<Block> COBALT_BLOCK = BLOCKS.register("cobalt_block", () -> new BlockFromOreItem(Block.Properties.of(Material.METAL).strength(6.0f, 45.0f).harvestLevel(3).sound(SoundType.METAL)));
		public static final RegistryObject<Block> BLUE_EMERALD_BLOCK = BLOCKS.register("blue_emerald_block", () -> new BlockFromOreItem(Block.Properties.of(Material.METAL).strength(9.0f, 50.0f).harvestLevel(3).sound(SoundType.METAL)));
		public static final RegistryObject<Block> PARYTH_BLOCK = BLOCKS.register("paryth_block", () -> new BlockFromOreItem(Block.Properties.of(Material.METAL).strength(5.6f, 35.0f).harvestLevel(2).sound(SoundType.METAL)));
		public static final RegistryObject<Block> LIGHTNING_BLOCK = BLOCKS.register("lightning_block", () -> new BlockFromOreItem(Block.Properties.of(Material.METAL).strength(8.5f, 40.0f).harvestLevel(2).sound(SoundType.METAL).lightLevel((p_235464_0_) -> {return 15;})));
		public static final RegistryObject<Block> FLAME_BLOCK = BLOCKS.register("flame_block", () -> new BlockFromOreItem(Block.Properties.of(Material.METAL).strength(5.1f, 40.0f).harvestLevel(2).sound(SoundType.METAL)));
		public static final RegistryObject<Block> HARDENED_REDSTONE_BLOCK = BLOCKS.register("hardened_redstone_block", () -> new BlockFromOreItem(Block.Properties.of(Material.METAL).strength(3.2f, 18.0f).sound(SoundType.METAL).harvestLevel(2)));
	// ORES
		public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", () -> new ModOreBlock(Block.Properties.of(Material.STONE).strength(5.0f, 15.0f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
		public static final RegistryObject<Block> OPAL_ORE = BLOCKS.register("opal_ore", () -> new ModOreBlock(Block.Properties.of(Material.STONE).strength(3.8f, 12.0f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)));
		public static final RegistryObject<Block> TANGERINE_ORE = BLOCKS.register("tangerine_ore", () -> new ModOreBlock(Block.Properties.of(Material.STONE).strength(5.5f, 25.0f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
		public static final RegistryObject<Block> COBALT_ORE = BLOCKS.register("cobalt_ore", () -> new ModOreBlock(Block.Properties.of(Material.STONE).strength(6.5f, 35.0f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(3).sound(SoundType.STONE)));
		public static final RegistryObject<Block> PARYTH_ORE = BLOCKS.register("paryth_ore", () -> new ModOreBlock(Block.Properties.of(Material.STONE).strength(5.5f, 35.0f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
		public static final RegistryObject<Block> WHITE_DWARF_STAR_ORE = BLOCKS.register("white_dwarf_star_ore", () -> new ModOreBlock(Block.Properties.of(Material.STONE).strength(6.0f, 200.0f).sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
		public static final RegistryObject<Block> NATURAL_ESSENCE_ORE = BLOCKS.register("natural_essence_ore", () -> new ModOreBlock(Block.Properties.of(Material.STONE).strength(2.0f, 8.0f).sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
		public static final RegistryObject<Block> EXPERIENCE_ORE = BLOCKS.register("experience_ore", () -> new ModOreBlock(Block.Properties.of(Material.STONE).strength(4.0f, 13.0f).sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

	// NETHER ORES
		public static final RegistryObject<Block> RUBY_ORE_NETHER = BLOCKS.register("ruby_ore_nether", () -> new Block(Block.Properties.of(Material.METAL).strength(2.0f, 8.0f).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
		public static final RegistryObject<Block> FLAME_ORE_NETHER = BLOCKS.register("flame_ore_nether", () -> new Block(Block.Properties.of(Material.METAL).strength(2.0f, 8.0f).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
		public static final RegistryObject<Block> HELLFIRE_ORE_NETHER = BLOCKS.register("hellfire_ore_nether", () -> new Block(Block.Properties.of(Material.METAL).strength(2.0f, 8.0f).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
	// BRICKS
		public static final RegistryObject<Block> SKINNY_SLANTED_BRICKS = BLOCKS.register("skinny_slanted_bricks", () -> new Block(Block.Properties.of(Material.STONE).strength(2.0f, 30.0f).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)));
		public static final RegistryObject<Block> SLANTED_BRICKS = BLOCKS.register("slanted_bricks", () -> new Block(Block.Properties.copy(SKINNY_SLANTED_BRICKS.get())));
		public static final RegistryObject<Block> SKINNY_BRICKS = BLOCKS.register("skinny_bricks", () -> new Block(Block.Properties.copy(SKINNY_SLANTED_BRICKS.get())));
		public static final RegistryObject<Block> CIRCULAR_BRICKS = BLOCKS.register("circular_bricks", () -> new Block(Block.Properties.copy(SKINNY_SLANTED_BRICKS.get())));
		public static final RegistryObject<Block> CRACKED_BRICKS = BLOCKS.register("cracked_bricks", () -> new Block(Block.Properties.copy(SKINNY_SLANTED_BRICKS.get())));
		public static final RegistryObject<Block> ENCASED_BRICKS = BLOCKS.register("encased_bricks", () -> new Block(Block.Properties.copy(SKINNY_SLANTED_BRICKS.get())));
		public static final RegistryObject<Block> MOSAIC_BRICKS = BLOCKS.register("mosaic_bricks", () -> new Block(Block.Properties.copy(SKINNY_SLANTED_BRICKS.get())));
		public static final RegistryObject<Block> ORNATE_BRICKS = BLOCKS.register("ornate_bricks", () -> new Block(Block.Properties.copy(SKINNY_SLANTED_BRICKS.get())));
		public static final RegistryObject<Block> ROAD_BRICKS = BLOCKS.register("road_bricks", () -> new Block(Block.Properties.copy(SKINNY_SLANTED_BRICKS.get())));
		public static final RegistryObject<Block> SOLID_BRICKS = BLOCKS.register("solid_bricks", () -> new Block(Block.Properties.copy(SKINNY_SLANTED_BRICKS.get())));
		public static final RegistryObject<Block> WEAVER_BRICKS = BLOCKS.register("weaver_bricks", () -> new Block(Block.Properties.copy(SKINNY_SLANTED_BRICKS.get())));
	// REDSTONE LAMPS
		public static final RegistryObject<Block> BLACK_REDSTONE_LAMP = BLOCKS.register("black_redstone_lamp", () -> new CustomLampBlock(Block.Properties.of(Material.GLASS).strength(0.3f, 1.5f).harvestLevel(0).sound(SoundType.GLASS)));
		public static final RegistryObject<Block> BLUE_REDSTONE_LAMP = BLOCKS.register("blue_redstone_lamp", () -> new CustomLampBlock(Block.Properties.copy(BLACK_REDSTONE_LAMP.get())));
		public static final RegistryObject<Block> BROWN_REDSTONE_LAMP = BLOCKS.register("brown_redstone_lamp", () -> new CustomLampBlock(Block.Properties.copy(BLACK_REDSTONE_LAMP.get())));
		public static final RegistryObject<Block> CYAN_REDSTONE_LAMP = BLOCKS.register("cyan_redstone_lamp", () -> new CustomLampBlock(Block.Properties.copy(BLACK_REDSTONE_LAMP.get())));
		public static final RegistryObject<Block> GRAY_REDSTONE_LAMP = BLOCKS.register("gray_redstone_lamp", () -> new CustomLampBlock(Block.Properties.copy(BLACK_REDSTONE_LAMP.get())));
		public static final RegistryObject<Block> GREEN_REDSTONE_LAMP = BLOCKS.register("green_redstone_lamp", () -> new CustomLampBlock(Block.Properties.copy(BLACK_REDSTONE_LAMP.get())));
		public static final RegistryObject<Block> LIGHT_BLUE_REDSTONE_LAMP = BLOCKS.register("light_blue_redstone_lamp", () -> new CustomLampBlock(Block.Properties.copy(BLACK_REDSTONE_LAMP.get())));
		public static final RegistryObject<Block> LIGHT_GRAY_REDSTONE_LAMP = BLOCKS.register("light_gray_redstone_lamp", () -> new CustomLampBlock(Block.Properties.copy(BLACK_REDSTONE_LAMP.get())));
		public static final RegistryObject<Block> LIME_REDSTONE_LAMP = BLOCKS.register("lime_redstone_lamp", () -> new CustomLampBlock(Block.Properties.copy(BLACK_REDSTONE_LAMP.get())));
		public static final RegistryObject<Block> MAGENTA_REDSTONE_LAMP = BLOCKS.register("magenta_redstone_lamp", () -> new CustomLampBlock(Block.Properties.copy(BLACK_REDSTONE_LAMP.get())));
		public static final RegistryObject<Block> ORANGE_REDSTONE_LAMP = BLOCKS.register("orange_redstone_lamp", () -> new CustomLampBlock(Block.Properties.copy(BLACK_REDSTONE_LAMP.get())));
		public static final RegistryObject<Block> PINK_REDSTONE_LAMP = BLOCKS.register("pink_redstone_lamp", () -> new CustomLampBlock(Block.Properties.copy(BLACK_REDSTONE_LAMP.get())));
		public static final RegistryObject<Block> PURPLE_REDSTONE_LAMP = BLOCKS.register("purple_redstone_lamp", () -> new CustomLampBlock(Block.Properties.copy(BLACK_REDSTONE_LAMP.get())));
		public static final RegistryObject<Block> RED_REDSTONE_LAMP = BLOCKS.register("red_redstone_lamp", () -> new CustomLampBlock(Block.Properties.copy(BLACK_REDSTONE_LAMP.get())));
		public static final RegistryObject<Block> WHITE_REDSTONE_LAMP = BLOCKS.register("white_redstone_lamp", () -> new CustomLampBlock(Block.Properties.copy(BLACK_REDSTONE_LAMP.get())));
		public static final RegistryObject<Block> YELLOW_REDSTONE_LAMP = BLOCKS.register("yellow_redstone_lamp", () -> new CustomLampBlock(Block.Properties.copy(BLACK_REDSTONE_LAMP.get())));
	// MISC BLOCKS
		public static final RegistryObject<Block> SUGAR_BLOCK = BLOCKS.register("sugar_block", () -> new Block(Block.Properties.of(Material.BAMBOO).strength(1.0f, 8.0f).harvestLevel(0).sound(SoundType.SWEET_BERRY_BUSH)));
		public static final RegistryObject<Block> SUGAR_CANE_BLOCK = BLOCKS.register("sugar_cane_block", () -> new RotatedPillarBlock(Block.Properties.of(Material.BAMBOO).strength(1.2f, 10.0f).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.CROP)));
		public static final RegistryObject<Block> BAMBOO_BLOCK = BLOCKS.register("bamboo_block", () -> new RotatedPillarBlock(Block.Properties.of(Material.BAMBOO).strength(1.5f, 12.0f).harvestTool(ToolType.AXE).harvestLevel(0).sound(SoundType.BAMBOO)));
		public static final RegistryObject<Block> BAMBOO_STAIRS = BLOCKS.register("bamboo_stairs", () -> new ModStairsBlock(BAMBOO_BLOCK.get().defaultBlockState(), Block.Properties.copy(BAMBOO_BLOCK.get())));
		public static final RegistryObject<Block> BAMBOO_SLAB = BLOCKS.register("bamboo_slab", () -> new SlabBlock(Block.Properties.copy(BAMBOO_BLOCK.get())));
		public static final RegistryObject<Block> BAMBOO_WALL = BLOCKS.register("bamboo_wall", () -> new WallBlock(Block.Properties.copy(BAMBOO_BLOCK.get())));
		public static final RegistryObject<Block> BAMBOO_DOOR = BLOCKS.register("bamboo_door", () -> new ModDoorBlock(Block.Properties.copy(BAMBOO_BLOCK.get())) {} );

}
