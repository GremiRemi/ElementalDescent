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

import static net.elementaldescent.tags.ElementalDescentTags.Items.repairsEnderite;

public class EnderiteMaterialKey {
    public static final int ENDERITE_BASE_DURABILITY = 14;

    public static final ResourceKey<EquipmentAsset> ENDERITE_ARMOR_MATERIAL_KEY = ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.fromNamespaceAndPath(ElementalDescent.MOD_ID, "enderite"));
    public static final ArmorMaterial ENDERITE_ARMOR_MATERIAL = new ArmorMaterial(
            ENDERITE_BASE_DURABILITY,
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
            repairsEnderite,
            ENDERITE_ARMOR_MATERIAL_KEY
    );
}
