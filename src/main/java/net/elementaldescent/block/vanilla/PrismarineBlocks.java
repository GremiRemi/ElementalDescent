package net.elementaldescent.block.vanilla;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static net.elementaldescent.block.ElementalDescentBlocks.registerBlock;

public class PrismarineBlocks {
    public static final Block PRISMARINE_BRICK_WALL = registerBlock(
            "prismarine_brick_wall", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block DARK_PRISMARINE_WALL = registerBlock(
            "dark_prismarine_wall", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static void registerBlocks() {}
}
