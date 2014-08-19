package com.dani154.modtesting.init;

import com.dani154.modtesting.item.ItemMT;
import com.dani154.modtesting.item.ItemMapleLeaf;
import com.dani154.modtesting.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemMT mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
