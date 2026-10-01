package net.elementaldescent.world.dimension;

import net.elementaldescent.ElementalDescent;
import net.elementaldescent.world.biome.abyss.MalevolentChasm;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.clock.WorldClock;
import net.minecraft.world.level.CardinalLighting;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;
import java.util.Optional;

public class ElementalDescentDimensions {
    public static final ResourceKey<DimensionType> OTHERSIDE_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE, Identifier.fromNamespaceAndPath(ElementalDescent.MOD_ID, "otherside_type"));
    public static final ResourceKey<LevelStem> OTHERSIDE_STEM = ResourceKey.create(Registries.LEVEL_STEM, Identifier.fromNamespaceAndPath(ElementalDescent.MOD_ID, "otherside"));

    public static void bootstrap(BootstrapContext<DimensionType> context)   {
        context.register(OTHERSIDE_TYPE, new DimensionType(
                false,
                true,
                false,
                false,
                16,
                0,
                384,
                384,
                HolderSet.empty(),
                1.0f,
                new DimensionType.MonsterSettings(ConstantInt.of(0), 0),
                DimensionType.Skybox.NONE,
                CardinalLighting.Type.NETHER,
                net.minecraft.world.attribute.EnvironmentAttributeMap.EMPTY,
                HolderSet.empty(),
                Optional.empty()));
    }

    public static void bootstrapStem(BootstrapContext<LevelStem> context) {
        var dimensionTypes = context.lookup(Registries.DIMENSION_TYPE);
        var biomes = context.lookup(Registries.BIOME);
        var noiseSettings = context.lookup(Registries.NOISE_SETTINGS);
    }
}
