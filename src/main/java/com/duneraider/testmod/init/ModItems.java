package com.duneraider.testmod.init;

import com.duneraider.testmod.item.ItemCupOfTea;
import com.duneraider.testmod.item.ItemTestMod;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemTestMod cupOfTea = new ItemCupOfTea();

    public static void init()
    {
        GameRegistry.registerItem(cupOfTea, "cupOfTea");
    }
}
