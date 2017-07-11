package com.grandhunterman.ethp.handlers;

import com.grandhunterman.ethp.ref;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by GrandHunterMan on Jul 10. Copyright 2017.
 */
public class ConfigHandler {
    private static Configuration config = null;

    //Categories for the configs
    public static final String CATEGORY_NAME_ITEMS = "Items";


    //Actual configs
    public static int IDontKnow;
    public static boolean Cool;


    public static void preInit(){
        File configFile = new File(Loader.instance().getConfigDir(), "ethp.cfg");
        config = new Configuration(configFile);
        syncFromFiles();

    }
    public static Configuration getConfig(){
        return config;

    }
    public static void clientPreInit(){
        MinecraftForge.EVENT_BUS.register(new ConfigEventHandler());
    }

    public static void syncFromFiles(){
        syncConfig(true, true);

    }

    public static void syncFromGUI(){
        syncConfig(false, true);

    }
    public static void syncFromFields(){
        syncConfig(false, false);

    }
    private static void syncConfig(boolean loadfromconfigfile, boolean readfieldsfromconfig){
        if(loadfromconfigfile){
            config.load();
        }
        //IDK CONFIG
        Property propertyIDontKnow = config.get(CATEGORY_NAME_ITEMS, "i_dont_know", 100);
        propertyIDontKnow.setLanguageKey("gui.config.items.i_dont_know.name");
        propertyIDontKnow.setComment(I18n.format("gui.config.items.i_dont_know.comment"));
        propertyIDontKnow.setMaxValue(100);
        propertyIDontKnow.setMinValue(1);

        //COOL CONFIG
        Property propertyCool = config.get(CATEGORY_NAME_ITEMS, "cool", true);
        propertyCool.setLanguageKey("gui.config.items.cool.name");
        propertyCool.setComment(I18n.format("gui.config.items.cool.comment"));

        List<String> orderForItems = new ArrayList<String>();
        orderForItems.add(propertyIDontKnow.getName());
        orderForItems.add(propertyCool.getName());
        config.setCategoryPropertyOrder(CATEGORY_NAME_ITEMS, orderForItems);

        if (readfieldsfromconfig) {
            IDontKnow = propertyIDontKnow.getInt();
            Cool = propertyCool.getBoolean();
        }


        propertyIDontKnow.set(IDontKnow);
        propertyCool.set(Cool);



        if (config.hasChanged()) {
            config.save();
        }


    }
    public static class ConfigEventHandler{
        @SubscribeEvent(priority = EventPriority.LOWEST)
        public void onEvent(ConfigChangedEvent.OnConfigChangedEvent event){
            if( event.getModID().equals(ref.MODID)){
                syncFromGUI();
            }

        }
    }
}
