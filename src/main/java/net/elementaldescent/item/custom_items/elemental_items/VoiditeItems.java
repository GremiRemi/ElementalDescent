package net.elementaldescent.item.custom_items.elemental_items;

import net.elementaldescent.item.armor_materials.VoiditeMaterialKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;

import static net.elementaldescent.item.ElementalDescentItems.registerItem;

public class VoiditeItems {
    public static final Item VOIDITE = registerItem("voidite", Item::new);
    public static final Item ESSENCE_OF_VOID = registerItem("essence_of_void", Item::new);
    public static final Item VOIDITE_SMITHING_TEMPLATE = registerItem("voidite_smithing_template", Item::new);
    public static final Item VOIDITE_HELMET = registerItem("voidite_helmet", properties -> new Item(properties
            .humanoidArmor(VoiditeMaterialKey.VOIDITE_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item VOIDITE_CHESTPLATE = registerItem("voidite_chestplate", properties -> new Item(properties
            .humanoidArmor(VoiditeMaterialKey.VOIDITE_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item VOIDITE_GLOVES =  registerItem("voidite_gloves", Item::new);
    public static final Item VOIDITE_LEGGINGS = registerItem("voidite_leggings", properties -> new Item(properties
            .humanoidArmor(VoiditeMaterialKey.VOIDITE_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item VOIDITE_BOOTS = registerItem("voidite_boots", properties -> new Item(properties
            .humanoidArmor(VoiditeMaterialKey.VOIDITE_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static void registerItems() {}
}
