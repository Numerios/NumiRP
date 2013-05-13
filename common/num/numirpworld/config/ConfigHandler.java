package num.numirpworld.config;

import java.io.File;
import java.util.logging.Level;

import cpw.mods.fml.common.FMLLog;

import net.minecraftforge.common.Configuration;
import num.numirpworld.lib.BlockIDs;
import num.numirpworld.lib.Reference;

public class ConfigHandler {
    public static Configuration configuration;

    public static void init(File configFile) {
        configuration = new Configuration(configFile);

        try {
            configuration.load();

            BlockIDs.ORES_ID = configuration.getBlock("ores",
                    BlockIDs.ORES_ID_DEFAULT).getInt(
                            BlockIDs.ORES_ID_DEFAULT);
            BlockIDs.STORAGE_ID = configuration.getBlock("storage block",
                    BlockIDs.STORAGE_ID_DEFAULT).getInt(
                            BlockIDs.STORAGE_ID_DEFAULT);

        } catch (Exception e) {
            FMLLog.log(Level.SEVERE, e, "Mod called " + Reference.MOD_NAME
                    + " was unable to load its configs!");
        } finally {
            configuration.save();
        }

    }
}
