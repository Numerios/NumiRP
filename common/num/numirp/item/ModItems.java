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
import num.numirp.item.tool.ItemToolAthame;
import num.numirp.item.tool.ItemToolAxe;
import num.numirp.item.tool.ItemToolHoe;
import num.numirp.item.tool.ItemToolPickaxe;
import num.numirp.item.tool.ItemToolShovel;
import num.numirp.item.tool.ItemToolSickle;
import num.numirp.item.tool.ItemToolSword;

public class ModItems {
    public static Item itemProcessed;
    public static ItemStack gemSapphire, gemGreenSapphire, gemRuby, ingotCopper, ingotTin, ingotSilver, dustNikolite,
            ingotTungsten;

    // Tools
    public static Item pickaxeRuby, pickaxeGreenSapphire, pickaxeSapphire;
    public static Item shovelRuby, shovelGreenSapphire, shovelSapphire;
    public static Item axeRuby, axeGreenSapphire, axeSapphire;
    public static Item swordRuby, swordGreenSapphire, swordSapphire;
    public static Item hoeRuby, hoeGreenSapphire, hoeSapphire;
    public static Item sickleWooden, sickleStone, sickleIron, sickleGolden, sickleDiamond, sickleRuby,
            sickleGreenSapphire, sickleSapphire;
    public static Item athame;
    public static Item woolcard;

    public static void init() {

        // Material types for tools
        EnumToolMaterial ruby = EnumHelper.addToolMaterial("RUBY", 2, 500, 8.0F, 3, 12);
        EnumToolMaterial greenSapphire = EnumHelper.addToolMaterial("GREENSAPPHIRE", 2, 500, 8.0F, 3, 12);
        EnumToolMaterial sapphire = EnumHelper.addToolMaterial("SAPPHIRE", 2, 500, 8.0F, 3, 12);

        // Processed items
        itemProcessed = new ItemProcessed(ItemIDs.PROCESSED_ID);
        GameRegistry.registerItem(itemProcessed, "itemProcessed");
        for (int i = 0; i < Strings.PROCESSED.length; i++) {
            LanguageRegistry.addName(new ItemStack(itemProcessed, 1, i), Strings.PROCESSED_NAMES[i]);
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
        pickaxeRuby = new ItemToolPickaxe(ItemIDs.PICKAXE_RUBY_ID, ruby);
        pickaxeGreenSapphire = new ItemToolPickaxe(ItemIDs.PICKAXE_GREEN_SAPPHIRE_ID, greenSapphire);
        pickaxeSapphire = new ItemToolPickaxe(ItemIDs.PICKAXE_SAPPHIRE_ID, sapphire);

        GameRegistry.registerItem(pickaxeRuby, "pickaxeRuby");
        GameRegistry.registerItem(pickaxeGreenSapphire, "pickaxeGreenSapphire");
        GameRegistry.registerItem(pickaxeSapphire, "pickaxeSapphire");

        LanguageRegistry.addName(new ItemStack(pickaxeRuby, 1), Strings.ORE_NAMES[0] + " Pickaxe");
        LanguageRegistry.addName(new ItemStack(pickaxeGreenSapphire, 1), Strings.ORE_NAMES[1] + " Pickaxe");
        LanguageRegistry.addName(new ItemStack(pickaxeSapphire, 1), Strings.ORE_NAMES[2] + " Pickaxe");

        // Shovels
        shovelRuby = new ItemToolShovel(ItemIDs.SHOVEL_RUBY_ID, ruby);
        shovelGreenSapphire = new ItemToolShovel(ItemIDs.SHOVEL_GREEN_SAPPHIRE_ID, greenSapphire);
        shovelSapphire = new ItemToolShovel(ItemIDs.SHOVEL_SAPPHIRE_ID, sapphire);

        GameRegistry.registerItem(shovelRuby, "shovelRuby");
        GameRegistry.registerItem(shovelGreenSapphire, "shovelGreenSapphire");
        GameRegistry.registerItem(shovelSapphire, "shovelSapphire");

        LanguageRegistry.addName(new ItemStack(shovelRuby, 1), Strings.ORE_NAMES[0] + " Shovel");
        LanguageRegistry.addName(new ItemStack(shovelGreenSapphire, 1), Strings.ORE_NAMES[1] + " Shovel");
        LanguageRegistry.addName(new ItemStack(shovelSapphire, 1), Strings.ORE_NAMES[2] + " Shovel");

        // Axes
        axeRuby = new ItemToolAxe(ItemIDs.AXE_RUBY_ID, ruby);
        axeGreenSapphire = new ItemToolAxe(ItemIDs.AXE_GREEN_SAPPHIRE_ID, greenSapphire);
        axeSapphire = new ItemToolAxe(ItemIDs.AXE_SAPPHIRE_ID, sapphire);

        GameRegistry.registerItem(axeRuby, "axeRuby");
        GameRegistry.registerItem(axeGreenSapphire, "axeGreenSapphire");
        GameRegistry.registerItem(axeSapphire, "axeSapphire");

        LanguageRegistry.addName(new ItemStack(axeRuby, 1), Strings.ORE_NAMES[0] + " Axe");
        LanguageRegistry.addName(new ItemStack(axeGreenSapphire, 1), Strings.ORE_NAMES[1] + " Axe");
        LanguageRegistry.addName(new ItemStack(axeSapphire, 1), Strings.ORE_NAMES[2] + " Axe");

        // Swords
        swordRuby = new ItemToolSword(ItemIDs.SWORD_RUBY_ID, ruby);
        swordGreenSapphire = new ItemToolSword(ItemIDs.SWORD_GREEN_SAPPHIRE_ID, greenSapphire);
        swordSapphire = new ItemToolSword(ItemIDs.SWORD_SAPPHIRE_ID, sapphire);

        GameRegistry.registerItem(swordRuby, "swordRuby");
        GameRegistry.registerItem(swordGreenSapphire, "swordGreenSapphire");
        GameRegistry.registerItem(swordSapphire, "swordSapphire");

        LanguageRegistry.addName(new ItemStack(swordRuby, 1), Strings.ORE_NAMES[0] + " Sword");
        LanguageRegistry.addName(new ItemStack(swordGreenSapphire, 1), Strings.ORE_NAMES[1] + " Sword");
        LanguageRegistry.addName(new ItemStack(swordSapphire, 1), Strings.ORE_NAMES[2] + " Sword");

        // Hoes
        hoeRuby = new ItemToolHoe(ItemIDs.HOE_RUBY_ID, ruby);
        hoeGreenSapphire = new ItemToolHoe(ItemIDs.HOE_GREEN_SAPPHIRE_ID, greenSapphire);
        hoeSapphire = new ItemToolHoe(ItemIDs.HOE_SAPPHIRE_ID, sapphire);

        GameRegistry.registerItem(hoeRuby, "hoeRuby");
        GameRegistry.registerItem(hoeGreenSapphire, "hoeGreenSapphire");
        GameRegistry.registerItem(hoeSapphire, "hoeSapphire");

        LanguageRegistry.addName(new ItemStack(hoeRuby, 1), Strings.ORE_NAMES[0] + " Hoe");
        LanguageRegistry.addName(new ItemStack(hoeGreenSapphire, 1), Strings.ORE_NAMES[1] + " Hoe");
        LanguageRegistry.addName(new ItemStack(hoeSapphire, 1), Strings.ORE_NAMES[2] + " Hoe");

        // Sickles
        sickleWooden = new ItemToolSickle(ItemIDs.SICKLE_WOODEN_ID, EnumToolMaterial.WOOD);
        sickleStone = new ItemToolSickle(ItemIDs.SICKLE_STONE_ID, EnumToolMaterial.STONE);
        sickleIron = new ItemToolSickle(ItemIDs.SICKLE_IRON_ID, EnumToolMaterial.IRON);
        sickleGolden = new ItemToolSickle(ItemIDs.SICKLE_GOLDEN_ID, EnumToolMaterial.GOLD);
        sickleDiamond = new ItemToolSickle(ItemIDs.SICKLE_DIAMOND_ID, EnumToolMaterial.EMERALD);
        sickleRuby = new ItemToolSickle(ItemIDs.SICKLE_RUBY_ID, ruby);
        sickleGreenSapphire = new ItemToolSickle(ItemIDs.SICKLE_GREEN_SAPPHIRE_ID, greenSapphire);
        sickleSapphire = new ItemToolSickle(ItemIDs.SICKLE_SAPPHIRE_ID, sapphire);

        GameRegistry.registerItem(sickleWooden, "sickleWooden");
        GameRegistry.registerItem(sickleStone, "sickleStone");
        GameRegistry.registerItem(sickleIron, "sickleIron");
        GameRegistry.registerItem(sickleGolden, "sickleGolden");
        GameRegistry.registerItem(sickleDiamond, "sickleDiamond");
        GameRegistry.registerItem(sickleRuby, "sickleRuby");
        GameRegistry.registerItem(sickleGreenSapphire, "sickleGreenSapphire");
        GameRegistry.registerItem(sickleSapphire, "sickleSapphire");

        LanguageRegistry.addName(new ItemStack(sickleWooden, 1), Strings.SICKLES[0] + " Sickle");
        LanguageRegistry.addName(new ItemStack(sickleStone, 1), Strings.SICKLES[1] + " Sickle");
        LanguageRegistry.addName(new ItemStack(sickleIron, 1), Strings.SICKLES[2] + " Sickle");
        LanguageRegistry.addName(new ItemStack(sickleGolden, 1), Strings.SICKLES[3] + " Sickle");
        LanguageRegistry.addName(new ItemStack(sickleDiamond, 1), Strings.SICKLES[4] + " Sickle");
        LanguageRegistry.addName(new ItemStack(sickleRuby, 1), Strings.SICKLES[5] + " Sickle");
        LanguageRegistry.addName(new ItemStack(sickleGreenSapphire, 1), "Green Sapphire Sickle"); // derp
        LanguageRegistry.addName(new ItemStack(sickleSapphire, 1), Strings.SICKLES[7] + " Sickle");

        // Athame
        athame = new ItemToolAthame(ItemIDs.ATHAME_ID, EnumToolMaterial.EMERALD);
        GameRegistry.registerItem(athame, "athame");
        LanguageRegistry.addName(new ItemStack(athame, 1), "Athame");

        // Wool Card
        woolcard = new ItemWoolCard(ItemIDs.WOOLCARD_ID);
        GameRegistry.registerItem(woolcard, "woolcard");
        LanguageRegistry.addName(new ItemStack(woolcard, 1), "Wool Card");

    }
}
