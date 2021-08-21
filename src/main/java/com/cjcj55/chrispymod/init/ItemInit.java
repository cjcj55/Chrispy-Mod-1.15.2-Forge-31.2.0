package com.cjcj55.chrispymod.init;

import com.cjcj55.chrispymod.ChrispyMod;
import com.cjcj55.chrispymod.itemgroups.ChrispyModItemGroup;
import com.cjcj55.chrispymod.objects.items.ChrispyItem;
import com.cjcj55.chrispymod.objects.items.EdibleExperienceItem;
import com.cjcj55.chrispymod.objects.items.FlameSwordItem;
import com.cjcj55.chrispymod.objects.items.FlameWandItem;
import com.cjcj55.chrispymod.objects.items.HellfireBurnableItem;
import com.cjcj55.chrispymod.objects.items.HoneyArmorItem;
import com.cjcj55.chrispymod.objects.items.HoneySwordItem;
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
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit 
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ChrispyMod.MOD_ID);

// ITEM WITH TOOLS & ARMOR
	public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new ChrispyItem(new Item.Properties()));
	public static final RegistryObject<Item> OPAL = ITEMS.register("opal", () -> new ChrispyItem(new Item.Properties()));
	public static final RegistryObject<Item> TANGERINE = ITEMS.register("tangerine", () -> new ChrispyItem(new Item.Properties()));
	public static final RegistryObject<Item> COBALT = ITEMS.register("cobalt", () -> new ChrispyItem(new Item.Properties()));
	public static final RegistryObject<Item> BLUE_EMERALD = ITEMS.register("blue_emerald", () -> new ChrispyItem(new Item.Properties()));
	public static final RegistryObject<Item> PARYTH = ITEMS.register("paryth", () -> new ChrispyItem(new Item.Properties()));
	public static final RegistryObject<Item> LIGHTNING = ITEMS.register("lightning", () -> new ChrispyItem(new Item.Properties()));
	public static final RegistryObject<Item> FLAME = ITEMS.register("flame", () -> new ChrispyItem(new Item.Properties()));
	public static final RegistryObject<Item> REDSTONE_INGOT = ITEMS.register("redstone_ingot", () -> new ChrispyItem(new Item.Properties()));
	public static final RegistryObject<Item> HELLFIRE = ITEMS.register("hellfire", () -> new HellfireBurnableItem(new Item.Properties()));	
	public static final RegistryObject<Item> WHITE_DWARF_STAR = ITEMS.register("white_dwarf_star", () -> new WhiteDwarfStarItem(new Item.Properties()));
	public static final RegistryObject<Item> NATURAL_ESSENCE = ITEMS.register("natural_essence", () -> new ChrispyItem(new Item.Properties()));
	public static final RegistryObject<Item> HONEY_STICK = ITEMS.register("honey_stick", () -> new Item(new Item.Properties().tab(ChrispyModItemGroup.instance).food(FoodList.HONEY_STICK)));
	public static final RegistryObject<Item> EDIBLE_EXPERIENCE = ITEMS.register("edible_experience", () -> new EdibleExperienceItem(new Item.Properties()));
	
	// First # is how much +/- damage each specific tool does. Second # is attack speed.
	public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ChrispyToolMaterials.ruby, -2, -2.8f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ChrispyToolMaterials.ruby, 0, -2.4f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ChrispyToolMaterials.ruby, -1, -3.0f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ChrispyToolMaterials.ruby, -3, -3.0f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ChrispyToolMaterials.ruby, 1, 0.0f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ChrispyArmorMaterials.ruby, EquipmentSlotType.HEAD, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ChrispyArmorMaterials.ruby, EquipmentSlotType.CHEST, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ChrispyArmorMaterials.ruby, EquipmentSlotType.LEGS, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ChrispyArmorMaterials.ruby, EquipmentSlotType.FEET, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	
	
	// First # is how much +/- damage each specific tool does. Second # is attack speed.
	public static final RegistryObject<PickaxeItem> OPAL_PICKAXE = ITEMS.register("opal_pickaxe", () -> new PickaxeItem(ChrispyToolMaterials.opal, -2, -2.8f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<SwordItem> OPAL_SWORD = ITEMS.register("opal_sword", () -> new SwordItem(ChrispyToolMaterials.opal, 0, -2.4f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<AxeItem> OPAL_AXE = ITEMS.register("opal_axe", () -> new AxeItem(ChrispyToolMaterials.opal, -1.0f, -3.1f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ShovelItem> OPAL_SHOVEL = ITEMS.register("opal_shovel", () -> new ShovelItem(ChrispyToolMaterials.opal, -3, -3.0f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<HoeItem> OPAL_HOE = ITEMS.register("opal_hoe", () -> new HoeItem(ChrispyToolMaterials.opal, 1, -1.0f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> OPAL_HELMET = ITEMS.register("opal_helmet", () -> new ArmorItem(ChrispyArmorMaterials.opal, EquipmentSlotType.HEAD, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> OPAL_CHESTPLATE = ITEMS.register("opal_chestplate", () -> new ArmorItem(ChrispyArmorMaterials.opal, EquipmentSlotType.CHEST, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> OPAL_LEGGINGS = ITEMS.register("opal_leggings", () -> new ArmorItem(ChrispyArmorMaterials.opal, EquipmentSlotType.LEGS, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> OPAL_BOOTS = ITEMS.register("opal_boots", () -> new ArmorItem(ChrispyArmorMaterials.opal, EquipmentSlotType.FEET, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	
	
	// First # is how much +/- damage each specific tool does. Second # is attack speed.
	public static final RegistryObject<PickaxeItem> TANGERINE_PICKAXE = ITEMS.register("tangerine_pickaxe", () -> new PickaxeItem(ChrispyToolMaterials.tangerine, -2, -2.8f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<SwordItem> TANGERINE_SWORD = ITEMS.register("tangerine_sword", () -> new SwordItem(ChrispyToolMaterials.tangerine, 0, -2.4f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<AxeItem> TANGERINE_AXE = ITEMS.register("tangerine_axe", () -> new AxeItem(ChrispyToolMaterials.tangerine, -1, -3.0f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ShovelItem> TANGERINE_SHOVEL = ITEMS.register("tangerine_shovel", () -> new ShovelItem(ChrispyToolMaterials.tangerine, -3, -3.0f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<HoeItem> TANGERINE_HOE = ITEMS.register("tangerine_hoe", () -> new HoeItem(ChrispyToolMaterials.tangerine, 1, 0.0f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> TANGERINE_HELMET = ITEMS.register("tangerine_helmet", () -> new ArmorItem(ChrispyArmorMaterials.tangerine, EquipmentSlotType.HEAD, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> TANGERINE_CHESTPLATE = ITEMS.register("tangerine_chestplate", () -> new ArmorItem(ChrispyArmorMaterials.tangerine, EquipmentSlotType.CHEST, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> TANGERINE_LEGGINGS = ITEMS.register("tangerine_leggings", () -> new ArmorItem(ChrispyArmorMaterials.tangerine, EquipmentSlotType.LEGS, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> TANGERINE_BOOTS = ITEMS.register("tangerine_boots", () -> new ArmorItem(ChrispyArmorMaterials.tangerine, EquipmentSlotType.FEET, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	
	
	// First # is how much +/- damage each specific tool does. Second # is attack speed.
	public static final RegistryObject<PickaxeItem> COBALT_PICKAXE = ITEMS.register("cobalt_pickaxe", () -> new PickaxeItem(ChrispyToolMaterials.cobalt, -2, -2.8f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<SwordItem> COBALT_SWORD = ITEMS.register("cobalt_sword", () -> new SwordItem(ChrispyToolMaterials.cobalt, 0, -2.4f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<AxeItem> COBALT_AXE = ITEMS.register("cobalt_axe", () -> new AxeItem(ChrispyToolMaterials.cobalt, -1, -2.9f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ShovelItem> COBALT_SHOVEL = ITEMS.register("cobalt_shovel", () -> new ShovelItem(ChrispyToolMaterials.cobalt, -3, -3.0f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<HoeItem> COBALT_HOE = ITEMS.register("cobalt_hoe", () -> new HoeItem(ChrispyToolMaterials.cobalt, 1, 0.0f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> COBALT_HELMET = ITEMS.register("cobalt_helmet", () -> new ArmorItem(ChrispyArmorMaterials.cobalt, EquipmentSlotType.HEAD, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> COBALT_CHESTPLATE = ITEMS.register("cobalt_chestplate", () -> new ArmorItem(ChrispyArmorMaterials.cobalt, EquipmentSlotType.CHEST, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> COBALT_LEGGINGS = ITEMS.register("cobalt_leggings", () -> new ArmorItem(ChrispyArmorMaterials.cobalt, EquipmentSlotType.LEGS, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> COBALT_BOOTS = ITEMS.register("cobalt_boots", () -> new ArmorItem(ChrispyArmorMaterials.cobalt, EquipmentSlotType.FEET, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	
	
	// First # is how much +/- damage each specific tool does. Second # is attack speed.
	public static final RegistryObject<PickaxeItem> BLUE_EMERALD_PICKAXE = ITEMS.register("blue_emerald_pickaxe", () -> new PickaxeItem(ChrispyToolMaterials.blue_emerald, -2, -2.6f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<SwordItem> BLUE_EMERALD_SWORD = ITEMS.register("blue_emerald_sword", () -> new SwordItem(ChrispyToolMaterials.blue_emerald, 0, -2.2f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<AxeItem> BLUE_EMERALD_AXE = ITEMS.register("blue_emerald_axe", () -> new AxeItem(ChrispyToolMaterials.blue_emerald, -1, -2.8f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ShovelItem> BLUE_EMERALD_SHOVEL = ITEMS.register("blue_emerald_shovel", () -> new ShovelItem(ChrispyToolMaterials.blue_emerald, -3, -2.9f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<HoeItem> BLUE_EMERALD_HOE = ITEMS.register("blue_emerald_hoe", () -> new HoeItem(ChrispyToolMaterials.blue_emerald, 1, 0.2f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> BLUE_EMERALD_HELMET = ITEMS.register("blue_emerald_helmet", () -> new ArmorItem(ChrispyArmorMaterials.blue_emerald, EquipmentSlotType.HEAD, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> BLUE_EMERALD_CHESTPLATE = ITEMS.register("blue_emerald_chestplate", () -> new ArmorItem(ChrispyArmorMaterials.blue_emerald, EquipmentSlotType.CHEST, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> BLUE_EMERALD_LEGGINGS = ITEMS.register("blue_emerald_leggings", () -> new ArmorItem(ChrispyArmorMaterials.blue_emerald, EquipmentSlotType.LEGS, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> BLUE_EMERALD_BOOTS = ITEMS.register("blue_emerald_boots", () -> new ArmorItem(ChrispyArmorMaterials.blue_emerald, EquipmentSlotType.FEET, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	
	
	// First # is how much +/- damage each specific tool does. Second # is attack speed.
	public static final RegistryObject<PickaxeItem> PARYTH_PICKAXE = ITEMS.register("paryth_pickaxe", () -> new PickaxeItem(ChrispyToolMaterials.paryth, -2, -2.8f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<SwordItem> PARYTH_SWORD = ITEMS.register("paryth_sword", () -> new SwordItem(ChrispyToolMaterials.paryth, 0, -2.4f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<AxeItem> PARYTH_AXE = ITEMS.register("paryth_axe", () -> new AxeItem(ChrispyToolMaterials.paryth, -1, -3.0f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ShovelItem> PARYTH_SHOVEL = ITEMS.register("paryth_shovel", () -> new ShovelItem(ChrispyToolMaterials.paryth, -3, -3.0f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<HoeItem> PARYTH_HOE = ITEMS.register("paryth_hoe", () -> new HoeItem(ChrispyToolMaterials.paryth, 1, 0.0f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> PARYTH_HELMET = ITEMS.register("paryth_helmet", () -> new ArmorItem(ChrispyArmorMaterials.paryth, EquipmentSlotType.HEAD, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> PARYTH_CHESTPLATE = ITEMS.register("paryth_chestplate", () -> new ArmorItem(ChrispyArmorMaterials.paryth, EquipmentSlotType.CHEST, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> PARYTH_LEGGINGS = ITEMS.register("paryth_leggings", () -> new ArmorItem(ChrispyArmorMaterials.paryth, EquipmentSlotType.LEGS, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> PARYTH_BOOTS = ITEMS.register("paryth_boots", () -> new ArmorItem(ChrispyArmorMaterials.paryth, EquipmentSlotType.FEET, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	
	
	// First # is how much +/- damage each specific tool does. Second # is attack speed.
	public static final RegistryObject<PickaxeItem> LIGHTNING_PICKAXE = ITEMS.register("lightning_pickaxe", () -> new PickaxeItem(ChrispyToolMaterials.lightning, -2, -2.8f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<SwordItem> LIGHTNING_SWORD = ITEMS.register("lightning_sword", () -> new LightningSwordItem(ChrispyToolMaterials.lightning, 0, -2.4f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<AxeItem> LIGHTNING_AXE = ITEMS.register("lightning_axe", () -> new AxeItem(ChrispyToolMaterials.lightning, -1, -3.0f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ShovelItem> LIGHTNING_SHOVEL = ITEMS.register("lightning_shovel", () -> new ShovelItem(ChrispyToolMaterials.lightning, -3, -3.0f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<HoeItem> LIGHTNING_HOE = ITEMS.register("lightning_hoe", () -> new HoeItem(ChrispyToolMaterials.lightning, 1, 0.0f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> LIGHTNING_HELMET = ITEMS.register("lightning_helmet", () -> new ArmorItem(ChrispyArmorMaterials.lightning, EquipmentSlotType.HEAD, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> LIGHTNING_CHESTPLATE = ITEMS.register("lightning_chestplate", () -> new ArmorItem(ChrispyArmorMaterials.lightning, EquipmentSlotType.CHEST, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> LIGHTNING_LEGGINGS = ITEMS.register("lightning_leggings", () -> new ArmorItem(ChrispyArmorMaterials.lightning, EquipmentSlotType.LEGS, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> LIGHTNING_BOOTS = ITEMS.register("lightning_boots", () -> new ArmorItem(ChrispyArmorMaterials.lightning, EquipmentSlotType.FEET, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	
	
	// First # is how much +/- damage each specific tool does. Second # is attack speed.
	public static final RegistryObject<PickaxeItem> FLAME_PICKAXE = ITEMS.register("flame_pickaxe", () -> new PickaxeItem(ChrispyToolMaterials.flame, -2, -2.8f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<SwordItem> FLAME_SWORD = ITEMS.register("flame_sword", () -> new FlameSwordItem(ChrispyToolMaterials.flame, 0, -2.4f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<AxeItem> FLAME_AXE = ITEMS.register("flame_axe", () -> new AxeItem(ChrispyToolMaterials.flame, 1.5f, -2.9f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ShovelItem> FLAME_SHOVEL = ITEMS.register("flame_shovel", () -> new ShovelItem(ChrispyToolMaterials.flame, -3, -3.0f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<HoeItem> FLAME_HOE = ITEMS.register("flame_hoe", () -> new HoeItem(ChrispyToolMaterials.flame, 1, 0.0f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> FLAME_HELMET = ITEMS.register("flame_helmet", () -> new ArmorItem(ChrispyArmorMaterials.flame, EquipmentSlotType.HEAD, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> FLAME_CHESTPLATE = ITEMS.register("flame_chestplate", () -> new ArmorItem(ChrispyArmorMaterials.flame, EquipmentSlotType.CHEST, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> FLAME_LEGGINGS = ITEMS.register("flame_leggings", () -> new ArmorItem(ChrispyArmorMaterials.flame, EquipmentSlotType.LEGS, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> FLAME_BOOTS = ITEMS.register("flame_boots", () -> new ArmorItem(ChrispyArmorMaterials.flame, EquipmentSlotType.FEET, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	
	
	// First # is how much +/- damage each specific tool does. Second # is attack speed.
	public static final RegistryObject<PickaxeItem> REDSTONE_PICKAXE = ITEMS.register("redstone_pickaxe", () -> new PickaxeItem(ChrispyToolMaterials.redstone, -2, -2.8f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<SwordItem> REDSTONE_SWORD = ITEMS.register("redstone_sword", () -> new SwordItem(ChrispyToolMaterials.redstone, 0, -2.4f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<AxeItem> REDSTONE_AXE = ITEMS.register("redstone_axe", () -> new AxeItem(ChrispyToolMaterials.redstone, 1.5f, -2.9f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ShovelItem> REDSTONE_SHOVEL = ITEMS.register("redstone_shovel", () -> new ShovelItem(ChrispyToolMaterials.redstone, -3, -3.0f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<HoeItem> REDSTONE_HOE = ITEMS.register("redstone_hoe", () -> new HoeItem(ChrispyToolMaterials.redstone, 1, 0.0f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> REDSTONE_HELMET = ITEMS.register("redstone_helmet", () -> new ArmorItem(ChrispyArmorMaterials.redstone, EquipmentSlotType.HEAD, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> REDSTONE_CHESTPLATE = ITEMS.register("redstone_chestplate", () -> new ArmorItem(ChrispyArmorMaterials.redstone, EquipmentSlotType.CHEST, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> REDSTONE_LEGGINGS = ITEMS.register("redstone_leggings", () -> new ArmorItem(ChrispyArmorMaterials.redstone, EquipmentSlotType.LEGS, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> REDSTONE_BOOTS = ITEMS.register("redstone_boots", () -> new ArmorItem(ChrispyArmorMaterials.redstone, EquipmentSlotType.FEET, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	
	// First # is how much +/- damage each specific tool does. Second # is attack speed.
	public static final RegistryObject<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(ChrispyToolMaterials.emerald, -2, -2.8f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<SwordItem> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordItem(ChrispyToolMaterials.emerald, 0, -2.4f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<AxeItem> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeItem(ChrispyToolMaterials.emerald, -1, -3.1f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ShovelItem> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ShovelItem(ChrispyToolMaterials.emerald, -3, -3.0f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<HoeItem> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new HoeItem(ChrispyToolMaterials.emerald, 1, 0.1f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new ArmorItem(ChrispyArmorMaterials.emerald, EquipmentSlotType.HEAD, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new ArmorItem(ChrispyArmorMaterials.emerald, EquipmentSlotType.CHEST, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new ArmorItem(ChrispyArmorMaterials.emerald, EquipmentSlotType.LEGS, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new ArmorItem(ChrispyArmorMaterials.emerald, EquipmentSlotType.FEET, new Item.Properties().tab(ChrispyModItemGroup.instance)));

	public static final RegistryObject<ArmorItem> WHITE_DWARF_STAR_HELMET = ITEMS.register("white_dwarf_star_helmet", () -> new SpeedArmorItem(ChrispyArmorMaterials.white_dwarf_star, EquipmentSlotType.HEAD, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> WHITE_DWARF_STAR_CHESTPLATE = ITEMS.register("white_dwarf_star_chestplate", () -> new SpeedArmorItem(ChrispyArmorMaterials.white_dwarf_star, EquipmentSlotType.CHEST, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> WHITE_DWARF_STAR_LEGGINGS = ITEMS.register("white_dwarf_star_leggings", () -> new SpeedArmorItem(ChrispyArmorMaterials.white_dwarf_star, EquipmentSlotType.LEGS, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> WHITE_DWARF_STAR_BOOTS = ITEMS.register("white_dwarf_star_boots", () -> new SpeedArmorItem(ChrispyArmorMaterials.white_dwarf_star, EquipmentSlotType.FEET, new Item.Properties().tab(ChrispyModItemGroup.instance)));	

	// First # is how much +/- damage each specific tool does. Second # is attack speed.
	public static final RegistryObject<PickaxeItem> HONEY_PICKAXE = ITEMS.register("honey_pickaxe", () -> new PickaxeItem(ChrispyToolMaterials.honey, -2, -2.8f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<SwordItem> HONEY_SWORD = ITEMS.register("honey_sword", () -> new HoneySwordItem(ChrispyToolMaterials.honey, 0, -2.4f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<AxeItem> HONEY_AXE = ITEMS.register("honey_axe", () -> new AxeItem(ChrispyToolMaterials.honey, -1, -3.1f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ShovelItem> HONEY_SHOVEL = ITEMS.register("honey_shovel", () -> new ShovelItem(ChrispyToolMaterials.honey, -3, -3.0f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<HoeItem> HONEY_HOE = ITEMS.register("honey_hoe", () -> new HoeItem(ChrispyToolMaterials.honey, 1, 0.1f, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> HONEY_HELMET = ITEMS.register("honey_helmet", () -> new HoneyArmorItem(ChrispyArmorMaterials.honey, EquipmentSlotType.HEAD, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> HONEY_CHESTPLATE = ITEMS.register("honey_chestplate", () -> new HoneyArmorItem(ChrispyArmorMaterials.honey, EquipmentSlotType.CHEST, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> HONEY_LEGGINGS = ITEMS.register("honey_leggings", () -> new HoneyArmorItem(ChrispyArmorMaterials.honey, EquipmentSlotType.LEGS, new Item.Properties().tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<ArmorItem> HONEY_BOOTS = ITEMS.register("honey_boots", () -> new HoneyArmorItem(ChrispyArmorMaterials.honey, EquipmentSlotType.FEET, new Item.Properties().tab(ChrispyModItemGroup.instance)));	
	
	public static final RegistryObject<Item> FLAME_WAND = ITEMS.register("flame_wand", () -> new FlameWandItem(new Item.Properties().durability(64).tab(ChrispyModItemGroup.instance)));
	public static final RegistryObject<Item> LIGHTNING_WAND = ITEMS.register("lightning_wand", () -> new LightningWandItem(new Item.Properties().durability(64).tab(ChrispyModItemGroup.instance)));
	
// FOOD	
	public static final RegistryObject<Item> BLACK_CANDY_CANE = ITEMS.register("black_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroup.instance).food(FoodList.BLACK_CANDY_CANE)));
	public static final RegistryObject<Item> BLUE_CANDY_CANE = ITEMS.register("blue_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroup.instance).food(FoodList.BLUE_CANDY_CANE)));
	public static final RegistryObject<Item> BROWN_CANDY_CANE = ITEMS.register("brown_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroup.instance).food(FoodList.BROWN_CANDY_CANE)));
	public static final RegistryObject<Item> CYAN_CANDY_CANE = ITEMS.register("cyan_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroup.instance).food(FoodList.CYAN_CANDY_CANE)));
	public static final RegistryObject<Item> GRAY_CANDY_CANE = ITEMS.register("gray_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroup.instance).food(FoodList.GRAY_CANDY_CANE)));
	public static final RegistryObject<Item> GREEN_CANDY_CANE = ITEMS.register("green_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroup.instance).food(FoodList.GREEN_CANDY_CANE)));
	public static final RegistryObject<Item> LIGHT_BLUE_CANDY_CANE = ITEMS.register("light_blue_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroup.instance).food(FoodList.LIGHT_BLUE_CANDY_CANE)));
	public static final RegistryObject<Item> LIGHT_GRAY_CANDY_CANE = ITEMS.register("light_gray_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroup.instance).food(FoodList.LIGHT_GRAY_CANDY_CANE)));
	public static final RegistryObject<Item> LIME_CANDY_CANE = ITEMS.register("lime_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroup.instance).food(FoodList.LIME_CANDY_CANE)));
	public static final RegistryObject<Item> MAGENTA_CANDY_CANE = ITEMS.register("magenta_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroup.instance).food(FoodList.MAGENTA_CANDY_CANE)));
	public static final RegistryObject<Item> ORANGE_CANDY_CANE = ITEMS.register("orange_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroup.instance).food(FoodList.ORANGE_CANDY_CANE)));
	public static final RegistryObject<Item> PINK_CANDY_CANE = ITEMS.register("pink_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroup.instance).food(FoodList.PINK_CANDY_CANE)));
	public static final RegistryObject<Item> PURPLE_CANDY_CANE = ITEMS.register("purple_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroup.instance).food(FoodList.PURPLE_CANDY_CANE)));
	public static final RegistryObject<Item> RED_CANDY_CANE = ITEMS.register("red_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroup.instance).food(FoodList.RED_CANDY_CANE)));
	public static final RegistryObject<Item> WHITE_CANDY_CANE = ITEMS.register("white_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroup.instance).food(FoodList.WHITE_CANDY_CANE)));
	public static final RegistryObject<Item> YELLOW_CANDY_CANE = ITEMS.register("yellow_candy_cane", () -> new Item(new Item.Properties().tab(ChrispyModItemGroup.instance).food(FoodList.YELLOW_CANDY_CANE)));
	
	public static final RegistryObject<Item> COOKED_CARROT = ITEMS.register("cooked_carrot", () -> new Item(new Item.Properties().tab(ChrispyModItemGroup.instance).food(FoodList.COOKED_CARROT)));
	
	
	
	
	
}
