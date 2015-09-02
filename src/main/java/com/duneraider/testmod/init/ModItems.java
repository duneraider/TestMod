package com.duneraider.testmod.init;

import com.duneraider.testmod.item.ItemCupOfTea;
import com.duneraider.testmod.item.ItemTeaBag;
import com.duneraider.testmod.item.ItemTestMod;
import com.duneraider.testmod.reference.Names;
import com.duneraider.testmod.reference.Reference;
import com.duneraider.testmod.utility.RegisterHelper;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemTestMod cupOfTea = new ItemCupOfTea(Names.Items.CUP_OF_TEA);
    public static final ItemTestMod teaBag = new ItemTeaBag(Names.Items.TEA_BAG);

    public static void init()
    {
        RegisterHelper.registerItems(cupOfTea);
        RegisterHelper.registerItems(teaBag);
    }
}
