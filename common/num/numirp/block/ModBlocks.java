package num.numirp.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import num.numirp.lib.BlockIDs;
import num.numirp.lib.Reference;
import num.numirp.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModBlocks {
    public static Block blockOres, blockStorage, blockDecor;
    public static ItemStack oreSapphire, oreGreenSapphire, oreRuby, oreCopper,
            oreTin, oreSilver, oreNikolite, oreTungsten, blockStorageSapphire,
            blockStorageGreenSapphire, blockStorageRuby, blockStorageCopper,
            blockStorageTin, blockStorageSilver, blockStorageNikolite,
            blockStorageTungsten, blockMarble, blockBasalt, blockMarbleBrick,
            blockBasaltCobble, blockBasaltBrick, blockBasaltChiseled,
            blockBasaltPaver;

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
        oreRuby = new ItemStack(blockOres, 1, 0);
        oreSapphire = new ItemStack(blockOres, 1, 1);
        oreGreenSapphire = new ItemStack(blockOres, 1, 2);
        oreTin = new ItemStack(blockOres, 1, 3);
        oreCopper = new ItemStack(blockOres, 1, 4);
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
        blockStorageRuby = new ItemStack(blockStorage, 1, 0);
        blockStorageGreenSapphire = new ItemStack(blockStorage, 1, 1);
        blockStorageSapphire = new ItemStack(blockStorage, 1, 2);
        blockStorageTin = new ItemStack(blockStorage, 1, 3);
        blockStorageCopper = new ItemStack(blockStorage, 1, 4);
        blockStorageSilver = new ItemStack(blockStorage, 1, 5);
        blockStorageNikolite = new ItemStack(blockStorage, 1, 6);
        blockStorageTungsten = new ItemStack(blockStorage, 1, 7);

        OreDictionary.registerOre("blockStorageSapphire", blockStorageSapphire);
        OreDictionary.registerOre("blockStorageGreenSapphire",
                blockStorageGreenSapphire);
        OreDictionary.registerOre("blockStorageRuby", blockStorageRuby);
        OreDictionary.registerOre("blockStorageCopper", blockStorageCopper);
        OreDictionary.registerOre("blockStorageTin", blockStorageTin);
        OreDictionary.registerOre("blockStorageSilver", blockStorageSilver);
        OreDictionary.registerOre("blockStorageNikolite", blockStorageNikolite);
        OreDictionary.registerOre("blockStorageTungsten", blockStorageTungsten);

        blockDecor = new BlockDecor(BlockIDs.DECOR_ID)
                .setUnlocalizedName("blockDecor");

        GameRegistry.registerBlock(
                blockDecor,
                ItemBlockDecor.class,
                Reference.MOD_ID.toLowerCase()
                        + (blockDecor.getUnlocalizedName().substring(5)));

        for (int i = 0; i < Strings.DECOR.length; i++) {
            LanguageRegistry.addName(new ItemStack(blockDecor, 1, i),
                    Strings.DECOR_NAMES[i]);
        }
        blockMarble = new ItemStack(blockDecor, 1, 0);
        blockBasalt = new ItemStack(blockDecor, 1, 1);
        blockMarbleBrick = new ItemStack(blockDecor, 1, 2);
        blockBasaltCobble = new ItemStack(blockDecor, 1, 3);
        blockBasaltBrick = new ItemStack(blockDecor, 1, 4);
        blockBasaltChiseled = new ItemStack(blockDecor, 1, 5);
        blockBasaltPaver = new ItemStack(blockDecor, 1, 6);
    }

}
