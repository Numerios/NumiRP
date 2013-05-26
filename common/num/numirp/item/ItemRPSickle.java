package num.numirp.item;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import num.numirp.lib.Reference;
import num.numirp.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemRPSickle extends ItemTool {
    private static Block[] blocksEffectiveAgainst = new Block[] { Block.leaves, Block.grass, Block.vine };
    private int materialId;

    public ItemRPSickle(int itemId, EnumToolMaterial material) {
        super(itemId, 1, material, blocksEffectiveAgainst);

        if (material.name() == "RUBY") {
            setUnlocalizedName("sickleRuby");
            materialId = 0;
        } else if (material.name() == "GREENSAPPHIRE") {
            setUnlocalizedName("sickleGreenSapphire");
            materialId = 1;
        } else if (material.name() == "SAPPHIRE") {
            setUnlocalizedName("sickleSapphire");
            materialId = 2;
        } else {
            setUnlocalizedName("sickleUnknown");
            materialId = 3;
        }

        setMaxDamage(120);
    }

    @Override
    public boolean onBlockDestroyed(ItemStack itemstack, World world, int par3, int x, int y, int z, EntityLiving entity) {
        Material material = world.getBlockMaterial(x, y, z);
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                for (int k = z - 1; k <= z + 1; k++) {
                    material = world.getBlockMaterial(i, j, k);
                    if (material == Material.plants || material == Material.vine || material == Material.leaves) {
                        world.destroyBlock(i, j, k, true);
                        itemstack.damageItem(1, entity);
                    }
                }
            }
        }
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.TEXTURE_PATH + "sickle" + Strings.ORES[materialId]);
    }
}
