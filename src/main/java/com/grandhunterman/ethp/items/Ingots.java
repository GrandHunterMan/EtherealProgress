package com.grandhunterman.ethp.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by GrandHunterMan on Jul 10. Copyright 2017.
 */
public class Ingots extends net.minecraft.item.Item {
    public Ingots(String name){
        super();
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);
        setMaxStackSize(64);



    }
}
