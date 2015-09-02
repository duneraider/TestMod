package com.duneraider.testmod.init;

import com.duneraider.testmod.reference.Names;
import com.duneraider.testmod.tool.ToolSuperPick;
import com.duneraider.testmod.utility.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModTools
{
    public static final Item.ToolMaterial SUPERIUM = EnumHelper.addToolMaterial("SUPERIUM", 3, 1250, 15.0F, 2.0F, 18);

    public static final ToolSuperPick superPick = new ToolSuperPick(SUPERIUM, Names.Tools.SUPER_PICK);

    public static void init()
    {
        RegisterHelper.registerTools(superPick);
    }
}
