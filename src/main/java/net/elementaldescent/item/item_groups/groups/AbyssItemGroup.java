package net.elementaldescent.item.item_groups.groups;

import net.elementaldescent.ElementalDescent;
import net.elementaldescent.item.custom_items.EndItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class AbyssItemGroup {
    public static final ResourceKey<CreativeModeTab> ABYSS_ITEM_GROUP_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(ElementalDescent.MOD_ID, "abyss_item_group"));
    public static final CreativeModeTab ABYSS_ITEM_GROUP = FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(EndItems.ENDERITE_INGOT))
            .title(Component.translatable("itemgroup.abyss_item_group"))
            .displayItems((parameters, output) -> {

            }).build();

    public static void registerItemGroup() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ABYSS_ITEM_GROUP_KEY, ABYSS_ITEM_GROUP);
    }
}
