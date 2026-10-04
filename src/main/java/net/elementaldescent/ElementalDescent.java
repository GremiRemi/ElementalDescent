package net.elementaldescent;

import net.elementaldescent.block.ElementalDescentBlocks;
import net.elementaldescent.item.ElementalDescentItems;
import net.elementaldescent.item.item_groups.ElementalDescentItemGroups;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElementalDescent implements ModInitializer {
	public static final String MOD_ID = "elemental-descent";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ElementalDescentItems.registerElementalDescentItems();
		ElementalDescentBlocks.registerElementalDescentBlocks();
		ElementalDescentItemGroups.registerElementalDescentItemGroups();

		LOGGER.info("Hello Fabric world!");
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
