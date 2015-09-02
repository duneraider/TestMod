package com.duneraider.testmod.init;

import com.duneraider.testmod.block.BlockFlag;
import com.duneraider.testmod.block.BlockTestMod;
import com.duneraider.testmod.reference.Names;
import com.duneraider.testmod.reference.Reference;
import com.duneraider.testmod.utility.RegisterHelper;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockTestMod flag = new BlockFlag(Names.Blocks.FLAG);

    public static void init()
    {
        RegisterHelper.registerBlocks(flag);
    }
}
