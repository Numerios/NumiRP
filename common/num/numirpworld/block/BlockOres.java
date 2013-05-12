package num.numirpworld.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import num.numirpworld.lib.Reference;
import num.numirpworld.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockOres extends Block {

    public BlockOres(int id, Material material) {
        super(id, material);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("numirpworld.ore");
    }

    @SideOnly(Side.CLIENT)
    private Icon[] icons;

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir) {
        icons = new Icon[Strings.ORES.length];

        for (int i = 0; i < Strings.ORES.length; i++) {
            icons[i] = ir.registerIcon(Reference.TEXTURE_PATH + "ore"
                    + Strings.ORES[i]);
        }
    }

    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        return icons[side];
    }

    @Override
    public int damageDropped(int meta) {
        return meta;
    }

    @Override
    public int quantityDropped(Random random) {
        return 1;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs creativetab, List list) {
        for (int i = 0; i < Strings.ORES.length; i++) {
            list.add(new ItemStack(par1, 1, i));
        }
    }

}