package net.elementaldescent.tags;

import net.elementaldescent.ElementalDescent;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ElementalDescentTags {
    public static class Blocks {
        public static final TagKey<Block> needsEnderiteTool = createTag("needs_enderite_tool");
        public static final TagKey<Block> incorrectForEnderiteTool = createTag("incorrect_enderite_tool");


        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(ElementalDescent.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> repairsEnderite = createTag("repairs_enderite");
        public static final TagKey<Item> repairsRuby = createTag("repairs_ruby");
        public static final TagKey<Item> repairsEmerald = createTag("repairs_emerald");
        public static final TagKey<Item> repairsTopaz = createTag("repairs_topaz");
        public static final TagKey<Item> repairsAmethyst =  createTag("repairs_amethyst");
        public static final TagKey<Item> repairsSapphire = createTag("repairs_sapphire");
        public static final TagKey<Item> repairsSilver = createTag("repairs_silver");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ElementalDescent.MOD_ID, name));
        }
    }
}
