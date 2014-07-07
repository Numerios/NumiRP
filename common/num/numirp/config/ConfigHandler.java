package num.numirp.config;

import net.minecraftforge.common.config.Configuration;
import num.numirp.lib.Module;
import num.numirp.lib.Reference;
import num.numirp.lib.Tweaks;
import num.numirp.lib.WorldGen;

import java.io.File;

public class ConfigHandler {
    public static Configuration configuration;

    public static void init(File configFile) {
        Configuration conf = new Configuration(configFile);

        @SuppressWarnings("unused")
        String usedVersion;

        try {
            conf.load();
            usedVersion = conf.get("Version info", "VERSION INFO - Please do not change this", Reference.MOD_VERSION)
                    .getString();

            Module.LAMPS = conf.get("General", "LAMP MODULE (adding lamps to the game)", Module.LAMPS_DEFAULT).getBoolean(
                    Module.LAMPS_DEFAULT);
            Module.TOOLS = conf.get("General", "TOOL MODULE (adding gem tools and wool card to the game)", Module.TOOLS_DEFAULT).getBoolean(
                    Module.TOOLS_DEFAULT);
            Module.STORAGE = conf.get("General", "STORAGE MODULE (adding the storage blocks to the game - Copper Storage Block, Silver Storage Block, etc.)",
                    Module.STORAGE_DEFAULT).getBoolean(Module.STORAGE_DEFAULT);
            Module.ORES = conf.get("General", "ORES MODULE (adding ores to the game)", Module.ORES_DEFAULT).getBoolean(
                    Module.ORES_DEFAULT);
            Module.DECOR = conf.get("General", "DECOR MODULE (adding decorative blocks to the game - basalt, marble and their variants)",
                    Module.DECOR_DEFAULT).getBoolean(Module.DECOR_DEFAULT);
            Module.PROCESSED = conf.get("General", "PROCESSED MODULE (adding processed things to the game - all gems, ingots and dusts)", Module.PROCESSED_DEFAULT).getBoolean(
                    Module.PROCESSED_DEFAULT);
            Module.TURTLES = conf.get("General", "TURTLE MODULE (adding gem tools to turtles from computercraft) [dependent on tools - if tools is off, this is too!]",
                    Module.TURTLES_DEFAULT).getBoolean(Module.TURTLES_DEFAULT);

            WorldGen.WORLDGEN_RUBY = conf.get("World Generation", "Ruby Generation", WorldGen.WORLDGEN_RUBY_DEFAULT)
                    .getBoolean(WorldGen.WORLDGEN_RUBY_DEFAULT);
            WorldGen.WORLDGEN_GREENSAPPHIRE = conf.get("World Generation", "Green Sapphire Generation",
                    WorldGen.WORLDGEN_GREENSAPPHIRE_DEFAULT).getBoolean(WorldGen.WORLDGEN_GREENSAPPHIRE_DEFAULT);
            WorldGen.WORLDGEN_SAPPHIRE = conf.get("World Generation", "Sapphire Generation",
                    WorldGen.WORLDGEN_SAPPHIRE_DEFAULT).getBoolean(WorldGen.WORLDGEN_SAPPHIRE_DEFAULT);
            WorldGen.WORLDGEN_TIN = conf.get("World Generation", "Tin Generation", WorldGen.WORLDGEN_TIN_DEFAULT)
                    .getBoolean(WorldGen.WORLDGEN_TIN_DEFAULT);
            WorldGen.WORLDGEN_COPPER = conf.get("World Generation", "Copper Generation",
                    WorldGen.WORLDGEN_COPPER_DEFAULT).getBoolean(WorldGen.WORLDGEN_COPPER_DEFAULT);
            WorldGen.WORLDGEN_SILVER = conf.get("World Generation", "Silver Generation",
                    WorldGen.WORLDGEN_SILVER_DEFAULT).getBoolean(WorldGen.WORLDGEN_SILVER_DEFAULT);
            WorldGen.WORLDGEN_NIKOLITE = conf.get("World Generation", "Nikolite Generation",
                    WorldGen.WORLDGEN_NIKOLITE_DEFAULT).getBoolean(WorldGen.WORLDGEN_NIKOLITE_DEFAULT);
            WorldGen.WORLDGEN_TUNGSTEN = conf.get("World Generation", "Tungsten Generation",
                    WorldGen.WORLDGEN_TUNGSTEN_DEFAULT).getBoolean(WorldGen.WORLDGEN_TUNGSTEN_DEFAULT);
            WorldGen.WORLDGEN_MARBLE = conf.get("World Generation", "Marble Generation",
                    WorldGen.WORLDGEN_MARBLE_DEFAULT).getBoolean(WorldGen.WORLDGEN_MARBLE_DEFAULT);
            WorldGen.WORLDGEN_BASALT = conf.get("World Generation", "Basalt Generation",
                    WorldGen.WORLDGEN_BASALT_DEFAULT).getBoolean(WorldGen.WORLDGEN_BASALT_DEFAULT);

            conf.addCustomCategoryComment("Tweaks", "Do not change these unless you know what you're doing!");
            Tweaks.SICKLE_RANGE = conf.get("Tweaks", "Sickle range - 3 by default", Tweaks.SICKLE_RANGE_DEFAULT)
                    .getInt(Tweaks.SICKLE_RANGE_DEFAULT);
            Tweaks.TURTLE_UPGRADE_BASE = conf.get("Tweaks", "Turtle upgrade number (by default 4900)",
                    Tweaks.TURTLE_UPGRADE_BASE_DEFAULT).getInt(Tweaks.TURTLE_UPGRADE_BASE_DEFAULT);

        } catch (Exception e) {
            System.err.println("Mod called " + Reference.MOD_NAME + " was unable to load its configs!");
        } finally {
            conf.save();
        }

    }
}
