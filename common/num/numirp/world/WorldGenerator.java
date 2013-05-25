package num.numirp.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import num.numirp.block.ModBlocks;
import num.numirp.lib.Values;
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
        if(Values.WORLDGEN_RUBY) this.addOre(ModBlocks.blockOres, 0, world, random, x, z, 6, 2, 24, 48); // Ruby
        if(Values.WORLDGEN_GREENSAPPHIRE) this.addOre(ModBlocks.blockOres, 1, world, random, x, z, 6, 2, 24, 48); // GSapphire
        if(Values.WORLDGEN_SAPPHIRE) this.addOre(ModBlocks.blockOres, 2, world, random, x, z, 6, 2, 24, 48); // Sapphire
        if(Values.WORLDGEN_TIN) this.addOre(ModBlocks.blockOres, 3, world, random, x, z, 8, 5, 15, 64); // Tin
        if(Values.WORLDGEN_COPPER) this.addOre(ModBlocks.blockOres, 4, world, random, x, z, 8, 20, 24, 64); // Copper
        if(Values.WORLDGEN_SILVER)  this.addOre(ModBlocks.blockOres, 5, world, random, x, z, 8, 5, 15, 48); // Silver
        if(Values.WORLDGEN_NIKOLITE) this.addOre(ModBlocks.blockOres, 6, world, random, x, z, 8, 10, 0, 16); // Nikolite
        if(Values.WORLDGEN_TUNGSTEN) this.addOre(ModBlocks.blockOres, 7, world, random, x, z, 2, 1, 0, 16); // Tungsten
        if(Values.WORLDGEN_MARBLE) this.addOre(ModBlocks.blockDecor, 0, world, random, x, z, 64, 1, 48, 72); // Marble
        if(Values.WORLDGEN_BASALT) this.addOre(ModBlocks.blockDecor, 1, world, random, x, z, 48, 1, 0, 24); // Basalt
    }

    private void generateNether(World world, Random random, int x, int z) {

    }

    public void addOre(Block block, int meta, World world, Random random,
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