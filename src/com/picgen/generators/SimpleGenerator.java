package com.picgen.generators;

import java.util.Random;

/**
 * One of the many generators that can be used to get key
 */
public class SimpleGenerator implements Generatable {

    /**
     * returns generated string for captcha
     * @param length - number of letters to generate
     * @return generated string of {@code length} characters
     */
    public String getCaptchaString(int length) {
        if (length < 3) throw new IllegalArgumentException();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(getRandomCharacter());
        }
        return builder.toString();
    }

    /**
     * Gets one character from the sequence
     * @return one (sometimes modified) character
     */
    private char getRandomCharacter() {
        final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int tmpCharNum = getRandomNumber(LETTERS.length() - 1);
        return changeChar(LETTERS.charAt(tmpCharNum), tmpCharNum);
    }

    /**
     * Returns one random number
     * @param limit - number must be between 0 and {@code limit}
     * @return a random number
     */
    private int getRandomNumber(int limit) {
        final Random randGen = new Random();
        return randGen.nextInt(limit);
    }

    /**
     * Modifies character based on it position in line
     * @param c - character
     * @param idx - character position in line
     * @return - (non-) modified character
     */
    private char changeChar(char c, int idx) {
        if ((idx % 2 == 1) && ((int) c % 2 == 0))
            return Character.toLowerCase(c);
        return c;
    }
}
