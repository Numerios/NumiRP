package num.numirp.base;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import num.numirp.core.Module;
import num.numirp.world.WorldGenerator;

public class ModuleBase extends Module {
    public static Item processed;

    public void preInit() {
        registerItems();
    }

    public void init() {
        registerRecipes();
        new WorldGenerator();
    }

    private void registerItems() {
        processed = new ItemProcessed();
        ((ItemProcessed) processed).registerOres();
        GameRegistry.registerItem(processed, processed.getUnlocalizedName());
    }

    private void registerRecipes() {

    }
}
