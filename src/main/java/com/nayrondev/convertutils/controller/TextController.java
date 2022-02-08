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
    public ResponseEntity<Text> toLowerCase(@PathVariable("text")String text){
        Text objText = new Text(text);
        objText.setText(textService.toLowerCase(text));
        return ResponseEntity.ok().body(objText);
    }

    @GetMapping (value = "/camelcase/{text}")
    public ResponseEntity<Text> camelCase(@PathVariable("text")String text){
        Text objText = new Text(text);
        objText.setText(textService.toCamelCase(text));
        return ResponseEntity.ok().body(objText);
    }

    @GetMapping (value = "/alternativecase/{text}")
    public ResponseEntity<Text> alternativeCase(@PathVariable("text")String text){
        Text objText = new Text(text);
        objText.setText(textService.alternativeCase(text));
        return ResponseEntity.ok().body(objText);
    }

    @GetMapping (value = "/alternativecasetwo/{text}")
    public ResponseEntity<Text> alternativeCaseTwo(@PathVariable("text")String text){
        Text objText = new Text(text);
        objText.setText(textService.alternativeCaseTwo(text));
        return ResponseEntity.ok().body(objText);
    }
}
