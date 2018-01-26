package com.picgen.picture;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * writes captcha key on the noised picture
 */
public class PictureWriter {
    public BufferedImage writeKeyWord(BufferedImage img, String word) {
        Graphics2D graphics2D = img.createGraphics();
        graphics2D.setPaint(Color.blue);
        graphics2D.setFont(new Font("Serif", Font.BOLD, 20));
        graphics2D.drawString("HELLLO", img.getWidth() / 2, img.getHeight() / 2);
        graphics2D.dispose();
        return img;
    }
}
