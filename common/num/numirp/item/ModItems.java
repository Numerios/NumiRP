package num.numirp.item;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import num.numirp.lib.ItemIDs;
import num.numirp.lib.Metadata;
import num.numirp.lib.Strings;
import num.numirp.item.tool.ItemAthame;
import num.numirp.item.tool.ToolAxe;
import num.numirp.item.tool.ToolPickaxe;
import num.numirp.item.tool.ToolShovel;
import num.numirp.item.tool.ToolSickle;

public class ModItems {
    public static Item itemProcessed;
    public static ItemStack gemSapphire, gemGreenSapphire, gemRuby, ingotCopper,
            ingotTin, ingotSilver, dustNikolite, ingotTungsten;

    // Tools
    public static Item pickaxeRuby, pickaxeGreenSapphire, pickaxeSapphire;
    public static Item shovelRuby, shovelGreenSapphire, shovelSapphire;
    public static Item axeRuby,axeGreenSapphire, axeSapphire;
    public static Item sickleRuby, sickleGreenSapphire, sickleSapphire;
    public static Item athame;

    public static void init() {
        
        //Material types for tools
        EnumToolMaterial ruby = EnumHelper.addToolMaterial("RUBY", 2, 500, 8.0F, 3, 12);
        EnumToolMaterial greenSapphire = EnumHelper.addToolMaterial("GREENSAPPHIRE", 2,
                500, 8.0F, 3, 12);
        EnumToolMaterial sapphire = EnumHelper.addToolMaterial("SAPPHIRE", 2, 500, 8.0F,
                3, 12);
        
        // Processed items
        itemProcessed = new ItemProcessed(ItemIDs.PROCESSED_ID);
        GameRegistry.registerItem(itemProcessed, "itemProcessed");
        for (int i = 0; i < Strings.PROCESSED.length; i++) {
            LanguageRegistry.addName(new ItemStack(itemProcessed, 1, i),
                    Strings.PROCESSED_NAMES[i]);
        }

        gemRuby = new ItemStack(itemProcessed, 1, Metadata.RUBY);
        gemGreenSapphire = new ItemStack(itemProcessed, 1, Metadata.GREENSAPPHIRE);
        gemSapphire = new ItemStack(itemProcessed, 1, Metadata.SAPPHIRE);
        ingotTin = new ItemStack(itemProcessed, 1, Metadata.TIN);
        ingotCopper = new ItemStack(itemProcessed, 1, Metadata.COPPER);
        ingotSilver = new ItemStack(itemProcessed, 1, Metadata.SILVER);
        dustNikolite = new ItemStack(itemProcessed, 1, Metadata.NIKOLITE);
        ingotTungsten = new ItemStack(itemProcessed, 1, Metadata.TUNGSTEN);

        OreDictionary.registerOre("gemRuby", gemRuby);
        OreDictionary.registerOre("gemGreenSapphire", gemGreenSapphire);
        OreDictionary.registerOre("gemSapphire", gemSapphire);
        OreDictionary.registerOre("ingotTin", ingotTin);
        OreDictionary.registerOre("ingotCopper", ingotCopper);
        OreDictionary.registerOre("ingotSilver", ingotSilver);
        OreDictionary.registerOre("dustNikolite", dustNikolite);
        OreDictionary.registerOre("ingotTungsten", ingotTungsten);

        // Pickaxes
        pickaxeRuby = new ToolPickaxe(ItemIDs.PICKAXE_RUBY_ID, ruby);
        pickaxeGreenSapphire = new ToolPickaxe(ItemIDs.PICKAXE_GREEN_SAPPHIRE_ID,
                greenSapphire);
        pickaxeSapphire = new ToolPickaxe(ItemIDs.PICKAXE_SAPPHIRE_ID, sapphire);

        GameRegistry.registerItem(pickaxeRuby, "pickaxeRuby");
        GameRegistry.registerItem(pickaxeGreenSapphire, "pickaxeGreenSapphire");
        GameRegistry.registerItem(pickaxeSapphire, "pickaxeSapphire");

        LanguageRegistry.addName(new ItemStack(pickaxeRuby, 1), Strings.ORE_NAMES[0] + " Pickaxe");
        LanguageRegistry.addName(new ItemStack(pickaxeGreenSapphire, 1),
                Strings.ORE_NAMES[1] + " Pickaxe");
        LanguageRegistry.addName(new ItemStack(pickaxeSapphire, 1), Strings.ORE_NAMES[2] + " Pickaxe");

        // Shovels
        shovelRuby = new ToolShovel(ItemIDs.SHOVEL_RUBY_ID, ruby);
        shovelGreenSapphire = new ToolShovel(ItemIDs.SHOVEL_GREEN_SAPPHIRE_ID,
                greenSapphire);
        shovelSapphire = new ToolShovel(ItemIDs.SHOVEL_SAPPHIRE_ID, sapphire);

        GameRegistry.registerItem(shovelRuby, "shovelRuby");
        GameRegistry.registerItem(shovelGreenSapphire, "shovelGreenSapphire");
        GameRegistry.registerItem(shovelSapphire, "shovelSapphire");

        LanguageRegistry.addName(new ItemStack(shovelRuby, 1), Strings.ORE_NAMES[0] + " Shovel");
        LanguageRegistry.addName(new ItemStack(shovelGreenSapphire, 1),
                Strings.ORE_NAMES[1] + " Shovel");
        LanguageRegistry.addName(new ItemStack(shovelSapphire, 1), Strings.ORE_NAMES[2] + " Shovel");

        // Shovels
        axeRuby = new ToolAxe(ItemIDs.AXE_RUBY_ID, ruby);
        axeGreenSapphire = new ToolAxe(ItemIDs.AXE_GREEN_SAPPHIRE_ID, greenSapphire);
        axeSapphire = new ToolAxe(ItemIDs.AXE_SAPPHIRE_ID, sapphire);

        GameRegistry.registerItem(axeRuby, "axeRuby");
        GameRegistry.registerItem(axeGreenSapphire, "axeGreenSapphire");
        GameRegistry.registerItem(axeSapphire, "axeSapphire");

        LanguageRegistry.addName(new ItemStack(axeRuby, 1), Strings.ORE_NAMES[0] + " Axe");
        LanguageRegistry.addName(new ItemStack(axeGreenSapphire, 1), Strings.ORE_NAMES[1] + " Axe");
        LanguageRegistry.addName(new ItemStack(axeSapphire, 1), Strings.ORE_NAMES[2] + " Axe");


        // Athames
        athame = new ItemAthame(ItemIDs.ATHAME_ID, EnumToolMaterial.IRON);
        GameRegistry.registerItem(athame, "athame");
        LanguageRegistry.addName(new ItemStack(athame, 1), Strings.ATHAME[0]);
        
        sickleRuby = new ToolSickle(ItemIDs.SICKLE_RUBY_ID, ruby);
        sickleGreenSapphire = new ToolSickle(ItemIDs.SICKLE_GREEN_SAPPHIRE_ID, greenSapphire);
        sickleSapphire = new ToolSickle(ItemIDs.SICKLE_SAPPHIRE_ID, sapphire);

        // Sickles
        GameRegistry.registerItem(sickleRuby, "sickleRuby");
        GameRegistry.registerItem(sickleGreenSapphire, "sickleGreenSapphire");
        GameRegistry.registerItem(sickleSapphire, "sickleSapphire");

        LanguageRegistry.addName(new ItemStack(sickleRuby, 1), Strings.ORE_NAMES[0] + " Sickle");
        LanguageRegistry.addName(new ItemStack(sickleGreenSapphire, 1), Strings.ORE_NAMES[1] + " Sickle");
        LanguageRegistry.addName(new ItemStack(sickleSapphire, 1), Strings.ORE_NAMES[2] + " Sickle");

    }
}
