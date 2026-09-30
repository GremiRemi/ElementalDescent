package net.elementaldescent.tags;


import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.tags.TagAppender;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class BlockTags extends FabricTagsProvider.BlockTagsProvider {

    public static final TagKey<Block> sculkStoneReplaceables = createTag("sculk_stone_replaceables");

    public BlockTags(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
    }

    protected TagAppender<Block, Block> valueLookupBuilder(TagKey<Block> tag) {
        valueLookupBuilder(sculkStoneReplaceables)
                .add(Ores.PURE_AMETHYST_ORE)
                .add(Ores.PURE_EMERALD_ORE)
                .add(Ores.PURE_OPAL_ORE)
                .add(Ores.PURE_RUBY_ORE)
                .add(Ores.PURE_SAPPHIRE_ORE);
        return super.valueLookupBuilder(tag);
    }


    private static TagKey<Block> createTag(String name) {
        return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(ElementalMod.MOD_ID, name));
    }
}
