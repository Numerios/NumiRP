package num.numirp;

import net.minecraft.creativetab.CreativeTabs;
import num.numirp.block.ModBlocks;
import num.numirp.config.ConfigHandler;
import num.numirp.core.handlers.AddonHandler;
import num.numirp.core.proxy.CommonProxy;
import num.numirp.creativetab.CreativeTabRP;
import num.numirp.item.ModItems;
import num.numirp.lib.Reference;
import num.numirp.recipe.ModCrafting;
import num.numirp.recipe.ModSmelting;
import num.numirp.world.WorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class NumiRP {

    @Instance(Reference.MOD_ID)
    public static NumiRP instance;

    public static CreativeTabs tabRP = new CreativeTabRP(CreativeTabs.getNextID(), Reference.MOD_ID);

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        ModBlocks.init();
        ModItems.init();
        GameRegistry.registerWorldGenerator(WorldGenerator.instance);
        ModCrafting.init();
        ModSmelting.init();

        proxy.initCapes();
    }

    @Init
    public void init(FMLInitializationEvent event) {
        proxy.initRendering();
    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
        AddonHandler.init();
    }
}
