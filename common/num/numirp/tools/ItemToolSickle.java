package num.numirp.tools;

/*
public class ItemToolSickle extends ItemTool {
    private static Block[] blocksEffectiveAgainst = new Block[]{Block.leaves, Block.grass, Block.vine};

    private int materialID;
    private EnumToolMaterial toolMaterial;

    public ItemToolSickle(int itemId, EnumToolMaterial toolMaterial) {
        super(itemId, 1, toolMaterial, blocksEffectiveAgainst);
        setCreativeTab(NumiRP.tabNRP);
        this.toolMaterial = toolMaterial;

        if (toolMaterial.name() == "WOOD") {
            setUnlocalizedName("sickleWooden");
            materialID = 0;
        } else if (toolMaterial.name() == "STONE") {
            setUnlocalizedName("sickleStone");
            materialID = 1;
        } else if (toolMaterial.name() == "IRON") {
            setUnlocalizedName("sickleIron");
            materialID = 2;
        } else if (toolMaterial.name() == "GOLD") {
            setUnlocalizedName("sickleGolden");
            materialID = 3;
        } else if (toolMaterial.name() == "EMERALD") {
            setUnlocalizedName("sickleDiamond");
            materialID = 4;
        } else if (toolMaterial.name() == "RUBY") {
            setUnlocalizedName("sickleRuby");
            materialID = 5;
        } else if (toolMaterial.name() == "GREENSAPPHIRE") {
            setUnlocalizedName("sickleGreenSapphire");
            materialID = 6;
        } else if (toolMaterial.name() == "SAPPHIRE") {
            setUnlocalizedName("sickleSapphire");
            materialID = 7;
        } else {
            setUnlocalizedName("sickleUnknown");
            materialID = 8;
        }
    }

    @Override
    public float getStrVsBlock(ItemStack is, Block block) {
        if (block.blockMaterial == Material.leaves || block.blockMaterial == Material.vine || block.blockMaterial == Material.leaves) {
            return this.efficiencyOnProperMaterial;
        }
        return super.getStrVsBlock(is, block);
    }

    @Override
    public boolean onBlockStartBreak(ItemStack itemstack, int x, int y, int z, EntityPlayer player) {
        World world = player.worldObj;
        int damageItem = 0;
        int configRange = Tweaks.SICKLE_RANGE;
        int range = (int) Math.floor(configRange - (configRange + 1) / 2);

        for (int i = x - range; i <= x + range; i++) {
            for (int j = y - range; j <= y + range; j++) {
                for (int k = z - range; k <= z + range; k++) {
                    Material material = world.getBlockMaterial(i, j, k);
                    if (material == Material.plants || material == Material.vine || material == Material.leaves) {
                        world.destroyBlock(i, j, k, true);
                        damageItem++;
                    }
                }
            }
        }
        itemstack.damageItem(damageItem, player);
        if (itemstack.getItemDamage() >= itemstack.getMaxDamage()) {
            player.destroyCurrentEquippedItem();
            return false;
        }

        return false;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World, int par3, int par4, int par5, int par6,
                                    EntityLivingBase par7EntityLivingBase) {
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.TEXTURE_PATH + "sickle" + Strings.SICKLES[materialID]);
    }

    @Override
    public boolean getIsRepairable(ItemStack toolIS, ItemStack repairIS) {
        return MaterialHelper.isRepairable(toolMaterial, repairIS);
    }
}                     */
