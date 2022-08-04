package com.nayrondev.convertutils.domain;

public class Text {

    private String text;
    private Integer words;
    private Integer chars;
    private Integer noSpaceChars;

    public Text(String text){
        this.text = text;
        getWords();
        getChars();
        getNoSpaceChars();
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

    public Integer getNoSpaceChars() {
        String noSpace = text.replace(" ","");
        char[] charsArray = noSpace.toCharArray();
        this.noSpaceChars = charsArray.length;
        return this.noSpaceChars;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Text{" +
                "text='" + text + '\'' +
                ", words=" + words +
                ", chars=" + chars +
                ", noSpaceChars=" + noSpaceChars +
                '}';
    }
}
