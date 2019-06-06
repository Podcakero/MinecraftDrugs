package com.podandperson.drugs.tabs;

import main.java.com.podandperson.drugs.Drugs;
import com.podandperson.drugs.init.DrugItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CustomDrugTab extends CreativeTabs {

	public CustomDrugTab() {
		super(Drugs.MODID);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(DrugItems.LSD_ITEM);
	}

}
