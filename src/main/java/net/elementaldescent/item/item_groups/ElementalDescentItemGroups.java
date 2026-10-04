package net.elementaldescent.item.item_groups;

import net.elementaldescent.ElementalDescent;
import net.elementaldescent.item.item_groups.groups.EnderiteItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;

import static net.elementaldescent.item.item_groups.groups.EnderiteItemGroup.ENDERITE_ITEM_GROUP;
import static net.elementaldescent.item.item_groups.groups.EnderiteItemGroup.ENDERITE_ITEM_GROUP_KEY;

public class ElementalDescentItemGroups {
    public static void registerElementalDescentItemGroups() {
        ElementalDescent.LOGGER.info("Registering Item Groups for " + ElementalDescent.MOD_ID);
        EnderiteItemGroup.registerItemGroup();
    }
}
