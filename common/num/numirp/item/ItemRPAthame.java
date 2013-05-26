package num.numirp.item;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import num.numirp.lib.Reference;

public class ItemRPAthame extends ItemSword {

    private int weaponDamage;
    
    public ItemRPAthame(int id, EnumToolMaterial material) {
        super(id, material);
        
        weaponDamage = 1 + material.getDamageVsEntity();
        setUnlocalizedName("athame");
    }
    
    @Override
    public float getStrVsBlock(ItemStack itemstack, Block block)
    {
        return 0.5F;
    }
    
    @Override
    public int getDamageVsEntity(Entity entity)
    {
        if(entity instanceof EntityEnderman) {
            Random random = new Random();
            int multiplier = random.nextInt(2);
            return this.weaponDamage * (multiplier + 6);
        }
        return this.weaponDamage;
    }
    
    @Override
    public boolean canHarvestBlock(Block block)
    {
        return false;
    }
    
    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        return par1ItemStack;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.TEXTURE_PATH + "athame");
    }
}
