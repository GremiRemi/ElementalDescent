package net.elementaldescent.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

import static net.elementaldescent.block.ElementalDescentBlocks.registerBlock;

public class SculkBlocks {
    public static final Block ANCIENT_SCULK = registerBlock(
            "ancient_sculk",
            properties -> new Block(properties.sound(SoundType.SCULK))
    );

    public static final Block GLOWING_SCULK = registerBlock(
            "glowing_sculk",
            properties -> new Block(properties.sound(SoundType.SCULK))
    );

    public static final Block SCULK_ROOTS = registerBlock(
            "sculk_roots",
            properties -> new Block(properties.sound(SoundType.SCULK_VEIN))
    );

    public static final Block SCULK_VINES = registerBlock(
            "sculk_vines",
            properties -> new Block(properties.sound(SoundType.SCULK_VEIN))
    );

    public static final Block SCULKIFIED_DEEPSLATE = registerBlock(
            "sculkified_deepslate",
            properties -> new Block(properties.sound(SoundType.STONE))
    );

    public static final Block SCULKIFIED_DEEPSLATE_BRICKS = registerBlock(
            "sculkified_deepslate_bricks",
            properties -> new Block(properties.sound(SoundType.STONE))
    );

    public static final Block SCULKIFIED_DEEPSLATE_SLAB = registerBlock(
            "sculkified_deepslate_slab",
            properties -> new Block(properties.sound(SoundType.STONE))
    );

    public static void registerBlocks() {}
}
