// src/main/java/com/yourmod/mixin/accessor/EndCityStructureAccessor.java
package net.elementaldescent.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder;
import net.minecraft.world.level.levelgen.structure.structures.EndCityStructure;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(EndCityStructure.class)
public interface EndCityStructureAccessor {
    @Invoker("generatePieces")
    void invokeGeneratePieces(StructurePiecesBuilder builder, BlockPos pos,
                              Rotation rotation, Structure.GenerationContext context);
}