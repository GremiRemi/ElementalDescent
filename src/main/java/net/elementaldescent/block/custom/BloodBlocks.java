package net.elementaldescent.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

import static net.elementaldescent.block.ElementalDescentBlocks.registerBlock;

public class BloodBlocks {
    public static final Block BLOOD_MYCELIUM = registerBlock(
            "blood_mycelium", properties -> new Block(properties
                    .sound(SoundType.STONE))
    );

    public static final Block BLOOD_MUSHROOM = registerBlock(
            "blood_mushroom", properties -> new Block(properties
                    .sound(SoundType.SLIME_BLOCK))
    );

    public static final Block GLOWING_BLOOD_MUSHROOM = registerBlock(
            "glowing_blood_mycelium", properties -> new Block(properties
                    .sound(SoundType.SLIME_BLOCK))
    );

    public static final Block BLOOD_GRASS = registerBlock(
            "blood_grass", properties -> new Block(properties
                    .sound(SoundType.WOOD))
    );

    public static final Block BLOOD_MOSS = registerBlock(
            "blood_moss", properties -> new Block(properties
                    .sound(SoundType.MOSS))
    );

    public static void registerBlocks() {}
}
