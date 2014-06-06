package num.numirp.storage;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockStorage extends ItemBlock {
    public ItemBlockStorage(Block block) {
        super(block);
        setHasSubtypes(true);
        setMaxDamage(0);
    }

    @Override
    public int getMetadata(int i) {
        return i;
    }

    @Override
    public String getUnlocalizedName(ItemStack is) {
        return ModuleStorage.storage.getUnlocalizedName() + "." + EnumStorage.VALID[is.getItemDamage()].getUnlocalizedName();
    }
}
