package net.elementaldescent.item.item_groups.groups;

import net.elementaldescent.ElementalDescent;
import net.elementaldescent.block.custom.EndBlocks;
import net.elementaldescent.item.custom_items.EndItems;
import net.elementaldescent.item.custom_items.elemental_items.*;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ElementalItemGroup {
    public static final ResourceKey<CreativeModeTab> ELEMENTAL_ITEM_GROUP_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(ElementalDescent.MOD_ID, "elemental_item_group"));
    public static final CreativeModeTab ELEMENTAL_ITEM_GROUP = FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(AetheriteItems.ESSENCE_OF_AETHER))
            .title(Component.translatable("itemgroup.elemental_item_group"))
            .displayItems((parameters, output) -> {
                output.accept(AetheriteItems.AETHERITE);
                output.accept(AetheriteItems.ESSENCE_OF_AETHER);
                output.accept(AetheriteItems.AETHERITE_SMITHING_TEMPLATE);
                output.accept(AetheriteItems.AETHERITE_HELMET);
                output.accept(AetheriteItems.AETHERITE_CHESTPLATE);
                output.accept(AetheriteItems.AETHERITE_GLOVES);
                output.accept(AetheriteItems.AETHERITE_LEGGINGS);
                output.accept(AetheriteItems.AETHERITE_BOOTS);

                output.accept(VoiditeItems.VOIDITE);
                output.accept(VoiditeItems.ESSENCE_OF_VOID);
                output.accept(VoiditeItems.VOIDITE_SMITHING_TEMPLATE);
                output.accept(VoiditeItems.VOIDITE_HELMET);
                output.accept(VoiditeItems.VOIDITE_CHESTPLATE);
                output.accept(VoiditeItems.VOIDITE_GLOVES);
                output.accept(VoiditeItems.VOIDITE_LEGGINGS);
                output.accept(VoiditeItems.VOIDITE_BOOTS);

                output.accept(PureRubyItems.RAW_PURE_RUBY);
                output.accept(PureRubyItems.REFINED_PURE_RUBY);
                output.accept(PureRubyItems.POLISHED_PURE_RUBY);
                output.accept(PureRubyItems.RADIANT_PURE_RUBY);
                output.accept(PureRubyItems.ESSENCE_OF_FIRE);
                output.accept(PureRubyItems.RUBY_SMITHING_TEMPLATE);
                output.accept(PureRubyItems.PURE_RUBY_HELMET);
                output.accept(PureRubyItems.PURE_RUBY_CHESTPLATE);
                output.accept(PureRubyItems.PURE_RUBY_GLOVES);
                output.accept(PureRubyItems.PURE_RUBY_LEGGINGS);
                output.accept(PureRubyItems.PURE_RUBY_BOOTS);

                output.accept(PureTopazItems.RAW_PURE_TOPAZ);
                output.accept(PureTopazItems.REFINED_PURE_TOPAZ);
                output.accept(PureTopazItems.POLISHED_PURE_TOPAZ);
                output.accept(PureTopazItems.RADIANT_PURE_TOPAZ);
                output.accept(PureTopazItems.ESSENCE_OF_LIGHTNING);
                output.accept(PureTopazItems.TOPAZ_SMITHING_TEMPLATE);
                output.accept(PureTopazItems.PURE_TOPAZ_HELMET);
                output.accept(PureTopazItems.PURE_TOPAZ_CHESTPLATE);
                output.accept(PureTopazItems.PURE_TOPAZ_GLOVES);
                output.accept(PureTopazItems.PURE_TOPAZ_LEGGINGS);
                output.accept(PureTopazItems.PURE_TOPAZ_BOOTS);

                output.accept(PureEmeraldItems.RAW_PURE_EMERALD);
                output.accept(PureEmeraldItems.REFINED_PURE_EMERALD);
                output.accept(PureEmeraldItems.POLISHED_PURE_EMERALD);
                output.accept(PureEmeraldItems.RADIANT_PURE_EMERALD);
                output.accept(PureEmeraldItems.ESSENCE_OF_EARTH);
                output.accept(PureEmeraldItems.EMERALD_SMITHING_TEMPLATE);
                output.accept(PureEmeraldItems.PURE_EMERALD_HELMET);
                output.accept(PureEmeraldItems.PURE_EMERALD_CHESTPLATE);
                output.accept(PureEmeraldItems.PURE_EMERALD_GLOVES);
                output.accept(PureEmeraldItems.PURE_EMERALD_LEGGINGS);
                output.accept(PureEmeraldItems.PURE_EMERALD_BOOTS);

                output.accept(PureSapphireItems.RAW_PURE_SAPPHIRE);
                output.accept(PureSapphireItems.REFINED_PURE_SAPPHIRE);
                output.accept(PureSapphireItems.POLISHED_PURE_SAPPHIRE);
                output.accept(PureSapphireItems.RADIANT_PURE_SAPPHIRE);
                output.accept(PureSapphireItems.ESSENCE_OF_WATER);
                output.accept(PureSapphireItems.SAPPHIRE_SMITHING_TEMPLATE);
                output.accept(PureSapphireItems.PURE_SAPPHIRE_HELMET);
                output.accept(PureSapphireItems.PURE_SAPPHIRE_CHESTPLATE);
                output.accept(PureSapphireItems.PURE_SAPPHIRE_GLOVES);
                output.accept(PureSapphireItems.PURE_SAPPHIRE_LEGGINGS);
                output.accept(PureSapphireItems.PURE_SAPPHIRE_BOOTS);

                output.accept(PureAmethystItems.RAW_PURE_AMETHYST);
                output.accept(PureAmethystItems.REFINED_PURE_AMETHYST);
                output.accept(PureAmethystItems.POLISHED_PURE_AMETHYST);
                output.accept(PureAmethystItems.RADIANT_PURE_AMETHYST);
                output.accept(PureAmethystItems.ESSENCE_OF_AIR);
                output.accept(PureAmethystItems.AMETHYST_SMITHING_TEMPLATE);
                output.accept(PureAmethystItems.PURE_AMETHYST_HELMET);
                output.accept(PureAmethystItems.PURE_AMETHYST_CHESTPLATE);
                output.accept(PureAmethystItems.PURE_AMETHYST_GLOVES);
                output.accept(PureAmethystItems.PURE_AMETHYST_LEGGINGS);
                output.accept(PureAmethystItems.PURE_AMETHYST_BOOTS);

            }).build();

    public static void registerItemGroup() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ELEMENTAL_ITEM_GROUP_KEY, ELEMENTAL_ITEM_GROUP);
    }
}
