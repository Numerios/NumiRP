package num.numirpworld.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import num.numirpworld.item.ItemBlockOres;
import num.numirpworld.lib.BlockIDs;
import num.numirpworld.lib.Reference;
import num.numirpworld.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModBlocks {
    public static Block blockOres;
    public static ItemStack oreSapphire, oreGreenSapphire, oreRuby, oreCopper,
            oreTin, oreSilver, oreNikolite, oreTungsten;

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

    }

}
