package com.cjcj55.chrispymod.init;

import com.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public enum ChrispyArmorMaterials implements IArmorMaterial
{
	// Durability; Boots, Leggings, Chestplate, Helmet; Enchantability
	// FIRST NUMBER: Leather = 5, Gold = 7, Iron = 15, Diamond = 33
	ruby("ruby", 17, new int[] {2, 5, 7, 3}, 15, ItemInit.RUBY.get(), "item.armor.equip_diamond", 0.0f),
	opal("opal", 15, new int[] {2, 4, 6, 3}, 14, ItemInit.OPAL.get(), "item.armor.equip_diamond", 0.0f),
	tangerine("tangerine", 18, new int[] {2, 5, 7, 3}, 3, ItemInit.TANGERINE.get(), "item.armor.equip_diamond", 0.0f),
	cobalt("cobalt", 25, new int[] {3, 6, 8, 3}, 8, ItemInit.COBALT.get(), "item.armor.equip_diamond", 1.0f),
	blue_emerald("blue_emerald", 40, new int[] {3, 6, 8, 4}, 13, ItemInit.BLUE_EMERALD.get(), "item.armor.equip_diamond", 2.2f),
	paryth("paryth", 16, new int[] {2, 5, 8, 3}, 18, ItemInit.PARYTH.get(), "item.armor.equip_diamond", 0.0f),
	lightning("lightning", 36, new int[] {2, 6, 8, 3}, 10, ItemInit.LIGHTNING.get(), "item.armor.equip_diamond", 1.0f),
	flame("flame", 25, new int[] {3, 6, 8, 3}, 12, ItemInit.FLAME.get(), "item.armor.equip_diamond", 0.0f),
	redstone("redstone", 17, new int[] {4, 5, 7, 2}, 12, ItemInit.REDSTONE_INGOT.get(), "item.armor.equip_diamond", 0.0f),
	emerald("emerald", 30, new int[] {3, 6, 8, 3}, 10, Items.EMERALD, "item.armor.equip_diamond", 1.2f),
	white_dwarf_star("white_dwarf_star", 16, new int[] {2, 5, 6, 2}, 10, ItemInit.WHITE_DWARF_STAR.get(), "item.armor.equip_leather", 0.0f),
	honey("honey", 15, new int[] {2, 4, 6, 3}, 14, Items.HONEY_BLOCK, "block.honey_block.break", 0.0f);
	
	private static final int[] max_damage_array = new int[]{13, 15, 16, 11};
	private String name, equipSound;
	private int durability, enchantability;
	private Item repairItem;
	private int[] damageReductionAmounts;
	private float toughness;
	
	// In vanilla, only diamond armor has toughness!
	private ChrispyArmorMaterials(String name, int durability, int[] damageReductionAmounts, int enchantability, Item repairItem, String equipSound, float toughness)
	{
		this.name = name;
		this.equipSound = equipSound;
		this.durability = durability;
		this.enchantability = enchantability;
		this.repairItem = repairItem;
		this.damageReductionAmounts = damageReductionAmounts;
		this.toughness = toughness;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlotType slot)
	{
		return this.damageReductionAmounts[slot.getIndex()];
	}

	@Override
	public int getDurabilityForSlot(EquipmentSlotType slot)
	{
		return max_damage_array[slot.getIndex()] * this.durability;
	}

	@Override
	public int getEnchantmentValue()
	{
		return this.enchantability;
	}

	@Override
	public String getName()
	{
		return ChrispyMod.MOD_ID + ":" + this.name;
	}

	@Override
	public Ingredient getRepairIngredient()
	{
		return Ingredient.of(this.repairItem);
	}

	@Override
	public SoundEvent getEquipSound()
	{
		return new SoundEvent(new ResourceLocation(equipSound));
	}

	@Override
	public float getToughness()
	{
		return this.toughness;
	}
// -------------------------------------------------------
	// NEW NEW NEW NEW NEW
	

	@Override
	public float getKnockbackResistance() {
		return 0;
	}
}
