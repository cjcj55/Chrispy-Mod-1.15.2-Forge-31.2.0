package com.cjcj55.chrispymod.objects.items;

import com.cjcj55.chrispymod.init.ItemInit;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HoneyArmorItemOther extends ArmorItem
{
	public HoneyArmorItemOther(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder) 
	{
		super(materialIn, slot, builder);
	}
	
	public static float playerHealth;
	public static PlayerEntity player;
	public static float four = 4;
	
	public static float getPlayerMaxHealth()
	{
		playerHealth = player.getMaxHealth();
		return playerHealth;
	}
	
	@Override
	public void onArmorTick(ItemStack stack, World world, PlayerEntity player)
	{		
		if(player.inventory.armorItemInSlot(0).getItem() == ItemInit.HONEY_BOOTS.get() &&
			player.inventory.armorItemInSlot(1).getItem() == ItemInit.HONEY_LEGGINGS.get() && 
			player.inventory.armorItemInSlot(2).getItem() == ItemInit.HONEY_CHESTPLATE.get() &&
			player.inventory.armorItemInSlot(3).getItem() == ItemInit.HONEY_HELMET.get())
		{
			
			if(!(playerHealth==(playerHealth + 4)))
			{
				player.getAttributes().getAttributeInstance(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(playerHealth + 4);
				playerHealth += 4;
			}
			//player.addPotionEffect(new EffectInstance(Effects.ABSORPTION, 0, 0, false, false, false));
			//if(!player.isPotionActive(Effects.HEALTH_BOOST))
			//{
				//player.getAttributes().getAttributeInstance(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(player.getMaxHealth() + 4);

			//}
		}	else { super.onArmorTick(stack, world, player);
			if((playerHealth==(playerHealth + 4)))
			{
				player.getAttributes().getAttributeInstance(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(playerHealth - 4);
				playerHealth -= 4;
			}	 		
			}	
	}
}