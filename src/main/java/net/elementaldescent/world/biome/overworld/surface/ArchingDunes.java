package net.elementaldescent.world.biome.overworld.surface;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.attribute.EnvironmentAttribute;
import net.minecraft.world.attribute.EnvironmentAttributeMap;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;

public class ArchingDunes {
    private static Biome buildInfestedCaves(BootstrapContext<Biome> context) {
        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .temperature(2.0f)
                .downfall(0.0f)
                .temperatureAdjustment(Biome.TemperatureModifier.NONE)
                .specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(0x3f76e4)
                        .build())
                .putAttributes(EnvironmentAttributeMap.builder()
                        .set(EnvironmentAttributes.FOG_COLOR, 0xe8d8b0)
                        .set(EnvironmentAttributes.SKY_COLOR, 0x6eb1ff)
                        .build())
                .mobSpawnSettings(new MobSpawnSettings.Builder()
                        .addSpawn(MobCategory.CREATURE, 4,
                                new MobSpawnSettings.SpawnerData(EntityTypes.RABBIT, 2, 3))
                        .addSpawn(MobCategory.CREATURE, 1,
                                new MobSpawnSettings.SpawnerData(EntityTypes.CAMEL, 1, 1))
                        .addSpawn(MobCategory.MONSTER, 80,
                                new MobSpawnSettings.SpawnerData(EntityTypes.HUSK, 2, 4))
                        .addSpawn(MobCategory.MONSTER, 20,
                                new MobSpawnSettings.SpawnerData(EntityTypes.SKELETON, 1, 2))
                        .build())
                .generationSettings(new BiomeGenerationSettings.Builder(
                        context.lookup(Registries.PLACED_FEATURE),
                        context.lookup(Registries.CONFIGURED_CARVER))
                        .build())
                .build();
    }
}
