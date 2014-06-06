package num.numirp.world.decor;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import num.numirp.world.ModuleWorld;

public class ItemBlockDecor extends ItemBlock {
    public ItemBlockDecor(Block block) {
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
        return ModuleWorld.decor.getUnlocalizedName() + "." + EnumDecor.VALID[is.getItemDamage()].getUnlocalizedName();
    }
}
