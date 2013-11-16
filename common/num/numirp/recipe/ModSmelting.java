package num.numirp.recipe;

import net.minecraft.item.crafting.FurnaceRecipes;
import num.numirp.block.ModBlocks;
import num.numirp.item.ModItems;
import num.numirp.lib.Metadata;
import num.numirp.lib.Module;

public class ModSmelting {

    public static void init() {
        if (Module.ORES && Module.PROCESSED) {
            FurnaceRecipes.smelting().addSmelting(ModBlocks.blockOres.blockID, Metadata.TIN, ModItems.ingotTin, 0.5F);
            FurnaceRecipes.smelting().addSmelting(ModBlocks.blockOres.blockID, Metadata.COPPER, ModItems.ingotCopper, 0.5F);
            FurnaceRecipes.smelting().addSmelting(ModBlocks.blockOres.blockID, Metadata.SILVER, ModItems.ingotSilver, 0.5F);
            FurnaceRecipes.smelting().addSmelting(ModBlocks.blockOres.blockID, Metadata.TUNGSTEN, ModItems.ingotTungsten,
                    0.5F);
        }
        if (Module.DECOR) {
            FurnaceRecipes.smelting().addSmelting(ModBlocks.blockDecor.blockID, Metadata.BASALTCOBBLE,
                    ModBlocks.blockBasalt, 0.5F);
        }
    }
}
