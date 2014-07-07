package num.numirp.tools;

/*
public class ItemToolHoe extends ItemHoe {
    private int materialID;
    private EnumToolMaterial toolMaterial;

    public ItemToolHoe(int itemId, EnumToolMaterial toolMaterial) {
        super(itemId, toolMaterial);
        setCreativeTab(NumiRP.tabNRP);
        this.toolMaterial = toolMaterial;

        if (toolMaterial.name() == "RUBY") {
            setUnlocalizedName("hoeRuby");
            materialID = 0;
        } else if (toolMaterial.name() == "GREENSAPPHIRE") {
            setUnlocalizedName("hoeGreenSapphire");
            materialID = 1;
        } else if (toolMaterial.name() == "SAPPHIRE") {
            setUnlocalizedName("hoeSapphire");
            materialID = 2;
        } else {
            setUnlocalizedName("hoeUnknown");
            materialID = 3;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.TEXTURE_PATH + "hoe" + Strings.ORES[materialID]);
    }

    @Override
    public boolean getIsRepairable(ItemStack toolIS, ItemStack repairIS) {
        return MaterialHelper.isRepairable(toolMaterial, repairIS);
    }
}      */
