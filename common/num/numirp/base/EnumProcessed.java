package num.numirp.base;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.oredict.OreDictionary;
import num.numirp.lib.Reference;

public enum EnumProcessed {
    RUBY("gemRuby"),
    GREENSAPPHIRE("gemGreenSapphire"),
    SAPPHIRE("gemSapphire"),
    SILVER("ingotSilver"),
    TIN("ingotTin"),
    COPPER("ingotCopper"),
    NIKOLITE("dustNikolite"),
    TUNGSTEN("ingotTungsten");

    public static final EnumProcessed[] VALID = values();
    public final String name;
    public final int meta = this.ordinal();
    public IIcon icon;

    private EnumProcessed(String name) {
        this.name = name;
    }

    public String getUnlocalizedName() {
        if (this == SILVER || this == TIN || this == COPPER || this == TUNGSTEN) {
            return ModuleBase.processed.getUnlocalizedName() + "." + name.toLowerCase().substring(5, 6) + name.substring(6);
        } else if (this == NIKOLITE) {
            return ModuleBase.processed.getUnlocalizedName() + "." + name.toLowerCase().substring(4, 5) + name.substring(5);
        } else {
            return ModuleBase.processed.getUnlocalizedName() + "." + name.toLowerCase().substring(3, 4) + name.substring(4);
        }
    }

    public void registerIcon(IIconRegister ir) {
        icon = ir.registerIcon(Reference.TEXTURE_PATH + name);
    }

    public ItemStack getIS(int amount) {
        return new ItemStack(ModuleBase.processed, amount, meta);
    }

    public void registerOre() {
        OreDictionary.registerOre(this.name, this.getIS(1));
    }
}
