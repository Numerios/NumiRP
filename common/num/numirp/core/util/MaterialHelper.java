package num.numirp.core.util;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class MaterialHelper {
    public static boolean isRepairable(Item.ToolMaterial material, ItemStack repairIS) {
        if (material.name() == "WOOD") {
            return (OreDictionary.getOreID("plankWood") == OreDictionary.getOreID(repairIS));
        } else if (material.name() == "STONE") {
            return repairIS.isItemEqual(new ItemStack(Blocks.cobblestone));
        } else if (material.name() == "GOLD") {
            return (OreDictionary.getOreID("ingotGold") == OreDictionary.getOreID(repairIS))
                    || (repairIS.isItemEqual(new ItemStack(Items.gold_ingot)));
        } else if (material.name() == "IRON") {
            return (OreDictionary.getOreID("ingotIron") == OreDictionary.getOreID(repairIS))
                    || (repairIS.isItemEqual(new ItemStack(Items.iron_ingot)));
        } else if (material.name() == "SILVER") {
            return (OreDictionary.getOreID("ingotSilver") == OreDictionary.getOreID(repairIS));
        } else if (material.name() == "EMERALD") {
            return repairIS.isItemEqual(new ItemStack(Items.diamond));
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
