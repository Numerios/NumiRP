package num.numirp.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import num.numirp.lib.BlockIDs;
import num.numirp.lib.Metadata;
import num.numirp.lib.Reference;
import num.numirp.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModBlocks {
    public static Block blockOres, blockStorage, blockDecor, blockLampNormal,
            blockLampNormalActive, blockLampInverted, blockLampInvertedActive;
    public static ItemStack oreSapphire, oreGreenSapphire, oreRuby, oreCopper, oreTin, oreSilver,
            oreNikolite, oreTungsten, blockStorageSapphire, blockStorageGreenSapphire,
            blockStorageRuby, blockStorageCopper, blockStorageTin, blockStorageSilver,
            blockStorageNikolite, blockStorageTungsten, blockMarble, blockBasalt, blockMarbleBrick,
            blockBasaltCobble, blockBasaltBrick, blockBasaltChiseled, blockBasaltPaver,
            blockLampWhite, blockLampOrange, blockLampMagenta, blockLampLBlue, blockLampYellow,
            blockLampLime, blockLampPink, blockLampGray, blockLampLGray, blockLampCyan,
            blockLampPurple, blockLampBlue, blockLampBrown, blockLampGreen, blockLampRed,
            blockLampBlack, blockLampInvertedWhite, blockLampInvertedOrange,
            blockLampInvertedMagenta, blockLampInvertedLBlue, blockLampInvertedYellow,
            blockLampInvertedLime, blockLampInvertedPink, blockLampInvertedGray,
            blockLampInvertedLGray, blockLampInvertedCyan, blockLampInvertedPurple,
            blockLampInvertedBlue, blockLampInvertedBrown, blockLampInvertedGreen,
            blockLampInvertedRed, blockLampInvertedBlack;

    public static void init() {
        blockOres = new BlockOres(BlockIDs.ORES_ID).setUnlocalizedName("blockOres");

        GameRegistry.registerBlock(blockOres, ItemBlockOres.class, Reference.MOD_ID.toLowerCase() + (blockOres.getUnlocalizedName().substring(5)));

        for (int i = 0; i < Strings.ORES.length; i++) {
            LanguageRegistry.addName(new ItemStack(blockOres, 1, i), Strings.ORE_NAMES[i] + " Ore");
        }
        oreRuby = new ItemStack(blockOres, 1, Metadata.RUBY);
        oreGreenSapphire = new ItemStack(blockOres, 1, Metadata.GREENSAPPHIRE);
        oreSapphire = new ItemStack(blockOres, 1, Metadata.SAPPHIRE);
        oreTin = new ItemStack(blockOres, 1, Metadata.TIN);
        oreCopper = new ItemStack(blockOres, 1, Metadata.COPPER);
        oreSilver = new ItemStack(blockOres, 1, Metadata.SILVER);
        oreNikolite = new ItemStack(blockOres, 1, Metadata.NIKOLITE);
        oreTungsten = new ItemStack(blockOres, 1, Metadata.TUNGSTEN);

        OreDictionary.registerOre("oreSapphire", oreSapphire);
        OreDictionary.registerOre("oreGreenSapphire", oreGreenSapphire);
        OreDictionary.registerOre("oreRuby", oreRuby);
        OreDictionary.registerOre("oreCopper", oreCopper);
        OreDictionary.registerOre("oreTin", oreTin);
        OreDictionary.registerOre("oreSilver", oreSilver);
        OreDictionary.registerOre("oreNikolite", oreNikolite);
        OreDictionary.registerOre("oreTungsten", oreTungsten);

        blockStorage = new BlockStorage(BlockIDs.STORAGE_ID).setUnlocalizedName("blockStorage");

        GameRegistry.registerBlock(blockStorage, ItemBlockStorage.class, Reference.MOD_ID.toLowerCase() + (blockStorage.getUnlocalizedName().substring(5)));

        for (int i = 0; i < Strings.ORES.length; i++) {
            LanguageRegistry.addName(new ItemStack(blockStorage, 1, i), Strings.ORE_NAMES[i] + " Storage Block");
        }
        blockStorageRuby = new ItemStack(blockStorage, 1, Metadata.RUBY);
        blockStorageGreenSapphire = new ItemStack(blockStorage, 1, Metadata.GREENSAPPHIRE);
        blockStorageSapphire = new ItemStack(blockStorage, 1, Metadata.SAPPHIRE);
        blockStorageTin = new ItemStack(blockStorage, 1, Metadata.TIN);
        blockStorageCopper = new ItemStack(blockStorage, 1, Metadata.COPPER);
        blockStorageSilver = new ItemStack(blockStorage, 1, Metadata.SILVER);
        blockStorageNikolite = new ItemStack(blockStorage, 1, Metadata.NIKOLITE);
        blockStorageTungsten = new ItemStack(blockStorage, 1, Metadata.TUNGSTEN);

        OreDictionary.registerOre("blockStorageSapphire", blockStorageSapphire);
        OreDictionary.registerOre("blockStorageGreenSapphire", blockStorageGreenSapphire);
        OreDictionary.registerOre("blockStorageRuby", blockStorageRuby);
        OreDictionary.registerOre("blockStorageCopper", blockStorageCopper);
        OreDictionary.registerOre("blockStorageTin", blockStorageTin);
        OreDictionary.registerOre("blockStorageSilver", blockStorageSilver);
        OreDictionary.registerOre("blockStorageNikolite", blockStorageNikolite);
        OreDictionary.registerOre("blockStorageTungsten", blockStorageTungsten);

        blockDecor = new BlockDecor(BlockIDs.DECOR_ID).setUnlocalizedName("blockDecor");

        GameRegistry.registerBlock(blockDecor, ItemBlockDecor.class, Reference.MOD_ID.toLowerCase() + (blockDecor.getUnlocalizedName().substring(5)));

        for (int i = 0; i < Strings.DECOR.length; i++) {
            LanguageRegistry.addName(new ItemStack(blockDecor, 1, i), Strings.DECOR_NAMES[i]);
        }
        blockMarble = new ItemStack(blockDecor, 1, Metadata.MARBLE);
        blockBasalt = new ItemStack(blockDecor, 1, Metadata.BASALT);
        blockMarbleBrick = new ItemStack(blockDecor, 1, Metadata.MARBLEBRICK);
        blockBasaltCobble = new ItemStack(blockDecor, 1, Metadata.BASALTCOBBLE);
        blockBasaltBrick = new ItemStack(blockDecor, 1, Metadata.BASALTBRICK);
        blockBasaltChiseled = new ItemStack(blockDecor, 1, Metadata.BASALTCHISELED);
        blockBasaltPaver = new ItemStack(blockDecor, 1, Metadata.BASALTPAVER);

        blockLampNormal = new BlockLamp(BlockIDs.LAMPS_NORMAL_ID, false, false, BlockIDs.LAMPS_NORMAL_ID, BlockIDs.LAMPS_NORMAL_ACTIVE_ID).setUnlocalizedName("lamp");
        blockLampNormalActive = new BlockLamp(BlockIDs.LAMPS_NORMAL_ACTIVE_ID, true, true, BlockIDs.LAMPS_NORMAL_ID, BlockIDs.LAMPS_NORMAL_ACTIVE_ID).setUnlocalizedName("lampOn");
        blockLampInverted = new BlockLamp(BlockIDs.LAMPS_INVERTED_ID, false, true, BlockIDs.LAMPS_INVERTED_ID, BlockIDs.LAMPS_INVERTED_ACTIVE_ID).setUnlocalizedName("lampInverted");
        blockLampInvertedActive = new BlockLamp(BlockIDs.LAMPS_INVERTED_ACTIVE_ID, true, false, BlockIDs.LAMPS_INVERTED_ID, BlockIDs.LAMPS_INVERTED_ACTIVE_ID).setUnlocalizedName("lampInvertedOn");

        GameRegistry.registerBlock(blockLampNormal, ItemBlockLamp.class, Reference.MOD_ID.toLowerCase() + (blockLampNormal.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(blockLampNormalActive, ItemBlockLamp.class, Reference.MOD_ID.toLowerCase() + (blockLampNormalActive.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(blockLampInverted, ItemBlockLamp.class, Reference.MOD_ID.toLowerCase() + (blockLampInverted.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(blockLampInvertedActive, ItemBlockLamp.class, Reference.MOD_ID.toLowerCase() + (blockLampInvertedActive.getUnlocalizedName().substring(5)));


        for (int i = 0; i < Strings.COLORS.length; i++) {
            LanguageRegistry.addName(new ItemStack(blockLampNormal, 1, i), Strings.COLOR_NAMES[i] + " Lamp");
        }
        for (int i = 0; i < Strings.COLORS.length; i++) {
            LanguageRegistry.addName(new ItemStack(blockLampInverted, 1, i), Strings.COLOR_NAMES[i] + " Inverted Lamp");
        }
        
        blockLampWhite = new ItemStack(blockLampNormal, 1, Metadata.WHITE);
        blockLampOrange = new ItemStack(blockLampNormal, 1, Metadata.ORANGE);
        blockLampMagenta = new ItemStack(blockLampNormal, 1, Metadata.MAGENTA);
        blockLampLBlue = new ItemStack(blockLampNormal, 1, Metadata.LBLUE);
        blockLampYellow = new ItemStack(blockLampNormal, 1, Metadata.YELLOW);
        blockLampLime = new ItemStack(blockLampNormal, 1, Metadata.LIME);
        blockLampPink = new ItemStack(blockLampNormal, 1, Metadata.PINK);
        blockLampGray = new ItemStack(blockLampNormal, 1, Metadata.GRAY);
        blockLampLGray = new ItemStack(blockLampNormal, 1, Metadata.LGRAY);
        blockLampCyan = new ItemStack(blockLampNormal, 1, Metadata.CYAN);
        blockLampPurple = new ItemStack(blockLampNormal, 1, Metadata.PURPLE);
        blockLampBlue = new ItemStack(blockLampNormal, 1, Metadata.BLUE);
        blockLampBrown = new ItemStack(blockLampNormal, 1, Metadata.BROWN);
        blockLampGreen = new ItemStack(blockLampNormal, 1, Metadata.GREEN);
        blockLampRed = new ItemStack(blockLampNormal, 1, Metadata.RED);
        blockLampBlack = new ItemStack(blockLampNormal, 1, Metadata.BLACK);

        blockLampInvertedWhite = new ItemStack(blockLampInverted, 1, Metadata.WHITE);
        blockLampInvertedOrange = new ItemStack(blockLampInverted, 1, Metadata.ORANGE);
        blockLampInvertedMagenta = new ItemStack(blockLampInverted, 1, Metadata.MAGENTA);
        blockLampInvertedLBlue = new ItemStack(blockLampInverted, 1, Metadata.LBLUE);
        blockLampInvertedYellow = new ItemStack(blockLampInverted, 1, Metadata.YELLOW);
        blockLampInvertedLime = new ItemStack(blockLampInverted, 1, Metadata.LIME);
        blockLampInvertedPink = new ItemStack(blockLampInverted, 1, Metadata.PINK);
        blockLampInvertedGray = new ItemStack(blockLampInverted, 1, Metadata.GRAY);
        blockLampInvertedLGray = new ItemStack(blockLampInverted, 1, Metadata.LGRAY);
        blockLampInvertedCyan = new ItemStack(blockLampInverted, 1, Metadata.CYAN);
        blockLampInvertedPurple = new ItemStack(blockLampInverted, 1, Metadata.PURPLE);
        blockLampInvertedBlue = new ItemStack(blockLampInverted, 1, Metadata.BLUE);
        blockLampInvertedBrown = new ItemStack(blockLampInverted, 1, Metadata.BROWN);
        blockLampInvertedGreen = new ItemStack(blockLampInverted, 1, Metadata.GREEN);
        blockLampInvertedRed = new ItemStack(blockLampInverted, 1, Metadata.RED);
        blockLampInvertedBlack = new ItemStack(blockLampInverted, 1, Metadata.BLACK);
    }

}
