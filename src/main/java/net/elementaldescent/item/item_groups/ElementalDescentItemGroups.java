package net.elementaldescent.item.item_groups;

import net.elementaldescent.ElementalDescent;
import net.elementaldescent.item.item_groups.groups.AbyssItemGroup;
import net.elementaldescent.item.item_groups.groups.ElementalItemGroup;
import net.elementaldescent.item.item_groups.groups.EndItemGroup;
import net.elementaldescent.item.item_groups.groups.NetherItemGroup;

public class ElementalDescentItemGroups {
    public static void registerElementalDescentItemGroups() {
        ElementalDescent.LOGGER.info("Registering Item Groups for " + ElementalDescent.MOD_ID);
        ElementalItemGroup.registerItemGroup();
        NetherItemGroup.registerItemGroup();
        EndItemGroup.registerItemGroup();
        AbyssItemGroup.registerItemGroup();
    }
}
