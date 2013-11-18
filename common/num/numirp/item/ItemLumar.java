package num.numirp.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import num.numirp.NumiRP;
import num.numirp.lib.Reference;
import num.numirp.lib.Strings;

import java.util.List;

public class ItemLumar extends Item {
    public ItemLumar(int id) {
        super(id);
        setHasSubtypes(true);
        setMaxDamage(0);
        setCreativeTab(NumiRP.tabNRP);
    }

    @SideOnly(Side.CLIENT)
    private Icon[] icons;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir) {
        icons = new Icon[Strings.COLORS.length];

        for (int i = 0; i < Strings.COLORS.length; i++) {
            icons[i] = ir.registerIcon(Reference.TEXTURE_PATH + "lumar" + Strings.COLORS[i]);
        }
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }

    @SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int i) {
        return icons[i];
    }

    @Override
    public String getUnlocalizedName(ItemStack is) {
        int meta = is.getItemDamage();
        return getUnlocalizedName() + ".lumar." + Strings.COLORS[meta];
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @SideOnly(Side.CLIENT)
    public void getSubItems(int par1, CreativeTabs creativetab, List list) {
        for (int i = 0; i < Strings.COLORS.length; i++) {
            list.add(new ItemStack(par1, 1, i));
        }
    }

}
