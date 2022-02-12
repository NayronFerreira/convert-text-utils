package com.nayrondev.convertutils.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Text {

    private String text;
    private Integer words;
    private Integer chars;

    public Text(String text){
        this.text = text;
    }

    public Integer getWords() {
        String[] separateWords = text.split(" ");
        this.words = separateWords.length;
        return words;
    }

    public Integer getChars() {
        char[] charsArray = text.toCharArray();
        this.chars = charsArray.length;
        return chars;
    }
}
