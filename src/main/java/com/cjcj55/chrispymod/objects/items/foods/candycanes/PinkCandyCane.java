package com.cjcj55.chrispymod.objects.items.foods.candycanes;

import com.cjcj55.chrispymod.objects.items.ChrispyItemFoodAlwaysEdible;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class PinkCandyCane extends ChrispyItemFoodAlwaysEdible
{
	public PinkCandyCane(String name, int hunger, float saturation, boolean alwaysEdible)
    {
        super(name, hunger, saturation, alwaysEdible);
    }
	
	@Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving)
	{
        {
        if(entityLiving instanceof PlayerEntity)
        {
        	entityLiving.addPotionEffect(new EffectInstance(Effects.STRENGTH, 100, 2, false, false));
            //ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(Items.SUGAR));
        }
        return super.onItemUseFinish(stack, worldIn, entityLiving);
        }
	}
	
	//@OnlyIn(Dist.CLIENT)
	//public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	//{
    //    tooltip.add(new TextComponentTranslation("deadlyenergydrink.tooltip"));
	//}
	
	/***
	 * @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving)
	{
        {
        if(entityLiving instanceof PlayerEntity)
        {
        	PlayerEntity player = (PlayerEntity) entityLiving;
        	entityLiving.addPotionEffect(new EffectInstance(Effects.POISON, 100, 3, false, false));
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(Items.SUGAR));
        }
        return super.onItemUseFinish(stack, worldIn, entityLiving);
        }
	}
	 */

}
