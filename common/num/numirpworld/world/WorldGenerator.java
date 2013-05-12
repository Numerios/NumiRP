package num.numirpworld.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import num.numirpworld.block.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenerator implements IWorldGenerator {
    public static WorldGenerator instance = new WorldGenerator();

    public void generate(Random random, int chunkX, int chunkZ, World world,
            IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId) {
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
        }
    }

    private void generateEnd(World world, Random random, int x, int z) {

    }

    private void generateSurface(World world, Random random, int x, int z) {
        // test gen
        this.addOreSpawn(ModBlocks.blockOres, 0, world, random, x, z, 4, 5, 15,
                64);
    }

    private void generateNether(World world, Random random, int x, int z) {

    }

    public void addOreSpawn(Block block, int meta, World world, Random random,
            int blockXPos, int blockZPos, int clusterSize, int spawnChances,
            int minY, int maxY) {
        for (int x = 0; x < spawnChances; x++) {
            int posX = blockXPos + random.nextInt(16);
            int posY = minY + random.nextInt(maxY - minY);
            int posZ = blockZPos + random.nextInt(16);
            (new WorldGenMinable(block.blockID, meta, clusterSize,
                    Block.stone.blockID)).generate(world, random, posX, posY,
                    posZ);
        }
    }
}