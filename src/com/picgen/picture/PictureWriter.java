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
    public BufferedImage writeKeyWord(BufferedImage img, String word)
            throws IOException {
        /*Graphics g = img.getGraphics();
        g.setColor(Color.BLUE);
        g.setFont(new Font("Arial Black", Font.BOLD, 20));
        g.drawString(word, 10, 100);
        return*/
        Graphics2D g2 = img.createGraphics();
        g2.drawString(word, 10, 100);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(img, "png", baos);
        //return baos.toByteArray();
        // convert back to buffered image
        InputStream in = new ByteArrayInputStream(baos.toByteArray());
        BufferedImage newImg = ImageIO.read(in);
        return newImg;
    }
}
