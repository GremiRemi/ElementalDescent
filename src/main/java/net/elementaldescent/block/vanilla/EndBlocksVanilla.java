package net.elementaldescent.block.vanilla;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

import static net.elementaldescent.block.ElementalDescentBlocks.registerBlock;

public class EndBlocksVanilla {
    public static final Block PURPUR_WALL = registerBlock(
            "purpur_wall", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block ENDSTONE_STAIRS = registerBlock(
            "endstone_stairs", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block ENDSTONE_SLAB = registerBlock(
            "endstone_slab", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block ENDSTONE_WALL = registerBlock(
            "endstone_wall", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static void registerBlocks() {}
}
