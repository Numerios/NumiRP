package num.numirp.tools;

/*
public class ItemToolPickaxe extends ItemPickaxe {
    private int materialID;
    private EnumToolMaterial toolMaterial;

    private static Material[] materialsEffectiveAgainst = {Material.rock, Material.iron, Material.piston,
            Material.anvil, Material.circuits, Material.ice, Material.glass};

    public ItemToolPickaxe(int itemId, EnumToolMaterial toolMaterial) {
        super(itemId, toolMaterial);
        setCreativeTab(NumiRP.tabNRP);
        this.toolMaterial = toolMaterial;

        if (toolMaterial.name() == "RUBY") {
            setUnlocalizedName("pickaxeRuby");
            materialID = 0;
        } else if (toolMaterial.name() == "GREENSAPPHIRE") {
            setUnlocalizedName("pickaxeGreenSapphire");
            materialID = 1;
        } else if (toolMaterial.name() == "SAPPHIRE") {
            setUnlocalizedName("pickaxeSapphire");
            materialID = 2;
        } else {
            setUnlocalizedName("pickaxeUnknown");
            materialID = 3;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.TEXTURE_PATH + "pickaxe" + Strings.ORES[materialID]);
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
                int harvestLevel = MinecraftForge.getBlockHarvestLevel(block, meta, "pickaxe");
                if (harvestLevel <= toolMaterial.getHarvestLevel()) {
                    return toolMaterial.getEfficiencyOnProperMaterial();
                }
                return 0.5F;
            }
        }
        return super.getStrVsBlock(is, block, meta);
    }
}            */
