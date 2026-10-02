package net.elementaldescent.item.armor_materials;

import net.elementaldescent.ElementalDescent;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

import java.util.Map;

import static net.elementaldescent.tags.ElementalDescentTags.Items.repairsEmerald;

public class EmeraldMaterialKey {
    public static final int EMERALD_BASE_DURABILITY = 15;

    public static final ResourceKey<EquipmentAsset> EMERALD_ARMOR_MATERIAL_KEY = ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.fromNamespaceAndPath(ElementalDescent.MOD_ID, "emerald"));
    public static final ArmorMaterial EMERALD_ARMOR_MATERIAL = new ArmorMaterial(
            EMERALD_BASE_DURABILITY,
            Map.of(
                    ArmorType.HELMET, 3,
                    ArmorType.CHESTPLATE, 8,
                    ArmorType.LEGGINGS, 6,
                    ArmorType.BOOTS, 3
            ),
            5,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            0.0f,
            0.0f,
            repairsEmerald,
            EMERALD_ARMOR_MATERIAL_KEY
    );
}
