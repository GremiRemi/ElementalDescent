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

public class OminousWoods {
    private static Biome buildOminousWoods(BootstrapContext<Biome> context) {
        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .temperature(0.7f)
                .downfall(0.8f)
                .temperatureAdjustment(Biome.TemperatureModifier.NONE)
                .specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(0x3f76e4)
                        .build())
                .putAttributes(EnvironmentAttributeMap.builder()
                        .set(EnvironmentAttributes.FOG_COLOR, 0x4a5048)
                        .set(EnvironmentAttributes.SKY_COLOR, 0x5c6b78)
                        .build())
                .mobSpawnSettings(new MobSpawnSettings.Builder()
                        .addSpawn(MobCategory.MONSTER, 80,
                                new MobSpawnSettings.SpawnerData(EntityTypes.ZOMBIE, 2, 4))
                        .addSpawn(MobCategory.MONSTER, 50,
                                new MobSpawnSettings.SpawnerData(EntityTypes.SKELETON, 1, 3))
                        .addSpawn(MobCategory.MONSTER, 50,
                                new MobSpawnSettings.SpawnerData(EntityTypes.SPIDER, 1, 2))
                        .addSpawn(MobCategory.MONSTER, 5,
                                new MobSpawnSettings.SpawnerData(EntityTypes.WITCH, 1, 1))
                        .build())
                .generationSettings(new BiomeGenerationSettings.Builder(
                        context.lookup(Registries.PLACED_FEATURE),
                        context.lookup(Registries.CONFIGURED_CARVER))
                        .build())
                .build();
    }
}
