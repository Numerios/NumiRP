package num.numirp.world.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import num.numirp.NumiRP;
import num.numirp.base.ModuleBase;
import num.numirp.lib.Reference;

import java.util.List;
import java.util.Random;

public class BlockOre extends Block {
    public BlockOre() {
        super(Material.rock);
        setBlockName(Reference.MOD_ID.toLowerCase() + ".world.ore");
        setHardness(3.0F);
        setResistance(5.0F);
        setCreativeTab(NumiRP.tabNRP);
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        return EnumOre.VALID[meta].icon;
    }

    @Override
    public void registerBlockIcons(IIconRegister ir) {
        for (EnumOre ore : EnumOre.VALID) {
            ore.registerIcon(ir);
        }
    }

    @Override
    public void getSubBlocks(Item Item, CreativeTabs tab, List list) {
        for (EnumOre ore : EnumOre.VALID) {
            list.add(ore.getIS(1));
        }
    }

    @Override
    public int damageDropped(int meta) {
        return meta;
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random random) {
        if (meta == EnumOre.NIKOLITE.meta)
            return 4 + random.nextInt(2) + random.nextInt(fortune + 1); // same as RS
        if ((meta == EnumOre.RUBY.meta) || (meta == EnumOre.GREENSAPPHIRE.meta) || (meta == EnumOre.SAPPHIRE.meta)) {
            return random.nextInt(fortune + 1) + 1;
        }
        return 1;
    }

    public void registerOres() {
        for (EnumOre ore : EnumOre.VALID) {
            ore.registerOre();
        }
    }

    @Override
    public Item getItemDropped(int id, Random rand, int meta) {
        if ((meta == EnumOre.RUBY.meta) || (meta == EnumOre.GREENSAPPHIRE.meta) || (meta == EnumOre.SAPPHIRE.meta) || (meta == EnumOre.NIKOLITE.meta)) {
            return ModuleBase.processed;
        }
        return Item.getItemFromBlock(this);
    }

}
