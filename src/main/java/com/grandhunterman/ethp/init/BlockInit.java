package com.grandhunterman.ethp.init;

import com.grandhunterman.ethp.Blocks.Ores;
import com.grandhunterman.ethp.ref;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static net.minecraftforge.fml.common.registry.ForgeRegistries.*;

/**
 * Created by GrandHunterMan on Jul 11. Copyright 2017.
 */
public class BlockInit {

    public static Block copper_ore;
    public static Block tin_ore;
    public static Block aluminum_ore;
    public static Block chrome_ore;
    public static Block lead_ore;
    public static Block nickel_ore;
    public static Block silver_ore;
    public static Block titanium_ore;
    public static Block rutile_ore;
    public static Block cryolite_ore;


    public static void init()
    {
        copper_ore = new Ores("copper_ore", 2.0f, 2.0f, 2 );
        tin_ore = new Ores("tin_ore", 2.0f, 2.0f, 2);
        aluminum_ore = new Ores("aluminum_ore", 2.0f, 2.0f, 2);
        chrome_ore = new Ores("chrome_ore", 2.0f, 2.0f, 2);
        nickel_ore = new Ores("nickel_ore", 2.0f, 2.0f, 2);
        lead_ore = new Ores("lead_ore", 2.0f, 2.0f, 2);
        silver_ore = new Ores("silver_ore", 2.0f, 2.0f, 2);
        titanium_ore = new Ores("titanium_ore", 2.0f, 2.0f, 2);
        rutile_ore = new Ores("rutile_ore", 2.0f, 2.0f, 2);
        cryolite_ore = new Ores("cryolite_ore", 2.0f, 2.0f, 2);
    }

    public static void register()
    {
        registerBlock(copper_ore);
        registerBlock(tin_ore);
        registerBlock(aluminum_ore);
        registerBlock(chrome_ore);
        registerBlock(lead_ore);
        registerBlock(nickel_ore);
        registerBlock(silver_ore);
        registerBlock(titanium_ore);
        registerBlock(rutile_ore);
        registerBlock(cryolite_ore);
    }


    public static void registerBlock(Block block)
    {
        ForgeRegistries.BLOCKS.register(block);
        block.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        ForgeRegistries.ITEMS.register(itemBlock);

    }


    public static void registerRenders()
    {
        registerRender(copper_ore);
        registerRender(tin_ore);
        registerRender(aluminum_ore);
        registerRender(chrome_ore);
        registerRender(lead_ore);
        registerRender(nickel_ore);
        registerRender(silver_ore);
        registerRender(titanium_ore);
        registerRender(rutile_ore);
        registerRender(cryolite_ore);


    }

    public static void registerRender(Block block)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(ref.MODID + ":" + block.getUnlocalizedName().substring(5)));
    }

}
