package com.grandhunterman.ethp.Blocks;

import net.minecraft.block.Block;

/**
 * Created by GrandHunterMan on Jul 11. Copyright 2017.
 */
public class Ores extends CustomBlock {

    public Ores(String name, float hardness, float resistance, int harvestlevel) {
        super(name, hardness, resistance);
        setHarvestLevel("pickaxe", harvestlevel);
    }
}
