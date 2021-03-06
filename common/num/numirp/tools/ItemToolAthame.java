package num.numirp.tools;

import com.google.common.collect.Multimap;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import num.numirp.NumiRP;
import num.numirp.core.util.MaterialHelper;
import num.numirp.lib.Reference;

import java.util.Random;

public class ItemToolAthame extends ItemSword {
    private float damage;
    private float materialDamage;
    private EnumToolMaterial toolMaterial;

    public ItemToolAthame(int id, EnumToolMaterial toolMaterial) {
        super(id, toolMaterial);
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
}
