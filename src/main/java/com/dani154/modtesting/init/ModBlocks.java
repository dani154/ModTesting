package com.dani154.modtesting.init;

import com.dani154.modtesting.block.BlockFlag;
import com.dani154.modtesting.block.BlockMT;
import com.dani154.modtesting.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockMT flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
