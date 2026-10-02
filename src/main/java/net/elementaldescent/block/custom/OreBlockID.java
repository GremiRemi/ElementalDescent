package net.elementaldescent.block.custom;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

import static net.elementaldescent.block.ElementalDescentBlocks.create;

public class OreBlockID {
    public static final Block PURE_AMETHYST_ORE = create("pure_amethyst_ore", properties -> new Block(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block PURE_EMERALD_ORE = create("pure_emerald_ore", properties -> new Block(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block PURE_TOPAZ_ORE = create("pure_topaz_ore", properties -> new Block(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block PURE_RUBY_ORE = create("pure_ruby_ore", properties -> new Block(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block PURE_SAPPHIRE_ORE = create("pure_sapphire_ore", properties -> new Block(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final Block PURE_AMETHYST_BLOCK = create("pure_amethyst_block", properties -> new Block(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block PURE_EMERALD_BLOCK = create("pure_emerald_block", properties -> new Block(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block PURE_TOPAZ_BLOCK = create("pure_topaz_block", properties -> new Block(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block PURE_RUBY_BLOCK = create("pure_ruby_block", properties -> new Block(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block PURE_SAPPHIRE_BLOCK = create("pure_sapphire_block", properties -> new Block(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

}
