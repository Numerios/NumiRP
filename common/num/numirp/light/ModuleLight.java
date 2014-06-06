package num.numirp.light;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import num.numirp.core.Module;
import num.numirp.world.WorldGenerator;

public class ModuleLight extends Module {
    public static Item lumar;

    public void preInit() {
        registerItems();
    }

    public void init() {
        registerRecipes();
        new WorldGenerator();
    }

    private void registerItems() {
        lumar = new ItemLumar();
        ((ItemLumar) lumar).registerOres();
        GameRegistry.registerItem(lumar, lumar.getUnlocalizedName());
    }

    private void registerRecipes() {

    }
}

