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

    // TODO: handle exeptions
    private String getCaptchaString(int length) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            builder.append(getRandomCharacter());
        }

        return builder.toString();
    }

    private char getRandomCharacter() {
        final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int tmpCharNum = getRandomNumber(LETTERS.length() - 1);
        return changeChar(LETTERS.charAt(tmpCharNum), tmpCharNum);
    };

    private int getRandomNumber(int limit) {
        final Random randGen = new Random();
        return randGen.nextInt(limit);
    }

    private char changeChar(char c, int idx) {
        if ((idx % 2 == 1) && ((int) c % 2 == 0)) return Character.toLowerCase(c);
        return c;
    }
}
