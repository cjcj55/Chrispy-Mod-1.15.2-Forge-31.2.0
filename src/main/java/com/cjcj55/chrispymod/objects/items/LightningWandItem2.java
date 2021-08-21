/*package com.cjcj55.chrispymod.objects.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceContext.FluidMode;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3i;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class LightningWandItem2 extends Item
{
	public LightningWandItem2(Properties properties) 
	{
		super(properties);
	}

	
	public ActionResultType spawnLightning(World world, BlockPos pos) {
        BlockState blockstate = world.getBlockState(pos);
        BlockPos check = pos.below();
        boolean use = false;
        while (!use) {
            if (check.func_177956_o() == world.func_217301_I()) {
                use = true;
                continue;
            }
            if (!world.isWaterAt(check).().equals((Object)Blocks.WATER)) break;
            check = check.();
        }
        if (use) {
            LightningBoltEntity lightningboltentity = (LightningBoltEntity)EntityType.LIGHTNING_BOLT.create(world);
            lightningboltentity.distanceToSqr(Vector3d.atBottomCenterOf((Vector3i)pos.()));
            world.addFreshEntity((Entity)lightningboltentity);
            lightningboltentity.playSound(SoundEvents.LIGHTNING_BOLT_IMPACT, 5.0f, 1.0f);
            return ActionResultType.sidedSuccess((boolean)world.);
        }
        return ActionResultType.FAIL;
    }

    public ActionResultType func_195939_a(ItemUseContext p_195939_1_) {
        BlockPos pos;
        World world = p_195939_1_.func_195991_k();
        ActionResultType result = this.spawnLightning(world, pos = p_195939_1_.func_195995_a());
        if (result.equals((Object)ActionResultType.func_233537_a_((boolean)world.field_72995_K))) {
            p_195939_1_.func_195996_i().func_190918_g(1);
        }
        return result;
    }
}*/
