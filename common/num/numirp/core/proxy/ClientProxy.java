package num.numirp.core.proxy;

import num.numirp.client.renderer.block.BlockLampRenderer;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
    public static int blockLampRenderType;
    public static int renderPass;

    @Override
    public void initRendering() {
        blockLampRenderType = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(new BlockLampRenderer());
    }
}
