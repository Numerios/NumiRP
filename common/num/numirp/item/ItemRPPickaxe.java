package num.numirp.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import num.numirp.lib.Reference;
import num.numirp.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemRPPickaxe extends ItemPickaxe {
    private int materialId;

    public ItemRPPickaxe(int itemId, EnumToolMaterial material) {
        super(itemId, material);

        if(material.name() == "RUBY") {
            setUnlocalizedName("pickaxeRuby");
            materialId = 0;
        } else if(material.name() == "GREENSAPPHIRE") {
            setUnlocalizedName("pickaxeGreenSapphire");
            materialId = 1;
        } else if(material.name() == "SAPPHIRE") {
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
}
