package net.elementaldescent.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

import static net.elementaldescent.block.ElementalDescentBlocks.registerBlock;

public class EchoBlocks {
    public static final Block ECHO_LOG = registerBlock(
            "echo_log", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block ECHO_WOOD = registerBlock(
            "echo_wood", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block STRIPPED_ECHO_LOG = registerBlock(
            "stripped_echo_log", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block STRIPPED_ECHO_WOOD = registerBlock(
            "stripped_echo_wood", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block ECHO_PLANKS = registerBlock(
            "echo_planks", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block ECHO_STAIRS = registerBlock(
            "echo_stairs", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block ECHO_SLAB = registerBlock(
            "echo_slab", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block ECHO_FENCE = registerBlock(
            "echo_fence", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block ECHO_FENCE_GATE = registerBlock(
            "echo_fence_gate", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block ECHO_BUTTON = registerBlock(
            "echo_button", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block ECHO_PRESSURE_PLATE = registerBlock(
            "echo_pressure_plate", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static void registerBlocks() {}
}
