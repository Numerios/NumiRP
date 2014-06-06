package num.numirp.world.ore;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.oredict.OreDictionary;
import num.numirp.lib.Reference;
import num.numirp.world.ModuleWorld;

public enum EnumOre {
    RUBY("oreRuby", 2, 24, 48, 2, 6),
    GREENSAPPHIRE("oreGreenSapphire", 2, 24, 48, 2, 6),
    SAPPHIRE("oreSapphire", 2, 24, 48, 2, 6),
    SILVER("oreSilver", 1, 15, 48, 5, 8),
    TIN("oreTin", 1, 15, 64, 5, 8),
    COPPER("oreCopper", 1, 24, 64, 20, 8),
    NIKOLITE("oreNikolite", 2, 0, 16, 10, 8),
    TUNGSTEN("oreTungsten", 2, 0, 16, 1, 2);

    public static final EnumOre[] VALID = values();
    public final String name;
    public final int harvestLevel, minY, maxY, clusterNum, clusterSize;
    public final int meta = this.ordinal();
    public IIcon icon;

    private EnumOre(String name, int harvestLevel, int minY, int maxY, int clusterNum, int clusterSize) {
        this.name = name;
        this.harvestLevel = harvestLevel;
        this.minY = minY;
        this.maxY = maxY;
        this.clusterNum = clusterNum;
        this.clusterSize = clusterSize;
    }

    public String getUnlocalizedName() {
        // removes the "ore" from the name and makes it lowercase (ex. oreCopper -> copper)
        return name.toLowerCase().substring(3, 4) + name.substring(4);
    }

    public void registerIcon(IIconRegister ir) {
        icon = ir.registerIcon(Reference.TEXTURE_PATH + "world/ore/" + name);
    }

    public ItemStack getIS(int amount) {
        return new ItemStack(ModuleWorld.ore, amount, meta);
    }

    public void registerOre() {
        OreDictionary.registerOre(this.name, this.getIS(1));
        ModuleWorld.ore.setHarvestLevel("pickaxe", harvestLevel, this.meta);
    }
}
