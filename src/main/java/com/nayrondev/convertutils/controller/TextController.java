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
    public ResponseEntity<Text> toUpperCase(@PathVariable("text") String text){
        return ResponseEntity.ok().body(textService.toUpperCase(text));
    }

    @GetMapping (value = "/tolowercase/{text}")
    public ResponseEntity<Text> toLowerCase(@PathVariable("text") String text){
        return ResponseEntity.ok().body(textService.toLowerCase(text));
    }

    @GetMapping (value = "/camelcase/{text}")
    public ResponseEntity<Text> camelCase(@PathVariable("text") String text){
        return ResponseEntity.ok().body(textService.toCamelCase(text));
    }

    @GetMapping (value = "/alternativecase/{text}")
    public ResponseEntity<Text> alternativeCase(@PathVariable("text") String text){
        return ResponseEntity.ok().body(textService.alternativeCase(text));
    }

    @GetMapping (value = "/alternativecasetwo/{text}")
    public ResponseEntity<Text> alternativeCaseTwo(@PathVariable("text") String text){
        return ResponseEntity.ok().body(textService.alternativeCaseTwo(text));
    }
}
