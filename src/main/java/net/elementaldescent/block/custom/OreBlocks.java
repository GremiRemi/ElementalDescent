package net.elementaldescent.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

import static net.elementaldescent.block.ElementalDescentBlocks.registerBlock;

public class OreBlocks {
    public static final Block PURE_AMETHYST_ORE = registerBlock(
            "pure_amethyst_ore", properties -> new Block(properties
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST))
    );

    public static final Block PURE_EMERALD_ORE = registerBlock(
            "pure_emerald_ore", properties -> new Block(properties
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST))
    );

    public static final Block PURE_TOPAZ_ORE = registerBlock(
            "pure_topaz_ore", properties -> new Block(properties
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST))
    );

    public static final Block PURE_RUBY_ORE = registerBlock(
            "pure_ruby_ore", properties -> new Block(properties
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST))
    );

    public static final Block PURE_SAPPHIRE_ORE = registerBlock(
            "pure_sapphire_ore", properties -> new Block(properties
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST))
    );

    public static final Block SILVER_ORE = registerBlock(
            "silver_ore", properties -> new Block(properties
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE))
    );

    public static final Block PURE_AMETHYST_BLOCK = registerBlock(
            "pure_amethyst_block", properties -> new Block(properties
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST))
    );

    public static final Block PURE_EMERALD_BLOCK = registerBlock(
            "pure_emerald_block", properties -> new Block(properties
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST))
    );

    public static final Block PURE_TOPAZ_BLOCK = registerBlock(
            "pure_topaz_block", properties -> new Block(properties
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST))
    );

    public static final Block PURE_RUBY_BLOCK = registerBlock(
            "pure_ruby_block", properties -> new Block(properties
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST))
    );

    public static final Block PURE_SAPPHIRE_BLOCK = registerBlock(
            "pure_sapphire_block", properties -> new Block(properties
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST))
    );

    public static final Block SILVER_BLOCK = registerBlock(
            "silver_block", properties -> new Block(properties
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.IRON))
    );

    public static void registerBlocks() {}
}
