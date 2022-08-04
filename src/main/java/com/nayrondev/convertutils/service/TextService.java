package com.nayrondev.convertutils.service;

import com.nayrondev.convertutils.domain.Text;
import com.nayrondev.convertutils.domain.request.TextRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class TextService {

    private static final Logger logger = LoggerFactory.getLogger(TextService.class);

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

    public Text toCamelCase(String text) {
        Text objText = new Text(text);
        String[] separateWords = text.split(" ");
        String stringConverted = "";

        for (int i = 0; i < separateWords.length; i++) {
            if (i+1 == separateWords.length){
                stringConverted = stringConverted + firstUpperCase(separateWords[i].toString());

            } else {
                stringConverted = stringConverted + firstUpperCase(separateWords[i].toString()+ " ");
            }
        }
        objText.setText(stringConverted);
        logger.info("metodo='toCamelCase' - objText='{}'",objText);
        return objText;
    }

    public Text alternativeCase(String text) {
        Text objText = new Text(text);
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                chars[i] = Character.toUpperCase(chars[i]);
            } else {
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }
        objText.setText(new String(chars));
        return objText;
    }

    public Text alternativeCaseTwo(String text){
        Text objText = new Text(text);
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        objText.setText(new String(chars));
        return objText;
    }

    public static String firstUpperCase(String text) {
        char[] chars = text.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        return new String(chars);
    }
}
