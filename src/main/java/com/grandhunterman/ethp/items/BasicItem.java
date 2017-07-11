package com.grandhunterman.ethp.items;

import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by GrandHunterMan on Jul 10. Copyright 2017.
 */
public class BasicItem extends net.minecraft.item.Item{
    public BasicItem(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);
        setMaxStackSize(64);
    }
}
