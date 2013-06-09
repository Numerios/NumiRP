package num.numirp.core.proxy;

import num.numirp.core.handlers.CraftingHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void initCrafting() {
        GameRegistry.registerCraftingHandler(new CraftingHandler());
    }

    public void initCapes() {
    }

    public void initRendering() {
    }
}
