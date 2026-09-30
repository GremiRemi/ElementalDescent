package net.elementaldescent.item;

import net.elementaldescent.ElementalDescent;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class ElementalDescentItemIds {
    public static final ResourceKey<Item> ENDERITE_INGOT = create("enderite_ingot");
    public static final ResourceKey<Item> PURE_AMETHYST = create("pure_amethyst");
    public static final ResourceKey<Item> PURE_EMERALD = create("pure_emerald");
    public static final ResourceKey<Item> PURE_OPAL = create("pure_opal");
    public static final ResourceKey<Item> PURE_RUBY = create("pure_ruby");
    public static final ResourceKey<Item> PURE_SAPPHIRE = create("pure_sapphire");

    public static ResourceKey<Item> create(String name) {
        return ResourceKey.create(Registries.ITEM, ElementalDescent.id(name));
    }
}
