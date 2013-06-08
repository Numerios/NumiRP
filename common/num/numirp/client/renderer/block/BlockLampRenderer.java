package num.numirp.client.renderer.block;

import org.lwjgl.util.Color;
import org.lwjgl.opengl.GL11;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.IBlockAccess;
import num.numirp.block.BlockLamp;
import num.numirp.core.proxy.ClientProxy;
import num.numirp.lib.BlockIDs;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

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

            int tmpBlockId;

            tmpBlockId = world.getBlockId(x, y, z - 1);
            if (tmpBlockId == BlockIDs.LAMPS_NORMAL_ACTIVE_ID || tmpBlockId == BlockIDs.LAMPS_INVERTED_ID)
                north = 0D;

            tmpBlockId = world.getBlockId(x, y, z + 1);
            if (tmpBlockId == BlockIDs.LAMPS_NORMAL_ACTIVE_ID || tmpBlockId == BlockIDs.LAMPS_INVERTED_ID)
                south = 1D;

            tmpBlockId = world.getBlockId(x + 1, y, z);
            if (tmpBlockId == BlockIDs.LAMPS_NORMAL_ACTIVE_ID || tmpBlockId == BlockIDs.LAMPS_INVERTED_ID)
                east = 1D;

            tmpBlockId = world.getBlockId(x - 1, y, z);
            if (tmpBlockId == BlockIDs.LAMPS_NORMAL_ACTIVE_ID || tmpBlockId == BlockIDs.LAMPS_INVERTED_ID)
                west = 0D;

            tmpBlockId = world.getBlockId(x, y + 1, z);
            if (tmpBlockId == BlockIDs.LAMPS_NORMAL_ACTIVE_ID || tmpBlockId == BlockIDs.LAMPS_INVERTED_ID)
                up = 1D;

            tmpBlockId = world.getBlockId(x, y - 1, z);
            if (tmpBlockId == BlockIDs.LAMPS_NORMAL_ACTIVE_ID || tmpBlockId == BlockIDs.LAMPS_INVERTED_ID)
                down = 0D;

            BlockLamp lamp = (BlockLamp) block;
            int metadata = world.getBlockMetadata(x, y, z);
            Color colors = lamp.getOverlayColor(metadata);
            renderer.overrideBlockBounds(west, down, north, east, up, south);
            renderer.setOverrideBlockTexture(lamp.glowTexture);
            renderer.renderStandardBlockWithColorMultiplier(lamp, x, y, z, (float) colors.getRed() / 255,
                    (float) colors.getGreen() / 255, (float) colors.getBlue() / 255);
            renderer.clearOverrideBlockTexture();
            renderer.unlockBlockBounds();
            return true;
        } else {
            if (renderer.hasOverrideBlockTexture()) {
                renderer.clearOverrideBlockTexture();
            }
            renderer.renderStandardBlock(block, x, y, z);
            return true;
        }
    }

    @Override
    public boolean shouldRender3DInInventory() {
        return true;
    }

    @Override
    public int getRenderId() {
        return ClientProxy.blockLampRenderType;
    }

}
