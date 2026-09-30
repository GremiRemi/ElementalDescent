package net.elementaldescent.world.biome;


import net.elementaldescent.ElementalDescent;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;

public class ElementalDescentBiomes {
    public static final ResourceKey<Biome> BURIED_CLOVE = ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath(ElementalDescent.MOD_ID, "buried_clove"));
}
