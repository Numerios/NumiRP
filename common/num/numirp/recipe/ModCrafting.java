package num.numirp.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import num.numirp.block.ModBlocks;
import num.numirp.item.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModCrafting {

    public static void init() {
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

        // Pickaxes
        GameRegistry.addRecipe(new ItemStack(ModItems.pickaxeRuby), new Object[] { "###", " I ", " I ", Character.valueOf('#'),
                ModItems.gemRuby, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.pickaxeGreenSapphire), new Object[] { "###", " I ", " I ", Character.valueOf('#'),
                ModItems.gemGreenSapphire, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.pickaxeSapphire), new Object[] { "###", " I ", " I ", Character.valueOf('#'),
                ModItems.gemSapphire, Character.valueOf('I'), Item.stick });

        // Shovels
        GameRegistry.addRecipe(new ItemStack(ModItems.shovelRuby), new Object[] { "#", "I", "I", Character.valueOf('#'),
                ModItems.gemRuby, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.shovelGreenSapphire), new Object[] { "#", "I", "I", Character.valueOf('#'),
                ModItems.gemGreenSapphire, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.shovelSapphire), new Object[] { "#", "I", "I", Character.valueOf('#'),
                ModItems.gemSapphire, Character.valueOf('I'), Item.stick });

        // Axes
        GameRegistry.addRecipe(new ItemStack(ModItems.axeRuby), new Object[] { "## ", "#I ", " I ", Character.valueOf('#'),
                ModItems.gemRuby, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.axeGreenSapphire), new Object[] { "## ", "#I ", " I ", Character.valueOf('#'),
                ModItems.gemGreenSapphire, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.axeSapphire), new Object[] { "## ", "#I ", " I ", Character.valueOf('#'),
                ModItems.gemSapphire, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.axeRuby), new Object[] { " ##", " I#", " I ", Character.valueOf('#'),
                ModItems.gemRuby, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.axeGreenSapphire), new Object[] { " ##", " I#", " I ", Character.valueOf('#'),
                ModItems.gemGreenSapphire, Character.valueOf('I'), Item.stick });
        GameRegistry.addRecipe(new ItemStack(ModItems.axeSapphire), new Object[] { " ##", " I#", " I ", Character.valueOf('#'),
                ModItems.gemSapphire, Character.valueOf('I'), Item.stick });
    }
}
