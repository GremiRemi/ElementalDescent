// src/main/java/com/yourmod/mixin/accessor/StructureAccessor.java
package net.elementaldescent.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.structure.Structure;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(Structure.class)
public interface StructureAccessor {
    @Invoker("getLowestYIn5by5BoxOffset7Blocks")
    BlockPos invokeGetLowestYIn5by5BoxOffset7Blocks(Structure.GenerationContext context, Rotation rotation);
}