package com.duneraider.testmod.tool;

import com.duneraider.testmod.creativetab.CreativeTabTestMod;
import com.duneraider.testmod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class ToolTestMod extends ItemTool
{
    public ToolTestMod(float damageVSEntities, Item.ToolMaterial toolMaterial, Set blocksEffectiveAgainst, String toolName)
    {
        super(damageVSEntities, toolMaterial, blocksEffectiveAgainst);
        this.setCreativeTab(CreativeTabTestMod.TESTMOD_TAB);
        this.setUnlocalizedName(toolName);
        this.setTextureName(Reference.MOD_ID + ":" + toolName);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(getUnwrappedUnlocalizedName(this.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
