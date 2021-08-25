/*package com.cjcj55.chrispymod.objects.items;

import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class LightningWandItem2 extends Item
{
	public LightningWandItem2(Properties properties) 
	{
		super(properties);
	}

	
	@Override
	public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
		if(!playerIn.getCooldowns().isOnCooldown(this)) {
			//playerIn.addPotionEffect(new EffectInstance(Effects.GLOWING, 200, 5));
			LightningBoltEntity entity = new LightningBoltEntity(null, worldIn);
			entity.setPos(playerIn.getX(), playerIn.getY(), playerIn.getZ());
			worldIn.addFreshEntity(entity);
			playerIn.getCooldowns().addCooldown(this, 1000);
			return ActionResult.success(playerIn.getItemInHand(handIn));
		}
		return ActionResult.fail(playerIn.getItemInHand(handIn));
	}
}*/
