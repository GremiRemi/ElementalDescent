package net.elementaldescent.item.item_groups.groups;

import net.elementaldescent.ElementalDescent;
import net.elementaldescent.block.custom.EndBlocks;
import net.elementaldescent.item.custom_items.EndItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class EnderiteItemGroup {
    public static final ResourceKey<CreativeModeTab> ENDERITE_ITEM_GROUP_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(ElementalDescent.MOD_ID, "enderite_item_group"));
    public static final CreativeModeTab ENDERITE_ITEM_GROUP = FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(EndItems.ENDERITE_INGOT))
            .title(Component.translatable("itemgroup.enderite_items"))
            .displayItems((parameters, output) -> {
                output.accept(EndItems.ENDERITE_INGOT);
                output.accept(EndItems.ENDERITE_SCRAP);
                output.accept(EndBlocks.ENDERITE_BLOCK);
                output.accept(EndBlocks.VOID_DEBRIS);
                output.accept(EndItems.ENDERITE_HELMET);
                output.accept(EndItems.ENDERITE_CHESTPLATE);
                output.accept(EndItems.ENDERITE_LEGGINGS);
                output.accept(EndItems.ENDERITE_BOOTS);
                output.accept(EndItems.ENDERITE_GLOVES);
                output.accept(EndItems.ENDERITE_SWORD);
                output.accept(EndItems.ENDERITE_PICKAXE);
                output.accept(EndItems.ENDERITE_AXE);
                output.accept(EndItems.ENDERITE_SHOVEL);
                output.accept(EndItems.ENDERITE_HOE);
                output.accept(EndItems.ENDERITE_HORSE_ARMOR);
                output.accept(EndItems.ENDERITE_NAUTILUS_ARMOR);
                output.accept(EndItems.ENDERITE_SMITHING_TEMPLATE);
            }).build();

    public static void registerItemGroup() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ENDERITE_ITEM_GROUP_KEY, ENDERITE_ITEM_GROUP);
    }
}
