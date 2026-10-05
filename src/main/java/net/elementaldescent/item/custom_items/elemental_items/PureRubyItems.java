package net.elementaldescent.item.custom_items.elemental_items;

import net.elementaldescent.item.armor_materials.RubyMaterialKey;
import net.elementaldescent.item.armor_materials.RubyMaterialKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.equipment.ArmorType;

import static net.elementaldescent.item.ElementalDescentItems.registerItem;

public class PureRubyItems {
    public static final Item RAW_PURE_RUBY = registerItem("raw_pure_ruby", Item::new);
    public static final Item REFINED_PURE_RUBY = registerItem("refined_pure_ruby", Item::new);
    public static final Item POLISHED_PURE_RUBY = registerItem("polished_pure_ruby", Item::new);
    public static final Item RADIANT_PURE_RUBY = registerItem("radiant_pure_ruby", Item::new);
    public static final Item ESSENCE_OF_FIRE = registerItem("essence_of_fire", Item::new);
    public static final Item RUBY_SMITHING_TEMPLATE = registerItem("ruby_smithing_template", Item::new);
    public static final Item PURE_RUBY_HELMET = registerItem("pure_ruby_helmet", properties -> new Item(properties
            .humanoidArmor(RubyMaterialKey.RUBY_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item PURE_RUBY_CHESTPLATE = registerItem("pure_ruby_chestplate", properties -> new Item(properties
            .humanoidArmor(RubyMaterialKey.RUBY_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item PURE_RUBY_GLOVES = registerItem("pure_ruby_gloves", Item::new);
    public static final Item PURE_RUBY_LEGGINGS = registerItem("pure_ruby_leggings", properties -> new Item(properties
            .humanoidArmor(RubyMaterialKey.RUBY_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item PURE_RUBY_BOOTS = registerItem("pure_ruby_boots", properties -> new Item(properties
            .humanoidArmor(RubyMaterialKey.RUBY_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static void registerItems() {}
}
