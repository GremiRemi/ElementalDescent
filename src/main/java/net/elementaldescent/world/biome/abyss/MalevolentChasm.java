package net.elementaldescent.world.biome.abyss;

import net.elementaldescent.ElementalDescent;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.attribute.EnvironmentAttributeMap;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;

public class MalevolentChasm {
    public static final ResourceKey<Biome> MALEVOLENT_CHASM = ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath(ElementalDescent.MOD_ID, "malevolent_chasm"));

    private static Biome buildMalevolentChasm(BootstrapContext<Biome> context) {
        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .temperature(2.0f)
                .downfall(0.0f)
                .temperatureAdjustment(Biome.TemperatureModifier.NONE)
                .specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(0x1a0000)
                        .build())
                .putAttributes(EnvironmentAttributeMap.builder()
                        .set(EnvironmentAttributes.FOG_COLOR, 0x0d0000)
                        .set(EnvironmentAttributes.FOG_END_DISTANCE, 16.0f)
                        .set(EnvironmentAttributes.SKY_COLOR, 0x000000)
                        .set(EnvironmentAttributes.WATER_EVAPORATES, false)
                        .set(EnvironmentAttributes.MONSTERS_BURN, false)
                        .set(EnvironmentAttributes.CAN_START_RAID, false)
                        .set(EnvironmentAttributes.FAST_LAVA, true)
                        .build())
                .mobSpawnSettings(new MobSpawnSettings.Builder()
                        .addSpawn(MobCategory.MONSTER, 10,
                                new MobSpawnSettings.SpawnerData(EntityTypes.MAGMA_CUBE, 2, 4))
                        .addSpawn(MobCategory.MONSTER, 8,
                                new MobSpawnSettings.SpawnerData(EntityTypes.WARDEN, 1, 1))
                        .build())
                .generationSettings(new BiomeGenerationSettings.Builder(
                        context.lookup(Registries.PLACED_FEATURE),
                        context.lookup(Registries.CONFIGURED_CARVER))
                        .build())
                .build();
    }
}
