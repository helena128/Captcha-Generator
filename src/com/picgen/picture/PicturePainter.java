package com.picgen.picture;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PicturePainter {
    public /*byte[]*/ BufferedImage drawPicture(int h, int w, int color) {
        BufferedImage img = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Pixel tmpPixel = new Pixel();

        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                tmpPixel.setColor(color);
                int p = tmpPixel.getP(); // calculate colot
                //img.setRGB(x, y, (int)Color.blue);

                // get next color
                color = getColor(tmpPixel);
            }
        }
        return img;
    }

    private int getColor(Pixel p) {
        return (int)(0.299*p.getR() + 0.587*p.getG() + 0.114*p.getB());
    }

    public void paint(Graphics g, BufferedImage img) {

    }
}
