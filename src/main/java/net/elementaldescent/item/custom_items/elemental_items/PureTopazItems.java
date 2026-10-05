package net.elementaldescent.item.custom_items.elemental_items;

import net.elementaldescent.item.armor_materials.TopazMaterialKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.equipment.ArmorType;

import static net.elementaldescent.item.ElementalDescentItems.registerItem;

public class PureTopazItems {
    public static final Item RAW_PURE_TOPAZ = registerItem("raw_pure_topaz", Item::new);
    public static final Item REFINED_PURE_TOPAZ = registerItem("refined_pure_topaz", Item::new);
    public static final Item POLISHED_PURE_TOPAZ = registerItem("polished_pure_topaz", Item::new);
    public static final Item RADIANT_PURE_TOPAZ = registerItem("radiant_pure_topaz", Item::new);
    public static final Item ESSENCE_OF_LIGHTNING = registerItem("essence_of_lightning", Item::new);
    public static final Item TOPAZ_SMITHING_TEMPLATE = registerItem("topaz_smithing_template", Item::new);
    public static final Item PURE_TOPAZ_HELMET = registerItem("pure_topaz_helmet", properties -> new Item(properties
            .humanoidArmor(TopazMaterialKey.TOPAZ_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item PURE_TOPAZ_CHESTPLATE = registerItem("pure_topaz_chestplate", properties -> new Item(properties
            .humanoidArmor(TopazMaterialKey.TOPAZ_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item PURE_TOPAZ_GLOVES = registerItem("pure_topaz_gloves", Item::new);
    public static final Item PURE_TOPAZ_LEGGINGS = registerItem("pure_topaz_leggings", properties -> new Item(properties
            .humanoidArmor(TopazMaterialKey.TOPAZ_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item PURE_TOPAZ_BOOTS = registerItem("pure_topaz_boots", properties -> new Item(properties
            .humanoidArmor(TopazMaterialKey.TOPAZ_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static void registerItems() {}
}
