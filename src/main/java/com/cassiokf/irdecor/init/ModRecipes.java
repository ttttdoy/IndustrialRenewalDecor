package com.cassiokf.irdecor.init;

import java.util.ArrayList;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.cassiokf.irdecor.blocks.*;

import cpw.mods.fml.common.registry.GameRegistry;
import it.unimi.dsi.fastutil.Pair;

public class ModRecipes {

    public static void register() {
        addShapedRecipe(new ItemStack(ModItems.IRON_ROD, 4), " I ", " I ", "   ", Pair.of('I', Items.iron_ingot));
        addShapedRecipe(new ItemStack(ModItems.STEEL_ROD, 4), " I ", " I ", "   ", Pair.of('I', "ingotSteel"));

        addCatwalkRecipe(ModBlocks.CATWALK_IRON, "stickIron");
        addCatwalkRecipe(ModBlocks.CATWALK_STEEL, "stickSteel");

        addHandrailRecipe(ModBlocks.HANDRAIL_IRON, "stickIron", Items.iron_ingot);
        addHandrailRecipe(ModBlocks.HANDRAIL_STEEL, "stickSteel", "ingotSteel");

        addBraceRecipe(ModBlocks.BRACE_IRON, "stickIron", Items.iron_ingot);
        addBraceRecipe(ModBlocks.BRACE_STEEL, "stickSteel", "ingotSteel");

        addPillarRecipe(ModBlocks.PILLAR_IRON, "stickIron", Items.iron_ingot);
        addPillarRecipe(ModBlocks.PILLAR_STEEL, "stickSteel", "ingotSteel");

        addColumnRecipe(ModBlocks.COLUMN_IRON, "stickIron", Items.iron_ingot);
        addColumnRecipe(ModBlocks.COLUMN_STEEL, "stickSteel", "ingotSteel");

        addHazardBlockRecipe(ModBlocks.BLOCK_HAZARD, "dyeYellow", "dyeBlack");
        addHazardBlockRecipe(ModBlocks.CAUTION_HAZARD, "dyeOrange", "dyeWhite");
        addHazardBlockRecipe(ModBlocks.DEFECTIVE_HAZARD, "dyeBlue", "dyeWhite");
        addHazardBlockRecipe(ModBlocks.SAFETY_HAZARD, "dyeLime", "dyeWhite");
        addHazardBlockRecipe(ModBlocks.RADIATION_HAZARD, "dyeMagenta", "dyeYellow");
        addHazardBlockRecipe(ModBlocks.AISLE_HAZARD, "dyeBlack", "dyeWhite");
        addHazardBlockRecipe(ModBlocks.FIRE_HAZARD, "dyeRed", "dyeWhite");

        addSignRecipe(ModBlocks.SIGN_HV, "dyeRed");
        addSignRecipe(ModBlocks.SIGN_RA, "dyeWhite");
        addSignRecipe(ModBlocks.SIGN_C, "dyeYellow");

        addCatwalkStairRecipe(ModBlocks.CATWALK_STAIR_IRON, "stickIron");
        addCatwalkStairRecipe(ModBlocks.CATWALK_STAIR_STEEL, "stickSteel");

        addCatwalkLadderRecipe(ModBlocks.CATWALK_LADDER_IRON, "stickIron", Items.iron_ingot);
        addCatwalkLadderRecipe(ModBlocks.CATWALK_LADDER_STEEL, "stickSteel", "ingotSteel");

        addShapedRecipe(
            new ItemStack(ModBlocks.CATWALK_HATCH),
            "ILI",
            "S S",
            "SSS",
            Pair.of('S', "stickIron"),
            Pair.of('I', Items.iron_ingot),
            Pair.of('L', Blocks.ladder));

        addShapedRecipe(
            new ItemStack(ModBlocks.CATWALK_GATE),
            "SIS",
            "SIS",
            "S S",
            Pair.of('S', "stickIron"),
            Pair.of('I', Items.iron_ingot));

        addShapedRecipe(
            new ItemStack(ModBlocks.RAZOR_WIRE, 4),
            "I I",
            "SSS",
            "WIW",
            Pair.of('S', "stickIron"),
            Pair.of('W', Items.stick),
            Pair.of('I', Items.iron_ingot));

        addShapedRecipe(
            new ItemStack(ModBlocks.PLATFORM, 4),
            "S S",
            "SWS",
            " P ",
            Pair.of('S', "stickIron"),
            Pair.of('W', new ItemStack(Blocks.planks, 1, OreDictionary.WILDCARD_VALUE)),
            Pair.of('P', ModBlocks.PILLAR_IRON));

        addShapedRecipe(
            new ItemStack(ModBlocks.FIRE_EXTINGUISHER),
            "ISI",
            "IBI",
            "IBI",
            Pair.of('S', "stickIron"),
            Pair.of('I', Items.iron_ingot),
            Pair.of('B', Items.water_bucket));

        addShapedRecipe(
            new ItemStack(ModBlocks.FRAME, 6),
            "SIS",
            " I ",
            "SIS",
            Pair.of('S', "stickIron"),
            Pair.of('I', "ingotSteel"));

        addShapedRecipe(
            new ItemStack(ModBlocks.FIRSTAID_KIT, 2),
            "S S",
            "SCS",
            "S S",
            Pair.of('S', "stickIron"),
            Pair.of('C', Blocks.chest));
    }

    @SafeVarargs
    private static void addShapedRecipe(ItemStack result, String top, String middle, String bottom,
        Pair<Character, Object>... ingredients) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(top);
        list.add(middle);
        list.add(bottom);
        for (Pair<Character, Object> ingredient : ingredients) {
            list.add(ingredient.first());
            list.add(ingredient.second());
        }

        GameRegistry.addRecipe(new ShapedOreRecipe(result, list.toArray()));
    }

    private static void addCatwalkRecipe(BlockCatwalk catwalk, Object stick) {
        addShapedRecipe(
            new ItemStack(catwalk, 6),
            "   ",
            "S S",
            "BBB",
            Pair.of('S', stick),
            Pair.of('B', Blocks.iron_bars));
    }

    private static void addHandrailRecipe(BlockHandRail handRail, Object stick, Object base) {
        addShapedRecipe(new ItemStack(handRail, 8), "SSS", "S S", "SIS", Pair.of('S', stick), Pair.of('I', base));
    }

    private static void addBraceRecipe(BlockBrace brace, Object stick, Object base) {
        addShapedRecipe(new ItemStack(brace, 12), "IS ", "SIS", " SI", Pair.of('S', stick), Pair.of('I', base));
    }

    private static void addPillarRecipe(BlockPillar pillar, Object stick, Object base) {
        addShapedRecipe(new ItemStack(pillar, 12), "SIS", "SIS", "SIS", Pair.of('S', stick), Pair.of('I', base));
    }

    private static void addColumnRecipe(BlockColumn column, Object stick, Object base) {
        addShapedRecipe(new ItemStack(column, 12), "SSS", "III", "SSS", Pair.of('S', stick), Pair.of('I', base));
    }

    private static void addHazardBlockRecipe(BlockIRBase hazard, String firstDye, String secondDye) {
        addShapedRecipe(
            new ItemStack(hazard, 16),
            "III",
            "F S",
            "III",
            Pair.of('I', Items.iron_ingot),
            Pair.of('F', firstDye),
            Pair.of('S', secondDye));
    }

    private static void addSignRecipe(BlockSign sign, String dye) {
        addShapedRecipe(
            new ItemStack(sign, 3),
            "DS ",
            " T ",
            "ITI",
            Pair.of('D', dye),
            Pair.of('S', Items.sign),
            Pair.of('T', "stickIron"),
            Pair.of('I', Items.iron_ingot));
    }

    private static void addCatwalkStairRecipe(BlockCatwalkStair stair, String stick) {
        addShapedRecipe(
            new ItemStack(stair, 4),
            "BSS",
            "SBS",
            " SB",
            Pair.of('B', Blocks.iron_bars),
            Pair.of('S', stick));
    }

    private static void addCatwalkLadderRecipe(BlockCatwalkLadder ladder, String stick, Object ingot) {
        addShapedRecipe(
            new ItemStack(ladder, 6),
            "SLS",
            "ILI",
            "SLS",
            Pair.of('S', stick),
            Pair.of('I', ingot),
            Pair.of('L', Blocks.ladder));
    }
}
