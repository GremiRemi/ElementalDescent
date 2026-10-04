package net.elementaldescent.world.biome.nether;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.attribute.EnvironmentAttributeMap;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;

public class WitheredMarsh {
    private static Biome buildWitheredMarsh(BootstrapContext<Biome> context) {
        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .temperature(2.0f)
                .downfall(0.0f)
                .temperatureAdjustment(Biome.TemperatureModifier.NONE)
                .specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(0x3b4a2a)
                        .build())
                .putAttributes(EnvironmentAttributeMap.builder()
                        .set(EnvironmentAttributes.FOG_COLOR, 0x2e3320)
                        .set(EnvironmentAttributes.WATER_EVAPORATES, false)
                        .build())
                .mobSpawnSettings(new MobSpawnSettings.Builder()
                        .addSpawn(MobCategory.MONSTER, 10,
                                new MobSpawnSettings.SpawnerData(EntityTypes.SKELETON, 2, 3))
                        .addSpawn(MobCategory.MONSTER, 5,
                                new MobSpawnSettings.SpawnerData(EntityTypes.WITCH, 1, 1))
                        .addSpawn(MobCategory.MONSTER, 3,
                                new MobSpawnSettings.SpawnerData(EntityTypes.WITHER_SKELETON, 1, 2))
                        .addSpawn(MobCategory.CREATURE, 60,
                                new MobSpawnSettings.SpawnerData(EntityTypes.STRIDER, 1, 2))
                        .build())
                .generationSettings(new BiomeGenerationSettings.Builder(
                        context.lookup(Registries.PLACED_FEATURE),
                        context.lookup(Registries.CONFIGURED_CARVER))
                        .build())
                .build();
    }
}
