package com.cjcj55.chrispymod.objects.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class CustomLampBlock extends Block {

    public static final BooleanProperty LIT = RedstoneLampBlock.LIT;
    int colour;

    public CustomLampBlock(Block.Properties properties) {
    	super(properties);
        this.setDefaultState(this.getStateContainer().getBaseState().with(LIT, false));
        //this.setRegistryName(new ResourceLocation(ChrispyMod.MOD_ID, name));
    }

	@Override
    public int getLightValue(BlockState state) {
        return state.get(LIT) ? 15 : 0;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(LIT, context.getWorld().isBlockPowered(context.getPos()));
    }

    @Override
    public void neighborChanged(BlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
        if (!worldIn.isRemote) {
            boolean flag = state.get(LIT);
            if (flag != worldIn.isBlockPowered(pos)) {
                if (flag) {
                    worldIn.getPendingBlockTicks().scheduleTick(pos, this, 4);
                } else {
                    worldIn.setBlockState(pos, state.cycle(LIT), 2);
                }
            }

        }
    }

    @Override
    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
        if (!worldIn.isRemote) {
            if (state.get(LIT) && !worldIn.isBlockPowered(pos)) {
                worldIn.setBlockState(pos, state.cycle(LIT), 2);
            }

        }
    }

}