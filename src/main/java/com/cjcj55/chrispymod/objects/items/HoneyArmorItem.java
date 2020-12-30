package com.cjcj55.chrispymod.objects.items;

import com.cjcj55.chrispymod.init.ItemInit;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class HoneyArmorItem extends ArmorItem
{
	public HoneyArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder) 
	{
		super(materialIn, slot, builder);
	}
	
	@Override
	public void onArmorTick(ItemStack stack, World world, PlayerEntity player)
	{
		if(player.inventory.armorItemInSlot(0).getItem() == ItemInit.HONEY_BOOTS.get() &&
				player.inventory.armorItemInSlot(1).getItem() == ItemInit.HONEY_LEGGINGS.get() && 
				player.inventory.armorItemInSlot(2).getItem() == ItemInit.HONEY_CHESTPLATE.get() &&
				player.inventory.armorItemInSlot(3).getItem() == ItemInit.HONEY_HELMET.get())
		{
			player.addPotionEffect(new EffectInstance(Effects.ABSORPTION, 20, 3));
		}
	}
	
	/*@Override
	public void onArmorTick(ItemStack stack, World world, PlayerEntity player)
	{		
		if(player.inventory.armorItemInSlot(0).getItem() == ItemInit.HONEY_BOOTS.get() &&
			player.inventory.armorItemInSlot(1).getItem() == ItemInit.HONEY_LEGGINGS.get() && 
			player.inventory.armorItemInSlot(2).getItem() == ItemInit.HONEY_CHESTPLATE.get() &&
			player.inventory.armorItemInSlot(3).getItem() == ItemInit.HONEY_HELMET.get())
		{			
				//player.getAttributes().getAttributeInstance(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(24);			
				player.getAttribute(SharedMonsterAttributes.MAX_HEALTH).applyModifier(new AttributeModifier("MaxHealth", 4.0f, AttributeModifier.Operation.ADDITION));
			
			//player.addPotionEffect(new EffectInstance(Effects.ABSORPTION, 0, 0, false, false, false));
			//if(!player.isPotionActive(Effects.HEALTH_BOOST))
			//{
				//player.getAttributes().getAttributeInstance(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(player.getMaxHealth() + 4);

			//}
		}	else { super.onArmorTick(stack, world, player);
				//player.getAttributes().getAttributeInstance(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20);
				player.getAttribute(SharedMonsterAttributes.MAX_HEALTH).removeModifier(new AttributeModifier("MaxHealth", 4.0f, AttributeModifier.Operation.ADDITION));
				 		
			}	
	}
	
	@SubscribeEvent
	public static void onArmorEquipped(LivingEquipmentChangeEvent event, PlayerEntity player)
	{
		player.addPotionEffect(new EffectInstance(Effects.))
	}*/
}