package com.picgen.util;

import com.picgen.generators.Generatable;
import com.picgen.generators.SimpleGenerator;

/**
 * This class holds sequence of generated characters
 */
public class Generator {
    private int minLetter;
    private int maxLetter;
    private Generatable simpleGenerator;

    public String getCaptchaKey() {
        return captchaKey;
    }

    private String captchaKey; // generated value

    public Generator(int minLetter, int maxLetter) {
        this.minLetter = minLetter;
        this.maxLetter = maxLetter;
        this.simpleGenerator = new SimpleGenerator();
        this.captchaKey = simpleGenerator.getCaptchaString(minLetter, maxLetter);
    }
}
