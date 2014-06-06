package num.numirp;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import num.numirp.addons.ModAddons;
import num.numirp.block.ModBlocks;
import num.numirp.config.ConfigHandler;
import num.numirp.core.creativetab.CreativeTabNRP;
import num.numirp.core.proxy.CommonProxy;
import num.numirp.core.util.Logger;
import num.numirp.item.ModItems;
import num.numirp.lib.Reference;
import num.numirp.recipe.ModCrafting;
import num.numirp.recipe.ModSmelting;
import num.numirp.world.WorldGenerator;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class NumiRP {

    @Instance(Reference.MOD_ID)
    public static NumiRP instance;

    public static CreativeTabs tabNRP = new CreativeTabNRP(CreativeTabs.getNextID(), Reference.MOD_ID);

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        Logger.init();

        ModBlocks.init();
        ModItems.init();

        GameRegistry.registerWorldGenerator(WorldGenerator.instance, 0);

        ModCrafting.init();
        ModSmelting.init();

        proxy.initCapes();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.initRendering();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        ModAddons.init();
    }
}
