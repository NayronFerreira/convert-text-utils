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
}
