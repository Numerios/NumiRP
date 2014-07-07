package num.numirp.tools;

/*
public class ItemToolAxe extends ItemAxe {
    private int materialID;
    private EnumToolMaterial toolMaterial;

    private static Material[] materialsEffectiveAgainst = {Material.wood, Material.circuits, Material.cactus,
            Material.vine, Material.pumpkin};

    public ItemToolAxe(int itemId, EnumToolMaterial toolMaterial) {
        super(itemId, toolMaterial);
        setCreativeTab(NumiRP.tabNRP);
        this.toolMaterial = toolMaterial;

        if (toolMaterial.name() == "RUBY") {
            setUnlocalizedName("axeRuby");
            materialID = 0;
        } else if (toolMaterial.name() == "GREENSAPPHIRE") {
            setUnlocalizedName("axeGreenSapphire");
            materialID = 1;
        } else if (toolMaterial.name() == "SAPPHIRE") {
            setUnlocalizedName("axeSapphire");
            materialID = 2;
        } else {
            setUnlocalizedName("axeUnknown");
            materialID = 3;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.TEXTURE_PATH + "axe" + Strings.ORES[materialID]);
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
        for (Material mat : materialsEffectiveAgainst) {
            if (mat == block.blockMaterial) {
                return true;
            }
        }
        return false;
    }

    @Override
    public float getStrVsBlock(ItemStack is, Block block, int meta) {
        for (Material mat : materialsEffectiveAgainst) {
            if (mat == block.blockMaterial) {
                int harvestLevel = MinecraftForge.getBlockHarvestLevel(block, meta, "axe");
                if (harvestLevel <= toolMaterial.getHarvestLevel()) {
                    return toolMaterial.getEfficiencyOnProperMaterial();
                }
                return 0.5F;
            }
        }
        return super.getStrVsBlock(is, block, meta);
    }

}   */
