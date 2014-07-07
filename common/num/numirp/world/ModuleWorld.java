package num.numirp.world;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import num.numirp.core.Module;
import num.numirp.world.decor.BlockDecor;
import num.numirp.world.decor.EnumDecor;
import num.numirp.world.decor.ItemBlockDecor;
import num.numirp.world.ore.BlockOre;
import num.numirp.world.ore.ItemBlockOre;

public class ModuleWorld extends Module {
    public static Block ore, decor;

    public void preInit() {
        registerBlocks();
    }

    public void init() {
        registerOres();
        registerRecipes();
        new WorldGenerator();
    }

    private void registerBlocks() {
        ore = new BlockOre();
        GameRegistry.registerBlock(ore, ItemBlockOre.class, ore.getUnlocalizedName());

        decor = new BlockDecor();
        GameRegistry.registerBlock(decor, ItemBlockDecor.class, decor.getUnlocalizedName());
    }

    private void registerOres() {
        ((BlockOre) ore).registerOres();
        ((BlockDecor) decor).registerOres();
    }

    private void registerRecipes() {
        // Decor blocks crafting
        GameRegistry.addRecipe(EnumDecor.BASALTBRICK.getIS(4), "##", "##",
                '#', EnumDecor.BASALT.getIS(1));
        GameRegistry.addRecipe(EnumDecor.MARBLEBRICK.getIS(4), "##", "##",
                '#', EnumDecor.MARBLE.getIS(1));
        GameRegistry.addRecipe(EnumDecor.BASALTCHISELED.getIS(4), "##",
                "##", '#', EnumDecor.BASALTBRICK.getIS(1));
        GameRegistry.addRecipe(EnumDecor.BASALTPAVER.getIS(1), "#",
                '#', EnumDecor.BASALT.getIS(1));

        // Decor blocks uncrafting
        GameRegistry.addRecipe(EnumDecor.BASALT.getIS(1), "#", '#',
                EnumDecor.BASALTBRICK.getIS(1));
        GameRegistry.addRecipe(EnumDecor.BASALT.getIS(1), "#", '#',
                EnumDecor.BASALTCHISELED.getIS(1));
        GameRegistry.addRecipe(EnumDecor.BASALT.getIS(1), "#", '#',
                EnumDecor.BASALTPAVER.getIS(1));
        GameRegistry.addRecipe(EnumDecor.MARBLE.getIS(1), "#", '#',
                EnumDecor.MARBLEBRICK.getIS(1));

        GameRegistry.addSmelting(EnumDecor.BASALTCOBBLE.getIS(1), EnumDecor.BASALT.getIS(1), 0.5F);
    }
}
