package num.numirpworld.recipe;

import net.minecraft.item.crafting.FurnaceRecipes;
import num.numirpworld.block.ModBlocks;

public class ModSmelting {

    public static void init() {
        FurnaceRecipes.smelting().addSmelting(ModBlocks.blockOres.blockID, 0, ModBlocks.blockStorageSapphire, 0.5F);
    }
}
