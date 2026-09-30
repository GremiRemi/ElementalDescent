package net.elementaldescent.mixin;

import net.elementaldescent.mixin.EndCityStructureAccessor;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelHeightAccessor;
import net.minecraft.world.level.NoiseColumn;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.structures.EndCityStructure;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Mixin(EndCityStructure.class)
public class EndCityStructureMixin {

    @Inject(method = "findGenerationPoint", at = @At("HEAD"), cancellable = true)
    private void findGenerationPoint(Structure.GenerationContext context,
                                     CallbackInfoReturnable<Optional<Structure.GenerationStub>> cir) {
        Rotation rotation = Rotation.getRandom(context.random());

        // Get the X/Z position vanilla would use
        BlockPos basePos = ((StructureAccessor)(Object)this)
                .invokeGetLowestYIn5by5BoxOffset7Blocks(context, rotation);
        int x = basePos.getX();
        int z = basePos.getZ();

        // Check each layer for end stone at that X/Z
        List<BlockPos> validPositions = new ArrayList<>();

        // Sample the chunk generator's column at this X/Z
        NoiseColumn column = context.chunkGenerator()
                .getBaseColumn(x, z, context.heightAccessor(), context.randomState());

        // Layer 1 — check near Y=65
        if (hasEndStoneNear(column, 10, 40, context.heightAccessor())) {
            int surfaceY = getSurfaceY(column, 10, 40, context.heightAccessor());
            validPositions.add(new BlockPos(x, surfaceY, z));
        }

        // Layer 2 — check near Y=130
        if (hasEndStoneNear(column, 75, 105, context.heightAccessor())) {
            int surfaceY = getSurfaceY(column, 75, 105, context.heightAccessor());
            validPositions.add(new BlockPos(x, surfaceY, z));
        }

        // Layer 3 — check near Y=195
        if (hasEndStoneNear(column, 140, 170, context.heightAccessor())) {
            int surfaceY = getSurfaceY(column, 140, 170, context.heightAccessor());
            validPositions.add(new BlockPos(x, surfaceY, z));
        }

        // No valid layers found — skip this location
        if (validPositions.isEmpty()) {
            cir.setReturnValue(Optional.empty());
            return;
        }

        // Pick randomly from valid layers
        BlockPos chosenPos = validPositions.get(context.random().nextInt(validPositions.size()));

        EndCityStructureAccessor accessor = (EndCityStructureAccessor)(Object)this;
        cir.setReturnValue(Optional.of(new Structure.GenerationStub(chosenPos,
                builder -> accessor.invokeGeneratePieces(builder, chosenPos, rotation, context))));
    }

    // Check if any block in the Y range is end stone
    private boolean hasEndStoneNear(NoiseColumn column, int minY, int maxY,
                                    LevelHeightAccessor heightAccessor) {
        for (int y = minY; y <= maxY; y++) {
            if (y < heightAccessor.getMinY() || y >= heightAccessor.getMaxY()) continue;
            if (column.getBlock(y).is(Blocks.END_STONE)) {
                return true;
            }
        }
        return false;
    }

    // Find the highest end stone Y in the range — this is the surface to place on
    private int getSurfaceY(NoiseColumn column, int minY, int maxY,
                            LevelHeightAccessor heightAccessor) {
        for (int y = maxY; y >= minY; y--) {
            if (y < heightAccessor.getMinY() || y >= heightAccessor.getMaxY()) continue;
            if (column.getBlock(y).is(Blocks.END_STONE)) {
                return y + 1; // +1 so the city sits on top of the surface block
            }
        }
        return minY;
    }
}