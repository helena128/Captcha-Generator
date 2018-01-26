package com.picgen.picture;

import com.picgen.generators.SimpleGenerator;

import java.awt.*;
import java.util.Random;

/**
 * Creates a random font
 */
public class FontFormatter {
    final private String[] fontNames = { "Arial", "Verdana", "Helvetica", "Comic Sans MS", "Times New Roman",
                                        "Georgia", "Courier" };

    private SimpleGenerator simpleGenerator = new SimpleGenerator();

    /**
     * Creates instance of a font based on randomly generated values
     * @return created Font
     */
    public Font getFont() {
        Font font;
        int size = simpleGenerator.generateNumberInRange(25, 55);
        String name = fontNames[simpleGenerator.generateNumberInRange(0, fontNames.length - 1)];
        int style = simpleGenerator.generateNumberInRange(0, 3);

        switch (style) {
            case 0:
                font = new Font(name, Font.PLAIN, size);
                break;
            case 1:
                font = new Font(name, Font.ITALIC, size);
                break;
            case 2:
                font = new Font(name, Font.BOLD, size);
                break;
            default:
                font = new Font(name, Font.BOLD | Font.ITALIC, size);
                break;
        }

        return font;
    }

    /**
     * Creates random font color
     * @return font color
     */
    public Color getFontColor() {
        Color tmpColor = Color.getHSBColor(new Random().nextFloat(),
                new Random().nextFloat(), new Random().nextFloat());
        tmpColor = reColor(tmpColor.darker());
        return tmpColor;
    }

    /**
     * Generates color components until they are dak enough
     * @param col - default color
     * @return new color or old if dark enough
     */
    private Color reColor(Color col) {
        int r = col.getRed();
        int g = col.getGreen();
        int b = col.getBlue();

        while (true) {
            if ((r > 0xa) || (g > 0xa) || (b > 0xa))
                return new Color(r, g, b);
        }
    }
}
