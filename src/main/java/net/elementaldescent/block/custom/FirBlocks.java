package net.elementaldescent.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static net.elementaldescent.block.ElementalDescentBlocks.registerBlock;

public class FirBlocks {
    public static final Block FIR_LOG = registerBlock(
            "fir_log", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block FIR_WOOD = registerBlock(
            "fir_wood", properties -> new Block(properties
                    .sound(SoundType.WOOD))
            
    );

    public static final Block STRIPPED_FIR_LOG = registerBlock(
            "stripped_fir_log", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block STRIPPED_FIR_WOOD = registerBlock(
            "stripped_fir_wood", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block FIR_PLANKS = registerBlock(
            "fir_planks", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block FIR_STAIRS = registerBlock(
            "fir_stairs", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block FIR_SLAB = registerBlock(
            "fir_slab", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block FIR_FENCE = registerBlock(
            "fir_fence", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block FIR_FENCE_GATE = registerBlock(
            "fir_fence_gate", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block FIR_BUTTON = registerBlock(
            "fir_button", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block FIR_PRESSURE_PLATE = registerBlock(
            "fir_pressure_plate", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static void registerBlocks() {}
}
