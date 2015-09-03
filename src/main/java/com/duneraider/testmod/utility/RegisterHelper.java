package com.duneraider.testmod.utility;

import com.duneraider.testmod.block.BlockTestMod;
import com.duneraider.testmod.item.ItemTestMod;
import com.duneraider.testmod.tool.ToolTestMod;
import cpw.mods.fml.common.registry.GameRegistry;

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

    public static void registerTools(ToolTestMod tool)
    {
        GameRegistry.registerItem(tool, tool.getUnlocalizedName().substring(tool.getUnlocalizedName().indexOf(":") + 1));
    }
}
