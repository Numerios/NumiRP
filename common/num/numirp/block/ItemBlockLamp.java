package num.numirp.block;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import num.numirp.lib.Strings;

public class ItemBlockLamp extends ItemBlock {
    public ItemBlockLamp(int par1) {
        super(par1);
        setHasSubtypes(true);
        setMaxDamage(0);
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }

    public String getUnlocalizedName(ItemStack is) {
        int meta = is.getItemDamage();
        return getUnlocalizedName() + "." + Strings.COLORS[meta];
    }

}
