package com.cassiokf.irdecor.init;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

import com.cassiokf.irdecor.IRDecor;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

    public static Item IRON_ROD;
    public static Item STEEL_ROD;

    public static void register() {
        IRON_ROD = registerItem("iron_rod");
        STEEL_ROD = registerItem("steel_rod");

        OreDictionary.registerOre("stickIron", IRON_ROD);
        OreDictionary.registerOre("stickSteel", STEEL_ROD);
    }

    private static Item registerItem(String name) {
        Item item = new Item().setUnlocalizedName(name)
            .setTextureName(IRDecor.MODID + ":" + name)
            .setCreativeTab(ModCreativeTab.INSTANCE);
        GameRegistry.registerItem(item, name, IRDecor.MODID);
        return item;
    }
}
