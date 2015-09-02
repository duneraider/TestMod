package com.duneraider.testmod.utility;

import com.duneraider.testmod.block.BlockTestMod;
import com.duneraider.testmod.item.ItemTestMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemTool;

public class RegisterHelper
{
    public static void registerItems(ItemTestMod item)
    {
        GameRegistry.registerItem(item, item.getUnlocalizedName().substring(item.getUnlocalizedName().indexOf(":") + 1));
    }

    public static void registerBlocks(BlockTestMod block)
    {
        GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(block.getUnlocalizedName().indexOf(":") + 1));
    }

    public static void registerTools(ItemTool tool)
    {
        LogHelper.info(tool.getUnlocalizedName());
        GameRegistry.registerItem(tool, tool.getUnlocalizedName().substring(tool.getUnlocalizedName().indexOf(":") + 1));
    }
}
