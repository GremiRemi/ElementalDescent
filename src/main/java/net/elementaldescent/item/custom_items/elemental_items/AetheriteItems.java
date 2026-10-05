package net.elementaldescent.item.custom_items.elemental_items;

import net.elementaldescent.item.armor_materials.AetheriteMaterialKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;

import static net.elementaldescent.item.ElementalDescentItems.registerItem;

public class AetheriteItems {
    public static final Item AETHERITE = registerItem("aetherite", Item::new);
    public static final Item ESSENCE_OF_AETHER = registerItem("essence_of_aether", Item::new);
    public static final Item AETHERITE_SMITHING_TEMPLATE = registerItem("aetherite_smithing_template", Item::new);
    public static final Item AETHERITE_HELMET = registerItem("aetherite_helmet", properties -> new Item(properties
            .humanoidArmor(AetheriteMaterialKey.AETHERITE_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item AETHERITE_CHESTPLATE = registerItem("aetherite_chestplate", properties -> new Item(properties
            .humanoidArmor(AetheriteMaterialKey.AETHERITE_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item AETHERITE_GLOVES = registerItem("aetherite_gloves", Item::new);
    public static final Item AETHERITE_LEGGINGS = registerItem("aetherite_leggings", properties -> new Item(properties
            .humanoidArmor(AetheriteMaterialKey.AETHERITE_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item AETHERITE_BOOTS = registerItem("aetherite_boots", properties -> new Item(properties
            .humanoidArmor(AetheriteMaterialKey.AETHERITE_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static void registerItems() {}
}
