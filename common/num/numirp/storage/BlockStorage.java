package num.numirp.storage;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import num.numirp.NumiRP;
import num.numirp.lib.Reference;

import java.util.List;

public class BlockStorage extends Block {
    public BlockStorage() {
        super(Material.rock);
        setBlockName(Reference.MOD_ID.toLowerCase() + ".storage");
        setHardness(3.0F);
        setResistance(5.0F);
        setCreativeTab(NumiRP.tabNRP);
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        return EnumStorage.VALID[meta].icon;
    }

    @Override
    public void registerBlockIcons(IIconRegister ir) {
        for (EnumStorage storage : EnumStorage.VALID) {
            storage.registerIcon(ir);
        }
    }

    @Override
    public void getSubBlocks(Item Item, CreativeTabs tab, List list) {
        for (EnumStorage storage : EnumStorage.VALID) {
            list.add(storage.getIS(1));
        }
    }

    @Override
    public int damageDropped(int meta) {
        return meta;
    }

    public void registerOres() {
        for (EnumStorage storage : EnumStorage.VALID) {
            storage.registerOre();
        }
    }
}
