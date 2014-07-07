package num.numirp.tools;

/*
public class ItemToolShovel extends ItemSpade {
    private int materialID;
    private EnumToolMaterial toolMaterial;

    private static Material[] materialsEffectiveAgainst = {Material.ground, Material.grass, Material.sand,
            Material.snow, Material.clay, Material.craftedSnow};

    public ItemToolShovel(int itemId, EnumToolMaterial toolMaterial) {
        super(itemId, toolMaterial);
        setCreativeTab(NumiRP.tabNRP);
        this.toolMaterial = toolMaterial;

        if (toolMaterial.name() == "RUBY") {
            setUnlocalizedName("shovelRuby");
            materialID = 0;
        } else if (toolMaterial.name() == "GREENSAPPHIRE") {
            setUnlocalizedName("shovelGreenSapphire");
            materialID = 1;
        } else if (toolMaterial.name() == "SAPPHIRE") {
            setUnlocalizedName("shovelSapphire");
            materialID = 2;
        } else {
            setUnlocalizedName("shovelUnknown");
            materialID = 3;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.TEXTURE_PATH + "shovel" + Strings.ORES[materialID]);
    }

    @Override
    public boolean getIsRepairable(ItemStack toolIS, ItemStack repairIS) {
        return MaterialHelper.isRepairable(toolMaterial, repairIS);
    }

    @Override
    public boolean canHarvestBlock(Block block) {
        if (block.blockMaterial.isToolNotRequired()) {
            return true;
        }
        for (Material material : materialsEffectiveAgainst) {
            if (material == block.blockMaterial) {
                return true;
            }
        }
        return false;
    }

    @Override
    public float getStrVsBlock(ItemStack is, Block block, int meta) {
        for (Material mat : materialsEffectiveAgainst) {
            if (mat == block.blockMaterial) {
                int harvestLevel = MinecraftForge.getBlockHarvestLevel(block, meta, "shovel");
                if (harvestLevel <= toolMaterial.getHarvestLevel()) {
                    return toolMaterial.getEfficiencyOnProperMaterial();
                }
                return 0.5F;
            }
        }
        return super.getStrVsBlock(is, block, meta);
    }
}                       */
