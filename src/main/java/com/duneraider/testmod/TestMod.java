package com.duneraider.testmod;

import com.duneraider.testmod.client.handler.KeyInputEventHandler;
import com.duneraider.testmod.handler.ConfigurationHandler;
import com.duneraider.testmod.init.ModBlocks;
import com.duneraider.testmod.init.ModItems;
import com.duneraider.testmod.init.ModTools;
import com.duneraider.testmod.init.Recipes;
import com.duneraider.testmod.proxy.IProxy;
import com.duneraider.testmod.reference.Reference;
import com.duneraider.testmod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class TestMod
{
    @Mod.Instance(Reference.MOD_ID)
    public static TestMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        proxy.registerKeyBindings();

        ModItems.init();
        ModBlocks.init();
        ModTools.init();

        LogHelper.info("Pre-Initialization complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());

        Recipes.init();

        LogHelper.info("Initialization complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post-Initialization complete!");
    }
}
