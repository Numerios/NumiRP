package num.numirp.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import num.numirp.NumiRP;
import num.numirp.core.proxy.ClientProxy;
import num.numirp.lib.Reference;
import num.numirp.lib.Strings;

import org.lwjgl.util.Color;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLamp extends Block {
    public final int normalId;
    public final int glowingId;
    public final boolean powered;
    public final boolean glow;

    public BlockLamp(int id, boolean powered, boolean glow, int normalId, int glowingId) {
        super(id, Material.redstoneLight);
        this.powered = powered;
        this.glow = glow;
        this.normalId = normalId;
        this.glowingId = glowingId;

        if (glow) {
            setLightValue(1.0F);
        } else {
            setLightValue(0F);
        }

        setHardness(0.2F);
        setResistance(2.0F);
        setStepSound(soundGlassFootstep);
        setCreativeTab(NumiRP.tabRP);
        setUnlocalizedName("numirpworld.lamp");
    }

    @Override
    public void onBlockAdded(World world, int x, int y, int z) {
        if (!world.isRemote) {
            int nowMetadata = world.getBlockMetadata(x, y, z);

            if (powered && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
                world.scheduleBlockUpdate(x, y, z, blockID, 4);
            } else if (!powered && world.isBlockIndirectlyGettingPowered(x, y, z)) {
                world.setBlock(x, y, z, glowingId, nowMetadata, 3);
            }
        }
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, int neighborBlockId) {
        if (!world.isRemote) {
            int nowMetadata = world.getBlockMetadata(x, y, z);

            if (powered && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
                world.scheduleBlockUpdate(x, y, z, blockID, 4);
            } else if (!powered && world.isBlockIndirectlyGettingPowered(x, y, z)) {
                world.setBlock(x, y, z, glowingId, nowMetadata, 3);
            }
        }
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random random) {
        if (!world.isRemote && powered && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
            int nowMetadata = world.getBlockMetadata(x, y, z);

            world.setBlock(x, y, z, normalId, nowMetadata, 3);
        }
    }

    @Override
    public boolean renderAsNormalBlock() {
        return true;
    }

    @Override
    public int getRenderType() {
        if (glow) {
            return ClientProxy.blockLampRenderType;
        } else {
            return 0;
        }
    }

    @Override
    public boolean isOpaqueCube() {
        return true;
    }

    @Override
    public boolean shouldSideBeRendered(IBlockAccess blockAccess, int x, int y, int z, int side) {
        return true;
    }

    private int pass = 0;

    @Override
    public int getRenderBlockPass() {
        if (glow) {
            pass++;
            if (pass == 2)
                pass = 0;
            return pass;
        } else
            return 0;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean canRenderInPass(int pass) {
        ClientProxy.renderPass = pass;
        return true;
    }

    @SideOnly(Side.CLIENT)
    private Icon[] icons;
    @SideOnly(Side.CLIENT)
    public Icon overlayTexture;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir) {
        icons = new Icon[Strings.COLORS.length];

        if (!glow) {
            for (int i = 0; i < Strings.COLORS.length; i++) {
                icons[i] = ir.registerIcon(Reference.TEXTURE_PATH + "lamp" + Strings.COLORS[i]);
            }
        } else {
            for (int i = 0; i < Strings.COLORS.length; i++) {
                icons[i] = ir.registerIcon(Reference.TEXTURE_PATH + "lampGlow" + Strings.COLORS[i]);
            }
        }

        overlayTexture = ir.registerIcon(Reference.TEXTURE_PATH + "lampOverlay");
    }

    @SideOnly(Side.CLIENT)
    public Icon getTintTexture() {
        return overlayTexture;
    }

    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        if (meta > 15) {
            return icons[meta - 16];
        }
        return icons[meta];
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs creativetab, List list) {
        if (!powered) {
            for (int i = 0; i < Strings.COLORS.length; i++) {
                list.add(new ItemStack(par1, 1, i));
            }
        }
    }

    @Override
    public int idDropped(int par1, Random par2Random, int par3) {
        return normalId;
    }

    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
        return new ItemStack(normalId, 1, world.getBlockMetadata(x, y, z));
    }

    @Override
    public int damageDropped(int metadata) {
        return metadata;
    }

    @SideOnly(Side.CLIENT)
    public Color getOverlayColor(int metadata) {
        switch (metadata) {
            case 0: // white
                return new Color(255, 255, 255);
            case 1: // orange
                return new Color(219, 139, 42);
            case 2: // magenta
                return new Color(198, 91, 193);
            case 3: // light blue
                return new Color(99, 142, 203);
            case 4: // yellow
                return new Color(232, 199, 37);
            case 5: // lime
                return new Color(105, 178, 10);
            case 6: // pink
                return new Color(226, 113, 173);
            case 7: // gray
                return new Color(117, 117, 117);
            case 8: // light gray
                return new Color(211, 211, 211);
            case 9: // cyan
                return new Color(30, 118, 153);
            case 10: // purple
                return new Color(145, 54, 201);
            case 11: // blue
                return new Color(52, 94, 195);
            case 12: // brown
                return new Color(135, 81, 45);
            case 13: // green
                return new Color(83, 122, 20);
            case 14: // red
                return new Color(191, 40, 40);
            case 15: // black
                return new Color(61, 61, 61);
            default:
                return new Color(0, 0, 0);
        }
    }
}
