package net.elementaldescent.datagen;

import net.elementaldescent.tags.ElementalDescentTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

import static net.elementaldescent.item.ElementalDescentItems.getID;
import static net.elementaldescent.item.custom_items.EndItems.ENDERITE_INGOT;

public class ItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        builder(ElementalDescentTags.Items.repairsEnderite)
                .add(getID(ENDERITE_INGOT));
    }
}
