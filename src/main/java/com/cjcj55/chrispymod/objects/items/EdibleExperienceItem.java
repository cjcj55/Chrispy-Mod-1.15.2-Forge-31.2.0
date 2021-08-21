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
		super(new Item.Properties().tab(ChrispyModItemGroup.instance).rarity(Rarity.UNCOMMON));
	}
	
	public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand)
	{
		ItemStack stack = player.getItemInHand(hand);
		world.playSound((PlayerEntity)null, player.getX(), player.getY(), player.getZ(), SoundEvents.EXPERIENCE_ORB_PICKUP, SoundCategory.NEUTRAL, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
		if (!world.isClientSide) 
		{
			int amount = 8;
			ExperienceOrbEntity xpEntity = new ExperienceOrbEntity(world, player.getX(), player.getY(), player.getZ(), amount);
			
			world.addFreshEntity(xpEntity);
			
			player.awardStat(Stats.ITEM_USED.get(this));
		      if (!player.abilities.mayfly) {
		        stack.shrink(1);
		      }
			
		}
		
		return ActionResult.success(stack);
	
	}
	
	public boolean hasEffect(ItemStack stack) 
	{
		return true;
	}
}
