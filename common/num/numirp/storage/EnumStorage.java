package num.numirp.storage;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import num.numirp.lib.Reference;
import num.numirp.world.ModuleWorld;

public enum EnumStorage {
    RUBY("storageRuby", 2),
    GREENSAPPHIRE("storageGreenSapphire", 2),
    SAPPHIRE("storageSapphire", 2),
    SILVER("storageSilver", 1),
    TIN("storageTin", 1),
    COPPER("storageCopper", 1),
    NIKOLITE("storageNikolite", 2),
    TUNGSTEN("storageTungsten", 2);

    public static final EnumStorage[] VALID = values();
    public final String name;
    public final int harvestLevel;
    public final int meta = this.ordinal();
    public IIcon icon;

    private EnumStorage(String name, int harvestLevel) {
        this.name = name;
        this.harvestLevel = harvestLevel;
    }

    public String getUnlocalizedName() {
        // removes the "storage" from the name and makes it lowercase (ex. storageCopper -> copper)
        return name.toLowerCase().substring(7, 8) + name.substring(8);
    }

    public void registerIcon(IIconRegister ir) {
        icon = ir.registerIcon(Reference.TEXTURE_PATH + "storage/" + name);
    }

    public ItemStack getIS(int amount) {
        return new ItemStack(ModuleStorage.storage, amount, meta);
    }

    public void registerOre() {
        ModuleWorld.ore.setHarvestLevel("pickaxe", harvestLevel, this.meta);
    }
}
