package com.nayrondev.convertutils.service;

import org.springframework.stereotype.Service;

@Service
public class TextService {

    public String toUpperCase(String text) {
        return text.toUpperCase();
    }

    public String toLowerCase(String text) {
        return text.toLowerCase();
    }

    public String toCamelCase(String text) {
        String[] separateWords = text.split(" ");
        String stringConverted = "";

        for (int i = 0; i < separateWords.length; i++) {
            stringConverted = stringConverted + " " + firstUpperCase(separateWords[i].toString());
        }
        return stringConverted;
    }

    public String firstUpperCase(String text) {
        char[] chars = text.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        return new String(chars);
    }

    public String alternativeCase(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                chars[i] = Character.toUpperCase(chars[i]);
            } else {
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }
        return new String(chars);
    }

    public String alternativeCaseTwo(String text){
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return new String(chars);
    }
}
