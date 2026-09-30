package net.elementaldescent.world.gen.chunk_generator;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.WorldGenRegion;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.LevelHeightAccessor;
import net.minecraft.world.level.NoiseColumn;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.biome.BiomeManager;
import net.minecraft.world.level.biome.BiomeSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.RandomState;
import net.minecraft.world.level.levelgen.blending.Blender;
import net.minecraft.world.level.levelgen.synth.PerlinSimplexNoise;
import org.joml.SimplexNoise;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class LayeredEndChunkGenerator extends ChunkGenerator {
    public static final MapCodec<LayeredEndChunkGenerator> CODEC = RecordCodecBuilder.mapCodec(instance ->
            instance.group(
                    BiomeSource.CODEC.fieldOf("biome_source").forGetter(ChunkGenerator::getBiomeSource)
            ).apply(instance, LayeredEndChunkGenerator::new)
    );

    private static final int CENTRAL_ISLAND_RADIUS = 200;
    private static final int OUTER_ISLAND_RADIUS = 700;
    private static final int OUTER_ISLAND_DECAY = 50;

    private static final int LAYER1_MIN = 10;
    private static final int LAYER1_MAX = 40;
    private static final int LAYER2_MIN = 75;
    private static final int LAYER2_MAX = 105;
    private static final int LAYER3_MIN = 140;
    private static final int LAYER3_MAX = 170;

    private static final int WORLD_BOTTOM = 0;
    private static final int WORLD_TOP = 256;

    private final PerlinSimplexNoise layer1Noise;
    private final PerlinSimplexNoise layer2Noise;
    private final PerlinSimplexNoise layer3Noise;
    private final SimplexNoise centralIslandNoise;

    public LayeredEndChunkGenerator(BiomeSource biomeSource) {
        super(biomeSource);
        this.layer1Noise = new PerlinSimplexNoise(RandomSource.create(5678L), List.of(-3, -2, -1, 0));
        this.layer2Noise = new PerlinSimplexNoise(RandomSource.create(1234L), List.of(-3, -2, -1, 0));
        this.layer3Noise = new PerlinSimplexNoise(RandomSource.create(9012L), List.of(-3, -2, -1, 0));
        this.centralIslandNoise = new SimplexNoise();
    }

    @Override
    protected MapCodec<? extends ChunkGenerator> codec() {
        return CODEC;
    }

    @Override
    public void applyCarvers(WorldGenRegion worldGenRegion, long l, RandomState randomState, BiomeManager biomeManager, StructureManager structureManager, ChunkAccess chunkAccess) {

    }

    @Override
    public void buildSurface(WorldGenRegion worldGenRegion, StructureManager structureManager,
                             RandomState randomState, ChunkAccess chunkAccess) {
        ChunkPos chunkPos = chunkAccess.getPos();
        int minBlockX = chunkPos.getMinBlockX();
        int minBlockZ = chunkPos.getMinBlockZ();

        for (int localX = 0; localX < 16; localX++) {
            for (int localZ = 0; localZ < 16; localZ++) {
                int worldX = minBlockX + localX;
                int worldZ = minBlockZ + localZ;

                // Find the top block of each layer and mark it as the surface
                // by checking downward from each layer max
                for (int layerMax : new int[]{LAYER3_MAX, LAYER2_MAX, LAYER1_MAX}) {
                    for (int y = layerMax; y >= WORLD_BOTTOM; y--) {
                        BlockPos pos = new BlockPos(localX, y, localZ);
                        if (chunkAccess.getBlockState(pos).is(Blocks.END_STONE)) {
                            // Top block found — heightmap is updated automatically
                            // by setBlockState so nothing extra needed here
                            break;
                        }
                    }
                }
            }
        }
    }

    public CompletableFuture<ChunkAccess> fillFromNoise(
            Blender blender, RandomState randomState,
            StructureManager structureManager, ChunkAccess chunkAccess) {

        ChunkPos chunkPos = chunkAccess.getPos();
        int minBlockX = chunkPos.getMinBlockX();
        int minBlockZ = chunkPos.getMinBlockZ();

        for (int localX = 0; localX < 16; localX++) {
            for (int localZ = 0; localZ < 16; localZ++) {
                int worldX = minBlockX + localX;
                int worldZ = minBlockZ + localZ;
                generateColumn(chunkAccess, worldX, worldZ, localX, localZ);
            }
        }

        return CompletableFuture.completedFuture(chunkAccess);
    }

    private void generateColumn(ChunkAccess chunk, int worldX, int worldZ, int localX, int localZ) {
        double distFromCenter = Math.sqrt((double)(worldX * worldX + worldZ * worldZ));

        if (distFromCenter < CENTRAL_ISLAND_RADIUS) {
            generateCentralIsland(chunk, worldX, worldZ, localX, localZ, distFromCenter);
        } else {
            generateOuterLayers(chunk, worldX, worldZ, localX, localZ);
        }
    }

    private void generateOuterLayers(ChunkAccess chunk, int worldX, int worldZ,
                                     int localX, int localZ) {
        double layer1Signal = getIslandSignal(worldX, worldZ, layer1Noise, 1.3, 60.0);
        double layer2Signal = getIslandSignal(worldX, worldZ, layer2Noise, 1.3, 60.0);
        double layer3Signal = getIslandSignal(worldX, worldZ, layer3Noise, 1.3, 60.0);

        placeLayerBlocks(chunk, localX, localZ, worldX, worldZ,
                layer1Signal, (LAYER1_MIN + LAYER1_MAX) / 2,  LAYER1_MIN, LAYER1_MAX, layer1Noise);
        placeLayerBlocks(chunk, localX, localZ, worldX, worldZ,
                layer2Signal, (LAYER2_MIN + LAYER2_MAX) / 2, LAYER2_MIN, LAYER2_MAX, layer2Noise);
        placeLayerBlocks(chunk, localX, localZ, worldX, worldZ,
                layer3Signal, (LAYER3_MIN + LAYER3_MAX) / 2, LAYER3_MIN, LAYER3_MAX, layer3Noise);
    }

    private void placeLayerBlocks(ChunkAccess chunk, int localX, int localZ,
                                  int worldX, int worldZ, double signal,
                                  int centerY, int minY, int maxY,
                                  PerlinSimplexNoise noise) {
        if (signal <= 0.1) return;

        for (int y = minY; y <= maxY; y++) {
            double verticalDist = Math.abs(y - centerY) / (double)(maxY - centerY);
            double verticalFalloff = 1.0 - (verticalDist * verticalDist);

            double yOffset = y * 0.05;

            double density = noise.getValue(
                    worldX / 120.0 + yOffset,
                    worldZ / 120.0 + yOffset,
                    false
            );

            double erosion = noise.getValue(
                    worldX / 40.0 + yOffset * 2.0 + 100.0,
                    worldZ / 40.0 + yOffset * 2.0 + 100.0,
                    false
            );

            double combined = signal * verticalFalloff
                    + density * 0.3
                    + erosion * (1.0 - verticalFalloff) * 0.4;

            if (combined > 0.35) {
                chunk.setBlockState(new BlockPos(localX, y, localZ),
                        Blocks.END_STONE.defaultBlockState(), 0);
            }
        }
    }

    private void generateCentralIsland(ChunkAccess chunk, int worldX, int worldZ,
                                       int localX, int localZ, double distFromCenter) {
        // Steeper falloff — stays positive only within ~100 blocks
        double islandSignal = 4.0 - (distFromCenter / 25.0)
                + centralIslandNoise.getValue(worldX * 0.02, worldZ * 0.02);

        if (islandSignal > 0.0) {
            int islandTop    = 64 + (int)(islandSignal * 2);
            int islandBottom = 55 - (int)(islandSignal * 2);
            for (int y = islandBottom; y <= islandTop; y++) {
                chunk.setBlockState(new BlockPos(localX, y, localZ),
                        Blocks.END_STONE.defaultBlockState(), 0);
            }
        }
    }

    private double getIslandSignal(int x, int z, PerlinSimplexNoise noise, double scale, double spread) {
        double dist = Math.sqrt((double)(x * x + z * z));

        // Below 750 = no islands, 750-800 = rapid decay, above 800 = full strength
        if (dist < OUTER_ISLAND_RADIUS) return 0.0;

        double decay = Math.min(1.0, (dist - OUTER_ISLAND_RADIUS) / OUTER_ISLAND_DECAY);

        return noise.getValue(x / spread * scale, z / spread * scale, false) * decay;
    }

    @Override
    public void spawnOriginalMobs(WorldGenRegion worldGenRegion) {

    }

    @Override
    public int getGenDepth() {
        return WORLD_TOP;
    }

    @Override
    public int getSeaLevel() {
        return 0;
    }

    @Override
    public int getMinY() {
        return WORLD_BOTTOM;
    }

    @Override
    public int getBaseHeight(int x, int z, Heightmap.Types types,
                             LevelHeightAccessor levelHeightAccessor,
                             RandomState randomState) {
        // Return the highest layer max as the surface height
        // Structure placement will project down to find actual terrain
        return LAYER3_MAX;
    }

    @Override
    public NoiseColumn getBaseColumn(int x, int z,
                                     LevelHeightAccessor levelHeightAccessor,
                                     RandomState randomState) {
        BlockState[] states = new BlockState[levelHeightAccessor.getHeight()];
        java.util.Arrays.fill(states, Blocks.AIR.defaultBlockState());

        double distFromCenter = Math.sqrt((double)(x * x + z * z));

        if (distFromCenter < CENTRAL_ISLAND_RADIUS) {
            double islandSignal = 4.0 - (distFromCenter / 25.0)
                    + centralIslandNoise.getValue(x * 0.02, z * 0.02);
            if (islandSignal > 0.0) {
                int top = 64 + (int)(islandSignal * 2);
                int bottom = 55 - (int)(islandSignal * 2);
                fillRange(states, bottom, top, levelHeightAccessor);
            }
        } else {
            double l1 = getIslandSignal(x, z, layer1Noise, 1.3, 60.0);
            double l2 = getIslandSignal(x, z, layer2Noise, 1.3, 60.0);
            double l3 = getIslandSignal(x, z, layer3Noise, 1.3, 60.0);

            // Use exact same logic as placeLayerBlocks for each layer
            simulateLayer(states, x, z, l1, (LAYER1_MIN + LAYER1_MAX) / 2, LAYER1_MIN, LAYER1_MAX, layer1Noise, levelHeightAccessor);
            simulateLayer(states, x, z, l2, (LAYER2_MIN + LAYER2_MAX) / 2, LAYER2_MIN, LAYER2_MAX, layer2Noise, levelHeightAccessor);
            simulateLayer(states, x, z, l3, (LAYER3_MIN + LAYER3_MAX) / 2, LAYER3_MIN, LAYER3_MAX, layer3Noise, levelHeightAccessor);
        }

        return new NoiseColumn(levelHeightAccessor.getMinY(), states);
    }

    private void simulateLayer(BlockState[] states, int x, int z, double signal,
                               int centerY, int minY, int maxY,
                               PerlinSimplexNoise noise,
                               LevelHeightAccessor heightAccessor) {
        if (signal <= 0.1) return;

        for (int y = minY; y <= maxY; y++) {
            double verticalDist = Math.abs(y - centerY) / (double)(maxY - centerY);
            double verticalFalloff = 1.0 - (verticalDist * verticalDist);

            double yOffset = y * 0.05;

            double density = noise.getValue(
                    x / 120.0 + yOffset,
                    z / 120.0 + yOffset,
                    false
            );

            double erosion = noise.getValue(
                    x / 40.0 + yOffset * 2.0 + 100.0,
                    z / 40.0 + yOffset * 2.0 + 100.0,
                    false
            );

            double combined = signal * verticalFalloff
                    + density * 0.3
                    + erosion * (1.0 - verticalFalloff) * 0.4;

            if (combined > 0.35) {
                int idx = y - heightAccessor.getMinY();
                if (idx >= 0 && idx < states.length) {
                    states[idx] = Blocks.END_STONE.defaultBlockState();
                }
            }
        }
    }

    private void fillRange(BlockState[] states, int minY, int maxY,
                           LevelHeightAccessor heightAccessor) {
        for (int y = minY; y <= maxY; y++) {
            int idx = y - heightAccessor.getMinY();
            if (idx >= 0 && idx < states.length) {
                states[idx] = Blocks.END_STONE.defaultBlockState();
            }
        }
    }

    @Override
    public void addDebugScreenInfo(List<String> list, RandomState randomState, BlockPos blockPos) {

    }
}