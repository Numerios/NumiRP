package num.numirp.tools;

/*
public class ItemToolWoolCard extends Item {

    public ItemToolWoolCard(int par1) {
        super(par1);
        setMaxStackSize(1);
        setNoRepair();
        setMaxDamage(128);
        setCreativeTab(NumiRP.tabNRP);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir) {
        itemIcon = ir.registerIcon(Reference.TEXTURE_PATH + "woolCard");
    }

    @Override
    public boolean hasContainerItem() {
        return true;
    }

    @Override
    public ItemStack getContainerItemStack(ItemStack is) {
        if (is.itemID == this.itemID) {
            is.setItemDamage(is.getItemDamage() + 1);
            return is;
        } else {
            ItemStack returned = new ItemStack(this);
            returned.setItemDamage(returned.getMaxDamage());
            return returned;
        }
    }

    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack is) {
        return false;
    }

}                                          */
