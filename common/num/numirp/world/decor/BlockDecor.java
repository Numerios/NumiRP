package num.numirp.world.decor;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import num.numirp.NumiRP;
import num.numirp.lib.Reference;
import num.numirp.world.ModuleWorld;

import java.util.List;
import java.util.Random;

public class BlockDecor extends Block {
    public BlockDecor() {
        super(Material.rock);
        setBlockName(Reference.MOD_ID.toLowerCase() + ".world.decor");
        setHardness(3.0F);
        setResistance(5.0F);
        setCreativeTab(NumiRP.tabNRP);
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        return EnumDecor.VALID[meta].icon;
    }

    @Override
    public void registerBlockIcons(IIconRegister ir) {
        for (EnumDecor decor : EnumDecor.VALID) {
            decor.registerIcon(ir);
        }
    }

    @Override
    public void getSubBlocks(Item Item, CreativeTabs tab, List list) {
        for (EnumDecor decor : EnumDecor.VALID) {
            list.add(decor.getIS(1));
        }
    }

    @Override
    public int damageDropped(int meta) {
        if (meta == EnumDecor.BASALT.meta) {
            return EnumDecor.BASALTCOBBLE.meta;
        }
        return meta;
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random random) {
        return 1;
    }

    public void registerOres() {
        for (EnumDecor decor : EnumDecor.VALID) {
            decor.registerOre();
        }
    }

    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
        return new ItemStack(ModuleWorld.decor, 1, world.getBlockMetadata(x, y, z));
    }
}
