package net.elementaldescent.datagen;

import net.elementaldescent.block.custom.EndBlocks;
import net.elementaldescent.block.custom.OreBlocks;
import net.elementaldescent.item.custom_items.EndItems;
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
    }
}
