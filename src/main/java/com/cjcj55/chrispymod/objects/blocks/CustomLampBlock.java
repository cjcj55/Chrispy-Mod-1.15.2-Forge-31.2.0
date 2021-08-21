package com.cjcj55.chrispymod.objects.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.block.RedstoneTorchBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class CustomLampBlock extends Block {

	public static final BooleanProperty LIT = RedstoneTorchBlock.LIT;

   public CustomLampBlock(AbstractBlock.Properties properties) {
      super(properties);
      this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.valueOf(false)));
   }

   @Nullable
   public BlockState getStateForPlacement(BlockItemUseContext context) {
      return this.defaultBlockState().setValue(LIT, Boolean.valueOf(context.getLevel().hasNeighborSignal(context.getClickedPos())));
   }

   public void neighborChanged(BlockState state, World world, BlockPos blockPos, Block block, BlockPos blockPos1, boolean bool) {
      if (!world.isClientSide) {
         boolean flag = state.getValue(LIT);
         if (flag != world.hasNeighborSignal(blockPos)) {
            if (flag) {
            	world.getBlockTicks().scheduleTick(blockPos, this, 4);
            } else {
            	world.setBlock(blockPos, state.cycle(LIT), 2);
            }
         }

      }
   }

   public void tick(BlockState state, ServerWorld world, BlockPos blockPos, Random random) {
      if (state.getValue(LIT) && !world.hasNeighborSignal(blockPos)) {
    	  world.setBlock(blockPos, state.cycle(LIT), 2);
      }

   }

   protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
      builder.add(LIT);
   }

}