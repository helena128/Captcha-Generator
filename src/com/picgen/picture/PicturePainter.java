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
        WritableRaster rast = Raster.createPackedRaster(dataBuffer, width, height, 1, null);
        // TODO: get normal colors - 1st with random last with lum
        ColorModel colorModel = new IndexColorModel(1, 2, new byte[] {
                (byte) 0, (byte) 250} ,  new byte[]  {(byte) 0,  (byte) 250 },  new byte[]  { (byte) 0, (byte) 250 });
        img = new BufferedImage(colorModel, rast, false, null);
        Random ran = new Random();
        ran.nextBytes(imgArr);
        return img;
    }
}
