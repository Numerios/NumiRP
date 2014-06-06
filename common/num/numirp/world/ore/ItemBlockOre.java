package num.numirp.world.ore;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import num.numirp.world.ModuleWorld;

public class ItemBlockOre extends ItemBlock {
    public ItemBlockOre(Block block) {
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
        return ModuleWorld.ore.getUnlocalizedName() + "." + EnumOre.VALID[is.getItemDamage()].getUnlocalizedName();
    }
}
