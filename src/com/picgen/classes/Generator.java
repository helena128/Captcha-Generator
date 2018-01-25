package com.picgen.classes;

import java.util.Random;

/**
 * This class holds sequence of generated characters
 */
public class Generator {
    private int numLetters; // number of letters we want to generate

    public String getCaptchaKey() {
        return captchaKey;
    }

    private String captchaKey; // generated value

    public Generator(int numLetters) {
        this.numLetters = numLetters;
        this.captchaKey = getCaptchaString(numLetters);
    }
}
