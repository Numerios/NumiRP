package num.numirp.world.decor;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.oredict.OreDictionary;
import num.numirp.lib.Reference;
import num.numirp.world.ModuleWorld;

public enum EnumDecor {
    MARBLE("decorMarble", 0, 48, 72, 40, 1, true),
    BASALT("decorBasalt", 0, 0, 24, 20, 1, true),
    MARBLEBRICK("decorMarbleBrick", 0, 0, 0, 0, 0, false),
    BASALTCOBBLE("decorBasaltCobble", 0, 0, 0, 0, 0, false),
    BASALTBRICK("decorBasaltBrick", 0, 0, 0, 0, 0, false),
    BASALTCHISELED("decorBasaltChiseled", 0, 0, 0, 0, 0, false),
    BASALTPAVER("decorBasaltPaver", 0, 0, 0, 0, 0, false);

    public static final EnumDecor[] VALID = values();
    public final String name;
    public final int harvestLevel, minY, maxY, clusterNum, clusterSize;
    public final boolean generated;
    public final int meta = this.ordinal();
    public IIcon icon;

    private EnumDecor(String name, int harvestLevel, int minY, int maxY, int clusterNum, int clusterSize, boolean generated) {
        this.name = name;
        this.harvestLevel = harvestLevel;
        this.minY = minY;
        this.maxY = maxY;
        this.clusterNum = clusterNum;
        this.clusterSize = clusterSize;
        this.generated = generated;
    }

    public String getUnlocalizedName() {
        // removes the "ore" from the name and makes it lowercase (ex. oreCopper -> copper)
        return name.toLowerCase().substring(5, 6) + name.substring(6);
    }

    public void registerIcon(IIconRegister ir) {
        icon = ir.registerIcon(Reference.TEXTURE_PATH + "world/decor/" + name);
    }

    public ItemStack getIS(int amount) {
        return new ItemStack(ModuleWorld.decor, amount, meta);
    }

    public void registerOre() {
        OreDictionary.registerOre(this.name, this.getIS(1));
        ModuleWorld.ore.setHarvestLevel("pickaxe", harvestLevel, this.meta);
    }
}
