package com.nayrondev.convertutils.resource;

import com.nayrondev.convertutils.domain.Text;
import com.nayrondev.convertutils.domain.request.TextRequest;
import com.nayrondev.convertutils.service.TextService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/convertutils")
public class TextController {


    private final TextService textService;

    public TextController(TextService textService) {
        this.textService = textService;
    }

    @PostMapping (value = "/touppercase")
    public ResponseEntity<Text> toUpperCase(TextRequest request) throws Exception {
        return ResponseEntity.ok().body(textService.toUpperCase(request));
    }

    @PostMapping (value = "/tolowercase")
    public ResponseEntity<Text> toLowerCase(TextRequest request) throws Exception {
        return ResponseEntity.ok().body(textService.toLowerCase(request));
    }

    @PostMapping (value = "/camelcase")
    public ResponseEntity<Text> camelCase(TextRequest request) throws Exception {
        return ResponseEntity.ok().body(textService.toCamelCase(request));
    }

    @PostMapping (value = "/alternativecase")
    public ResponseEntity<Text> alternativeCase(TextRequest request) throws Exception {
        return ResponseEntity.ok().body(textService.alternativeCase(request));
    }

    @PostMapping (value = "/alternativecasetwo")
    public ResponseEntity<Text> alternativeCaseTwo(TextRequest request) throws Exception {
        return ResponseEntity.ok().body(textService.alternativeCaseTwo(request));
    }

    @PostMapping (value = "/lettercounter/{character}")
    public ResponseEntity<Integer> letterCounter(@PathVariable ("character") Character character, TextRequest request) throws Exception {
        return ResponseEntity.ok().body(textService.characterCounter(character, request));
    }
}