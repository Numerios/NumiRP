package num.numirpworld;

import num.numirpworld.block.ModBlocks;
import num.numirpworld.config.ConfigHandler;
import num.numirpworld.item.ModItems;
import num.numirpworld.lib.Reference;
import num.numirpworld.world.WorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class NumiRPWorld {

    @Instance(Reference.MOD_ID)
    public static NumiRPWorld instance;

    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        ModBlocks.init();
        ModItems.init();
        GameRegistry.registerWorldGenerator(WorldGenerator.instance);

    }

    @Init
    public void init(FMLInitializationEvent event) {
    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
    }
}
