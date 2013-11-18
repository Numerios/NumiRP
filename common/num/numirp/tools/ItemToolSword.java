package num.numirp.tools;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import num.numirp.NumiRP;
import num.numirp.core.util.MaterialHelper;
import num.numirp.lib.Reference;
import num.numirp.lib.Strings;

public class ItemToolSword extends ItemSword {
    private int materialID;
    private EnumToolMaterial toolMaterial;

    public ItemToolSword(int itemId, EnumToolMaterial toolMaterial) {
        super(itemId, toolMaterial);
        this.toolMaterial = toolMaterial;
        setCreativeTab(NumiRP.tabNRP);

        if (toolMaterial.name() == "RUBY") {
            setUnlocalizedName("swordRuby");
            materialID = 0;
        } else if (toolMaterial.name() == "GREENSAPPHIRE") {
            setUnlocalizedName("swordGreenSapphire");
            materialID = 1;
        } else if (toolMaterial.name() == "SAPPHIRE") {
            setUnlocalizedName("swordSapphire");
            materialID = 2;
        } else {
            setUnlocalizedName("swordUnknown");
            materialID = 3;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.TEXTURE_PATH + "sword" + Strings.ORES[materialID]);
    }

    @Override
    public boolean getIsRepairable(ItemStack toolIS, ItemStack repairIS) {
        return MaterialHelper.isRepairable(toolMaterial, repairIS);
    }
}
