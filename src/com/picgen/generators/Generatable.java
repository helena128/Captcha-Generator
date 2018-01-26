package com.picgen.generators;

/**
 * Created in case we provide new algorithms for encoding
 */
public interface Generatable {
    String getCaptchaString(int min, int max);
}