package net.elementaldescent.item;

import net.elementaldescent.ElementalDescent;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ElementalDescentItems{
    public static Item registerItem(String  name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(ElementalDescent.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ElementalDescent.MOD_ID, name)))));
    }

    public static ResourceKey<Item> getID(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }

    public static void registerElementalDescentItems() {
        ElementalDescent.LOGGER.info("Registering Items for " + ElementalDescent.MOD_ID);
    }
}
