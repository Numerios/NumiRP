package num.numirpworld.recipe;

import net.minecraft.item.crafting.FurnaceRecipes;
import num.numirpworld.block.ModBlocks;
import num.numirpworld.item.ModItems;

public class ModSmelting {

    public static void init() {
        FurnaceRecipes.smelting().addSmelting(ModBlocks.blockOres.blockID, 3,
                ModItems.ingotTin, 0.5F);
        FurnaceRecipes.smelting().addSmelting(ModBlocks.blockOres.blockID, 4,
                ModItems.ingotCopper, 0.5F);
        FurnaceRecipes.smelting().addSmelting(ModBlocks.blockOres.blockID, 5,
                ModItems.ingotSilver, 0.5F);
        FurnaceRecipes.smelting().addSmelting(ModBlocks.blockOres.blockID, 7,
                ModItems.ingotTungsten, 0.5F);

    }
}
