package com.podandperson.drugs.client;

import main.java.com.podandperson.drugs.*;
import com.podandperson.drugs.init.*;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(modid = Drugs.MODID, value = Side.CLIENT)
public final class ClientEventSubscriber {
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		registerModel(DrugItems.LSD_ITEM);
	}
	private static void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
