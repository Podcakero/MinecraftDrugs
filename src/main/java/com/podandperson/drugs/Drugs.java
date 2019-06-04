package main.java.com.podandperson.drugs;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.SidedProxy;

import com.podandperson.drugs.proxy.*;

@Mod(modid = Drugs.MODID, name = Drugs.NAME, version = Drugs.VERSION, acceptedMinecraftVersions = Drugs.MC_VERSION)
public class Drugs {

	public static final String MODID = "Drugs";
	public static final String NAME = "Minecraft Drugs";
	public static final String VERSION = "0.0.1";
	public static final String MC_VERSION = "[1.12.X]";

	public static final Logger LOGGER = LogManager.getLogger(Drugs.MODID);

	public static final String CLIENT = "com.podandperson.drugs.proxy.ClientProxy";
	public static final String SERVER = "com.podandperson.drugs.proxy.ServerProxy";
	@SidedProxy(clientSide = Drugs.CLIENT, serverSide = Drugs.SERVER)
	public static IProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		LOGGER.info(Drugs.NAME);
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

}
