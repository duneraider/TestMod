package com.duneraider.testmod.block;

import com.duneraider.testmod.creativetab.CreativeTabTestMod;
import com.duneraider.testmod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockTestMod extends Block
{
    public BlockTestMod(Material material, String blockName)
    {
        super(material);
        this.setBlockName(blockName);
        this.setBlockTextureName(Reference.MOD_ID + ":" + blockName);
        this.setCreativeTab(CreativeTabTestMod.TESTMOD_TAB);
    }

    public BlockTestMod(String blockName)
    {
        this(Material.rock, blockName);
    }

    public BlockTestMod()
    {
        this(Material.rock, null);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
