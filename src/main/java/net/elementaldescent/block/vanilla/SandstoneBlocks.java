package net.elementaldescent.block.vanilla;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static net.elementaldescent.block.ElementalDescentBlocks.registerBlock;


public class SandstoneBlocks {
    public static final Block SANDSTONE_BRICKS = registerBlock(
            "sandstone_bricks", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block SANDSTONE_BRICK_STAIRS = registerBlock(
            "sandstone_brick_stairs", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block SANDSTONE_BRICK_SLAB = registerBlock(
            "sandstone_brick_slab", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block SANDSTONE_BRICK_WALL = registerBlock(
            "sandstone_brick_wall", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock(
            "smooth_sandstone_wall", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block RED_SANDSTONE_BRICKS = registerBlock(
            "red_sandstone_bricks", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block RED_SANDSTONE_BRICK_STAIRS = registerBlock(
            "red_sandstone_brick_stairs", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block RED_SANDSTONE_BRICK_SLAB = registerBlock(
            "red_sandstone_brick_slab", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block RED_SANDSTONE_BRICK_WALL = registerBlock(
            "red_sandstone_brick_wall", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock(
            "smooth_red_sandstone_wall", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static void registerBlocks() {}
}
