package com.cjcj55.chrispymod.init;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

public enum ChrispyToolMaterials implements IItemTier
{
	//attackDamage = x.yf + 1  										2.0f = 3dmg;  3.0f = 4dmg
	//attackDamage:  WOOD/GOLD = 4dmg; STONE = 5dmg; IRON = 6dmg; DIAMOND = 7dmg
	//attackDamage:  WOOD/GOLD = 3.0f; STONE = 4.0f; IRON = 5.0f; DIAMOND = 6.0f
	ruby(5.5f, 6.5f, 850, 3, 15, ItemInit.RUBY.get()),
	opal(5.0f, 6.0f, 350, 2, 14, ItemInit.OPAL.get()),
	tangerine(5.5f, 6.5f, 600, 3, 12, ItemInit.TANGERINE.get()),
	cobalt(6.5f, 8.0f, 1500, 3, 8, ItemInit.COBALT.get()),
	blue_emerald(7.0f, 8.5f, 1600, 3, 13, ItemInit.BLUE_EMERALD.get()),
	paryth(5.5f, 6.0f, 450, 2, 18, ItemInit.PARYTH.get()),
	lightning(5.0f, 8.0f, 800, 3, 10, ItemInit.LIGHTNING.get()),
	flame(4.5f, 7.0f, 750, 3, 12, ItemInit.FLAME.get()),
	redstone(5.7f, 6.8f, 744, 3, 12, ItemInit.REDSTONE_INGOT.get()),
	emerald(7.0f, 6.8f, 812, 3, 10, Items.EMERALD),
	honey(5.0f, 6.0f, 350, 2, 14, Items.HONEY_BLOCK);
	
	private float attackDamage, efficiency;
	private int durability, harvestLevel, enchantability;
	private Item repairMaterial;
	
	// Enchantability: Higher enchantability # =  higher chance to get better enchantments at lower levels!
	private ChrispyToolMaterials(float attackDamage, float efficiency, int durability, int harvestLevel, int enchantability, Item repairMaterial)
	{
		this.attackDamage = attackDamage;
		this.efficiency = efficiency;
		this.durability = durability;
		this.harvestLevel = harvestLevel;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial;
	}

	@Override
	public float getAttackDamageBonus()
	{
		return this.attackDamage;
	}

	@Override
	public float getSpeed()
	{
		return this.efficiency;
	}

	@Override
	public int getEnchantmentValue()
	{
		return this.enchantability;
	}

	@Override
	public int getLevel()
	{
		return this.harvestLevel;
	}

	@Override
	public int getUses()
	{
		return this.durability;
	}

	@Override
	public Ingredient getRepairIngredient()
	{
		return Ingredient.of(this.repairMaterial);
	}
}
