package num.numirp.block;

import java.util.List;
import java.util.Random;

import org.lwjgl.util.Color;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import num.numirp.NumiRP;
import num.numirp.core.proxy.ClientProxy;
import num.numirp.lib.Reference;
import num.numirp.lib.Strings;
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
            setLightValue(0.9F);
        } else {
            setLightValue(0F);
        }

        setHardness(3.0F);
        setResistance(2.0F);
        setStepSound(soundGlassFootstep);
        setCreativeTab(NumiRP.tabRP);
        setUnlocalizedName("numirpworld.lamp");

        MinecraftForge.setBlockHarvestLevel(this, "pickaxe", 0);
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
        return ClientProxy.blockLampRenderType;
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
    public Icon glowTexture;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir) {
        icons = new Icon[Strings.COLORS.length];

        for (int i = 0; i < Strings.COLORS.length; i++) {
            icons[i] = ir.registerIcon(Reference.TEXTURE_PATH + "lamp" + Strings.COLORS[i]);
        }

        glowTexture = ir.registerIcon(Reference.TEXTURE_PATH + "lampGlow");
    }

    @SideOnly(Side.CLIENT)
    public Icon getGlowTexture() {
        return glowTexture;
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
        if(!powered){
            for (int i = 0; i < Strings.COLORS.length; i++) {
                list.add(new ItemStack(par1, 1, i));
            }
        }
    }
    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return normalId;
    }

    @SideOnly(Side.CLIENT)

    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return normalId;
    }

    @SideOnly(Side.CLIENT)
    public Color getOverlayColor(int metadata) {
        switch (metadata) {
            case 0:
                return new Color(221, 221, 221);
            case 1:
                return new Color(219, 125, 62);
            case 2:
                return new Color(179, 80, 188);
            case 3:
                return new Color(107, 138, 201);
            case 4:
                return new Color(177, 166, 39);
            case 5:
                return new Color(65, 174, 56);
            case 6:
                return new Color(208, 132, 153);
            case 7:
                return new Color(64, 64, 64);
            case 8:
                return new Color(154, 161, 161);
            case 9:
                return new Color(46, 110, 137);
            case 10:
                return new Color(126, 61, 181);
            case 11:
                return new Color(46, 56, 141);
            case 12:
                return new Color(79, 50, 31);
            case 13:
                return new Color(53, 70, 27);
            case 14:
                return new Color(150, 52, 48);
            case 15:
                return new Color(25, 25, 25);
            default:
                return new Color(0, 0, 0);
        }
    }
}
