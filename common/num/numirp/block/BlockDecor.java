package num.numirp.block;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraftforge.common.MinecraftForge;
import num.numirp.lib.Reference;
import num.numirp.lib.Strings;

public class BlockDecor extends Block {
    public BlockDecor(int id) {
        super(id, Material.rock);
        setHardness(3.0F);
        setResistance(5.0F);
        setStepSound(soundStoneFootstep);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("numirpworld.decor");
        
        MinecraftForge.setBlockHarvestLevel(this, "pickaxe", 0);
    }
    
    @SideOnly(Side.CLIENT)
    private Icon[] icons;
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir) {
        icons = new Icon[Strings.DECOR.length];

        for (int i = 0; i < Strings.DECOR.length; i++) {
            icons[i] = ir.registerIcon(Reference.TEXTURE_PATH + "block"
                    + Strings.DECOR[i]);
        }
    }
    
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        return icons[meta];
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
        for (int i = 0; i < Strings.DECOR.length; i++) {
            list.add(new ItemStack(par1, 1, i));
        }
    }
}
