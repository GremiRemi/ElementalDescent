package net.elementaldescent.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

import static net.elementaldescent.block.ElementalDescentBlocks.registerBlock;

public class AzureBlocks {
    public static final Block AZURE_MYCELIUM = registerBlock(
            "azure_mycelium", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block AZURE_MUSHROOM = registerBlock(
            "azure_mushroom", properties -> new Block(properties
                    .sound(SoundType.SLIME_BLOCK))
    );

    public static final Block GLOWING_AZURE_MUSHROOM = registerBlock(
            "glowing_azure_mycelium", properties -> new Block(properties
                .sound(SoundType.SLIME_BLOCK))
    );

    public static final Block AZURE_GRASS = registerBlock(
            "azure_grass", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block AZURE_MOSS = registerBlock(
            "azure_moss", properties -> new Block(properties
                .sound(SoundType.MOSS))
    );

    public static void registerBlocks() {}
}
