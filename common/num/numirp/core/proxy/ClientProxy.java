package num.numirp.core.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import num.numirp.client.BlockLampRenderer;

public class ClientProxy extends CommonProxy {
    public static int blockLampRenderType;
    public static int renderPass;

    @Override
    public void initRendering() {
        blockLampRenderType = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(new BlockLampRenderer());
    }
}
