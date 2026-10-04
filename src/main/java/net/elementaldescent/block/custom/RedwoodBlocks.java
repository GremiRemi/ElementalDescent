package net.elementaldescent.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

import static net.elementaldescent.block.ElementalDescentBlocks.registerBlock;


public class RedwoodBlocks {
    public static final Block REDWOOD_LOG = registerBlock(
            "redwood_log", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block REDWOOD_WOOD = registerBlock(
            "redwood_wood", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block STRIPPED_REDWOOD_LOG = registerBlock(
            "stripped_redwood_log", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block STRIPPED_REDWOOD_WOOD = registerBlock(
            "stripped_redwood_wood", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block REDWOOD_PLANKS = registerBlock(
            "redwood_planks", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block REDWOOD_STAIRS = registerBlock(
            "redwood_stairs", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block REDWOOD_SLAB = registerBlock(
            "redwood_slab", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block REDWOOD_FENCE = registerBlock(
            "redwood_fence", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block REDWOOD_FENCE_GATE = registerBlock(
            "redwood_fence_gate", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block REDWOOD_BUTTON = registerBlock(
            "redwood_button", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block REDWOOD_PRESSURE_PLATE = registerBlock(
            "redwood_pressure_plate", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static void registerBlocks() {}
}
