package com.picgen.picture;

import java.awt.*;
import java.awt.image.*;
import java.util.Random;

/**
 * Creates background for the image
 */
public class PicturePainter {

    /**
     * Creates BufferedImage object, randomly colored
     * @param height - height of the BufferedImage object
     * @param width - width of BufferedImage object
     * @return created image
     */
    public BufferedImage getBufferedImage(int height, int width) {
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        int p; // pixel

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                p = getPixelColor();
                img.setRGB(x, y, p);
            }
        }
        return img;

    }

    /**
     * Creates random color for pixel
     * @return color code
     */
    protected int getPixelColor() {
        Random rand = new Random();
        int a = rand.nextInt(255);
        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);

        int p = ((a << 24) | (r << 16) | (g << 8) | b);
        return p;
    }
}
