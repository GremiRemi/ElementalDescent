package net.elementaldescent.block.vanilla;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static net.elementaldescent.block.ElementalDescentBlocks.registerBlock;


public class StoneBlocks {
    public static final Block POLISHED_GRANITE_WALL = registerBlock(
            "polished_granite_wall", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block GRANITE_BRICKS = registerBlock(
            "granite_bricks", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block GRANITE_BRICK_STAIRS = registerBlock(
            "granite_brick_stairs", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block GRANITE_BRICK_SLAB = registerBlock(
            "granite_brick_slab", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block GRANITE_BRICK_WALL = registerBlock(
            "granite_brick_wall", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block POLISHED_ANDESITE_WALL = registerBlock(
            "polished_andesite_wall", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block ANDESITE_BRICKS = registerBlock(
            "andesite_bricks", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block ANDESITE_BRICK_STAIRS = registerBlock(
            "andesite_brick_stairs", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block ANDESITE_BRICK_SLAB = registerBlock(
            "andesite_brick_slab", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block ANDESITE_BRICK_WALL = registerBlock(
            "andesite_brick_wall", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block POLISHED_DIORITE_WALL = registerBlock(
            "polished_diorite_wall", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block DIORITE_BRICKS = registerBlock(
            "diorite_bricks", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block DIORITE_BRICK_STAIRS = registerBlock(
            "diorite_brick_stairs", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block DIORITE_BRICK_SLAB = registerBlock(
            "diorite_brick_slab", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block DIORITE_BRICK_WALL = registerBlock(
            "diorite_brick_wall", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static void registerBlocks() {}
}
