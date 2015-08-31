package com.duneraider.testmod.block;

import com.duneraider.testmod.reference.Reference;

public class BlockFlag extends BlockTestMod
{
    public BlockFlag()
    {
        super();
        this.setBlockName("flag");
        this.setBlockTextureName(Reference.MOD_ID + ":" + "flag");
    }
}
