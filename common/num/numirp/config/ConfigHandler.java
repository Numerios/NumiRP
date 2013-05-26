package num.numirp.config;

import java.io.File;
import java.util.logging.Level;

import cpw.mods.fml.common.FMLLog;

import net.minecraftforge.common.Configuration;
import num.numirp.lib.BlockIDs;
import num.numirp.lib.ItemIDs;
import num.numirp.lib.Reference;
import num.numirp.lib.WorldGen;

public class ConfigHandler {
    public static Configuration configuration;

    public static void init(File configFile) {
        Configuration conf = new Configuration(configFile);

        try {
            conf.load();
            WorldGen.WORLDGEN_RUBY = conf.get("World Generation", "Ruby Generation", WorldGen.WORLDGEN_RUBY_DEFAULT).getBoolean(WorldGen.WORLDGEN_RUBY_DEFAULT);
            WorldGen.WORLDGEN_GREENSAPPHIRE = conf.get("World Generation", "Green Sapphire Generation", WorldGen.WORLDGEN_GREENSAPPHIRE_DEFAULT).getBoolean(WorldGen.WORLDGEN_GREENSAPPHIRE_DEFAULT);
            WorldGen.WORLDGEN_SAPPHIRE = conf.get("World Generation", "Sapphire Generation", WorldGen.WORLDGEN_SAPPHIRE_DEFAULT).getBoolean(WorldGen.WORLDGEN_SAPPHIRE_DEFAULT);
            WorldGen.WORLDGEN_TIN = conf.get("World Generation", "Tin Generation", WorldGen.WORLDGEN_TIN_DEFAULT).getBoolean(WorldGen.WORLDGEN_TIN_DEFAULT);
            WorldGen.WORLDGEN_COPPER = conf.get("World Generation", "Copper Generation", WorldGen.WORLDGEN_COPPER_DEFAULT).getBoolean(WorldGen.WORLDGEN_COPPER_DEFAULT);
            WorldGen.WORLDGEN_SILVER = conf.get("World Generation", "Silver Generation", WorldGen.WORLDGEN_SILVER_DEFAULT).getBoolean(WorldGen.WORLDGEN_SILVER_DEFAULT);
            WorldGen.WORLDGEN_NIKOLITE = conf.get("World Generation", "Nikolite Generation", WorldGen.WORLDGEN_NIKOLITE_DEFAULT).getBoolean(WorldGen.WORLDGEN_NIKOLITE_DEFAULT);
            WorldGen.WORLDGEN_TUNGSTEN = conf.get("World Generation", "Tungsten Generation", WorldGen.WORLDGEN_TUNGSTEN_DEFAULT).getBoolean(WorldGen.WORLDGEN_TUNGSTEN_DEFAULT);
            WorldGen.WORLDGEN_MARBLE = conf.get("World Generation", "Marble Generation", WorldGen.WORLDGEN_MARBLE_DEFAULT).getBoolean(WorldGen.WORLDGEN_MARBLE_DEFAULT);
            WorldGen.WORLDGEN_BASALT = conf.get("World Generation", "Basalt Generation", WorldGen.WORLDGEN_BASALT_DEFAULT).getBoolean(WorldGen.WORLDGEN_BASALT_DEFAULT);

            ItemIDs.PICKAXE_RUBY_ID = conf.getItem("pickaxeRuby", ItemIDs.PICKAXE_RUBY_ID_DEFAULT).getInt(ItemIDs.PICKAXE_RUBY_ID_DEFAULT);
            ItemIDs.PICKAXE_GREEN_SAPPHIRE_ID = conf.getItem("pickaxeGreenSaphire", ItemIDs.PICKAXE_GREEN_SAPPHIRE_ID_DEFAULT).getInt(ItemIDs.PICKAXE_GREEN_SAPPHIRE_ID_DEFAULT);
            ItemIDs.PICKAXE_SAPPHIRE_ID = conf.getItem("pickaxeSaphire", ItemIDs.PICKAXE_SAPPHIRE_ID_DEFAULT).getInt(ItemIDs.PICKAXE_SAPPHIRE_ID_DEFAULT);

            ItemIDs.SHOVEL_RUBY_ID = conf.getItem("shovelRuby", ItemIDs.SHOVEL_RUBY_ID_DEFAULT).getInt(ItemIDs.SHOVEL_RUBY_ID_DEFAULT);
            ItemIDs.SHOVEL_GREEN_SAPPHIRE_ID = conf.getItem("shovelGreenSaphire", ItemIDs.SHOVEL_GREEN_SAPPHIRE_ID_DEFAULT).getInt(ItemIDs.SHOVEL_GREEN_SAPPHIRE_ID_DEFAULT);
            ItemIDs.SHOVEL_SAPPHIRE_ID = conf.getItem("shovelSaphire", ItemIDs.SHOVEL_SAPPHIRE_ID_DEFAULT).getInt(ItemIDs.SHOVEL_SAPPHIRE_ID_DEFAULT);

            ItemIDs.AXE_RUBY_ID = conf.getItem("axeRuby", ItemIDs.AXE_RUBY_ID_DEFAULT).getInt(ItemIDs.AXE_RUBY_ID_DEFAULT);
            ItemIDs.AXE_GREEN_SAPPHIRE_ID = conf.getItem("axeGreenSaphire", ItemIDs.AXE_GREEN_SAPPHIRE_ID_DEFAULT).getInt(ItemIDs.AXE_GREEN_SAPPHIRE_ID_DEFAULT);
            ItemIDs.AXE_SAPPHIRE_ID = conf.getItem("axeSaphire", ItemIDs.AXE_SAPPHIRE_ID_DEFAULT).getInt(ItemIDs.AXE_SAPPHIRE_ID_DEFAULT);

            ItemIDs.SICKLE_RUBY_ID = conf.getItem("sickleRuby", ItemIDs.SICKLE_RUBY_ID_DEFAULT).getInt(ItemIDs.SICKLE_RUBY_ID_DEFAULT);

            ItemIDs.ATHAME_ID = conf.getItem("sickleRuby", ItemIDs.ATHAME_ID_DEFAULT).getInt(ItemIDs.ATHAME_ID_DEFAULT);

            ItemIDs.PROCESSED_ID = conf.getItem("processed", ItemIDs.PROCESSED_ID_DEFAULT).getInt(ItemIDs.PROCESSED_ID_DEFAULT);

            ItemIDs.SICKLE_RUBY_ID = conf.getItem("sickleRuby", ItemIDs.SICKLE_RUBY_ID_DEFAULT).getInt(ItemIDs.SICKLE_RUBY_ID_DEFAULT);
            ItemIDs.SICKLE_GREEN_SAPPHIRE_ID = conf.getItem("sickleGreenSapphire", ItemIDs.SICKLE_GREEN_SAPPHIRE_ID_DEFAULT).getInt(ItemIDs.SICKLE_GREEN_SAPPHIRE_ID_DEFAULT);
            ItemIDs.SICKLE_SAPPHIRE_ID = conf.getItem("sickleSapphire", ItemIDs.SICKLE_SAPPHIRE_ID_DEFAULT).getInt(ItemIDs.SICKLE_SAPPHIRE_ID_DEFAULT);

            BlockIDs.ORES_ID = conf.getBlock("ores", BlockIDs.ORES_ID_DEFAULT).getInt(BlockIDs.ORES_ID_DEFAULT);
            BlockIDs.STORAGE_ID = conf.getBlock("storage blocks", BlockIDs.STORAGE_ID_DEFAULT).getInt(BlockIDs.STORAGE_ID_DEFAULT);
            BlockIDs.DECOR_ID = conf.getBlock("decorative blocks (marble, basalt, etc.)", BlockIDs.DECOR_ID_DEFAULT).getInt(BlockIDs.DECOR_ID_DEFAULT);

        } catch (Exception e) {
            FMLLog.log(Level.SEVERE, e, "Mod called " + Reference.MOD_NAME + " was unable to load its configs!");
        } finally {
            conf.save();
        }

    }
}
