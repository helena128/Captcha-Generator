package com.picgen.picture;

public class Pixel {
    public Pixel(int a, int r, int g, int b, int color) {
        this.a = a;
        this.r = r;
        this.g = g;
        this.b = b;
        this.color = color;
    }

    public Pixel() { }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getA() {
        return (color >> 24) & 0xFF;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getP() {
        return (a<<24) | (r<<16) | (g<<8) | b; //pixel
    }

    private int a, r, g, b, color, p;
}
