package com.grandhunterman.ethp;

/**
 * Created by GrandHunterMan on Jul 10. Copyright 2017.
 */

import com.grandhunterman.ethp.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ref.MODID, name = ref.MODNAME, version = ref.MODVERSION)
public class ExampleMod
{
    @SidedProxy(clientSide = ref.CLIENTPROXY, serverSide = ref.COMMONPROXY)
    public static CommonProxy proxy;



    //PREINIT
    @EventHandler
    public static void preInit(FMLPreInitializationEvent event){
        proxy.preInit(event);
    }



    //INIT
    @EventHandler
    public static void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }


    //POSTINIT
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}
