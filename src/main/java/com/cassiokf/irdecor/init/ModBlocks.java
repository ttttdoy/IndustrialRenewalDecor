package com.cassiokf.irdecor.init;

import net.minecraft.block.Block;

import com.cassiokf.irdecor.IRDecor;
import com.cassiokf.irdecor.blocks.BlockBrace;
import com.cassiokf.irdecor.blocks.BlockCatwalk;
import com.cassiokf.irdecor.blocks.BlockCatwalkGate;
import com.cassiokf.irdecor.blocks.BlockCatwalkHatch;
import com.cassiokf.irdecor.blocks.BlockCatwalkLadder;
import com.cassiokf.irdecor.blocks.BlockCatwalkStair;
import com.cassiokf.irdecor.blocks.BlockColumn;
import com.cassiokf.irdecor.blocks.BlockFireExtinguisher;
import com.cassiokf.irdecor.blocks.BlockFirstAidKit;
import com.cassiokf.irdecor.blocks.BlockHandRail;
import com.cassiokf.irdecor.blocks.BlockIRBase;
import com.cassiokf.irdecor.blocks.BlockPillar;
import com.cassiokf.irdecor.blocks.BlockPlatform;
import com.cassiokf.irdecor.blocks.BlockRazorWire;
import com.cassiokf.irdecor.blocks.BlockSign;
import com.cassiokf.irdecor.tileentity.TileEntityCatwalk;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

    // Phase 2
    public static BlockHandRail HANDRAIL_IRON;
    public static BlockHandRail HANDRAIL_STEEL;
    public static BlockBrace BRACE_IRON;
    public static BlockBrace BRACE_STEEL;

    // Phase 3
    public static BlockCatwalkHatch CATWALK_HATCH;
    public static BlockCatwalkGate CATWALK_GATE;
    public static BlockRazorWire RAZOR_WIRE;

    // Phase 4
    public static BlockPillar PILLAR_IRON;
    public static BlockPillar PILLAR_STEEL;
    public static BlockColumn COLUMN_IRON;
    public static BlockColumn COLUMN_STEEL;
    public static BlockCatwalk CATWALK_IRON;
    public static BlockCatwalk CATWALK_STEEL;
    public static BlockPlatform PLATFORM;

    // Hazard blocks
    public static BlockIRBase BLOCK_HAZARD;
    public static BlockIRBase CAUTION_HAZARD;
    public static BlockIRBase DEFECTIVE_HAZARD;
    public static BlockIRBase SAFETY_HAZARD;
    public static BlockIRBase RADIATION_HAZARD;
    public static BlockIRBase AISLE_HAZARD;
    public static BlockIRBase FIRE_HAZARD;

    // Misc
    public static Block FIRE_EXTINGUISHER;
    public static Block FRAME;
    public static Block FIRSTAID_KIT;

    // Signs
    public static BlockSign SIGN_HV;
    public static BlockSign SIGN_RA;
    public static BlockSign SIGN_C;

    // Phase 5
    public static BlockCatwalkStair CATWALK_STAIR_IRON;
    public static BlockCatwalkStair CATWALK_STAIR_STEEL;
    public static BlockCatwalkLadder CATWALK_LADDER_IRON;
    public static BlockCatwalkLadder CATWALK_LADDER_STEEL;

    public static void register() {
        // Phase 2
        HANDRAIL_IRON = registerBlock(new BlockHandRail(), "handrail_iron");
        HANDRAIL_STEEL = registerBlock(new BlockHandRail(), "handrail_steel");
        BRACE_IRON = registerBlock(new BlockBrace(), "brace_iron");
        BRACE_STEEL = registerBlock(new BlockBrace(), "brace_steel");

        // Phase 3
        CATWALK_HATCH = registerBlock(new BlockCatwalkHatch(), "catwalk_hatch");
        CATWALK_GATE = registerBlock(new BlockCatwalkGate(), "catwalk_gate");
        RAZOR_WIRE = registerBlock(new BlockRazorWire(), "razor_wire");

        // Phase 4
        PILLAR_IRON = registerBlock(new BlockPillar(), "pillar_iron");
        PILLAR_STEEL = registerBlock(new BlockPillar(), "pillar_steel");
        COLUMN_IRON = registerBlock(new BlockColumn(), "column_iron");
        COLUMN_STEEL = registerBlock(new BlockColumn(), "column_steel");
        CATWALK_IRON = registerBlock(new BlockCatwalk(), "catwalk_iron");
        CATWALK_STEEL = registerBlock(new BlockCatwalk(), "catwalk_steel");
        PLATFORM = registerBlock(new BlockPlatform(), "platform");

        // Phase 5
        CATWALK_STAIR_IRON = registerBlock(new BlockCatwalkStair(), "catwalk_stair_iron");
        CATWALK_STAIR_STEEL = registerBlock(new BlockCatwalkStair(), "catwalk_stair_steel");
        CATWALK_LADDER_IRON = registerBlock(new BlockCatwalkLadder(), "catwalk_ladder_iron");
        CATWALK_LADDER_STEEL = registerBlock(new BlockCatwalkLadder(), "catwalk_ladder_steel");

        // Hazard blocks
        BLOCK_HAZARD = registerBlock(new BlockIRBase(), "block_hazard");
        CAUTION_HAZARD = registerBlock(new BlockIRBase(), "caution_hazard");
        DEFECTIVE_HAZARD = registerBlock(new BlockIRBase(), "defective_hazard");
        SAFETY_HAZARD = registerBlock(new BlockIRBase(), "safety_hazard");
        RADIATION_HAZARD = registerBlock(new BlockIRBase(), "radiation_hazard");
        AISLE_HAZARD = registerBlock(new BlockIRBase(), "aisle_hazard");
        FIRE_HAZARD = registerBlock(new BlockIRBase(), "fire_hazard");

        // Misc
        FIRE_EXTINGUISHER = registerBlock(new BlockFireExtinguisher(), "fire_extinguisher");
        FRAME = registerBlock(new BlockIRBase(), "frame");
        FIRSTAID_KIT = registerBlock(new BlockFirstAidKit(), "firstaid_kit");

        // Signs
        SIGN_HV = registerBlock(new BlockSign(), "sign_hv");
        SIGN_RA = registerBlock(new BlockSign(), "sign_ra");
        SIGN_C = registerBlock(new BlockSign(), "sign_c");

        // Tile Entities
        GameRegistry.registerTileEntity(TileEntityCatwalk.class, IRDecor.MODID + ":catwalk");
    }

    public static Block[] getSigns() {
        return new Block[] { SIGN_HV, SIGN_RA, SIGN_C };
    }

    private static <T extends Block> T registerBlock(T block, String name) {
        block.setBlockName(IRDecor.MODID + "." + name);
        GameRegistry.registerBlock(block, name);
        return block;
    }
}
