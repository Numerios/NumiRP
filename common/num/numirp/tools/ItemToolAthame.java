package num.numirp.tools;

/*
public class ItemToolAthame extends ItemSword {
    private float damage;
    private float materialDamage;
    private ToolMaterial toolMaterial;

    public ItemToolAthame(ToolMaterial toolMaterial) {
        super(toolMaterial);
        setUnlocalizedName("athame");
        setCreativeTab(NumiRP.tabNRP);
        this.toolMaterial = toolMaterial;
        this.materialDamage = toolMaterial.getDamageVsEntity();
        damage = materialDamage;
    }

    @Override
    public float getStrVsBlock(ItemStack itemstack, Block block) {
        return 0.8F;
    }

    @Override
    public boolean hitEntity(ItemStack is, EntityLivingBase target, EntityLivingBase attacker) {
        if ((target instanceof EntityEnderman) || (target instanceof EntityDragon)) {
            Random random = new Random();
            damage = random.nextInt((int) (materialDamage + 2)) + 20;
        }
        return super.hitEntity(is, target, attacker);
    }

    // TODO: FIX ATHAME DAMAGE!

    @Override
    public float func_82803_g() {
        return damage;
    }

    @Override
    public boolean canHarvestBlock(Block block) {
        return false;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack is, World world, EntityPlayer entityPlayer) {
        return is;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.TEXTURE_PATH + "athame");
    }

    @Override
    public boolean getIsRepairable(ItemStack toolIS, ItemStack repairIS) {
        return MaterialHelper.isRepairable(toolMaterial, repairIS);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public Multimap getItemAttributeModifiers() {
        Multimap multimap = super.getItemAttributeModifiers();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(
                field_111210_e, "Weapon modifier", (double) this.damage, 0));
        return multimap;
    }
}         */
