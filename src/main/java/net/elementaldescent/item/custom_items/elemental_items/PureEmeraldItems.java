package net.elementaldescent.item.custom_items.elemental_items;

import net.elementaldescent.item.armor_materials.EmeraldMaterialKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.equipment.ArmorType;

import static net.elementaldescent.item.ElementalDescentItems.registerItem;

public class PureEmeraldItems {
    public static final Item RAW_PURE_EMERALD = registerItem("raw_pure_emerald", Item::new);
    public static final Item REFINED_PURE_EMERALD = registerItem("refined_pure_emerald", Item::new);
    public static final Item POLISHED_PURE_EMERALD = registerItem("polished_pure_emerald", Item::new);
    public static final Item RADIANT_PURE_EMERALD = registerItem("radiant_pure_emerald", Item::new);
    public static final Item ESSENCE_OF_EARTH = registerItem("essence_of_earth", Item::new);
    public static final Item EMERALD_SMITHING_TEMPLATE = registerItem("emerald_smithing_template", Item::new);
    public static final Item PURE_EMERALD_HELMET = registerItem("pure_emerald_helmet", properties -> new Item(properties
            .humanoidArmor(EmeraldMaterialKey.EMERALD_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item PURE_EMERALD_CHESTPLATE = registerItem("pure_emerald_chestplate", properties -> new Item(properties
            .humanoidArmor(EmeraldMaterialKey.EMERALD_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item PURE_EMERALD_GLOVES =  registerItem("pure_emerald_gloves", Item::new);
    public static final Item PURE_EMERALD_LEGGINGS = registerItem("pure_emerald_leggings", properties -> new Item(properties
            .humanoidArmor(EmeraldMaterialKey.EMERALD_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item PURE_EMERALD_BOOTS = registerItem("pure_emerald_boots", properties -> new Item(properties
            .humanoidArmor(EmeraldMaterialKey.EMERALD_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static void registerItems() {}
}
