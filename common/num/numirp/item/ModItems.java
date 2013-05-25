package num.numirp.item;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import num.numirp.lib.ItemIDs;
import num.numirp.lib.Strings;
import num.numirp.item.ItemRPPickaxe;

public class ModItems {
    public static Item itemProcessed;
    public static ItemStack gemSapphire, gemGreenSapphire, gemRuby, ingotCopper, ingotTin, ingotSilver, dustNikolite,
            ingotTungsten;

    // Tools
    public static Item pickaxeRuby, pickaxeGreenSapphire, pickaxeSapphire;
    public static Item shovelRuby, shovelGreenSapphire, shovelSapphire;
    public static Item axeRuby,axeGreenSapphire, axeSapphire;
    public static Item sickleRuby;

    public static void init() {
        itemProcessed = new ItemProcessed(ItemIDs.PROCESSED_ID);
        GameRegistry.registerItem(itemProcessed, "itemProcessed");
        for (int i = 0; i < Strings.PROCESSED.length; i++) {
            LanguageRegistry.addName(new ItemStack(itemProcessed, 1, i), Strings.PROCESSED_NAMES[i]);
        }

        gemRuby = new ItemStack(itemProcessed, 1, 0);
        gemGreenSapphire = new ItemStack(itemProcessed, 1, 1);
        gemSapphire = new ItemStack(itemProcessed, 1, 2);
        ingotTin = new ItemStack(itemProcessed, 1, 3);
        ingotCopper = new ItemStack(itemProcessed, 1, 4);
        ingotSilver = new ItemStack(itemProcessed, 1, 5);
        dustNikolite = new ItemStack(itemProcessed, 1, 6);
        ingotTungsten = new ItemStack(itemProcessed, 1, 7);

        OreDictionary.registerOre("gemRuby", gemRuby);
        OreDictionary.registerOre("gemGreenSapphire", gemGreenSapphire);
        OreDictionary.registerOre("gemSapphire", gemSapphire);
        OreDictionary.registerOre("ingotTin", ingotTin);
        OreDictionary.registerOre("ingotCopper", ingotCopper);
        OreDictionary.registerOre("ingotSilver", ingotSilver);
        OreDictionary.registerOre("dustNikolite", dustNikolite);
        OreDictionary.registerOre("ingotTungsten", ingotTungsten);

        // Pickaxes
        EnumToolMaterial ruby = EnumHelper.addToolMaterial("RUBY", 2, 500, 8.0F, 3, 12);
        EnumToolMaterial greenSapphire = EnumHelper.addToolMaterial("GREENSAPPHIRE", 2, 500, 8.0F, 3, 12);
        EnumToolMaterial sapphire = EnumHelper.addToolMaterial("SAPPHIRE", 2, 500, 8.0F, 3, 12);
        
        pickaxeRuby = new ItemRPPickaxe(ItemIDs.PICKAXE_RUBY_ID, ruby);
        GameRegistry.registerItem(pickaxeRuby, "pickaxeRuby");
        LanguageRegistry.addName(new ItemStack(pickaxeRuby, 1), Strings.PICKAXES[0]);
        
        pickaxeGreenSapphire = new ItemRPPickaxe(ItemIDs.PICKAXE_GREEN_SAPPHIRE_ID, greenSapphire);
        GameRegistry.registerItem(pickaxeGreenSapphire, "pickaxeGreenSapphire");
        LanguageRegistry.addName(new ItemStack(pickaxeGreenSapphire, 1), Strings.PICKAXES[1]);
        
        pickaxeSapphire = new ItemRPPickaxe(ItemIDs.PICKAXE_SAPPHIRE_ID, sapphire);
        GameRegistry.registerItem(pickaxeSapphire, "pickaxeSapphire");
        LanguageRegistry.addName(new ItemStack(pickaxeSapphire, 1), Strings.PICKAXES[2]);

        // Shovels
        shovelRuby = new ItemRPShovel(ItemIDs.SHOVEL_RUBY_ID, ruby);
        GameRegistry.registerItem(shovelRuby, "shovelRuby");
        LanguageRegistry.addName(new ItemStack(shovelRuby, 1), Strings.SHOVELS[0]);
        
        shovelGreenSapphire = new ItemRPShovel(ItemIDs.SHOVEL_GREEN_SAPPHIRE_ID, greenSapphire);
        GameRegistry.registerItem(shovelGreenSapphire, "shovelGreenSapphire");
        LanguageRegistry.addName(new ItemStack(shovelGreenSapphire, 1), Strings.SHOVELS[1]);
        
        shovelSapphire = new ItemRPShovel(ItemIDs.SHOVEL_SAPPHIRE_ID, sapphire);
        GameRegistry.registerItem(shovelSapphire, "shovelSapphire");
        LanguageRegistry.addName(new ItemStack(shovelSapphire, 1), Strings.SHOVELS[2]);

        // Shovels
        axeRuby = new ItemRPAxe(ItemIDs.AXE_RUBY_ID, ruby);
        GameRegistry.registerItem(axeRuby, "axeRuby");
        LanguageRegistry.addName(new ItemStack(axeRuby, 1), Strings.AXES[0]);
        
        axeGreenSapphire = new ItemRPAxe(ItemIDs.AXE_GREEN_SAPPHIRE_ID, greenSapphire);
        GameRegistry.registerItem(axeGreenSapphire, "axeGreenSapphire");
        LanguageRegistry.addName(new ItemStack(axeGreenSapphire, 1), Strings.AXES[1]);
        
        axeSapphire = new ItemRPAxe(ItemIDs.AXE_SAPPHIRE_ID, sapphire);
        GameRegistry.registerItem(axeSapphire, "axeSapphire");
        LanguageRegistry.addName(new ItemStack(axeSapphire, 1), Strings.AXES[2]);

        // Sickles
        sickleRuby = new ItemRPSickle(ItemIDs.SICKLE_RUBY_ID, ruby);
        GameRegistry.registerItem(sickleRuby, "sickleRuby");
        LanguageRegistry.addName(new ItemStack(sickleRuby, 1), Strings.SICKLES[0]);
        
    }
}
