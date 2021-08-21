package com.cjcj55.chrispymod.objects.items;


import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.item.SwordItem;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.entity.EntityStruckByLightningEvent;

public class LightningSwordItem extends SwordItem
{
	public LightningSwordItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}
	
	/*public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) 
	{	
        World world = target.getPosition(1.0f);

        double x = target.position().x;
        double y = target.position().y;
        double z = target.position().z;

     
        
        if(!world.isClientSide) 
        {
              LightningBoltEntity entity = new LightningBoltEntity();
              ServerWorld serverWorld = (ServerWorld)world;
              serverWorld.addFreshEntity(entity);
        }
        
        return super.hurtEnemy(stack, target, attacker);
    }*/
	
	@Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.UNCOMMON;
    }
    
}
