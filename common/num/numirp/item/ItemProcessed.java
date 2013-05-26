package num.numirp.item;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import num.numirp.lib.Reference;
import num.numirp.lib.Strings;

public class ItemProcessed extends Item {
    public ItemProcessed(int id) {
        super(id);
        setHasSubtypes(true);
        setMaxDamage(0);
        setCreativeTab(CreativeTabs.tabMaterials); // yea, yea, yea... temporary
    }

    @SideOnly(Side.CLIENT)
    private Icon[] icons;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir) {
        icons = new Icon[Strings.PROCESSED.length];

        for (int i = 0; i < Strings.PROCESSED.length; i++) {
            icons[i] = ir.registerIcon(Reference.TEXTURE_PATH
                    + Strings.PROCESSED[i]);
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
        return getUnlocalizedName() + "." + Strings.PROCESSED[meta] + "."
                + "processed";
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @SideOnly(Side.CLIENT)
    public void getSubItems(int par1, CreativeTabs creativetab, List list) {
        for (int i = 0; i < Strings.PROCESSED.length; i++) {
            list.add(new ItemStack(par1, 1, i));
        }
    }
}
