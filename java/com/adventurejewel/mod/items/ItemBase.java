package com.adventurejewel.mod.items;

import com.adventurejewel.mod.Main;
import com.adventurejewel.mod.init.ModItems;
import com.adventurejewel.mod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel 
{

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);		
		ModItems.ITEMS.add(this);
	}


	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");	
	}
	
}
