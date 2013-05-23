package num.numirpworld.recipe;

import num.numirpworld.block.ModBlocks;
import num.numirpworld.item.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModCrafting {

    public static void init() {
        GameRegistry.addRecipe(ModBlocks.blockStorageRuby,
                new Object[] { "###", "###", "###", Character.valueOf('#'), 
                ModItems.gemRuby });
        GameRegistry.addRecipe(ModBlocks.blockStorageGreenSapphire,
                new Object[] { "###", "###", "###", Character.valueOf('#'),
                ModItems.gemGreenSapphire });
        GameRegistry.addRecipe(ModBlocks.blockStorageSapphire, new Object[] {
                "###", "###", "###", Character.valueOf('#'),
                ModItems.gemSapphire });
        GameRegistry.addRecipe(ModBlocks.blockStorageTin, new Object[] { "###",
                "###", "###", Character.valueOf('#'), ModItems.ingotTin });
        GameRegistry.addRecipe(ModBlocks.blockStorageCopper, new Object[] {
                "###", "###", "###", Character.valueOf('#'),
                ModItems.ingotCopper });
        GameRegistry.addRecipe(ModBlocks.blockStorageSilver, new Object[] {
                "###", "###", "###", Character.valueOf('#'),
                ModItems.ingotSilver });
        GameRegistry.addRecipe(ModBlocks.blockStorageNikolite, new Object[] {
                "###", "###", "###", Character.valueOf('#'),
                ModItems.dustNikolite });
        GameRegistry.addRecipe(ModBlocks.blockStorageTungsten, new Object[] {
                "###", "###", "###", Character.valueOf('#'),
                ModItems.ingotTungsten });

    }
}
