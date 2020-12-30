package com.cjcj55.chrispymod.objects.items;

import com.cjcj55.chrispymod.itemgroups.ChrispyModItemGroup;

import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class EdibleExperienceItem extends Item 
{
	public EdibleExperienceItem(Properties properties) 
	{
		super(new Item.Properties().group(ChrispyModItemGroup.instance).rarity(Rarity.UNCOMMON));
	}
	
	public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand)
	{
		ItemStack stack = player.getHeldItem(hand);
		world.playSound((PlayerEntity)null, player.getPosX(), player.getPosY(), player.getPosZ(), SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.NEUTRAL, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
		if (!world.isRemote) 
		{
			int amount = 8;
			ExperienceOrbEntity xpEntity = new ExperienceOrbEntity(world, player.getPosX(), player.getPosY(), player.getPosZ(), amount);
			
			world.addEntity(xpEntity);
			
			player.addStat(Stats.ITEM_USED.get(this));
		      if (!player.abilities.isCreativeMode) {
		        stack.shrink(1);
		      }
			
		}
		
		return ActionResult.resultSuccess(stack);
	
	}
	
	@Override
	public boolean hasEffect(ItemStack stack) 
	{
		return true;
	}
}
