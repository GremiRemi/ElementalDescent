package net.elementaldescent.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static net.elementaldescent.block.ElementalDescentBlocks.registerBlock;

public class EndBlocks {
    public static final Block COMPRESSED_ENDSTONE = registerBlock(
            "compressed_endstone", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block VOID_DEBRIS = registerBlock(
            "void_debris", properties -> new Block(properties
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERITE_BLOCK))
    );

    public static final Block ENDERITE_BLOCK = registerBlock(
            "enderite_block", properties -> new Block(properties
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERITE_BLOCK))
    );

    public static void registerBlocks() {}
}
