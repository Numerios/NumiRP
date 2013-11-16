package num.numirp.tools;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
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

public class ItemToolSickle extends ItemTool {
    private static Block[] blocksEffectiveAgainst = new Block[]{Block.leaves, Block.grass, Block.vine};

    private int materialID;
    private EnumToolMaterial toolMaterial;

    public ItemToolSickle(int itemId, EnumToolMaterial toolMaterial) {
        super(itemId, 1, toolMaterial, blocksEffectiveAgainst);
        setCreativeTab(NumiRP.tabRP);
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
}
