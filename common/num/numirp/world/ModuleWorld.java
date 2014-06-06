package num.numirp.world;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import num.numirp.core.Module;

public class ModuleWorld extends Module {
    public static Block ore;

    public void preInit() {
        registerBlocks();
    }

    public void init() {
        registerRecipes();
        new WorldGenerator();
    }

    private void registerBlocks() {
        ore = new BlockOre();
        ((BlockOre) ore).registerOres();
        GameRegistry.registerBlock(ore, ItemBlockOre.class, ore.getUnlocalizedName());
    }

    private void registerRecipes() {

    }
}
