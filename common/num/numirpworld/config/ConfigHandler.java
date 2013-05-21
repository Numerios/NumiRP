package num.numirpworld.config;

import java.io.File;
import java.util.logging.Level;

import cpw.mods.fml.common.FMLLog;

import net.minecraftforge.common.Configuration;
import num.numirpworld.lib.BlockIDs;
import num.numirpworld.lib.ItemIDs;
import num.numirpworld.lib.Reference;
import num.numirpworld.lib.Values;

public class ConfigHandler {
    public static Configuration configuration;

    public static void init(File configFile) {
        Configuration conf = new Configuration(configFile);

        try {
            conf.load();
            Values.WORLDGEN_RUBY = conf.get("World Generation", "Ruby Generation", Values.WORLDGEN_RUBY_DEFAULT).getBoolean(Values.WORLDGEN_RUBY_DEFAULT);
            Values.WORLDGEN_GREENSAPPHIRE = conf.get("World Generation", "Green Sapphire Generation", Values.WORLDGEN_GREENSAPPHIRE_DEFAULT).getBoolean(Values.WORLDGEN_GREENSAPPHIRE_DEFAULT);
            Values.WORLDGEN_SAPPHIRE = conf.get("World Generation", "Sapphire Generation", Values.WORLDGEN_SAPPHIRE_DEFAULT).getBoolean(Values.WORLDGEN_SAPPHIRE_DEFAULT);
            Values.WORLDGEN_TIN = conf.get("World Generation", "Tin Generation", Values.WORLDGEN_TIN_DEFAULT).getBoolean(Values.WORLDGEN_TIN_DEFAULT);
            Values.WORLDGEN_COPPER = conf.get("World Generation", "Copper Generation", Values.WORLDGEN_COPPER_DEFAULT).getBoolean(Values.WORLDGEN_COPPER_DEFAULT);
            Values.WORLDGEN_SILVER = conf.get("World Generation", "Silver Generation", Values.WORLDGEN_SILVER_DEFAULT).getBoolean(Values.WORLDGEN_SILVER_DEFAULT);
            Values.WORLDGEN_NIKOLITE = conf.get("World Generation", "Nikolite Generation", Values.WORLDGEN_NIKOLITE_DEFAULT).getBoolean(Values.WORLDGEN_NIKOLITE_DEFAULT);
            Values.WORLDGEN_TUNGSTEN = conf.get("World Generation", "Tungsten Generation", Values.WORLDGEN_TUNGSTEN_DEFAULT).getBoolean(Values.WORLDGEN_TUNGSTEN_DEFAULT);

            
            ItemIDs.PROCESSED_ID = conf.getItem("processed",
                    ItemIDs.PROCESSED_ID_DEFAULT).getInt(
                    ItemIDs.PROCESSED_ID_DEFAULT);
            BlockIDs.ORES_ID = conf.getBlock("ores",
                    BlockIDs.ORES_ID_DEFAULT).getInt(BlockIDs.ORES_ID_DEFAULT);
            BlockIDs.STORAGE_ID = conf.getBlock("storage block",
                    BlockIDs.STORAGE_ID_DEFAULT).getInt(
                    BlockIDs.STORAGE_ID_DEFAULT);

        } catch (Exception e) {
            FMLLog.log(Level.SEVERE, e, "Mod called " + Reference.MOD_NAME
                    + " was unable to load its configs!");
        } finally {
            conf.save();
        }

    }
}
