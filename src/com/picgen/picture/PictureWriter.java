package com.picgen.picture;

import com.picgen.generators.SimpleGenerator;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * writes captcha key on the noised picture
 */
public class PictureWriter {
    /**
     * Writes key word on the picture
     * @param img - picture with ready background
     * @param word - key that must be written
     * @return updated pic with key on it
     */
    public BufferedImage writeKeyWord(BufferedImage img, String word) {
        Graphics2D graphics2D = img.createGraphics();
        FontFormatter fontFormatter = new FontFormatter();

        int[] coords = findPlace(img.getWidth(), img.getHeight());

        // TODO: handle word align?
        graphics2D.setPaint(fontFormatter.getFontColor());
        graphics2D.setFont(fontFormatter.getFont());
        graphics2D.drawString(word, coords[0], coords[1]);
        graphics2D.dispose();
        return img;
    }

    /**
     * Handles word align
     * @param w - width of pic
     * @param h - height of pic
     * @return array [x, y] with coordinates of the start point
     */
    private int[] findPlace(int w, int h) {
        SimpleGenerator simpleGenerator = new SimpleGenerator();
        int[] coords = new int[2];
        int oX = (int) w / 2;
        int oY = (int) h / 2;
        // offset
        int tmpX = simpleGenerator.generateNumberInRange(-w / 2, -w / 4);
        int tmpY = simpleGenerator.generateNumberInRange(-h / 4, h / 4);
        coords[0] = oX + tmpX;
        coords[1] = oY + tmpY;

        return coords;
    }
}
