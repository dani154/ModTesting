package com.dani154.modtesting.creativetab;

import com.dani154.modtesting.init.ModItems;
import com.dani154.modtesting.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMT
{
    public static final CreativeTabs MT_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.mapleLeaf;
        }
    };
}
