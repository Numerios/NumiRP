package num.numirp.item.tool;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import num.numirp.NumiRP;
import num.numirp.core.util.MaterialHelper;
import num.numirp.lib.Reference;
import num.numirp.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemToolPickaxe extends ItemPickaxe {
    private int materialId;
    private EnumToolMaterial material;

    public ItemToolPickaxe(int itemId, EnumToolMaterial material) {
        super(itemId, material);
        setCreativeTab(NumiRP.tabRP);
        this.material = material;

        if (material.name() == "RUBY") {
            setUnlocalizedName("pickaxeRuby");
            materialId = 0;
        } else if (material.name() == "GREENSAPPHIRE") {
            setUnlocalizedName("pickaxeGreenSapphire");
            materialId = 1;
        } else if (material.name() == "SAPPHIRE") {
            setUnlocalizedName("pickaxeSapphire");
            materialId = 2;
        } else {
            setUnlocalizedName("pickaxeUnknown");
            materialId = 3;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.TEXTURE_PATH + "pickaxe" + Strings.ORES[materialId]);
    }
    
    @Override
    public boolean getIsRepairable(ItemStack toolIS, ItemStack repairIS) {
        return MaterialHelper.isRepairable(material, repairIS);
    }
}
