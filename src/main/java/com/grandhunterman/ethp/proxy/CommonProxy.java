package com.grandhunterman.ethp.proxy;

import com.grandhunterman.ethp.handlers.RegistryHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by GrandHunterMan on Jul 10. Copyright 2017.
 */
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event)
    {
        RegistryHandler.Common();
    }


    public void init(FMLInitializationEvent event)
    {

    }


    public void postInit(FMLPostInitializationEvent event)
    {

    }
}

