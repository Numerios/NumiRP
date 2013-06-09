package num.numirp.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import num.numirp.block.ModBlocks;
import num.numirp.item.ModItems;
import num.numirp.lib.Metadata;
import num.numirp.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModCrafting {

    public static void init() {
        // Storage Blocks crafting
        GameRegistry.addRecipe(ModBlocks.blockStorageRuby, new Object[] { "###", "###", "###", Character.valueOf('#'),
                ModItems.gemRuby });
        GameRegistry.addRecipe(ModBlocks.blockStorageGreenSapphire,
                new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.gemGreenSapphire });
        GameRegistry.addRecipe(ModBlocks.blockStorageSapphire,
                new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.gemSapphire });
        GameRegistry.addRecipe(ModBlocks.blockStorageTin, new Object[] { "###", "###", "###", Character.valueOf('#'),
                ModItems.ingotTin });
        GameRegistry.addRecipe(ModBlocks.blockStorageCopper, new Object[] { "###", "###", "###",
                Character.valueOf('#'), ModItems.ingotCopper });
        GameRegistry.addRecipe(ModBlocks.blockStorageSilver, new Object[] { "###", "###", "###",
                Character.valueOf('#'), ModItems.ingotSilver });
        GameRegistry.addRecipe(ModBlocks.blockStorageNikolite,
                new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.dustNikolite });
        GameRegistry.addRecipe(ModBlocks.blockStorageTungsten,
                new Object[] { "###", "###", "###", Character.valueOf('#'), ModItems.ingotTungsten });

        // Storage Blocks uncrafting
        GameRegistry.addRecipe(new ItemStack(ModItems.itemProcessed, 9, Metadata.RUBY),
                new Object[] { "#", Character.valueOf('#'), ModBlocks.blockStorageRuby });
        GameRegistry.addRecipe(new ItemStack(ModItems.itemProcessed, 9, Metadata.GREENSAPPHIRE), new Object[] { "#",
                Character.valueOf('#'), ModBlocks.blockStorageGreenSapphire });
        GameRegistry.addRecipe(new ItemStack(ModItems.itemProcessed, 9, Metadata.SAPPHIRE), new Object[] { "#",
                Character.valueOf('#'), ModBlocks.blockStorageSapphire });
        GameRegistry.addRecipe(new ItemStack(ModItems.itemProcessed, 9, Metadata.TIN),
                new Object[] { "#", Character.valueOf('#'), ModBlocks.blockStorageTin });
        GameRegistry.addRecipe(new ItemStack(ModItems.itemProcessed, 9, Metadata.COPPER),
                new Object[] { "#", Character.valueOf('#'), ModBlocks.blockStorageCopper });
        GameRegistry.addRecipe(new ItemStack(ModItems.itemProcessed, 9, Metadata.SILVER),
                new Object[] { "#", Character.valueOf('#'), ModBlocks.blockStorageSilver });
        GameRegistry.addRecipe(new ItemStack(ModItems.itemProcessed, 9, Metadata.NIKOLITE), new Object[] { "#",
                Character.valueOf('#'), ModBlocks.blockStorageNikolite });
        GameRegistry.addRecipe(new ItemStack(ModItems.itemProcessed, 9, Metadata.TUNGSTEN), new Object[] { "#",
                Character.valueOf('#'), ModBlocks.blockStorageTungsten });

        // Decor blocks crafting
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockDecor, 4, Metadata.BASALTBRICK), new Object[] { "##", "##",
                Character.valueOf('#'), ModBlocks.blockBasalt });
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockDecor, 4, Metadata.MARBLEBRICK), new Object[] { "##", "##",
                Character.valueOf('#'), ModBlocks.blockMarble });
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockDecor, 4, Metadata.BASALTCHISELED), new Object[] { "##",
                "##", Character.valueOf('#'), ModBlocks.blockBasaltBrick });
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockDecor, 1, Metadata.BASALTPAVER), new Object[] { "#",
                Character.valueOf('#'), ModBlocks.blockBasalt });

        // Decor blocks uncrafting
        GameRegistry.addRecipe(ModBlocks.blockBasalt, new Object[] { "#", Character.valueOf('#'),
                ModBlocks.blockBasaltBrick });
        GameRegistry.addRecipe(ModBlocks.blockBasalt, new Object[] { "#", Character.valueOf('#'),
                ModBlocks.blockBasaltChiseled });
        GameRegistry.addRecipe(ModBlocks.blockBasalt, new Object[] { "#", Character.valueOf('#'),
                ModBlocks.blockBasaltPaver });
        GameRegistry.addRecipe(ModBlocks.blockMarble, new Object[] { "#", Character.valueOf('#'),
                ModBlocks.blockMarbleBrick });

        // Pickaxes
        GameRegistry.addRecipe(new ItemStack(ModItems.pickaxeRuby),
                new Object[] { "###", " I ", " I ", Character.valueOf('#'), ModItems.gemRuby, Character.valueOf('I'),
                        Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.pickaxeGreenSapphire), new Object[] { "###", " I ", " I ",
                Character.valueOf('#'), ModItems.gemGreenSapphire, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(
                new ItemStack(ModItems.pickaxeSapphire),
                new Object[] { "###", " I ", " I ", Character.valueOf('#'), ModItems.gemSapphire,
                        Character.valueOf('I'), Item.stick });

        // Shovels
        GameRegistry.addRecipe(new ItemStack(ModItems.shovelRuby), new Object[] { "#", "I", "I",
                Character.valueOf('#'), ModItems.gemRuby, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.shovelGreenSapphire),
                new Object[] { "#", "I", "I", Character.valueOf('#'), ModItems.gemGreenSapphire,
                        Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.shovelSapphire),
                new Object[] { "#", "I", "I", Character.valueOf('#'), ModItems.gemSapphire, Character.valueOf('I'),
                        Item.stick });

        // Axes
        GameRegistry.addRecipe(new ItemStack(ModItems.axeRuby),
                new Object[] { "## ", "#I ", " I ", Character.valueOf('#'), ModItems.gemRuby, Character.valueOf('I'),
                        Item.stick });
        GameRegistry.addRecipe(
                new ItemStack(ModItems.axeGreenSapphire),
                new Object[] { "## ", "#I ", " I ", Character.valueOf('#'), ModItems.gemGreenSapphire,
                        Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(
                new ItemStack(ModItems.axeSapphire),
                new Object[] { "## ", "#I ", " I ", Character.valueOf('#'), ModItems.gemSapphire,
                        Character.valueOf('I'), Item.stick });

        GameRegistry.addRecipe(new ItemStack(ModItems.axeRuby),
                new Object[] { " ##", " I#", " I ", Character.valueOf('#'), ModItems.gemRuby, Character.valueOf('I'),
                        Item.stick });
        GameRegistry.addRecipe(
                new ItemStack(ModItems.axeGreenSapphire),
                new Object[] { " ##", " I#", " I ", Character.valueOf('#'), ModItems.gemGreenSapphire,
                        Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(
                new ItemStack(ModItems.axeSapphire),
                new Object[] { " ##", " I#", " I ", Character.valueOf('#'), ModItems.gemSapphire,
                        Character.valueOf('I'), Item.stick });

        // Swords
        GameRegistry.addRecipe(new ItemStack(ModItems.swordRuby), new Object[] { "#", "#", "I", Character.valueOf('#'),
                ModItems.gemRuby, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.swordGreenSapphire),
                new Object[] { "#", "#", "I", Character.valueOf('#'), ModItems.gemGreenSapphire,
                        Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.swordSapphire),
                new Object[] { "#", "#", "I", Character.valueOf('#'), ModItems.gemSapphire, Character.valueOf('I'),
                        Item.stick });

        // Hoes
        GameRegistry.addRecipe(new ItemStack(ModItems.hoeRuby),
                new Object[] { "## ", " I ", " I ", Character.valueOf('#'), ModItems.gemRuby, Character.valueOf('I'),
                        Item.stick });
        GameRegistry.addRecipe(
                new ItemStack(ModItems.hoeGreenSapphire),
                new Object[] { "## ", " I ", " I ", Character.valueOf('#'), ModItems.gemGreenSapphire,
                        Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(
                new ItemStack(ModItems.hoeSapphire),
                new Object[] { "## ", " I ", " I ", Character.valueOf('#'), ModItems.gemSapphire,
                        Character.valueOf('I'), Item.stick });

        // Sickle
        GameRegistry.addRecipe(new ItemStack(ModItems.sickleWooden),
                new Object[] { " # ", "  #", "I# ", Character.valueOf('#'), Block.planks, Character.valueOf('I'),
                        Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.sickleStone),
                new Object[] { " # ", "  #", "I# ", Character.valueOf('#'), Block.cobblestone, Character.valueOf('I'),
                        Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.sickleIron),
                new Object[] { " # ", "  #", "I# ", Character.valueOf('#'), Item.ingotIron, Character.valueOf('I'),
                        Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.sickleGolden),
                new Object[] { " # ", "  #", "I# ", Character.valueOf('#'), Item.ingotGold, Character.valueOf('I'),
                        Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.sickleDiamond),
                new Object[] { " # ", "  #", "I# ", Character.valueOf('#'), Item.diamond, Character.valueOf('I'),
                        Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.sickleRuby),
                new Object[] { " # ", "  #", "I# ", Character.valueOf('#'), ModItems.gemRuby, Character.valueOf('I'),
                        Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.sickleGreenSapphire), new Object[] { " # ", "  #", "I# ",
                Character.valueOf('#'), ModItems.gemGreenSapphire, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(
                new ItemStack(ModItems.sickleSapphire),
                new Object[] { " # ", "  #", "I# ", Character.valueOf('#'), ModItems.gemSapphire,
                        Character.valueOf('I'), Item.stick });

        // Athame
        GameRegistry.addRecipe(new ItemStack(ModItems.athame), new Object[] { "#", "I", Character.valueOf('#'),
                ModItems.ingotSilver, Character.valueOf('I'), Item.stick });

        // Wool Card
        GameRegistry.addRecipe(new ItemStack(ModItems.woolcard), new Object[] { "#", "X", "I", Character.valueOf('#'),
                Block.fenceIron, Character.valueOf('X'), Block.planks, Character.valueOf('I'), Item.stick });
        for (int c = 0; c < Strings.COLORS.length; c++) {
            GameRegistry.addShapelessRecipe(new ItemStack(Item.silk, 4), new ItemStack(ModItems.woolcard, 1, 32767),
                    new ItemStack(Block.cloth, 1, c));
        }

        // Lumars
        for (int i = 0; i < Strings.COLORS.length; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemLumar, 4, i), new ItemStack(Item.redstone, 1),
                    new ItemStack(Item.lightStoneDust, 1), new ItemStack(Item.dyePowder, 1, Strings.COLORS.length - i
                            - 1), new ItemStack(Item.dyePowder, 1, Strings.COLORS.length - i - 1));
        }
        for (int i = 0; i < Strings.COLORS.length; i++) {
            System.out.println("Adding Lamp recipe: " + i);
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockLampNormal, 1, i), new Object[] { "GLG", "GLG", "GRG", Character.valueOf('G'),
                Block.glass, Character.valueOf('L'), new ItemStack(ModItems.itemLumar, 1, i), Character.valueOf('R'), Item.redstone});
        }
        for (int i = 0; i < Strings.COLORS.length; i++) {
            System.out.println("Adding Lamp recipe: " + i);
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockLampInverted, 1, i), new Object[] { "GLG", "GLG", "GRG", Character.valueOf('G'),
                Block.glass, Character.valueOf('L'), new ItemStack(ModItems.itemLumar, 1, i), Character.valueOf('R'), Block.torchRedstoneActive});
        }
    }
}
