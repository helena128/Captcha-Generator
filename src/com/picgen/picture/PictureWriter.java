package com.picgen.picture;

import com.picgen.generators.SimpleGenerator;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * writes captcha key on the noised picture
 */
public class PictureWriter {
    public BufferedImage writeKeyWord(BufferedImage img, String word) {
        Graphics2D graphics2D = img.createGraphics();
        FontFormatter fontFormatter = new FontFormatter();

        int[] coords = findPlace(img.getWidth(), img.getHeight());

        // TODO: handle font color & style
        graphics2D.setPaint(fontFormatter.getFontColor());
        graphics2D.setFont(fontFormatter.getFont());
        graphics2D.drawString("HELLLO", coords[0], coords[1]);
        graphics2D.dispose();
        return img;
    }

    private int[] findPlace(int w, int h) {
        SimpleGenerator simpleGenerator = new SimpleGenerator();
        int[] coords = new int[2];
        int oX = (int) w / 2;
        int oY = (int) h / 2;
        // offset
        int tmpX = simpleGenerator.generateNumberInRange(-w / 2, 0);
        int tmpY = simpleGenerator.generateNumberInRange(-h / 4, h / 4);
        coords[0] = oX + tmpX;
        coords[1] = oY + tmpY;

        return coords;
    }
}
