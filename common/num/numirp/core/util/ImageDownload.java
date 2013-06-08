package num.numirp.core.util;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import net.minecraft.client.renderer.IImageBuffer;

public class ImageDownload implements IImageBuffer {

    private int imgWidth;
    private int imgHeight;

    @Override
    public BufferedImage parseUserSkin(BufferedImage bufferedImage) {
        if (bufferedImage == null) {
            return null;
        }
        else {
            this.imgWidth = (bufferedImage.getWidth() <= 64) ? 64: (bufferedImage.getWidth());
            this.imgHeight = (bufferedImage.getHeight() <= 32) ? 32: (bufferedImage.getHeight());

            BufferedImage capeImage = new BufferedImage(this.imgWidth, this.imgHeight, 2);

            Graphics graphics = capeImage.getGraphics();
            graphics.drawImage(bufferedImage, 0, 0, (ImageObserver)null);
            graphics.dispose();

            return capeImage;
        }
    }

}