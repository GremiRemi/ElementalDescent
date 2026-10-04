package net.elementaldescent.block.vanilla;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

import static net.elementaldescent.block.ElementalDescentBlocks.registerBlock;

public class DeepslateBlocks {
    public static final Block DEEPSLATE_STAIRS = registerBlock(
            "deepslate_stairs", properties -> new Block(properties
                    .sound(SoundType.DEEPSLATE))
    );

    public static final Block DEEPSLATE_SLAB = registerBlock(
            "deepslate_slab", properties -> new Block(properties
                    .sound(SoundType.DEEPSLATE))
    );

    public static final Block DEEPSLATE_WALL = registerBlock(
            "deepslate_wall", properties -> new Block(properties
                    .sound(SoundType.DEEPSLATE))
    );

    public static final Block CUT_DEEPSLATE = registerBlock(
            "cut_deepslate", properties -> new Block(properties
                    .sound(SoundType.DEEPSLATE))
    );

    public static final Block CUT_DEEPSLATE_STAIRS = registerBlock(
            "cut_deepslate_stairs", properties -> new Block(properties
                    .sound(SoundType.DEEPSLATE))
    );

    public static final Block CUT_DEEPSLATE_SLAB = registerBlock(
            "cut_deepslate_slab", properties -> new Block(properties
                    .sound(SoundType.DEEPSLATE))
    );

    public static final Block CUT_DEEPSLATE_WALL = registerBlock(
            "cut_deepslate_wall", properties -> new Block(properties
                    .sound(SoundType.DEEPSLATE))
    );

    public static void registerBlocks() {}
}
