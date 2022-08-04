package com.nayrondev.convertutils.service;

import com.nayrondev.convertutils.domain.Text;
import com.nayrondev.convertutils.domain.request.TextRequest;
import org.springframework.stereotype.Service;


@Service
public class TextService {

    public Text toUpperCase(TextRequest request) throws Exception {
        try {
            return new Text(request.getText().toUpperCase());
        } catch (Exception e) {
            throw new Exception("Falha ao converter texto" + e.getMessage());
        }
    }

    public Text toLowerCase(TextRequest request) throws Exception {
        try {
            return new Text(request.getText().toLowerCase());
        } catch (Exception e) {
            throw new Exception("Falha ao converter texto" + e.getMessage());
        }
    }

    public Text toCamelCase(TextRequest request) throws Exception {
        StringBuilder stringConverted = new StringBuilder();

        try {
            String[] separateWords = request.getText().split(" ");

            for (int i = 0; i < separateWords.length; i++) {
                if (i+1 == separateWords.length){
                    stringConverted.append(firstUpperCase(separateWords[i]));
                } else {
                    stringConverted.append(firstUpperCase(separateWords[i] + " "));
                }
            }
            return new Text(stringConverted.toString());
        } catch (Exception e) {
            throw new Exception("Falha ao converter texto" + e.getMessage());
        }
    }

    public Text alternativeCase(TextRequest request) throws Exception {
        try {
            char[] chars = request.getText().toCharArray();

            for (int i = 0; i < chars.length; i++) {
                if (isEven(i)) {
                    chars[i] = Character.toUpperCase(chars[i]);
                } else {
                    chars[i] = Character.toLowerCase(chars[i]);
                }
            }
            return new Text(new String(chars));
        } catch (Exception e) {
            throw new Exception("Falha ao converter texto" + e.getMessage());
        }
    }

    public Text alternativeCaseTwo(TextRequest request) throws Exception {
        try {
            char[] chars = request.getText().toCharArray();

            for (int i = 0; i < chars.length; i++) {
                if (isEven(i)) {
                    chars[i] = Character.toLowerCase(chars[i]);
                } else {
                    chars[i] = Character.toUpperCase(chars[i]);
                }
            }
            return new Text(new String(chars));
        } catch (Exception e) {
            throw new Exception("Falha ao converter texto" + e.getMessage());
        }
    }

    public static String firstUpperCase(String text) {
        char[] chars = text.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        return new String(chars);
    }

    public Boolean isEven(Integer number) {
        return number % 2 == 0;
    }
}
