package com.podandperson.drugs;

import main.java.com.podandperson.drugs.*;
import com.podandperson.drugs.item.lsd;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = Drugs.MODID)
public final class EventSubscriber {
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
				new lsd().setRegistryName("lsd").setUnlocalizedName(Drugs.MODID + "." + "lsd"),
		};
		event.getRegistry().registerAll(items);
	}
}
