package num.numirp.core.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import num.numirp.world.ModuleWorld;
import num.numirp.world.decor.EnumDecor;

public class CreativeTabNRP extends CreativeTabs {
    public CreativeTabNRP(int id, String name) {
        super(id, name);
    }

    @Override
    public ItemStack getIconItemStack() {
        return EnumDecor.MARBLE.getIS(1);
    }

    @Override
    public Item getTabIconItem() {
        return Item.getItemFromBlock(ModuleWorld.decor);
    }

    @Override
    public String getTranslatedTabLabel() {
        return "NumiRP";
    }

}
