package net.elementaldescent.tags;

import net.elementaldescent.ElementalDescent;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.jspecify.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static net.elementaldescent.item.ElementalDescentItemIds.ENDERITE_INGOT;

public class ItemTags extends FabricTagsProvider.ItemTagsProvider {
    public static final TagKey<Item> repairsEnderite = createTag("repairs_enderite");
    public static final TagKey<Item> repairsAmethyst = createTag("repairs_amethyst");
    public static final TagKey<Item> repairsEmerald = createTag("repairs_emerald");
    public static final TagKey<Item> repairsTopaz = createTag("repairs_topaz");
    public static final TagKey<Item> repairsRuby = createTag("repairs_ruby");
    public static final TagKey<Item> repairsSapphire = createTag("repairs_sapphire");
    public static final TagKey<Item> repairsSilver = createTag("repairs_silver");

    public ItemTags(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture, @Nullable BlockTagsProvider blockTagsProvider) {
        super(output, registryLookupFuture, blockTagsProvider);
    }

    private static TagKey<Item> createTag(String name) {
        return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ElementalDescent.MOD_ID, name));
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        builder(repairsEnderite)
                .add(ENDERITE_INGOT);
    }
}
