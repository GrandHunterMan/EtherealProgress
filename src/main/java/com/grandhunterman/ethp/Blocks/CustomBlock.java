package com.grandhunterman.ethp.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

/**
 * Created by GrandHunterMan on Jul 11. Copyright 2017.
 */
public class CustomBlock extends Block {
    public CustomBlock(String name, float hardness, float resistance) {
        super(Material.ROCK);
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(hardness);
        setResistance(resistance);
    }
}
