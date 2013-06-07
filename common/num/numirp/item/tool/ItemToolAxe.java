package num.numirp.item.tool;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import num.numirp.NumiRP;
import num.numirp.lib.Reference;
import num.numirp.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemToolAxe extends ItemAxe {
    private int materialId;

    public ItemToolAxe(int itemId, EnumToolMaterial material) {
        super(itemId, material);
        setCreativeTab(NumiRP.tabRP);

        if(material.name() == "RUBY") {
            setUnlocalizedName("axeRuby");
            materialId = 0;
        } else if(material.name() == "GREENSAPPHIRE") {
            setUnlocalizedName("axeGreenSapphire");
            materialId = 1;
        } else if(material.name() == "SAPPHIRE") {
            setUnlocalizedName("axeSapphire");
            materialId = 2;
        } else {
            setUnlocalizedName("axeUnknown");
            materialId = 3;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.TEXTURE_PATH + "axe" + Strings.ORES[materialId]);
    }
}
