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

import static net.elementaldescent.tags.ElementalDescentTags.Items.repairsAmethyst;

public class AmethystMaterialKey {
    public static final int AMETHYST_BASE_DURABILITY = 15;

    public static final ResourceKey<EquipmentAsset> AMETHYST_ARMOR_MATERIAL_KEY = ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.fromNamespaceAndPath(ElementalDescent.MOD_ID, "amethyst"));
    public static final ArmorMaterial AMETHYST_ARMOR_MATERIAL = new ArmorMaterial(
            AMETHYST_BASE_DURABILITY,
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
            repairsAmethyst,
            AMETHYST_ARMOR_MATERIAL_KEY
    );
}
