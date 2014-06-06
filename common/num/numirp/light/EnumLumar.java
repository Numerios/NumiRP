package num.numirp.light;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.oredict.OreDictionary;
import num.numirp.base.ModuleBase;
import num.numirp.lib.Reference;

public enum EnumLumar {
    WHITE("lumarWhite"),
    ORANGE("lumarOrange"),
    MAGENTA("lumarMagenta"),
    LBLUE("lumarLBlue"),
    YELLOW("lumarYellow"),
    LIME("lumarLime"),
    PINK("lumarPink"),
    GRAY("lumarGray"),
    LGRAY("lumarLGray"),
    CYAN("lumarCyan"),
    PURPLE("lumarPurple"),
    BLUE("lumarBlue"),
    BROWN("lumarBrown"),
    GREEN("lumarGreen"),
    RED("lumarRed"),
    BLACK("lumarBlack");

    public static final EnumLumar[] VALID = values();
    public final String name;
    public final int meta = this.ordinal();
    public IIcon icon;

    private EnumLumar(String name) {
        this.name = name;
    }

    public String getUnlocalizedName() {
            return ModuleLight.lumar.getUnlocalizedName() + "." + name.toLowerCase().substring(5, 6) + name.substring(6);
    }

    public void registerIcon(IIconRegister ir) {
        icon = ir.registerIcon(Reference.TEXTURE_PATH + name);
    }

    public ItemStack getIS(int amount) {
        return new ItemStack(ModuleLight.lumar, amount, meta);
    }

    public void registerOre() {
        OreDictionary.registerOre(this.name, this.getIS(1));
    }
}
