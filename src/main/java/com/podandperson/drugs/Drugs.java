package main.java.com.podandperson.drugs;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.*;
import org.apache.logging.log4j.Logger;

@Mod(modid = Drugs.MODID, name = Drugs.NAME, version = Drugs.VERSION)
public class Drugs
{
	public static final String MODID = "drugs";
	public static final String NAME = "Drugs Mod";
	public static final String VERSION = "0.0.0.1";
	
	private static Logger logger;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		logger = event.getModLog();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		//shit
	}
}
