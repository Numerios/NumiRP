package num.numirp.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;
import num.numirp.lib.Reference;
import num.numirp.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemRPShovel extends ItemSpade {
    private int materialId;

    public ItemRPShovel(int itemId, EnumToolMaterial material) {
        super(itemId, material);

        if(material.name() == "RUBY") {
            setUnlocalizedName("shovelRuby");
            materialId = 0;
        } else if(material.name() == "GREENSAPPHIRE") {
            setUnlocalizedName("shovelGreenSapphire");
            materialId = 1;
        } else if(material.name() == "SAPPHIRE") {
            setUnlocalizedName("shovelSapphire");
            materialId = 2;
        } else {
            setUnlocalizedName("shovelUnknown");
            materialId = 3;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.TEXTURE_PATH + "shovel" + Strings.ORES[materialId]);
    }
}
