package net.elementaldescent.world.biome.overworld.elemental;

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

public class ColossalDepths {
    private static Biome buildColossalDepths(BootstrapContext<Biome> context) {
        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .temperature(0.5f)
                .downfall(0.5f)
                .temperatureAdjustment(Biome.TemperatureModifier.NONE)
                .specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(0x0b2a5c)
                        .build())
                .putAttributes(EnvironmentAttributeMap.builder()
                        .set(EnvironmentAttributes.FOG_COLOR, 0x0a1a33)
                        .set(EnvironmentAttributes.FOG_END_DISTANCE, 96.0f)
                        .set(EnvironmentAttributes.SKY_COLOR, 0x3a5f9e)
                        .build())
                .mobSpawnSettings(new MobSpawnSettings.Builder()
                        .addSpawn(MobCategory.MONSTER, 10,
                                new MobSpawnSettings.SpawnerData(EntityTypes.DROWNED, 1, 2))
                        .addSpawn(MobCategory.WATER_CREATURE, 10,
                                new MobSpawnSettings.SpawnerData(EntityTypes.SQUID, 1, 4))
                        .addSpawn(MobCategory.UNDERGROUND_WATER_CREATURE, 10,
                                new MobSpawnSettings.SpawnerData(EntityTypes.GLOW_SQUID, 4, 6))
                        .build())
                .generationSettings(new BiomeGenerationSettings.Builder(
                        context.lookup(Registries.PLACED_FEATURE),
                        context.lookup(Registries.CONFIGURED_CARVER))
                        .build())
                .build();
    }
}
