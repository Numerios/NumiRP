package num.numirp.core.util;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class MaterialHelper {
    public static boolean isRepairable(EnumToolMaterial material, ItemStack repairIS) {
        if (material.name() == "WOOD") {
            return (OreDictionary.getOreID("plankWood") == OreDictionary.getOreID(repairIS));
        } else if (material.name() == "STONE") {
            return Block.cobblestone.blockID == repairIS.itemID;
        } else if (material.name() == "GOLD") {
            return (OreDictionary.getOreID("ingotGold") == OreDictionary.getOreID(repairIS))
                    || (Item.ingotGold.itemID == repairIS.itemID);
        } else if (material.name() == "IRON") {
            return (OreDictionary.getOreID("ingotIron") == OreDictionary.getOreID(repairIS))
                    || (Item.ingotIron.itemID == repairIS.itemID);
        } else if (material.name() == "SILVER") {
            return (OreDictionary.getOreID("ingotSilver") == OreDictionary.getOreID(repairIS));
        } else if (material.name() == "EMERALD") {
            return Item.diamond.itemID == repairIS.itemID;
        } else if (material.name() == "RUBY") {
            return OreDictionary.getOreID("gemRuby") == OreDictionary.getOreID(repairIS);
        } else if (material.name() == "GREENSAPPHIRE") {
            return OreDictionary.getOreID("gemGreenSapphire") == OreDictionary.getOreID(repairIS);
        } else if (material.name() == "SAPPHIRE") {
            return OreDictionary.getOreID("gemSapphire") == OreDictionary.getOreID(repairIS);
        } else {
            return false;
        }

    }
}
