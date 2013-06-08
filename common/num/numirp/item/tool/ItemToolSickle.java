package num.numirp.item.tool;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import num.numirp.NumiRP;
import num.numirp.lib.Reference;
import num.numirp.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemToolSickle extends ItemTool {
    private static Block[] blocksEffectiveAgainst = new Block[] { Block.leaves,
            Block.grass, Block.vine };
    private int materialId;

    public ItemToolSickle(int itemId, EnumToolMaterial material) {
        super(itemId, 1, material, blocksEffectiveAgainst);
        setCreativeTab(NumiRP.tabRP);
        if (material.name() == "WOOD") {
            setUnlocalizedName("sickleWooden");
            materialId = 0;
        } else if (material.name() == "STONE") {
            setUnlocalizedName("sickleStone");
            materialId = 1;
        } else if (material.name() == "IRON") {
            setUnlocalizedName("sickleIron");
            materialId = 2;
        } else if (material.name() == "GOLD") {
            setUnlocalizedName("sickleGolden");
            materialId = 3;
        } else if (material.name() == "EMERALD") {
            setUnlocalizedName("sickleDiamond");
            materialId = 4;
        } else if (material.name() == "RUBY") {
            setUnlocalizedName("sickleRuby");
            materialId = 5;
        } else if (material.name() == "GREENSAPPHIRE") {
            setUnlocalizedName("sickleGreenSapphire");
            materialId = 6;
        } else if (material.name() == "SAPPHIRE") {
            setUnlocalizedName("sickleSapphire");
            materialId = 7;
        } else {
            setUnlocalizedName("sickleUnknown");
            materialId = 8;
        }
    }

    @Override
    public float getStrVsBlock(ItemStack itemstack, Block block) {
        if(block.blockMaterial == Material.leaves){
            return 1.5F;
        }
        return 0.5F;
    }

    @Override
    public boolean onBlockStartBreak(ItemStack itemstack, int x, int y, int z, EntityPlayer player) {
        World world = player.worldObj;
        Material material = world.getBlockMaterial(x, y, z);
        int damageItem = 0;
        
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                for (int k = z - 1; k <= z + 1; k++) {
                    material = world.getBlockMaterial(i, j, k);
                    if (material == Material.plants || material == Material.vine
                            || material == Material.leaves) {
                        world.destroyBlock(i, j, k, true);
                        damageItem++;
                    }
                }
            }
        }
        if(itemstack.getItemDamage() <= damageItem){
            player.destroyCurrentEquippedItem();
            return false;
        }
        itemstack.damageItem(damageItem, player);
        
        return false;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World, int par3, int par4, int par5, int par6, EntityLiving par7EntityLiving) {
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.TEXTURE_PATH + "sickle"
                + Strings.SICKLES[materialId]);
    }
}
