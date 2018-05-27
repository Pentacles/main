package com.adventurejewel.mod.handlers;

import com.adventurejewel.mod.JewelWork.ContainerJewelFurnace;
import com.adventurejewel.mod.JewelWork.GuiJewelFurnace;
import com.adventurejewel.mod.JewelWork.TileEntityJewelFurnace;
import com.adventurejewel.mod.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_JEWEL) return new ContainerJewelFurnace(player.inventory, (TileEntityJewelFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_JEWEL) return new GuiJewelFurnace(player.inventory, (TileEntityJewelFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}
}
