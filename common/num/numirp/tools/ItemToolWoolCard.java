package num.numirp.tools;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import num.numirp.NumiRP;
import num.numirp.lib.Reference;

public class ItemToolWoolCard extends Item {

    public ItemToolWoolCard(int par1) {
        super(par1);
        setMaxStackSize(1);
        setMaxDamage(128);
        setCreativeTab(NumiRP.tabNRP);
        canRepair = false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir) {
        itemIcon = ir.registerIcon(Reference.TEXTURE_PATH + "woolCard");
    }

    public boolean doesContainerItemLeaveCraftingGrid() {
        return false;
    }

    @Override
    public boolean hasContainerItem() {
        return true;
    }

    @Override
    public ItemStack getContainerItemStack(ItemStack is) {
        is.setItemDamage(is.getItemDamage() + 1);
        if (is.getItemDamage() > getMaxDamage())
            is.stackSize = 0;
        return is;
    }

}
