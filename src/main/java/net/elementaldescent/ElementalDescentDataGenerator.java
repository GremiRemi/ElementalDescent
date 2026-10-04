package net.elementaldescent;

import net.elementaldescent.datagen.ElementalDescentEquipmentAssetProvider;
import net.elementaldescent.datagen.ElementalDescentModels;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ElementalDescentDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ElementalDescentModels::new);
		pack.addProvider(ElementalDescentEquipmentAssetProvider::new);
	}
}
