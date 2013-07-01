package num.numirp.core.util;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class MaterialHelper {
    public static boolean isRepairable(EnumToolMaterial material, ItemStack repairIS) {
        System.err.println(material.name() + " | " + repairIS);
        switch (material.name()) {
            case "WOOD":
                return (OreDictionary.getOreID("plankWood") == OreDictionary.getOreID(repairIS));

            case "STONE":
                return Block.cobblestone.blockID == repairIS.itemID;

            case "GOLD":
                return (OreDictionary.getOreID("ingotGold") == OreDictionary.getOreID(repairIS)) || (Item.ingotGold.itemID == repairIS.itemID);

            case "IRON":
                return (OreDictionary.getOreID("ingotIron") == OreDictionary.getOreID(repairIS)) || (Item.ingotIron.itemID == repairIS.itemID);

            case "SILVER":
                return (OreDictionary.getOreID("ingotSilver") == OreDictionary.getOreID(repairIS));

            case "EMERALD":
                return Item.diamond.itemID == repairIS.itemID;

            case "RUBY":
                return OreDictionary.getOreID("gemRuby") == OreDictionary.getOreID(repairIS);

            case "GREENSAPPHIRE":
                return OreDictionary.getOreID("gemGreenSapphire") == OreDictionary.getOreID(repairIS);

            case "SAPPHIRE":
                return OreDictionary.getOreID("gemSapphire") == OreDictionary.getOreID(repairIS);

            default:
                return false;
        }
    }
}
