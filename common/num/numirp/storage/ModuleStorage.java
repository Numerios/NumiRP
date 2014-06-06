package num.numirp.storage;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraftforge.oredict.ShapedOreRecipe;
import num.numirp.base.EnumProcessed;
import num.numirp.core.Module;
import num.numirp.world.WorldGenerator;

public class ModuleStorage extends Module {
    public static Block storage;

    public void preInit() {
        registerBlocks();
    }

    public void init() {
        registerRecipes();
        new WorldGenerator();
    }

    private void registerBlocks() {
        storage = new BlockStorage();
        ((BlockStorage) storage).registerOres();
        GameRegistry.registerBlock(storage, ItemBlockStorage.class, storage.getUnlocalizedName());
    }

    private void registerRecipes() {
        // Storage Blocks crafting
        GameRegistry.addRecipe(new ShapedOreRecipe(EnumStorage.RUBY.getIS(1), "###", "###", "###",
                '#', "gemRuby"));
        GameRegistry.addRecipe(new ShapedOreRecipe(EnumStorage.GREENSAPPHIRE.getIS(1), "###", "###",
                "###", '#', "gemGreenSapphire"));
        GameRegistry.addRecipe(new ShapedOreRecipe(EnumStorage.SAPPHIRE.getIS(1), "###", "###", "###",
                '#', "gemSapphire"));
        GameRegistry.addRecipe(new ShapedOreRecipe(EnumStorage.TIN.getIS(1), "###", "###", "###",
                '#', "ingotTin"));
        GameRegistry.addRecipe(new ShapedOreRecipe(EnumStorage.COPPER.getIS(1), "###", "###", "###",
                '#', "ingotCopper"));
        GameRegistry.addRecipe(new ShapedOreRecipe(EnumStorage.SILVER.getIS(1), "###", "###", "###",
                '#', "ingotSilver"));
        GameRegistry.addRecipe(new ShapedOreRecipe(EnumStorage.NIKOLITE.getIS(1), "###", "###", "###",
                '#', "dustNikolite"));
        GameRegistry.addRecipe(new ShapedOreRecipe(EnumStorage.TUNGSTEN.getIS(1), "###", "###", "###",
                '#', "ingotTungsten"));

        // Storage Blocks uncrafting
        GameRegistry.addRecipe(EnumProcessed.RUBY.getIS(9), "#", '#', EnumStorage.RUBY.getIS(1));
        GameRegistry.addRecipe(EnumProcessed.GREENSAPPHIRE.getIS(9), "#", '#', EnumStorage.GREENSAPPHIRE.getIS(1));
        GameRegistry.addRecipe(EnumProcessed.SAPPHIRE.getIS(9), "#", '#', EnumStorage.SAPPHIRE.getIS(1));
        GameRegistry.addRecipe(EnumProcessed.TIN.getIS(9), "#", '#', EnumStorage.TIN.getIS(1));
        GameRegistry.addRecipe(EnumProcessed.COPPER.getIS(9), "#", '#', EnumStorage.COPPER.getIS(1));
        GameRegistry.addRecipe(EnumProcessed.SILVER.getIS(9), "#", '#', EnumStorage.SILVER.getIS(1));
        GameRegistry.addRecipe(EnumProcessed.NIKOLITE.getIS(9), "#", '#', EnumStorage.NIKOLITE.getIS(1));
        GameRegistry.addRecipe(EnumProcessed.TUNGSTEN.getIS(9), "#", '#', EnumStorage.TUNGSTEN.getIS(1));
    }
}
