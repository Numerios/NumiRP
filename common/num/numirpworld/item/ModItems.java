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
        for (int i = 0; i < Strings.PROCESSED.length; i++) {
            LanguageRegistry.addName(new ItemStack(itemProcessed, 1, i),
                    Strings.PROCESSED_NAMES[i]);
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

    }
}
