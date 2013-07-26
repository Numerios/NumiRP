package num.numirp.item.tool;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
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

public class ItemToolAthame extends ItemSword {
    private float damage;
    private EnumToolMaterial material;

    public ItemToolAthame(int id, EnumToolMaterial material) {
        super(id, material);
        setUnlocalizedName("athame");
        setCreativeTab(NumiRP.tabRP);
        this.material = material;
        this.damage = 4 + material.getDamageVsEntity();
    }

    @Override
    public float getStrVsBlock(ItemStack itemstack, Block block) {
        return 0.8F;
    }

    @Override
    public boolean hitEntity(ItemStack itemStack, EntityLivingBase entityHit, EntityLivingBase player) {
        if ((entityHit instanceof EntityEnderman) || (entityHit instanceof EntityDragon)) {
            Random random = new Random();
            damage = random.nextInt((int) damage + 2) + 24;
        }
        return super.hitEntity(itemStack, entityHit, player);
    }

    @Override
    public float func_82803_g() {
        return damage;
    }

    // @Override
    // public int getDamageVsEntity(Entity entity) {
    // if ((entity instanceof EntityEnderman) || (entity instanceof
    // EntityDragon)) {
    // Random random = new Random();
    // damage = random.nextInt(damage + 2) + 24;
    // }
    // return damage;
    // }

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
        return MaterialHelper.isRepairable(material, repairIS);
    }
}
