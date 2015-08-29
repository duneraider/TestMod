package com.duneraider.testmod.init;

import com.duneraider.testmod.block.BlockFlag;
import com.duneraider.testmod.block.BlockTestMod;
import com.duneraider.testmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockTestMod flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
