package num.numirpworld.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import num.numirpworld.lib.BlockIDs;
import num.numirpworld.lib.Reference;
import num.numirpworld.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModBlocks {
    public static Block blockOres, blockStorage;
    public static ItemStack oreSapphire, oreGreenSapphire, oreRuby, oreCopper,
            oreTin, oreSilver, oreNikolite, oreTungsten, blockStorageSapphire,
            blockStorageGreenSapphire, blockStorageRuby, blockStorageCopper,
            blockStorageTin, blockStorageSilver, blockStorageNikolite,
            blockStorageTungsten;

    public static void init() {
        blockOres = new BlockOres(BlockIDs.ORES_ID)
                .setUnlocalizedName("blockOres");

        GameRegistry.registerBlock(
                blockOres,
                ItemBlockOres.class,
                Reference.MOD_ID.toLowerCase()
                        + (blockOres.getUnlocalizedName().substring(5)));

        for (int i = 0; i < Strings.ORES.length; i++) {
            LanguageRegistry.addName(new ItemStack(blockOres, 1, i),
                    Strings.ORE_NAMES[i] + " Ore");
        }

        oreSapphire = new ItemStack(blockOres, 1, 0);
        oreGreenSapphire = new ItemStack(blockOres, 1, 1);
        oreRuby = new ItemStack(blockOres, 1, 2);
        oreCopper = new ItemStack(blockOres, 1, 3);
        oreTin = new ItemStack(blockOres, 1, 4);
        oreSilver = new ItemStack(blockOres, 1, 5);
        oreNikolite = new ItemStack(blockOres, 1, 6);
        oreTungsten = new ItemStack(blockOres, 1, 7);

        OreDictionary.registerOre("oreSapphire", oreSapphire);
        OreDictionary.registerOre("oreGreenSapphire", oreGreenSapphire);
        OreDictionary.registerOre("oreRuby", oreRuby);
        OreDictionary.registerOre("oreCopper", oreCopper);
        OreDictionary.registerOre("oreTin", oreTin);
        OreDictionary.registerOre("oreSilver", oreSilver);
        OreDictionary.registerOre("oreNikolite", oreNikolite);
        OreDictionary.registerOre("oreTungsten", oreTungsten);

        blockStorage = new BlockStorage(BlockIDs.STORAGE_ID)
                .setUnlocalizedName("blockStorage");

        GameRegistry.registerBlock(
                blockStorage,
                ItemBlockStorage.class,
                Reference.MOD_ID.toLowerCase()
                        + (blockStorage.getUnlocalizedName().substring(5)));

        for (int i = 0; i < Strings.ORES.length; i++) {
            LanguageRegistry.addName(new ItemStack(blockStorage, 1, i),
                    Strings.ORE_NAMES[i] + " Storage Block");
        }

        blockStorageSapphire = new ItemStack(blockStorage, 1, 0);
        blockStorageGreenSapphire = new ItemStack(blockStorage, 1, 1);
        blockStorageRuby = new ItemStack(blockStorage, 1, 2);
        blockStorageCopper = new ItemStack(blockStorage, 1, 3);
        blockStorageTin = new ItemStack(blockStorage, 1, 4);
        blockStorageSilver = new ItemStack(blockStorage, 1, 5);
        blockStorageNikolite = new ItemStack(blockStorage, 1, 6);
        blockStorageTungsten = new ItemStack(blockStorage, 1, 7);
        
        OreDictionary.registerOre("blockStorageSapphire", blockStorageSapphire);
        OreDictionary.registerOre("blockStorageGreenSapphire", blockStorageGreenSapphire);
        OreDictionary.registerOre("blockStorageRuby", blockStorageRuby);
        OreDictionary.registerOre("blockStorageCopper", blockStorageCopper);
        OreDictionary.registerOre("blockStorageTin", blockStorageTin);
        OreDictionary.registerOre("blockStorageSilver", blockStorageSilver);
        OreDictionary.registerOre("blockStorageNikolite", blockStorageNikolite);
        OreDictionary.registerOre("blockStorageTungsten", blockStorageTungsten);

    }

}
