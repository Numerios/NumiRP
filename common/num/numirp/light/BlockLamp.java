package num.numirp.light;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import num.numirp.NumiRP;
import num.numirp.core.proxy.ClientProxy;
import num.numirp.lib.Reference;
import num.numirp.lib.Strings;

import java.util.List;
import java.util.Random;

public class BlockLamp extends Block {
    public final boolean powered;
    public final boolean glow;
    public final Block normal, glowing;

    public BlockLamp(boolean powered, boolean glow, Block normal, Block glowing, String variant) {
        super(Material.redstoneLight);
        setBlockName(Reference.MOD_ID.toLowerCase() + ".light.lamp." + variant);
        this.powered = powered;
        this.glow = glow;
        this.normal = normal;
        this.glowing = glowing;

        if (glow) {
            setLightLevel(1.0F);
        } else {
            setLightLevel(0F);
        }

        setHardness(0.2F);
        setResistance(2.0F);
        setCreativeTab(NumiRP.tabNRP);
    }

    @Override
    public void onBlockAdded(World world, int x, int y, int z) {
        if (!world.isRemote) {
            int nowMetadata = world.getBlockMetadata(x, y, z);

            if (powered && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
                world.scheduleBlockUpdate(x, y, z, this, 4);
            } else if (!powered && world.isBlockIndirectlyGettingPowered(x, y, z)) {
                world.setBlock(x, y, z, glowing, nowMetadata, 3);
            }
        }
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
        if (!world.isRemote) {
            int nowMetadata = world.getBlockMetadata(x, y, z);
            if (powered && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
                world.scheduleBlockUpdate(x, y, z, this, 4);
            } else if (!powered && world.isBlockIndirectlyGettingPowered(x, y, z)) {
                world.setBlock(x, y, z, glowing, nowMetadata, 3);
            }
        }
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random random) {
        if (!world.isRemote && powered && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
            int nowMetadata = world.getBlockMetadata(x, y, z);

            world.setBlock(x, y, z, this, nowMetadata, 3);
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
    private IIcon[] icons;
    @SideOnly(Side.CLIENT)
    public IIcon overlayTexture;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister ir) {
        icons = new IIcon[Strings.COLORS.length];

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
    public IIcon getTintTexture() {
        return overlayTexture;
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (meta > 15) {
            return icons[meta - 16];
        }
        return icons[meta];
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Block block, CreativeTabs tab, List list) {
        if (!powered) {
            for (int i = 0; i < Strings.COLORS.length; i++) {
                list.add(new ItemStack(this, 1, i));
            }
        }
    }

   /* @Override
    public int blockDropped(Block block, Random par2Random, int par3) {
        return normal;
    }                    */

    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
        return new ItemStack(normal, 1, world.getBlockMetadata(x, y, z));
    }

    @Override
    public int damageDropped(int metadata) {
        return metadata;
    }

    @SideOnly(Side.CLIENT)
    public int getRenderColor(int metadata) {
        switch (metadata) {
            case 0: // white
                return new LocalColour(255, 255, 255).getInt();
            case 1: // orange
                return new LocalColour(219, 139, 42).getInt();
            case 2: // magenta
                return new LocalColour(198, 91, 193).getInt();
            case 3: // light blue
                return new LocalColour(99, 142, 203).getInt();
            case 4: // yellow
                return new LocalColour(232, 199, 37).getInt();
            case 5: // lime
                return new LocalColour(105, 178, 10).getInt();
            case 6: // pink
                return new LocalColour(226, 113, 173).getInt();
            case 7: // gray
                return new LocalColour(117, 117, 117).getInt();
            case 8: // light gray
                return new LocalColour(211, 211, 211).getInt();
            case 9: // cyan
                return new LocalColour(30, 118, 153).getInt();
            case 10: // purple
                return new LocalColour(145, 54, 201).getInt();
            case 11: // blue
                return new LocalColour(52, 94, 195).getInt();
            case 12: // brown
                return new LocalColour(135, 81, 45).getInt();
            case 13: // green
                return new LocalColour(83, 122, 20).getInt();
            case 14: // red
                return new LocalColour(191, 40, 40).getInt();
            case 15: // black
                return new LocalColour(61, 61, 61).getInt();
            default:
                return new LocalColour(0, 0, 0).getInt();
        }
    }

    /**
     * Colour class, borrowed from ComplexWiring
     */
    public static class LocalColour {
        public byte r, g, b;
        public int colour;

        public LocalColour(int r, int g, int b) {
            this.r = (byte) r;
            this.g = (byte) g;
            this.b = (byte) b;
            colour = this.getInt();
        }

        public LocalColour(int colour) {
            this((colour >> 16) & 0xFF, (colour >> 8) & 0xFF, colour & 0xFF);
        }

        public int getInt() {
            return (this.r & 0xFF) << 16 | (this.g & 0xFF) << 8 | (this.b & 0xFF);
        }
    }
}
