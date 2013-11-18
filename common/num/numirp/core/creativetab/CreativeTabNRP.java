package num.numirp.core.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import num.numirp.block.ModBlocks;
import num.numirp.item.ModItems;
import num.numirp.lib.Module;

public class CreativeTabNRP extends CreativeTabs {

    public CreativeTabNRP(int id, String name) {
        super(id, name);
    }


    @Override
    public ItemStack getIconItemStack(){
        if(Module.DECOR) {
            return ModBlocks.blockMarble.copy();
        } else if (Module.LAMPS) {
            return ModItems.lumarGray.copy();
        } else {
            return null;
        }
    }

    @Override
    public String getTranslatedTabLabel() {
        return "NumiRP";
    }

}
