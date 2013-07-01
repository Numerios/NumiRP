package num.numirp.item.tool;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import num.numirp.NumiRP;
import num.numirp.core.util.MaterialHelper;
import num.numirp.lib.Reference;
import num.numirp.lib.Strings;

public class ItemToolHoe extends ItemHoe {
    private int materialId;
    private EnumToolMaterial material;

    public ItemToolHoe(int itemId, EnumToolMaterial material) {
        super(itemId, material);
        setCreativeTab(NumiRP.tabRP);
        this.material = material;

        if (material.name() == "RUBY") {
            setUnlocalizedName("hoeRuby");
            materialId = 0;
        } else if (material.name() == "GREENSAPPHIRE") {
            setUnlocalizedName("hoeGreenSapphire");
            materialId = 1;
        } else if (material.name() == "SAPPHIRE") {
            setUnlocalizedName("hoeSapphire");
            materialId = 2;
        } else {
            setUnlocalizedName("hoeUnknown");
            materialId = 3;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.TEXTURE_PATH + "hoe" + Strings.ORES[materialId]);
    }
    
    @Override
    public boolean getIsRepairable(ItemStack toolIS, ItemStack repairIS) {
        return MaterialHelper.isRepairable(material, repairIS);
    }
}
