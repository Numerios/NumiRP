package num.numirp.world;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import num.numirp.block.ModBlocks;
import num.numirp.lib.Metadata;
import num.numirp.lib.Module;
import num.numirp.lib.WorldGen;

import java.util.Random;

public class WorldGenerator implements IWorldGenerator {
    public static WorldGenerator instance = new WorldGenerator();

    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
                         IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId) {
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
            default:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
        }
    }

    private void generateEnd(World world, Random random, int x, int z) {

    }

    private void generateSurface(World world, Random random, int x, int z) {
        if (Module.ORES) {
            if (WorldGen.WORLDGEN_RUBY)
                this.addOre(ModBlocks.blockOres, Metadata.RUBY, world, random, x, z, 6, 2, 24, 48);
            if (WorldGen.WORLDGEN_GREENSAPPHIRE)
                this.addOre(ModBlocks.blockOres, Metadata.GREENSAPPHIRE, world, random, x, z, 6, 2, 24, 48);
            if (WorldGen.WORLDGEN_SAPPHIRE)
                this.addOre(ModBlocks.blockOres, Metadata.SAPPHIRE, world, random, x, z, 6, 2, 24, 48);
            if (WorldGen.WORLDGEN_TIN)
                this.addOre(ModBlocks.blockOres, Metadata.TIN, world, random, x, z, 8, 5, 15, 64);
            if (WorldGen.WORLDGEN_COPPER)
                this.addOre(ModBlocks.blockOres, Metadata.COPPER, world, random, x, z, 8, 20, 24, 64);
            if (WorldGen.WORLDGEN_SILVER)
                this.addOre(ModBlocks.blockOres, Metadata.SILVER, world, random, x, z, 8, 5, 15, 48);
            if (WorldGen.WORLDGEN_NIKOLITE)
                this.addOre(ModBlocks.blockOres, Metadata.NIKOLITE, world, random, x, z, 8, 10, 0, 16);
            if (WorldGen.WORLDGEN_TUNGSTEN)
                this.addOre(ModBlocks.blockOres, Metadata.TUNGSTEN, world, random, x, z, 2, 1, 0, 16);
        }
        if (Module.DECOR) {
            if (WorldGen.WORLDGEN_MARBLE)
                this.addOre(ModBlocks.blockDecor, Metadata.MARBLE, world, random, x, z, 40, 1, 48, 72);
            if (WorldGen.WORLDGEN_BASALT)
                this.addOre(ModBlocks.blockDecor, Metadata.BASALT, world, random, x, z, 20, 1, 0, 24);
        }
    }

    private void generateNether(World world, Random random, int x, int z) {

    }

    public void addOre(Block block, int meta, World world, Random random, int blockXPos, int blockZPos,
                       int clusterSize, int spawnChances, int minY, int maxY) {
        for (int x = 0; x < spawnChances; x++) {
            int posX = blockXPos + random.nextInt(16);
            int posY = minY + random.nextInt(maxY - minY);
            int posZ = blockZPos + random.nextInt(16);
            (new WorldGenMinable(block.blockID, meta, clusterSize, Block.stone.blockID)).generate(world, random, posX,
                    posY, posZ);
        }
    }
}
