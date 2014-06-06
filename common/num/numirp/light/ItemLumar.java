package num.numirp.light;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import num.numirp.NumiRP;
import num.numirp.lib.Reference;

import java.util.List;

public class ItemLumar extends Item{
    public ItemLumar() {
        super();
        setHasSubtypes(true);
        setMaxDamage(0);
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".light.lumar");
        setCreativeTab(NumiRP.tabNRP);
    }

    @Override
    public void registerIcons(IIconRegister ir) {
        for (EnumLumar lumar : EnumLumar.VALID) {
            lumar.registerIcon(ir);
        }
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }

    @Override
    public IIcon getIconFromDamage(int meta) {
        return EnumLumar.VALID[meta].icon;
    }

    @Override
    public String getUnlocalizedName(ItemStack is) {
        return EnumLumar.VALID[is.getItemDamage()].getUnlocalizedName();
    }

    @Override
    public void getSubItems(Item item, CreativeTabs tab, List list) {
        for (int i = 0; i < EnumLumar.VALID.length; i++) {
            list.add(EnumLumar.VALID[i].getIS(1));
        }
    }

    public void registerOres() {
        for (EnumLumar lumar : EnumLumar.VALID) {
            lumar.registerOre();
        }
    }
}
