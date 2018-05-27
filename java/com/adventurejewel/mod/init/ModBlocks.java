package com.adventurejewel.mod.init;

import java.util.ArrayList;
import java.util.List;

import com.adventurejewel.mod.blocks.BlockBase;
import com.adventurejewel.mod.blocks.JewelWorkBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block JEWEL_WORK = new JewelWorkBlock("jewel_work", Material.IRON);
	
}
