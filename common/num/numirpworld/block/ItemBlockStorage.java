package num.numirpworld.block;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import num.numirpworld.lib.Strings;

public class ItemBlockStorage extends ItemBlock {
    public ItemBlockStorage(int par1) {
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
        return getUnlocalizedName() + "." + Strings.ORES[meta] + "Storage";
    }

}
