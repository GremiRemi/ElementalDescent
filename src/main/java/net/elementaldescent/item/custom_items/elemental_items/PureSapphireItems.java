package net.elementaldescent.item.custom_items.elemental_items;

import net.elementaldescent.item.armor_materials.SapphireMaterialKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.equipment.ArmorType;

import static net.elementaldescent.item.ElementalDescentItems.registerItem;

public class PureSapphireItems {
    public static final Item RAW_PURE_SAPPHIRE = registerItem("raw_pure_sapphire", Item::new);
    public static final Item REFINED_PURE_SAPPHIRE = registerItem("refined_pure_sapphire", Item::new);
    public static final Item POLISHED_PURE_SAPPHIRE = registerItem("polished_pure_sapphire", Item::new);
    public static final Item RADIANT_PURE_SAPPHIRE = registerItem("radiant_pure_sapphire", Item::new);
    public static final Item ESSENCE_OF_WATER = registerItem("essence_of_water", Item::new);
    public static final Item SAPPHIRE_SMITHING_TEMPLATE = registerItem("sapphire_smithing_template", Item::new);
    public static final Item PURE_SAPPHIRE_HELMET = registerItem("pure_sapphire_helmet", properties -> new Item(properties
            .humanoidArmor(SapphireMaterialKey.SAPPHIRE_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item PURE_SAPPHIRE_CHESTPLATE = registerItem("pure_sapphire_chestplate", properties -> new Item(properties
            .humanoidArmor(SapphireMaterialKey.SAPPHIRE_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item PURE_SAPPHIRE_GLOVES = registerItem("pure_sapphire_gloves", Item::new);
    public static final Item PURE_SAPPHIRE_LEGGINGS = registerItem("pure_sapphire_leggings", properties -> new Item(properties
            .humanoidArmor(SapphireMaterialKey.SAPPHIRE_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item PURE_SAPPHIRE_BOOTS = registerItem("pure_sapphire_boots", properties -> new Item(properties
            .humanoidArmor(SapphireMaterialKey.SAPPHIRE_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static void registerItems() {}
}
