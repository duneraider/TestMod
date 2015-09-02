package com.duneraider.testmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.cupOfTea, 4), "bt", "mw",
                'b', new ItemStack(Items.bowl),
                'm', new ItemStack(Items.milk_bucket),
                't', new ItemStack(ModItems.teaBag),
                'w', new ItemStack(Items.water_bucket));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.flag, 2),
                new ItemStack(Items.wheat),
                new ItemStack(Items.wheat),
                new ItemStack(Items.dye, 1, 0));

        GameRegistry.addRecipe(new ItemStack(ModTools.superPick), "fff", " s ", " s ",
                'f', new ItemStack(ModBlocks.flag),
                's', new ItemStack(Items.stick));
    }
}
