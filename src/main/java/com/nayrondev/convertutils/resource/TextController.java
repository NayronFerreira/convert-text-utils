package com.nayrondev.convertutils.resource;

import com.nayrondev.convertutils.domain.Text;
import com.nayrondev.convertutils.domain.request.TextRequest;
import com.nayrondev.convertutils.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/convertutils")
public class TextController {

    @Autowired
    private TextService textService;

    @PostMapping (value = "/touppercase")
    public ResponseEntity<Text> toUpperCase(TextRequest request) throws Exception {
        return ResponseEntity.ok().body(textService.toUpperCase(request));
    }

    @PostMapping (value = "/tolowercase")
    public ResponseEntity<Text> toLowerCase(TextRequest request) throws Exception {
        return ResponseEntity.ok().body(textService.toLowerCase(request));
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
