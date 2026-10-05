package net.elementaldescent.datagen;

import net.elementaldescent.block.custom.EndBlocks;
import net.elementaldescent.block.custom.OreBlocks;
import net.elementaldescent.item.custom_items.EndItems;
import net.elementaldescent.item.custom_items.elemental_items.*;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TexturedModel;

public class ElementalDescentModels extends FabricModelProvider {
    public ElementalDescentModels(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerator) {
        blockModelGenerator.createTrivialCube(EndBlocks.ENDERITE_BLOCK);
        blockModelGenerator.createTrivialBlock(EndBlocks.VOID_DEBRIS, TexturedModel.COLUMN_ALT);
        blockModelGenerator.createTrivialCube(OreBlocks.PURE_AMETHYST_BLOCK);
        blockModelGenerator.createTrivialCube(OreBlocks.PURE_EMERALD_BLOCK);
        blockModelGenerator.createTrivialCube(OreBlocks.PURE_TOPAZ_BLOCK);
        blockModelGenerator.createTrivialCube(OreBlocks.PURE_RUBY_BLOCK);
        blockModelGenerator.createTrivialCube(OreBlocks.PURE_SAPPHIRE_BLOCK);
        blockModelGenerator.createTrivialCube(OreBlocks.PURE_AMETHYST_ORE);
        blockModelGenerator.createTrivialCube(OreBlocks.PURE_EMERALD_ORE);
        blockModelGenerator.createTrivialCube(OreBlocks.PURE_TOPAZ_ORE);
        blockModelGenerator.createTrivialCube(OreBlocks.PURE_RUBY_ORE);
        blockModelGenerator.createTrivialCube(OreBlocks.PURE_SAPPHIRE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(EndItems.ENDERITE_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(EndItems.ENDERITE_SCRAP, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(EndItems.ENDERITE_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(EndItems.ENDERITE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(EndItems.ENDERITE_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(EndItems.ENDERITE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(EndItems.ENDERITE_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(EndItems.ENDERITE_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModelGenerator.generateFlatItem(EndItems.ENDERITE_HELMET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(EndItems.ENDERITE_CHESTPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(EndItems.ENDERITE_LEGGINGS, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(EndItems.ENDERITE_BOOTS, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(EndItems.ENDERITE_HORSE_ARMOR, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(EndItems.ENDERITE_NAUTILUS_ARMOR, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(AetheriteItems.AETHERITE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AetheriteItems.ESSENCE_OF_AETHER, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AetheriteItems.AETHERITE_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AetheriteItems.AETHERITE_HELMET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AetheriteItems.AETHERITE_CHESTPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AetheriteItems.AETHERITE_GLOVES, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AetheriteItems.AETHERITE_LEGGINGS, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AetheriteItems.AETHERITE_BOOTS, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(VoiditeItems.VOIDITE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(VoiditeItems.ESSENCE_OF_VOID, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(VoiditeItems.VOIDITE_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(VoiditeItems.VOIDITE_HELMET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(VoiditeItems.VOIDITE_CHESTPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(VoiditeItems.VOIDITE_GLOVES, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(VoiditeItems.VOIDITE_LEGGINGS, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(VoiditeItems.VOIDITE_BOOTS, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(PureRubyItems.RAW_PURE_RUBY, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureRubyItems.REFINED_PURE_RUBY, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureRubyItems.POLISHED_PURE_RUBY, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureRubyItems.RADIANT_PURE_RUBY, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureRubyItems.ESSENCE_OF_FIRE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureRubyItems.RUBY_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureRubyItems.PURE_RUBY_HELMET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureRubyItems.PURE_RUBY_CHESTPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureRubyItems.PURE_RUBY_GLOVES, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureRubyItems.PURE_RUBY_LEGGINGS, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureRubyItems.PURE_RUBY_BOOTS, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(PureTopazItems.RAW_PURE_TOPAZ, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureTopazItems.REFINED_PURE_TOPAZ, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureTopazItems.POLISHED_PURE_TOPAZ, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureTopazItems.RADIANT_PURE_TOPAZ, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureTopazItems.ESSENCE_OF_LIGHTNING, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureTopazItems.TOPAZ_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureTopazItems.PURE_TOPAZ_HELMET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureTopazItems.PURE_TOPAZ_CHESTPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureTopazItems.PURE_TOPAZ_GLOVES, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureTopazItems.PURE_TOPAZ_LEGGINGS, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureTopazItems.PURE_TOPAZ_BOOTS, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(PureEmeraldItems.RAW_PURE_EMERALD, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureEmeraldItems.REFINED_PURE_EMERALD, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureEmeraldItems.POLISHED_PURE_EMERALD, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureEmeraldItems.RADIANT_PURE_EMERALD, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureEmeraldItems.ESSENCE_OF_EARTH, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureEmeraldItems.EMERALD_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureEmeraldItems.PURE_EMERALD_HELMET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureEmeraldItems.PURE_EMERALD_CHESTPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureEmeraldItems.PURE_EMERALD_GLOVES, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureEmeraldItems.PURE_EMERALD_LEGGINGS, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureEmeraldItems.PURE_EMERALD_BOOTS, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(PureSapphireItems.RAW_PURE_SAPPHIRE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureSapphireItems.REFINED_PURE_SAPPHIRE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureSapphireItems.POLISHED_PURE_SAPPHIRE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureSapphireItems.RADIANT_PURE_SAPPHIRE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureSapphireItems.ESSENCE_OF_WATER, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureSapphireItems.SAPPHIRE_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureSapphireItems.PURE_SAPPHIRE_HELMET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureSapphireItems.PURE_SAPPHIRE_CHESTPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureSapphireItems.PURE_SAPPHIRE_GLOVES, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureSapphireItems.PURE_SAPPHIRE_LEGGINGS, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureSapphireItems.PURE_SAPPHIRE_BOOTS, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(PureAmethystItems.RAW_PURE_AMETHYST, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureAmethystItems.REFINED_PURE_AMETHYST, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureAmethystItems.POLISHED_PURE_AMETHYST, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureAmethystItems.RADIANT_PURE_AMETHYST, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureAmethystItems.ESSENCE_OF_AIR, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureAmethystItems.AMETHYST_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureAmethystItems.PURE_AMETHYST_HELMET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureAmethystItems.PURE_AMETHYST_CHESTPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureAmethystItems.PURE_AMETHYST_GLOVES, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureAmethystItems.PURE_AMETHYST_LEGGINGS, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PureAmethystItems.PURE_AMETHYST_BOOTS, ModelTemplates.FLAT_ITEM);
    }
}
