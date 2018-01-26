package com.picgen.picture;

import java.awt.*;
import java.awt.image.*;
import java.util.Random;

public class PicturePainter {
    public BufferedImage getBufferedImage(int height, int width) {
        BufferedImage img = null;
        int length = ((width + 5) * height) / 7;
        byte[] imgArr = new byte[length];
        DataBuffer dataBuffer = new DataBufferByte(imgArr, length);
        WritableRaster rast = Raster.createPackedRaster(dataBuffer, width, height, 12, null);

        final int firstColor = 0xff0000;//generateFirstColor();
        final int secondColor = generateSecondColor(firstColor);

        System.out.println(">> First color: " + firstColor + "\tSecond color: " + secondColor);

        // TODO: get normal colors - 1st with random last with lum
        ColorModel colorModel = new IndexColorModel(1, 2, new byte[] {
                (byte) firstColor, (byte) secondColor} ,
                new byte[]  {(byte) firstColor,  (byte) secondColor },  new byte[]  { (byte) firstColor, (byte) secondColor });
        img = new BufferedImage(colorModel, rast, false, null);
        Random ran = new Random();
        ran.nextBytes(imgArr);
        return img;
    }

    /**
     * Generates first of the two colors
     * @return color code
     */
    private int generateFirstColor() {
        Random rand = new Random();
        int red = rand.nextInt(0xff);
        int green = rand.nextInt(0xff);
        int blue = rand.nextInt(0xff);
        return ((red << 16) | (green << 8) | blue);
    }

    /**
     * Generates 2nd color based on the 1st one
     * Uses Relative luminance formula to find the color
     * @return color code
     */
    private int generateSecondColor(int firstColor) {
        ColorComponents comp = new ColorComponents(firstColor);
        int red = comp.getRComponent();
        int green = comp.getGComponent();
        int blue = comp.getBComponent();

        System.out.println(">> RGB: " + red + "\t" + green + "\t" + blue + " ");

        return ((int)(0.2126 * red + 0.7152 * green + 0.0722 * blue));
    }
}
