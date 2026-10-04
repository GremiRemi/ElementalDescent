package net.elementaldescent.item.custom_items;

import net.elementaldescent.item.armor_materials.EnderiteMaterialKey;
import net.elementaldescent.item.tool_materials.EnderiteToolKey;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.equipment.ArmorType;

import static net.elementaldescent.item.ElementalDescentItems.registerItem;

public class EndItems {
    public static final Item ENDERITE_SWORD = registerItem("enderite_sword", properties -> new Item(properties
            .sword(EnderiteToolKey.ENDERITE_TOOL_MATERIAL, 1.5f, 2)));
    public static final Item ENDERITE_PICKAXE = registerItem("enderite_pickaxe", properties -> new Item(properties
            .pickaxe(EnderiteToolKey.ENDERITE_TOOL_MATERIAL, 1.5f, 2)));
    public static final Item ENDERITE_AXE = registerItem("enderite_axe", properties -> new Item(properties
            .axe(EnderiteToolKey.ENDERITE_TOOL_MATERIAL, 1.5f, 2)));
    public static final Item ENDERITE_SHOVEL = registerItem("enderite_shovel", properties -> new ShovelItem(
            EnderiteToolKey.ENDERITE_TOOL_MATERIAL, 1.5f, 2, properties));
    public static final Item ENDERITE_HOE = registerItem("enderite_hoe", properties -> new HoeItem(
            EnderiteToolKey.ENDERITE_TOOL_MATERIAL, 1.5f, 2, properties));
    public static final Item ENDERITE_HELMET = registerItem("enderite_helmet", properties -> new Item(properties
            .humanoidArmor(EnderiteMaterialKey.ENDERITE_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item ENDERITE_CHESTPLATE = registerItem("enderite_chestplate", properties -> new Item(properties
            .humanoidArmor(EnderiteMaterialKey.ENDERITE_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item ENDERITE_LEGGINGS = registerItem("enderite_leggings", properties -> new Item(properties
            .humanoidArmor(EnderiteMaterialKey.ENDERITE_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item ENDERITE_BOOTS = registerItem("enderite_boots", properties -> new Item(properties
            .humanoidArmor(EnderiteMaterialKey.ENDERITE_ARMOR_MATERIAL, ArmorType.BOOTS)));
    public static final Item ENDERITE_GLOVES = registerItem("enderite_gloves", Item::new);
    public static final Item ENDERITE_SCRAP = registerItem("enderite_scrap", Item::new);
    public static final Item ENDERITE_HORSE_ARMOR = registerItem("enderite_horse_armor", properties ->  new Item(properties
            .horseArmor(EnderiteMaterialKey.ENDERITE_ARMOR_MATERIAL)));
    public static final Item ENDERITE_NAUTILUS_ARMOR = registerItem("enderite_nautilus_armor", properties -> new Item(properties
            .nautilusArmor(EnderiteMaterialKey.ENDERITE_ARMOR_MATERIAL)));
    public static final Item ENDERITE_SMITHING_TEMPLATE = registerItem("enderite_smithing_template", Item::new);

    public static final Item ENDERITE_INGOT = registerItem("enderite_ingot", Item::new);

/**
    public static final Item BROKEN_END_CORE = registerItem(EndItemsID.BROKEN_END_CORE, Item::new);
    public static final Item DAMAGED_END_CORE = registerItem(EndItemsID.DAMAGED_END_CORE, Item::new);
    public static final Item NORMAL_END_CORE = registerItem(EndItemsID.NORMAL_END_CORE, Item::new);
    public static final Item IMPERFECT_END_CORE = registerItem(EndItemsID.IMPERFECT_END_CORE, Item::new);
    public static final Item SUPERIOR_END_CORE = registerItem(EndItemsID.SUPERIOR_END_CORE, Item::new);

    public static final Item RAW_AETHERITE = registerItem(EndItemsID.RAW_AETHERITE, Item::new);
    public static final Item AETHERITE_SHARD = registerItem(EndItemsID.AETHERITE_SHARD, Item::new);
    public static final Item AETHERITE_INGOT = registerItem(EndItemsID.AETHERITE_INGOT, Item::new);
    public static final Item AETHERITE_HAMMER = registerItem(EndItemsID.AETHERITE_HAMMER, Item::new);

    public static final Item END_DUST = registerItem(EndItemsID.END_DUST, Item::new);
    **/

    public static void registerItems() {}
}
