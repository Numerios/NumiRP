package num.numirp.recipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import num.numirp.block.ModBlocks;
import num.numirp.item.ModItems;
import num.numirp.lib.Metadata;
import num.numirp.lib.Module;
import num.numirp.lib.Strings;

public class ModCrafting {

    public static void init() {
        if (Module.STORAGE) {
            // Storage Blocks crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockStorageRuby, "###", "###", "###",
                    '#', "gemRuby"));
            GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockStorageGreenSapphire, "###", "###",
                    "###", '#', "gemGreenSapphire"));
            GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockStorageSapphire, "###", "###", "###",
                    '#', "gemSapphire"));
            GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockStorageTin, "###", "###", "###",
                    '#', "ingotTin"));
            GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockStorageCopper, "###", "###", "###",
                    '#', "ingotCopper"));
            GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockStorageSilver, "###", "###", "###",
                    '#', "ingotSilver"));
            GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockStorageNikolite, "###", "###", "###",
                    '#', "dustNikolite"));
            GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockStorageTungsten, "###", "###", "###",
                    '#', "ingotTungsten"));

            // Storage Blocks uncrafting
            GameRegistry.addRecipe(new ItemStack(ModItems.itemProcessed, 9, Metadata.RUBY),
                    "#", '#', ModBlocks.blockStorageRuby);
            GameRegistry.addRecipe(new ItemStack(ModItems.itemProcessed, 9, Metadata.GREENSAPPHIRE), "#",
                    '#', ModBlocks.blockStorageGreenSapphire);
            GameRegistry.addRecipe(new ItemStack(ModItems.itemProcessed, 9, Metadata.SAPPHIRE), "#",
                    '#', ModBlocks.blockStorageSapphire);
            GameRegistry.addRecipe(new ItemStack(ModItems.itemProcessed, 9, Metadata.TIN),
                    "#", '#', ModBlocks.blockStorageTin);
            GameRegistry.addRecipe(new ItemStack(ModItems.itemProcessed, 9, Metadata.COPPER),
                    "#", '#', ModBlocks.blockStorageCopper);
            GameRegistry.addRecipe(new ItemStack(ModItems.itemProcessed, 9, Metadata.SILVER),
                    "#", '#', ModBlocks.blockStorageSilver);
            GameRegistry.addRecipe(new ItemStack(ModItems.itemProcessed, 9, Metadata.NIKOLITE), "#",
                    '#', ModBlocks.blockStorageNikolite);
            GameRegistry.addRecipe(new ItemStack(ModItems.itemProcessed, 9, Metadata.TUNGSTEN), "#",
                    '#', ModBlocks.blockStorageTungsten);
        }

        if (Module.TOOLS) {
            // Pickaxes
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.pickaxeRuby), new Object[]{"###", " I ",
                    " I ", '#', "gemRuby", 'I', Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.pickaxeGreenSapphire), new Object[]{"###",
                    " I ", " I ", '#', "gemGreenSapphire", 'I', Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.pickaxeSapphire), new Object[]{"###",
                    " I ", " I ", '#', "gemSapphire", 'I', Item.stick}));

            // Shovels
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.shovelRuby), new Object[]{"#", "I", "I",
                    '#', "gemRuby", 'I', Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.shovelGreenSapphire), new Object[]{"#",
                    "I", "I", '#', "gemGreenSapphire", 'I', Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.shovelSapphire), new Object[]{"#", "I",
                    "I", '#', "gemSapphire", 'I', Item.stick}));

            // Axes
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.axeRuby), new Object[]{"## ", "#I ", " I ",
                    '#', "gemRuby", 'I', Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.axeGreenSapphire), new Object[]{"## ",
                    "#I ", " I ", '#', "gemGreenSapphire", 'I', Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.axeSapphire), new Object[]{"## ", "#I ",
                    " I ", '#', "gemSapphire", 'I', Item.stick}));

            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.axeRuby), new Object[]{" ##", " I#", " I ",
                    '#', "gemRuby", 'I', Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.axeGreenSapphire), new Object[]{" ##",
                    " I#", " I ", '#', "gemGreenSapphire", 'I', Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.axeSapphire), new Object[]{" ##", " I#",
                    " I ", '#', "gemSapphire", 'I', Item.stick}));

            // Swords
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.swordRuby), new Object[]{"#", "#", "I",
                    '#', "gemRuby", 'I', Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.swordGreenSapphire), new Object[]{"#", "#",
                    "I", '#', "gemGreenSapphire", 'I', Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.swordSapphire), new Object[]{"#", "#", "I",
                    '#', "gemSapphire", 'I', Item.stick}));

            // Hoes
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.hoeRuby), new Object[]{"## ", " I ", " I ",
                    '#', "gemRuby", 'I', Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.hoeGreenSapphire), new Object[]{"## ",
                    " I ", " I ", '#', "gemGreenSapphire", 'I', Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.hoeSapphire), new Object[]{"## ", " I ",
                    " I ", '#', "gemSapphire", 'I', Item.stick}));

            // Sickle
            GameRegistry.addRecipe(new ItemStack(ModItems.sickleWooden),
                    new Object[]{" # ", "  #", "I# ", '#', Block.planks, 'I',
                            Item.stick}
            );
            GameRegistry.addRecipe(new ItemStack(ModItems.sickleStone),
                    new Object[]{" # ", "  #", "I# ", '#', Block.cobblestone, 'I',
                            Item.stick}
            );
            GameRegistry.addRecipe(new ItemStack(ModItems.sickleIron),
                    new Object[]{" # ", "  #", "I# ", '#', Item.ingotIron, 'I',
                            Item.stick}
            );
            GameRegistry.addRecipe(new ItemStack(ModItems.sickleGolden),
                    new Object[]{" # ", "  #", "I# ", '#', Item.ingotGold, 'I',
                            Item.stick}
            );
            GameRegistry.addRecipe(new ItemStack(ModItems.sickleDiamond),
                    new Object[]{" # ", "  #", "I# ", '#', Item.diamond, 'I',
                            Item.stick}
            );

            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.sickleRuby), new Object[]{" # ", "  #",
                    "I# ", '#', "gemRuby", 'I', Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.sickleGreenSapphire), new Object[]{" # ",
                    "  #", "I# ", '#', "gemGreenSapphire", 'I', Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.sickleSapphire), new Object[]{" # ", "  #",
                    "I# ", '#', "gemSapphire", 'I', Item.stick}));

            // Athame
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.athame), new Object[]{"#", "I",
                    '#', "ingotSilver", 'I', Item.stick}));

            // Wool Card
            GameRegistry.addRecipe(new ItemStack(ModItems.woolCard), new Object[]{"#", "X", "I", '#',
                    Item.ingotIron, 'X', Block.planks, 'I', Item.stick});
            for (int c = 0; c < Strings.COLORS.length; c++) {
                GameRegistry.addShapelessRecipe(new ItemStack(Item.silk, 4), new ItemStack(ModItems.woolCard, 1, OreDictionary.WILDCARD_VALUE),
                        new ItemStack(Block.cloth, 1, c));
            }
        }

        if (Module.LAMPS) {
            // Lamps
            for (int i = 0; i < Strings.COLORS.length; i++) {
                GameRegistry.addRecipe(new ItemStack(ModBlocks.blockLampNormal, 1, i), new Object[]{"GLG", "GLG",
                        "GRG", 'G', Block.glass, 'L',
                        new ItemStack(ModItems.itemLumar, 1, i), 'R', Item.redstone});
            }

            for (int i = 0; i < Strings.COLORS.length; i++) {
                GameRegistry.addRecipe(new ItemStack(ModBlocks.blockLampInverted, 1, i), new Object[]{"GLG", "GLG",
                        "GRG", 'G', Block.glass, 'L',
                        new ItemStack(ModItems.itemLumar, 1, i), 'R', Block.torchRedstoneActive});
            }

            for (int i = 0; i < Strings.COLORS.length; i++) {
                for (int j = 0; j < Strings.COLORS.length; j++) {
                    if (i != j) {
                        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockLampNormal, 1, i), new ItemStack(
                                Item.dyePowder, 1, Strings.COLORS.length - i - 1), new ItemStack(
                                ModBlocks.blockLampNormal, 1, j));
                        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockLampInverted, 1, i),
                                new ItemStack(Item.dyePowder, 1, Strings.COLORS.length - i - 1), new ItemStack(
                                        ModBlocks.blockLampInverted, j)
                        );
                    }
                }
            }

            for (int i = 0; i < Strings.COLORS.length; i++) {
                GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockLampNormal, 1, i), new ItemStack(
                        Item.redstone), new ItemStack(ModBlocks.blockLampInverted, 1, i));
            }

            for (int i = 0; i < Strings.COLORS.length; i++) {
                GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockLampInverted, 1, i), new ItemStack(
                        Block.torchRedstoneActive), new ItemStack(ModBlocks.blockLampNormal, 1, i));
            }
        }
    }
}
