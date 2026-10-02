package net.elementaldescent.block;

import java.util.function.Function;

import net.elementaldescent.ElementalDescent;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ElementalDescentBlocks {
    public static Block create(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(ElementalDescent.MOD_ID, name))));
        registerBlock(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(ElementalDescent.MOD_ID, name), toRegister);
    }

    public static void registerBlock(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(ElementalDescent.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ElementalDescent.MOD_ID, name)))));
    }

    public static ResourceKey<Block> getID(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }

    public static void registerModBlocks() {
        ElementalDescent.LOGGER.info("Registering Mod Blocks for " +  ElementalDescent.MOD_ID);
    }
}
