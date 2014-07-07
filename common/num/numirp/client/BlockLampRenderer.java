package num.numirp.client;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.IBlockAccess;
import num.numirp.core.proxy.ClientProxy;
import num.numirp.light.BlockLamp;
import num.numirp.light.ModuleLight;
import org.lwjgl.opengl.GL11;

public class BlockLampRenderer implements ISimpleBlockRenderingHandler {

    @Override
    public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer) {
        Tessellator tessellator = Tessellator.instance;

        renderer.setRenderBoundsFromBlock(block);
        GL11.glTranslatef(-0.5F, -0.5F, -0.5F);

        tessellator.startDrawingQuads();
        tessellator.setNormal(0.0F, -1F, 0.0F);
        renderer.renderFaceYNeg(block, 0.0D, 0.0D, 0.0D, block.getIcon(0, metadata));
        tessellator.draw();

        tessellator.startDrawingQuads();
        tessellator.setNormal(0.0F, 1.0F, 0.0F);
        renderer.renderFaceYPos(block, 0.0D, 0.0D, 0.0D, block.getIcon(1, metadata));
        tessellator.draw();

        tessellator.startDrawingQuads();
        tessellator.setNormal(0.0F, 0.0F, -1F);
        renderer.renderFaceZNeg(block, 0.0D, 0.0D, 0.0D, block.getIcon(2, metadata));
        tessellator.draw();

        tessellator.startDrawingQuads();
        tessellator.setNormal(0.0F, 0.0F, 1.0F);
        renderer.renderFaceZPos(block, 0.0D, 0.0D, 0.0D, block.getIcon(3, metadata));
        tessellator.draw();

        tessellator.startDrawingQuads();
        tessellator.setNormal(-1F, 0.0F, 0.0F);
        renderer.renderFaceXNeg(block, 0.0D, 0.0D, 0.0D, block.getIcon(4, metadata));
        tessellator.draw();

        tessellator.startDrawingQuads();
        tessellator.setNormal(1.0F, 0.0F, 0.0F);
        renderer.renderFaceXPos(block, 0.0D, 0.0D, 0.0D, block.getIcon(5, metadata));
        tessellator.draw();

        GL11.glTranslatef(0.5F, 0.5F, 0.5F);
    }

    @Override
    public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId,
                                    RenderBlocks renderer) {
        if (ClientProxy.renderPass == 1) {
            double north = -0.03D;
            double south = 1.03D;
            double east = 1.03D;
            double west = -0.03D;
            double up = 1.03D;
            double down = -0.03D;

            Block tmpBlock;

            tmpBlock = world.getBlock(x, y, z - 1);
            if (tmpBlock == ModuleLight.lampNormal || tmpBlock == ModuleLight.lampInverted)
                north = 0D;

            tmpBlock = world.getBlock(x, y, z + 1);
            if (tmpBlock == ModuleLight.lampNormal || tmpBlock == ModuleLight.lampInverted)
                south = 1D;

            tmpBlock = world.getBlock(x + 1, y, z);
            if (tmpBlock == ModuleLight.lampNormal || tmpBlock == ModuleLight.lampInverted)
                east = 1D;

            tmpBlock = world.getBlock(x - 1, y, z);
            if (tmpBlock == ModuleLight.lampNormal || tmpBlock == ModuleLight.lampInverted)
                west = 0D;

            tmpBlock = world.getBlock(x, y + 1, z);
            if (tmpBlock == ModuleLight.lampNormal || tmpBlock == ModuleLight.lampInverted)
                up = 1D;

            tmpBlock = world.getBlock(x, y - 1, z);
            if (tmpBlock == ModuleLight.lampNormal || tmpBlock == ModuleLight.lampInverted)
                down = 0D;

            BlockLamp lamp = (BlockLamp) block;
            int metadata = world.getBlockMetadata(x, y, z);
            int renderColor = lamp.getRenderColor(metadata);
            BlockLamp.LocalColour colour = new BlockLamp.LocalColour(renderColor);
            renderer.overrideBlockBounds(west, down, north, east, up, south);
            renderer.setOverrideBlockTexture(lamp.overlayTexture);
            renderer.renderStandardBlockWithColorMultiplier(lamp, x, y, z, (float) colour.r,
                    (float) colour.g, (float) colour.b);
            renderer.clearOverrideBlockTexture();
            renderer.unlockBlockBounds();
            return true;
        } else {
            if (renderer.hasOverrideBlockTexture()) {
                renderer.clearOverrideBlockTexture();
            }
            renderer.renderStandardBlockWithColorMultiplier(block, x, y, z, 1F, 1F, 1F);
            return true;
        }
    }

    @Override
    public boolean shouldRender3DInInventory(int modelId) {
        return true;
    }

    @Override
    public int getRenderId() {
        return ClientProxy.blockLampRenderType;
    }

}
