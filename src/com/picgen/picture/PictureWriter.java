package com.picgen.picture;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * writes captcha key on the noised picture
 */
public class PictureWriter {
    public BufferedImage writeKeyWord(BufferedImage img, String word) {
        Graphics2D graphics2D = img.createGraphics();
        FontFormatter fontFormatter = new FontFormatter();

        // TODO: handle font color & style
        graphics2D.setPaint(fontFormatter.getFontColor());
        graphics2D.setFont(fontFormatter.getFont());
        graphics2D.drawString("HELLLO", img.getWidth() / 2, img.getHeight() / 2);
        graphics2D.dispose();
        return img;
    }
}
