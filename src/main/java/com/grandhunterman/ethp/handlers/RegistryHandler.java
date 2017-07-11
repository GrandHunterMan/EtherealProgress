package com.grandhunterman.ethp.handlers;

import com.grandhunterman.ethp.init.BlockInit;
import com.grandhunterman.ethp.init.ItemInit;

/**
 * Created by GrandHunterMan on Jul 10. Copyright 2017.
 */
public class RegistryHandler {


    public static void Client()
    {
        ItemInit.register();
        BlockInit.registerRenders();
    }



    public static void Common()
    {
        ItemInit.init();
        BlockInit.init();
        BlockInit.register();
    }


}
