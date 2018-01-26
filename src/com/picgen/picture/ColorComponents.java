package com.picgen.picture;

/**
 * This class gets color components for future actions
 */
public class ColorComponents {
    private final int color;

    public ColorComponents(int color) {
        this.color = color;
    }

    /**
     * Get red component
     * @return
     */
    public int getRComponent() {
        return ((color >> 16) & 0xff);
    }

    /**
     * Get green component
     * @return
     */
    public int getGComponent() {
        return ((color >> 8) & 0xff);
    }

    /**
     * Get blue component
     * @return
     */
    public int getBComponent() {
        return (color & 0xff);
    }
}
