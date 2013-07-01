package num.numirp.item.tool;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import num.numirp.NumiRP;
import num.numirp.core.util.MaterialHelper;
import num.numirp.lib.Reference;
import num.numirp.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemToolSword extends ItemSword {
    private int materialId;
    private EnumToolMaterial material;

    public ItemToolSword(int itemId, EnumToolMaterial material) {
        super(itemId, material);
        this.material = material;
        setCreativeTab(NumiRP.tabRP);

        if (material.name() == "RUBY") {
            setUnlocalizedName("swordRuby");
            materialId = 0;
        } else if (material.name() == "GREENSAPPHIRE") {
            setUnlocalizedName("swordGreenSapphire");
            materialId = 1;
        } else if (material.name() == "SAPPHIRE") {
            setUnlocalizedName("swordSapphire");
            materialId = 2;
        } else {
            setUnlocalizedName("swordUnknown");
            materialId = 3;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.TEXTURE_PATH + "sword" + Strings.ORES[materialId]);
    }

    @Override
    public boolean getIsRepairable(ItemStack toolIS, ItemStack repairIS) {
        return MaterialHelper.isRepairable(material, repairIS);
    }
}
