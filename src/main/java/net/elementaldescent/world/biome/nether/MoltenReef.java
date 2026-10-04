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

public class MoltenReef {
    private static Biome buildMoltenReef(BootstrapContext<Biome> context) {
        return new Biome.BiomeBuilder()
            .hasPrecipitation(false)
            .temperature(2.0f)
            .downfall(0.0f)
            .temperatureAdjustment(Biome.TemperatureModifier.NONE)
            .specialEffects(new BiomeSpecialEffects.Builder()
                    .waterColor(0x3f76e4)
                    .build())
            .putAttributes(EnvironmentAttributeMap.builder()
                    .set(EnvironmentAttributes.FOG_COLOR, 0x5a2010)
                    .set(EnvironmentAttributes.FAST_LAVA, true)
                    .build())
            .mobSpawnSettings(new MobSpawnSettings.Builder()
                    .addSpawn(MobCategory.CREATURE, 80,
                            new MobSpawnSettings.SpawnerData(EntityTypes.STRIDER, 2, 4))
                    .addSpawn(MobCategory.MONSTER, 20,
                            new MobSpawnSettings.SpawnerData(EntityTypes.MAGMA_CUBE, 2, 4))
                    // TODO: Lava fish??? Would be kinda cool
                    .build())
            .generationSettings(new BiomeGenerationSettings.Builder(
                    context.lookup(Registries.PLACED_FEATURE),
                    context.lookup(Registries.CONFIGURED_CARVER))
                    .build())
            .build();
    }
}
