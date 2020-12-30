package com.cjcj55.chrispymod.objects.items;


import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.item.SwordItem;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class LightningSwordItem extends SwordItem
{
	public LightningSwordItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}
	
	@Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) 
	{
        
        World world = target.getEntityWorld();

        int x = target.getPosition().getX();
        int y = target.getPosition().getY();
        int z = target.getPosition().getZ();

     
        
        if(!world.isRemote()) 
        {
              LightningBoltEntity entity = new LightningBoltEntity(world, x, y, z, false);
              ServerWorld serverWorld = (ServerWorld)world;
              serverWorld.addLightningBolt(entity);
        }
        
        return super.hitEntity(stack, target, attacker);
    }
	
	@Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.UNCOMMON;
    }
    
}
