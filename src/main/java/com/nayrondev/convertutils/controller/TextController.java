package com.nayrondev.convertutils.controller;

import com.nayrondev.convertutils.model.Text;
import com.nayrondev.convertutils.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/convertutils")
public class TextController {

    @Autowired
    private TextService textService;

    @GetMapping(value = "/touppercase/{text}")
    public ResponseEntity<Text> toUpperCase(@PathVariable ("text")String text){
        Text objText = new Text(text);
        objText.setText(textService.toUpperCase(text));
        return ResponseEntity.ok().body(objText);
    }

    @GetMapping (value = "/tolowercase/{text}")
    public ResponseEntity<String> toLowerCase(@PathVariable("text")String text){
        return ResponseEntity.ok().body(textService.toLowerCase(text));
    }

    @GetMapping (value = "/camelcase/{text}")
    public ResponseEntity<String> camelCase(@PathVariable("text")String text){
        return ResponseEntity.ok().body(textService.toCamelCase(text));
    }

    @GetMapping (value = "/alternativecase/{text}")
    public ResponseEntity<String> alternativeCase(@PathVariable("text")String text){
        return ResponseEntity.ok().body(textService.alternativeCase(text));
    }

    @GetMapping (value = "/alternativecasetwo/{text}")
    public ResponseEntity<String> alternativeCaseTwo(@PathVariable("text")String text){
        return ResponseEntity.ok().body(textService.alternativeCaseTwo(text));
    }
}
