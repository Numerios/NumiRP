package num.numirp.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import num.numirp.block.ModBlocks;
import num.numirp.item.ModItems;
import num.numirp.lib.Metadata;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModCrafting {

    public static void init() {
        GameRegistry.addRecipe(ModBlocks.blockStorageRuby, new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.gemRuby });
        GameRegistry.addRecipe(ModBlocks.blockStorageGreenSapphire, new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.gemGreenSapphire });
        GameRegistry.addRecipe(ModBlocks.blockStorageSapphire, new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.gemSapphire });
        GameRegistry.addRecipe(ModBlocks.blockStorageTin, new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.ingotTin });
        GameRegistry.addRecipe(ModBlocks.blockStorageCopper, new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.ingotCopper });
        GameRegistry.addRecipe(ModBlocks.blockStorageSilver, new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.ingotSilver });
        GameRegistry.addRecipe(ModBlocks.blockStorageNikolite, new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.dustNikolite });
        GameRegistry.addRecipe(ModBlocks.blockStorageTungsten, new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.ingotTungsten });
        GameRegistry.addRecipe(ModBlocks.blockStorageRuby, new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.gemRuby });
        GameRegistry.addRecipe(ModBlocks.blockStorageGreenSapphire, new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.gemGreenSapphire });
        GameRegistry.addRecipe(ModBlocks.blockStorageSapphire, new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.gemSapphire });
        GameRegistry.addRecipe(ModBlocks.blockStorageTin, new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.ingotTin });
        GameRegistry.addRecipe(ModBlocks.blockStorageCopper, new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.ingotCopper });
        GameRegistry.addRecipe(ModBlocks.blockStorageSilver, new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.ingotSilver });
        GameRegistry.addRecipe(ModBlocks.blockStorageNikolite, new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.dustNikolite });
        GameRegistry.addRecipe(ModBlocks.blockStorageTungsten, new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.ingotTungsten });
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockDecor, 4, 4), new Object[] { "##", "##", Character.valueOf('#'), ModBlocks.blockBasalt });
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockDecor, 4, 2), new Object[] { "##", "##", Character.valueOf('#'), ModBlocks.blockMarble });
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockDecor, 4, 5), new Object[] { "##", "##", Character.valueOf('#'), ModBlocks.blockBasaltBrick });
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockDecor, 1, 6), new Object[] { "#", Character.valueOf('#'), ModBlocks.blockBasalt });

        // Pickaxes
        GameRegistry.addRecipe(new ItemStack(ModItems.pickaxeRuby), new Object[] { "###", " I ", " I ", Character.valueOf('#'), ModItems.gemRuby, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.pickaxeGreenSapphire), new Object[] { "###", " I ", " I ", Character.valueOf('#'), ModItems.gemGreenSapphire, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.pickaxeSapphire), new Object[] { "###", " I ", " I ", Character.valueOf('#'), ModItems.gemSapphire, Character.valueOf('I'), Item.stick });

        // Shovels
        GameRegistry.addRecipe(new ItemStack(ModItems.shovelRuby), new Object[] { "#", "I", "I", Character.valueOf('#'), ModItems.gemRuby, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.shovelGreenSapphire), new Object[] { "#", "I", "I", Character.valueOf('#'), ModItems.gemGreenSapphire, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.shovelSapphire), new Object[] { "#", "I", "I", Character.valueOf('#'), ModItems.gemSapphire, Character.valueOf('I'), Item.stick });

        // Axes
        GameRegistry.addRecipe(new ItemStack(ModItems.axeRuby), new Object[] { "## ", "#I ", " I ", Character.valueOf('#'), ModItems.gemRuby, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.axeGreenSapphire), new Object[] { "## ", "#I ", " I ", Character.valueOf('#'), ModItems.gemGreenSapphire, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.axeSapphire), new Object[] { "## ", "#I ", " I ", Character.valueOf('#'), ModItems.gemSapphire, Character.valueOf('I'), Item.stick });

        GameRegistry.addRecipe(new ItemStack(ModItems.axeRuby), new Object[] { " ##", " I#", " I ", Character.valueOf('#'), ModItems.gemRuby, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.axeGreenSapphire), new Object[] { " ##", " I#", " I ", Character.valueOf('#'), ModItems.gemGreenSapphire, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.axeSapphire), new Object[] { " ##", " I#", " I ", Character.valueOf('#'), ModItems.gemSapphire, Character.valueOf('I'), Item.stick });

        // Swords
        GameRegistry.addRecipe(new ItemStack(ModItems.swordRuby), new Object[] { "#", "#", "I", Character.valueOf('#'), ModItems.gemRuby, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.swordGreenSapphire), new Object[] { "#", "#", "I", Character.valueOf('#'), ModItems.gemGreenSapphire, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.swordSapphire), new Object[] { "#", "#", "I", Character.valueOf('#'), ModItems.gemSapphire, Character.valueOf('I'), Item.stick });

        // Hoes
        GameRegistry.addRecipe(new ItemStack(ModItems.hoeRuby), new Object[] { "## ", " I ", " I ", Character.valueOf('#'), ModItems.gemRuby, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.hoeGreenSapphire), new Object[] { "## ", " I ", " I ", Character.valueOf('#'), ModItems.gemGreenSapphire, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.hoeSapphire), new Object[] { "## ", " I ", " I ", Character.valueOf('#'), ModItems.gemSapphire, Character.valueOf('I'), Item.stick });

        // Athame
        GameRegistry.addRecipe(new ItemStack(ModItems.athame), new Object[] { " #", "I ", Character.valueOf('#'), ModItems.ingotSilver, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.athame), new Object[] { "# ", " I", Character.valueOf('#'), ModItems.ingotSilver, Character.valueOf('I'), Item.stick });

        // Sickle
        GameRegistry.addRecipe(new ItemStack(ModItems.sickleRuby), new Object[] { " # ", "  #", "I# ", Character.valueOf('#'), ModItems.gemRuby, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.sickleGreenSapphire), new Object[] { " # ", "  #", "I# ", Character.valueOf('#'), ModItems.gemGreenSapphire, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.sickleSapphire), new Object[] { " # ", "  #", "I# ", Character.valueOf('#'), ModItems.gemSapphire, Character.valueOf('I'), Item.stick });

        // Storage Blocks crafting
        GameRegistry.addRecipe(ModBlocks.blockStorageRuby, new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.gemRuby });
        GameRegistry.addRecipe(ModBlocks.blockStorageGreenSapphire, new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.gemGreenSapphire });
        GameRegistry.addRecipe(ModBlocks.blockStorageSapphire, new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.gemSapphire });
        GameRegistry.addRecipe(ModBlocks.blockStorageTin, new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.ingotTin });
        GameRegistry.addRecipe(ModBlocks.blockStorageCopper, new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.ingotCopper });
        GameRegistry.addRecipe(ModBlocks.blockStorageSilver, new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.ingotSilver });
        GameRegistry.addRecipe(ModBlocks.blockStorageNikolite, new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.dustNikolite });
        GameRegistry.addRecipe(ModBlocks.blockStorageTungsten, new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.ingotTungsten });

        // Storage Blocks uncrafting
        GameRegistry.addRecipe(new ItemStack(ModItems.itemProcessed, 9, Metadata.RUBY), new Object[] { "#", Character.valueOf('#'), ModBlocks.blockStorageRuby });
        GameRegistry.addRecipe(new ItemStack(ModItems.itemProcessed, 9, Metadata.GREENSAPPHIRE), new Object[] { "#", Character.valueOf('#'), ModBlocks.blockStorageGreenSapphire });
        GameRegistry.addRecipe(new ItemStack(ModItems.itemProcessed, 9, Metadata.SAPPHIRE), new Object[] { "#", Character.valueOf('#'), ModBlocks.blockStorageSapphire });
        GameRegistry.addRecipe(new ItemStack(ModItems.itemProcessed, 9, Metadata.TIN), new Object[] { "#", Character.valueOf('#'), ModBlocks.blockStorageTin });
        GameRegistry.addRecipe(new ItemStack(ModItems.itemProcessed, 9, Metadata.COPPER), new Object[] { "#", Character.valueOf('#'), ModBlocks.blockStorageCopper });
        GameRegistry.addRecipe(new ItemStack(ModItems.itemProcessed, 9, Metadata.SILVER), new Object[] { "#", Character.valueOf('#'), ModBlocks.blockStorageSilver });
        GameRegistry.addRecipe(new ItemStack(ModItems.itemProcessed, 9, Metadata.NIKOLITE), new Object[] { "#", Character.valueOf('#'), ModBlocks.blockStorageNikolite });
        GameRegistry.addRecipe(new ItemStack(ModItems.itemProcessed, 9, Metadata.TUNGSTEN), new Object[] { "#", Character.valueOf('#'), ModBlocks.blockStorageTungsten });

        // Decor blocks crafting
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockDecor, 4, Metadata.BASALTBRICK), new Object[] { "##", "##", Character.valueOf('#'), ModBlocks.blockBasalt });
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockDecor, 4, Metadata.MARBLEBRICK), new Object[] { "##", "##", Character.valueOf('#'), ModBlocks.blockMarble });
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockDecor, 4, Metadata.BASALTCHISELED), new Object[] { "##", "##", Character.valueOf('#'), ModBlocks.blockBasaltBrick });
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockDecor, 1, Metadata.BASALTPAVER), new Object[] { "#", Character.valueOf('#'), ModBlocks.blockBasalt });

        // Decor blocks uncrafting
        GameRegistry.addRecipe(ModBlocks.blockBasalt, new Object[] { "#", Character.valueOf('#'), ModBlocks.blockBasaltBrick });
        GameRegistry.addRecipe(ModBlocks.blockBasalt, new Object[] { "#", Character.valueOf('#'), ModBlocks.blockBasaltChiseled });
        GameRegistry.addRecipe(ModBlocks.blockBasalt, new Object[] { "#", Character.valueOf('#'), ModBlocks.blockBasaltPaver });
        GameRegistry.addRecipe(ModBlocks.blockMarble, new Object[] { "#", Character.valueOf('#'), ModBlocks.blockMarbleBrick });
    }
}
