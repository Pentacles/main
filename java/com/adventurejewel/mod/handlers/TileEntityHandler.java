package com.adventurejewel.mod.handlers;

import com.adventurejewel.mod.JewelWork.TileEntityJewelFurnace;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityJewelFurnace.class, "adventurejewel:jewel_furnace");
	}
}
