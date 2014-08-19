package com.dani154.modtesting.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.flag, 6), "rrr", "www", "rrr", 'w', new ItemStack(Blocks.wool, 1, 0), 'r', new ItemStack(Blocks.wool, 1, 14)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.mapleLeaf), "treeLeaves", new ItemStack(Items.stone_sword)));
    }
}
