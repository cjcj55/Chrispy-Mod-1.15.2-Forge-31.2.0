package com.cjcj55.chrispymod.init;
/*package com.cjcj55.chrispymod.init;

import com.cjcj55.chrispymod.ChrispyMod;
import com.cjcj55.chrispymod.itemgroups.ChrispyModItemGroup;
import com.cjcj55.chrispymod.objects.items.ChrispyItem;
import com.cjcj55.chrispymod.objects.items.CustomAxeItem;
import com.cjcj55.chrispymod.objects.items.FlameSwordItem;
import com.cjcj55.chrispymod.objects.items.FlameWandItem;
import com.cjcj55.chrispymod.objects.items.HellfireBurnableItem;
import com.cjcj55.chrispymod.objects.items.LightningSwordItem;
import com.cjcj55.chrispymod.objects.items.LightningWandItem;
import com.cjcj55.chrispymod.objects.items.SpeedArmorItem;
import com.cjcj55.chrispymod.objects.items.WhiteDwarfStarItem;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Rarity;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ChrispyMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(ChrispyMod.MOD_ID)
public class ItemInit
{
	public static final Item ruby = null; 
	public static final Item ruby_pickaxe = null;
	public static final Item ruby_sword = null;
	public static final Item ruby_axe = null;
	public static final Item ruby_shovel = null;
	public static final Item ruby_hoe = null;
	public static final Item ruby_helmet = null;
	public static final Item ruby_chestplate = null;
	public static final Item ruby_leggings = null;
	public static final Item ruby_boots = null;
	public static final Item ruby_block = null;
	public static final Item ruby_ore = null;
	public static final Item ruby_ore_nether = null;
	
	public static final Item opal = null;
	public static final Item opal_pickaxe = null;
	public static final Item opal_sword = null;
	public static final Item opal_axe = null;
	public static final Item opal_shovel = null;
	public static final Item opal_hoe = null;
	public static final Item opal_helmet = null;
	public static final Item opal_chestplate = null;
	public static final Item opal_leggings = null;
	public static final Item opal_boots = null;
	public static final Item opal_block = null;
	public static final Item opal_ore = null;
	
	public static final Item tangerine = null;
	public static final Item tangerine_pickaxe = null;
	public static final Item tangerine_sword = null;
	public static final Item tangerine_axe = null;
	public static final Item tangerine_shovel = null;
	public static final Item tangerine_hoe = null;
	public static final Item tangerine_helmet = null;
	public static final Item tangerine_chestplate = null;
	public static final Item tangerine_leggings = null;
	public static final Item tangerine_boots = null;
	public static final Item tangerine_block = null;
	public static final Item tangerine_ore = null;
	
	public static final Item cobalt = null;
	public static final Item cobalt_shard = null;
	public static final Item cobalt_pickaxe = null;
	public static final Item cobalt_sword = null;
	public static final Item cobalt_axe = null;
	public static final Item cobalt_shovel = null;
	public static final Item cobalt_hoe = null;
	public static final Item cobalt_helmet = null;
	public static final Item cobalt_chestplate = null;
	public static final Item cobalt_leggings = null;
	public static final Item cobalt_boots = null;
	public static final Item cobalt_block = null;
	public static final Item cobalt_ore = null;
	
	public static final Item blue_emerald = null;
	public static final Item blue_emerald_pickaxe = null;
	public static final Item blue_emerald_sword = null;
	public static final Item blue_emerald_axe = null;
	public static final Item blue_emerald_shovel = null;
	public static final Item blue_emerald_hoe = null;
	public static final Item blue_emerald_helmet = null;
	public static final Item blue_emerald_chestplate = null;
	public static final Item blue_emerald_leggings = null;
	public static final Item blue_emerald_boots = null;
	public static final Item blue_emerald_block = null;
	
	public static final Item paryth = null;
	public static final Item paryth_pickaxe = null;
	public static final Item paryth_sword = null;
	public static final Item paryth_axe = null;
	public static final Item paryth_shovel = null;
	public static final Item paryth_hoe = null;
	public static final Item paryth_helmet = null;
	public static final Item paryth_chestplate = null;
	public static final Item paryth_leggings = null;
	public static final Item paryth_boots = null;
	public static final Item paryth_block = null;
	public static final Item paryth_ore = null;
	
	public static final Item lightning = null;
	public static final Item lightning_pickaxe = null;
	public static final Item lightning_sword = null;
	public static final Item lightning_axe = null;
	public static final Item lightning_shovel = null;
	public static final Item lightning_hoe = null;
	public static final Item lightning_helmet = null;
	public static final Item lightning_chestplate = null;
	public static final Item lightning_leggings = null;
	public static final Item lightning_boots = null;
	public static final Item lightning_block = null;
	
	public static final Item flame = null;
	public static final Item flame_pickaxe = null;
	public static final Item flame_sword = null;
	public static final Item flame_axe = null;
	public static final Item flame_shovel = null;
	public static final Item flame_hoe = null;
	public static final Item flame_helmet = null;
	public static final Item flame_chestplate = null;
	public static final Item flame_leggings = null;
	public static final Item flame_boots = null;
	public static final Item flame_block = null;
	public static final Item flame_ore_nether = null;
	
	public static final Item redstone_ingot = null;
	public static final Item redstone_pickaxe = null;
	public static final Item redstone_sword = null;
	public static final Item redstone_axe = null;
	public static final Item redstone_shovel = null;
	public static final Item redstone_hoe = null;
	public static final Item redstone_helmet = null;
	public static final Item redstone_chestplate = null;
	public static final Item redstone_leggings = null;
	public static final Item redstone_boots = null;
	public static final Item hardened_redstone_block = null;
	
	public static final Item emerald_pickaxe = null;
	public static final Item emerald_sword = null;
	public static final Item emerald_axe = null;
	public static final Item emerald_shovel = null;
	public static final Item emerald_hoe = null;
	public static final Item emerald_helmet = null;
	public static final Item emerald_chestplate = null;
	public static final Item emerald_leggings = null;
	public static final Item emerald_boots = null;
	
	public static final Item hellfire = null;
	
	public static final Item white_dwarf_star = null;
	public static final Item white_dwarf_star_helmet = null;
	public static final Item white_dwarf_star_chestplate = null;
	public static final Item white_dwarf_star_leggings = null;
	public static final Item white_dwarf_star_boots = null;
	
	public static final Item natural_essence = null;
	
	public static final Item flame_wand = null;
	public static final Item lightning_wand = null;
	
	public static final Item grand_experience_bottle = null;
	//public static Item wandering_cow_egg = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new Item(new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("ruby"));
		event.getRegistry().register(new PickaxeItem(ChrispyToolMaterials.ruby, -2, -2.8f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("ruby_pickaxe"));
		// First # is how much +/- damage each specific tool does. Second # is attack speed.
		event.getRegistry().register(new SwordItem(ChrispyToolMaterials.ruby, 0, -2.4f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("ruby_sword"));
		event.getRegistry().register(new AxeItem(ChrispyToolMaterials.ruby, -1.0f, -3.0f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("ruby_axe"));
		event.getRegistry().register(new ShovelItem(ChrispyToolMaterials.ruby, -3.0f, -3.0f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("ruby_shovel"));
		event.getRegistry().register(new HoeItem(ChrispyToolMaterials.ruby, 0.0f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("ruby_hoe"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.ruby, EquipmentSlotType.HEAD, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("ruby_helmet"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.ruby, EquipmentSlotType.CHEST, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("ruby_chestplate"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.ruby, EquipmentSlotType.LEGS, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("ruby_leggings"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.ruby, EquipmentSlotType.FEET, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("ruby_boots"));
		
		event.getRegistry().register(new ChrispyItem("opal"));
		event.getRegistry().register(new PickaxeItem(ChrispyToolMaterials.opal, -2, -2.8f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("opal_pickaxe"));
		event.getRegistry().register(new SwordItem(ChrispyToolMaterials.opal, 0, -2.4f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("opal_sword"));
		event.getRegistry().register(new CustomAxeItem(ChrispyToolMaterials.opal, -1.0f, -3.1f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("opal_axe"));
		event.getRegistry().register(new ShovelItem(ChrispyToolMaterials.opal, -3.0f, -3.0f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("opal_shovel"));
		event.getRegistry().register(new HoeItem(ChrispyToolMaterials.opal, -1.0f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("opal_hoe"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.opal, EquipmentSlotType.HEAD, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("opal_helmet"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.opal, EquipmentSlotType.CHEST, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("opal_chestplate"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.opal, EquipmentSlotType.LEGS, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("opal_leggings"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.opal, EquipmentSlotType.FEET, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("opal_boots"));
		
		event.getRegistry().register(new ChrispyItem("tangerine"));
		event.getRegistry().register(new PickaxeItem(ChrispyToolMaterials.tangerine, -2, -2.8f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("tangerine_pickaxe"));
		event.getRegistry().register(new SwordItem(ChrispyToolMaterials.tangerine, 0, -2.4f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("tangerine_sword"));
		event.getRegistry().register(new CustomAxeItem(ChrispyToolMaterials.tangerine, -1.0f, -3.0f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("tangerine_axe"));
		event.getRegistry().register(new ShovelItem(ChrispyToolMaterials.tangerine, -3.0f, -3.0f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("tangerine_shovel"));
		event.getRegistry().register(new HoeItem(ChrispyToolMaterials.tangerine, 0.0f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("tangerine_hoe"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.tangerine, EquipmentSlotType.HEAD, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("tangerine_helmet"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.tangerine, EquipmentSlotType.CHEST, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("tangerine_chestplate"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.tangerine, EquipmentSlotType.LEGS, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("tangerine_leggings"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.tangerine, EquipmentSlotType.FEET, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("tangerine_boots"));
		
		event.getRegistry().register(new ChrispyItem("cobalt"));
		event.getRegistry().register(new Item(new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("cobalt_shard"));
		event.getRegistry().register(new PickaxeItem(ChrispyToolMaterials.cobalt, -2, -2.8f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("cobalt_pickaxe"));
		event.getRegistry().register(new SwordItem(ChrispyToolMaterials.cobalt, 0, -2.4f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("cobalt_sword"));
		event.getRegistry().register(new CustomAxeItem(ChrispyToolMaterials.cobalt, -1.0f, -2.9f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("cobalt_axe"));
		event.getRegistry().register(new ShovelItem(ChrispyToolMaterials.cobalt, -3.0f, -3.0f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("cobalt_shovel"));
		event.getRegistry().register(new HoeItem(ChrispyToolMaterials.cobalt, 0.0f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("cobalt_hoe"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.cobalt, EquipmentSlotType.HEAD, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("cobalt_helmet"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.cobalt, EquipmentSlotType.CHEST, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("cobalt_chestplate"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.cobalt, EquipmentSlotType.LEGS, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("cobalt_leggings"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.cobalt, EquipmentSlotType.FEET, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("cobalt_boots"));
		
		event.getRegistry().register(new ChrispyItem("blue_emerald"));
		event.getRegistry().register(new PickaxeItem(ChrispyToolMaterials.blue_emerald, -2, -2.6f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("blue_emerald_pickaxe"));
		event.getRegistry().register(new SwordItem(ChrispyToolMaterials.blue_emerald, 0, -2.2f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("blue_emerald_sword"));
		event.getRegistry().register(new CustomAxeItem(ChrispyToolMaterials.blue_emerald, -1.0f, -2.8f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("blue_emerald_axe"));
		event.getRegistry().register(new ShovelItem(ChrispyToolMaterials.blue_emerald, -3.0f, -2.9f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("blue_emerald_shovel"));
		event.getRegistry().register(new HoeItem(ChrispyToolMaterials.blue_emerald, 0.2f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("blue_emerald_hoe"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.blue_emerald, EquipmentSlotType.HEAD, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("blue_emerald_helmet"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.blue_emerald, EquipmentSlotType.CHEST, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("blue_emerald_chestplate"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.blue_emerald, EquipmentSlotType.LEGS, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("blue_emerald_leggings"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.blue_emerald, EquipmentSlotType.FEET, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("blue_emerald_boots"));
		
		event.getRegistry().register(new ChrispyItem("paryth"));
		event.getRegistry().register(new PickaxeItem(ChrispyToolMaterials.paryth, -2, -2.8f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("paryth_pickaxe"));
		event.getRegistry().register(new SwordItem(ChrispyToolMaterials.paryth, 0, -2.4f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("paryth_sword"));
		event.getRegistry().register(new CustomAxeItem(ChrispyToolMaterials.paryth, -1.0f, -3.0f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("paryth_axe"));
		event.getRegistry().register(new ShovelItem(ChrispyToolMaterials.paryth, -3.0f, -3.0f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("paryth_shovel"));
		event.getRegistry().register(new HoeItem(ChrispyToolMaterials.paryth, 0.0f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("paryth_hoe"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.paryth, EquipmentSlotType.HEAD, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("paryth_helmet"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.paryth, EquipmentSlotType.CHEST, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("paryth_chestplate"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.paryth, EquipmentSlotType.LEGS, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("paryth_leggings"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.paryth, EquipmentSlotType.FEET, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("paryth_boots"));
		
		
		event.getRegistry().register(new ChrispyItem("lightning"));
		event.getRegistry().register(new PickaxeItem(ChrispyToolMaterials.lightning, -2, -2.8f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("lightning_pickaxe"));
		event.getRegistry().register(new LightningSwordItem(ChrispyToolMaterials.lightning, 0, -2.4f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("lightning_sword"));
		event.getRegistry().register(new CustomAxeItem(ChrispyToolMaterials.lightning, -1.0f, -3.0f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("lightning_axe"));
		event.getRegistry().register(new ShovelItem(ChrispyToolMaterials.lightning, -3.0f, -3.0f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("lightning_shovel"));
		event.getRegistry().register(new HoeItem(ChrispyToolMaterials.lightning, 0.0f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("lightning_hoe"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.lightning, EquipmentSlotType.HEAD, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("lightning_helmet"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.lightning, EquipmentSlotType.CHEST, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("lightning_chestplate"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.lightning, EquipmentSlotType.LEGS, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("lightning_leggings"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.lightning, EquipmentSlotType.FEET, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("lightning_boots"));
		
		event.getRegistry().register(new ChrispyItem("flame"));
		event.getRegistry().register(new PickaxeItem(ChrispyToolMaterials.flame, -2, -2.8f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("flame_pickaxe"));
		event.getRegistry().register(new FlameSwordItem(ChrispyToolMaterials.flame, 0, -2.4f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("flame_sword"));
		event.getRegistry().register(new CustomAxeItem(ChrispyToolMaterials.flame, 1.5f, -2.9f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("flame_axe"));
		event.getRegistry().register(new ShovelItem(ChrispyToolMaterials.flame, -1.8f, -3.0f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("flame_shovel"));
		event.getRegistry().register(new HoeItem(ChrispyToolMaterials.flame, -1.0f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("flame_hoe"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.flame, EquipmentSlotType.HEAD, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("flame_helmet"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.flame, EquipmentSlotType.CHEST, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("flame_chestplate"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.flame, EquipmentSlotType.LEGS, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("flame_leggings"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.flame, EquipmentSlotType.FEET, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("flame_boots"));
		
		event.getRegistry().register(new ChrispyItem("redstone_ingot"));
		event.getRegistry().register(new PickaxeItem(ChrispyToolMaterials.redstone, -2, -2.8f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("redstone_pickaxe"));
		event.getRegistry().register(new FlameSwordItem(ChrispyToolMaterials.redstone, 0, -2.4f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("redstone_sword"));
		event.getRegistry().register(new CustomAxeItem(ChrispyToolMaterials.redstone, -1.0f, -3.1f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("redstone_axe"));
		event.getRegistry().register(new ShovelItem(ChrispyToolMaterials.redstone, -3.0f, -3.0f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("redstone_shovel"));
		event.getRegistry().register(new HoeItem(ChrispyToolMaterials.redstone, -1.0f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("redstone_hoe"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.redstone, EquipmentSlotType.HEAD, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("redstone_helmet"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.redstone, EquipmentSlotType.CHEST, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("redstone_chestplate"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.redstone, EquipmentSlotType.LEGS, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("redstone_leggings"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.redstone, EquipmentSlotType.FEET, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("redstone_boots"));
		
		event.getRegistry().register(new PickaxeItem(ChrispyToolMaterials.emerald, -1, -2.7f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("emerald_pickaxe"));
		event.getRegistry().register(new FlameSwordItem(ChrispyToolMaterials.emerald, 1, -2.3f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("emerald_sword"));
		event.getRegistry().register(new CustomAxeItem(ChrispyToolMaterials.emerald, -1.0f, -3.1f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("emerald_axe"));
		event.getRegistry().register(new ShovelItem(ChrispyToolMaterials.emerald, -3.0f, -3.0f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("emerald_shovel"));
		event.getRegistry().register(new HoeItem(ChrispyToolMaterials.emerald, 0.1f, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("emerald_hoe"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.emerald, EquipmentSlotType.HEAD, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("emerald_helmet"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.emerald, EquipmentSlotType.CHEST, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("emerald_chestplate"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.emerald, EquipmentSlotType.LEGS, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("emerald_leggings"));
		event.getRegistry().register(new ArmorItem(ChrispyArmorMaterials.emerald, EquipmentSlotType.FEET, new Item.Properties().group(ChrispyModItemGroup.instance)).setRegistryName("emerald_boots"));
		
		event.getRegistry().register(new HellfireBurnableItem("hellfire"));
		
		event.getRegistry().register(new WhiteDwarfStarItem("white_dwarf_star"));
		event.getRegistry().register(new SpeedArmorItem(ChrispyArmorMaterials.white_dwarf_star, EquipmentSlotType.HEAD, new Item.Properties().group(ChrispyModItemGroup.instance).rarity(Rarity.EPIC)).setRegistryName("white_dwarf_star_helmet"));
		event.getRegistry().register(new SpeedArmorItem(ChrispyArmorMaterials.white_dwarf_star, EquipmentSlotType.CHEST, new Item.Properties().group(ChrispyModItemGroup.instance).rarity(Rarity.EPIC)).setRegistryName("white_dwarf_star_chestplate"));
		event.getRegistry().register(new SpeedArmorItem(ChrispyArmorMaterials.white_dwarf_star, EquipmentSlotType.LEGS, new Item.Properties().group(ChrispyModItemGroup.instance).rarity(Rarity.EPIC)).setRegistryName("white_dwarf_star_leggings"));
		event.getRegistry().register(new SpeedArmorItem(ChrispyArmorMaterials.white_dwarf_star, EquipmentSlotType.FEET, new Item.Properties().group(ChrispyModItemGroup.instance).rarity(Rarity.EPIC)).setRegistryName("white_dwarf_star_boots"));
	
		event.getRegistry().register(new ChrispyItem("natural_essence"));
		
		event.getRegistry().register(new FlameWandItem(new Item.Properties().maxDamage(64).group(ChrispyModItemGroup.instance)).setRegistryName("flame_wand"));
		event.getRegistry().register(new LightningWandItem(new Item.Properties().maxDamage(64).group(ChrispyModItemGroup.instance)).setRegistryName("lightning_wand"));

		//EntitiesInit.registerEntitySpawnEggs(event);
	}
}*/
