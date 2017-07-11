package com.grandhunterman.ethp.init;

import com.grandhunterman.ethp.items.BasicItem;
import com.grandhunterman.ethp.items.Ingots;
import com.grandhunterman.ethp.ref;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

/**
 * Created by GrandHunterMan on Jul 10. Copyright 2017.
 */
public class ItemInit {

    public static Item copper_ingot, tin_ingot, aluminum_ingot, chrome_ingot, coaly_iron_ingot, lead_ingot, nickel_ingot, silver_ingot, steel_ingot, titanium_ingot;
    public static  Item rutile_crystal, cryolite_crystal, salt_dust;
    public static Item basic_capacitor, basic_resistor, basic_switch, bread_board, improvised_circuit_board;

    public static void init()
    {
        copper_ingot = new Ingots("copper_ingot");
        tin_ingot = new Ingots("tin_ingot");
        aluminum_ingot = new Ingots("aluminum_ingot");
        chrome_ingot = new Ingots("chrome_ingot");
        coaly_iron_ingot = new Ingots("coaly_iron_ingot");
        lead_ingot = new Ingots("lead_ingot");
        nickel_ingot = new Ingots("nickel_ingot");
        silver_ingot = new Ingots("silver_ingot");
        steel_ingot = new Ingots("steel_ingot");
        titanium_ingot = new Ingots("titanium_ingot");

        rutile_crystal = new BasicItem("rutile_crystal");
        cryolite_crystal = new BasicItem("cryolite_crystal");
        salt_dust = new BasicItem("salt_dust");

        basic_capacitor = new BasicItem("basic_capacitor");
        basic_resistor = new BasicItem("basic_resistor");
        basic_switch = new BasicItem("basic_switch");
        bread_board = new BasicItem("bread_board");
        improvised_circuit_board = new BasicItem("improvised_circuit_board");
    }
    public static void register()
    {
        registerItem(copper_ingot);
        registerItem(tin_ingot);
        registerItem(aluminum_ingot);
        registerItem(chrome_ingot);
        registerItem(coaly_iron_ingot);
        registerItem(lead_ingot);
        registerItem(nickel_ingot);
        registerItem(silver_ingot);
        registerItem(steel_ingot);
        registerItem(titanium_ingot);

        registerItem(rutile_crystal);
        registerItem(cryolite_crystal);
        registerItem(salt_dust);

        registerItem(basic_capacitor);
        registerItem(basic_resistor);
        registerItem(basic_switch);
        registerItem(bread_board);
        registerItem(improvised_circuit_board);
    }
    public static void registerItem(Item item)
    {
        ForgeRegistries.ITEMS.register(item);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ref.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
