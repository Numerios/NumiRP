package num.numirp.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraftforge.common.MinecraftForge;
import num.numirp.item.ModItems;
import num.numirp.lib.Reference;
import num.numirp.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockOres extends Block {

    public BlockOres(int id) {
        super(id, Material.rock);
        setHardness(3.0F);
        setResistance(5.0F);
        setStepSound(soundStoneFootstep);
        setCreativeTab(CreativeTabs.tabBlock);
        setUnlocalizedName("numirpworld.ore");

        MinecraftForge.setBlockHarvestLevel(this, 0, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, 1, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, 2, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, 3, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(this, 4, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(this, 5, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(this, 6, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, 7, "pickaxe", 2);
    }

    @SideOnly(Side.CLIENT)
    private Icon[] icons;

    @Override
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
        return icons[meta];
    }

    @Override
    public int idDropped(int id, Random rand, int meta) {
        if ((id < 3) || (id == 6))
            return ModItems.itemProcessed.itemID;
        return this.blockID;
    }

    @Override
    public int damageDropped(int meta) {
        return meta;
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random random) {
        if (meta == 6)
            return 4 + random.nextInt(2) + random.nextInt(fortune + 1); // same as RS
        if (meta < 3) {
            return random.nextInt(fortune + 1) + 1;
        }
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