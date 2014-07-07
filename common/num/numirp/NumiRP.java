package num.numirp;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import num.numirp.base.ModuleBase;
import num.numirp.core.ModuleManager;
import num.numirp.core.creativetab.CreativeTabNRP;
import num.numirp.core.proxy.CommonProxy;
import num.numirp.core.util.Logger;
import num.numirp.lib.Reference;
import num.numirp.light.ModuleLight;
import num.numirp.storage.ModuleStorage;
import num.numirp.world.ModuleWorld;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class NumiRP {

    @Instance(Reference.MOD_ID)
    public static NumiRP instance;

    public static CreativeTabs tabNRP = new CreativeTabNRP(CreativeTabs.getNextID(), Reference.MOD_ID);

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //    ConfigHandler.init(event.getSuggestedConfigurationFile());
        Logger.init();
        Logger.debug("PreInit started!");

        ModuleManager.INSTANCE.register(new ModuleBase());
        ModuleManager.INSTANCE.register(new ModuleWorld());
        ModuleManager.INSTANCE.register(new ModuleStorage());
        ModuleManager.INSTANCE.register(new ModuleLight());

        ModuleManager.INSTANCE.preInit();
        Logger.debug("PreInit finished!");

        //   ModBlocks.init();
        //   ModItems.init();

        //   GameRegistry.registerWorldGenerator(WorldGenerator.instance, 0);

        //   ModCrafting.init();
        //   ModSmelting.init();

        //   proxy.initCapes();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        Logger.debug("Init started!");

        ModuleManager.INSTANCE.init();

        //   proxy.initRendering();
        Logger.debug("Init finished!");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        Logger.debug("PostInit started!");

        ModuleManager.INSTANCE.postInit();
        Logger.debug("PostInit finished!");
    }
}
