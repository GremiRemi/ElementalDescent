package net.elementaldescent.world.biome.overworld.cave;

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

public class InfestedCaves {
    private static Biome buildInfestedCaves(BootstrapContext<Biome> context) {
        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .temperature(0.8f)
                .downfall(0.4f)
                .temperatureAdjustment(Biome.TemperatureModifier.NONE)
                .specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(0x3f76e4)
                        .build())
                .putAttributes(EnvironmentAttributeMap.builder()
                        .set(EnvironmentAttributes.FOG_COLOR, 0x3a3a3a)
                        .build())
                .mobSpawnSettings(new MobSpawnSettings.Builder()
                        .addSpawn(MobCategory.MONSTER, 20,
                                new MobSpawnSettings.SpawnerData(EntityTypes.SILVERFISH, 2, 4))
                        .addSpawn(MobCategory.MONSTER, 10,
                                new MobSpawnSettings.SpawnerData(EntityTypes.CAVE_SPIDER, 1, 3))
                        .addSpawn(MobCategory.MONSTER, 10,
                                new MobSpawnSettings.SpawnerData(EntityTypes.SPIDER, 1, 2))
                        .build())
                .generationSettings(new BiomeGenerationSettings.Builder(
                        context.lookup(Registries.PLACED_FEATURE),
                        context.lookup(Registries.CONFIGURED_CARVER))
                        .build())
                .build();
    }
}
