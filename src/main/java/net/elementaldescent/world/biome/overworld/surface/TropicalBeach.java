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

public class TropicalBeach {
    private static Biome buildTropicalBeach(BootstrapContext<Biome> context) {
        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .temperature(0.9f)
                .downfall(0.6f)
                .temperatureAdjustment(Biome.TemperatureModifier.NONE)
                .specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(0x43d5ee)
                        .build())
                .putAttributes(EnvironmentAttributeMap.builder()
                        .set(EnvironmentAttributes.FOG_COLOR, 0xc0d8ff)
                        .set(EnvironmentAttributes.SKY_COLOR, 0x77a8ff)
                        .build())
                .mobSpawnSettings(new MobSpawnSettings.Builder()
                        .addSpawn(MobCategory.CREATURE, 5,
                                new MobSpawnSettings.SpawnerData(EntityTypes.TURTLE, 2, 5))
                        .addSpawn(MobCategory.WATER_AMBIENT, 25,
                                new MobSpawnSettings.SpawnerData(EntityTypes.TROPICAL_FISH, 4, 8))
                        .addSpawn(MobCategory.MONSTER, 50,
                                new MobSpawnSettings.SpawnerData(EntityTypes.ZOMBIE, 2, 4))
                        .addSpawn(MobCategory.MONSTER, 30,
                                new MobSpawnSettings.SpawnerData(EntityTypes.SKELETON, 1, 3))
                        .build())
                .generationSettings(new BiomeGenerationSettings.Builder(
                        context.lookup(Registries.PLACED_FEATURE),
                        context.lookup(Registries.CONFIGURED_CARVER))
                        .build())
                .build();
    }
}
