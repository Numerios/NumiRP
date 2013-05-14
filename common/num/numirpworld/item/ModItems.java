package num.numirpworld.item;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import num.numirpworld.lib.ItemIDs;
import num.numirpworld.lib.Strings;

public class ModItems {
    public static Item itemProcessed;
    public static ItemStack gemSapphire, gemGreenSapphire, gemRuby,
            ingotCopper, ingotTin, ingotSilver, dustNikolite, ingotTungsten;

    public static void init() {
        itemProcessed = new ItemProcessed(ItemIDs.PROCESSED_ID);
        GameRegistry.registerItem(itemProcessed, "itemProcessed");
        for (int i = 0; i < Strings.ORES.length; i++) {
            LanguageRegistry.addName(new ItemStack(itemProcessed, 1, i),
                    Strings.PROCESSED_NAMES[i]);
        }

        gemSapphire = new ItemStack(itemProcessed, 1, 0);
        gemGreenSapphire = new ItemStack(itemProcessed, 1, 1);
        gemRuby = new ItemStack(itemProcessed, 1, 2);
        ingotCopper = new ItemStack(itemProcessed, 1, 3);
        ingotTin = new ItemStack(itemProcessed, 1, 4);
        ingotSilver = new ItemStack(itemProcessed, 1, 5);
        dustNikolite = new ItemStack(itemProcessed, 1, 6);
        ingotTungsten = new ItemStack(itemProcessed, 1, 7);

        OreDictionary.registerOre("gemSapphire", gemSapphire);
        OreDictionary.registerOre("gemGreenSapphire", gemGreenSapphire);
        OreDictionary.registerOre("gemRuby", gemRuby);
        OreDictionary.registerOre("ingotCopper", ingotCopper);
        OreDictionary.registerOre("ingotTin", ingotTin);
        OreDictionary.registerOre("ingotSilver", ingotSilver);
        OreDictionary.registerOre("dustNikolite", dustNikolite);
        OreDictionary.registerOre("ingotTungsten", ingotTungsten);
    }
}
