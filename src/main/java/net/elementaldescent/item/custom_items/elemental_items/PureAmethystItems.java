package net.elementaldescent.item.custom_items.elemental_items;

import net.elementaldescent.item.armor_materials.AmethystMaterialKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.equipment.ArmorType;

import static net.elementaldescent.item.ElementalDescentItems.registerItem;

public class PureAmethystItems {
    public static final Item RAW_PURE_AMETHYST = registerItem("raw_pure_amethyst", Item::new);
    public static final Item REFINED_PURE_AMETHYST = registerItem("refined_pure_amethyst", Item::new);
    public static final Item POLISHED_PURE_AMETHYST = registerItem("polished_pure_amethyst", Item::new);
    public static final Item RADIANT_PURE_AMETHYST = registerItem("radiant_pure_amethyst", Item::new);
    public static final Item ESSENCE_OF_AIR = registerItem("essence_of_air", Item::new);
    public static final Item AMETHYST_SMITHING_TEMPLATE = registerItem("amethyst_smithing_template", Item::new);
    public static final Item PURE_AMETHYST_HELMET = registerItem("pure_amethyst_helmet", properties -> new Item(properties
            .humanoidArmor(AmethystMaterialKey.AMETHYST_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item PURE_AMETHYST_CHESTPLATE = registerItem("pure_amethyst_chestplate", properties -> new Item(properties
            .humanoidArmor(AmethystMaterialKey.AMETHYST_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item PURE_AMETHYST_GLOVES = registerItem("pure_amethyst_gloves", Item::new);
    public static final Item PURE_AMETHYST_LEGGINGS = registerItem("pure_amethyst_leggings", properties -> new Item(properties
            .humanoidArmor(AmethystMaterialKey.AMETHYST_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item PURE_AMETHYST_BOOTS = registerItem("pure_amethyst_boots", properties -> new Item(properties
            .humanoidArmor(AmethystMaterialKey.AMETHYST_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static void registerItems() {}
}
