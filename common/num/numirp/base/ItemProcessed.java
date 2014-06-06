package num.numirp.base;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import num.numirp.NumiRP;
import num.numirp.lib.Reference;

import java.util.List;

public class ItemProcessed extends Item {
    public ItemProcessed() {
        super();
        setHasSubtypes(true);
        setMaxDamage(0);
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".base.processed");
        setCreativeTab(NumiRP.tabNRP);
    }

    @Override
    public void registerIcons(IIconRegister ir) {
        for (EnumProcessed processed : EnumProcessed.VALID) {
            processed.registerIcon(ir);
        }
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }

    @Override
    public IIcon getIconFromDamage(int meta) {
        return EnumProcessed.VALID[meta].icon;
    }

    @Override
    public String getUnlocalizedName(ItemStack is) {
        return EnumProcessed.VALID[is.getItemDamage()].getUnlocalizedName();
    }

    @Override
    public void getSubItems(Item item, CreativeTabs tab, List list) {
        for (int i = 0; i < EnumProcessed.VALID.length; i++) {
            list.add(EnumProcessed.VALID[i].getIS(1));
        }
    }

    public void registerOres() {
        for (EnumProcessed processed : EnumProcessed.VALID) {
            processed.registerOre();
        }
    }
}
