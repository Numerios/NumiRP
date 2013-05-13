package num.numirpworld.block;

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
import num.numirpworld.lib.Reference;
import num.numirpworld.lib.Strings;

public class BlockStorage extends Block {
    public BlockStorage(int id) {
        super(id, Material.rock);
        setHardness(3.0F);
        setResistance(5.0F);
        setStepSound(soundStoneFootstep);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("numirpworld.storage");
        
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
            icons[i] = ir.registerIcon(Reference.TEXTURE_PATH + "blockStorage"
                    + Strings.ORES[i]);
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
        for (int i = 0; i < Strings.ORES.length; i++) {
            list.add(new ItemStack(par1, 1, i));
        }
    }
}
