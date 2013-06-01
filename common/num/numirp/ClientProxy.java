package num.numirp;

import num.numirp.renderer.BlockLampRenderer;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
    public static int blockLampRenderType;
    public static int renderPass;
    
    public static void setCustomRenderers()
    {
            blockLampRenderType = RenderingRegistry.getNextAvailableRenderId();
            RenderingRegistry.registerBlockHandler(new BlockLampRenderer());
    }
}