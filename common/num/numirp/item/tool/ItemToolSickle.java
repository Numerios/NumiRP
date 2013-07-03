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
import num.numirp.core.util.MaterialHelper;
import num.numirp.lib.Reference;
import num.numirp.lib.Strings;
import num.numirp.lib.Tweaks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemToolSickle extends ItemTool {
    private static Block[] blocksEffectiveAgainst = new Block[] { Block.leaves, Block.grass, Block.vine };
    private int materialId;
    private EnumToolMaterial material;

    public ItemToolSickle(int itemId, EnumToolMaterial material) {
        super(itemId, 1, material, blocksEffectiveAgainst);
        setCreativeTab(NumiRP.tabRP);
        this.material = material;

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
        if (block.blockMaterial == Material.leaves) {
            return 4F;
        }
        return 0.5F;
    }

    @Override
    public boolean onBlockStartBreak(ItemStack itemstack, int x, int y, int z, EntityPlayer player) {
        World world = player.worldObj;
        Material material = world.getBlockMaterial(x, y, z);
        int damageItem = 0;
        int configRange = Tweaks.SICKLE_RANGE;
        int range = (int) Math.floor(configRange - (configRange + 1) / 2);

        for (int i = x - range; i <= x + range; i++) {
            for (int j = y - range; j <= y + range; j++) {
                for (int k = z - range; k <= z + range; k++) {
                    material = world.getBlockMaterial(i, j, k);
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
            EntityLiving par7EntityLiving) {
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.TEXTURE_PATH + "sickle" + Strings.SICKLES[materialId]);
    }

    @Override
    public boolean getIsRepairable(ItemStack toolIS, ItemStack repairIS) {
        return MaterialHelper.isRepairable(material, repairIS);
    }
}
