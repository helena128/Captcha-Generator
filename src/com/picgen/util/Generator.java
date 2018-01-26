package com.picgen.util;

import com.picgen.generators.SimpleGenerator;
import com.picgen.picture.PicturePainter;
import com.picgen.picture.PictureWriter;

import java.awt.image.BufferedImage;

/**
 * This class holds sequence of generated characters and a pic
 */
public class Generator {
    private static final int MIN_LETTER = 5;
    private static final int MAX_LETTER = 6;
    private static final int PIC_HEIGHT = 200;
    private static final int PIC_WIDTH = 300;

    private BufferedImage old = new PicturePainter().getBufferedImage(PIC_HEIGHT, PIC_WIDTH);

    private String key;
    private BufferedImage img;

    public Generator() {
        this.key = new SimpleGenerator().getCaptchaString(MIN_LETTER, MAX_LETTER);
        this.img = new PictureWriter().writeKeyWord(old, this.key);
    }

    public String getKey() {
        return key;
    }

    public BufferedImage getImg() {
        return img;
    }
}
