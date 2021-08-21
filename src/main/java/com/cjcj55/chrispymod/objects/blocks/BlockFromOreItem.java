package com.cjcj55.chrispymod.objects.blocks;

import net.minecraft.block.Block;

public class BlockFromOreItem extends Block
{
	/*public BlockFromOreItem(String name) 
	{
		super(Block.Properties.create(Material.IRON).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE));
        //this.setRegistryName(new ResourceLocation(ChrispyMod.MOD_ID, name));
	}*/

	public BlockFromOreItem(Block.Properties properties) 
	{
		super(properties);
	}
	
}
