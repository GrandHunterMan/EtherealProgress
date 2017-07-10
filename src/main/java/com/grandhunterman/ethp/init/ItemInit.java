package com.grandhunterman.ethp.init;

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

    public static Item copper_ingot, tin_ingot;


    public static void init()
    {
        copper_ingot = new Ingots("copper_ingot");
        tin_ingot = new Ingots("tin_ingot");
    }
    public static void register()
    {
        registerItem(copper_ingot);
        registerItem(tin_ingot);
    }
    public static void registerItem(Item item)
    {
        ForgeRegistries.ITEMS.register(item);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ref.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
