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

public class Prairie {
    private static Biome buildPrairie(BootstrapContext<Biome> context) {
        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .temperature(0.8f)
                .downfall(0.4f)
                .temperatureAdjustment(Biome.TemperatureModifier.NONE)
                .specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(0x3f76e4)
                        .build())
                .putAttributes(EnvironmentAttributeMap.builder()
                        .set(EnvironmentAttributes.FOG_COLOR, 0xc0d8ff)
                        .set(EnvironmentAttributes.SKY_COLOR, 0x78a7ff)
                        .build())
                .mobSpawnSettings(new MobSpawnSettings.Builder()
                        .addSpawn(MobCategory.CREATURE, 8,
                                new MobSpawnSettings.SpawnerData(EntityTypes.COW, 2, 4))
                        .addSpawn(MobCategory.CREATURE, 5,
                                new MobSpawnSettings.SpawnerData(EntityTypes.HORSE, 2, 6))
                        .addSpawn(MobCategory.MONSTER, 50,
                                new MobSpawnSettings.SpawnerData(EntityTypes.ZOMBIE, 2, 4))
                        .addSpawn(MobCategory.MONSTER, 50,
                                new MobSpawnSettings.SpawnerData(EntityTypes.SKELETON, 1, 3))
                        .build())
                .generationSettings(new BiomeGenerationSettings.Builder(
                        context.lookup(Registries.PLACED_FEATURE),
                        context.lookup(Registries.CONFIGURED_CARVER))
                        .build())
                .build();
    }
}
