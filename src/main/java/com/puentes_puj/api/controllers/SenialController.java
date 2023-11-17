package com.puentes_puj.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.puentes_puj.api.model.senial.Senial;
import com.puentes_puj.api.model.senial.SenialRepository;

@RestController
public class SenialController {
    
    @Autowired
    private SenialRepository senialRepository;

    // create senial
    @CrossOrigin
    @PostMapping(value = "/seniales/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createSenial(@RequestBody Senial newSenial) throws Exception {
        HttpHeaders responseHeaders = new HttpHeaders();
        newSenial.setId(null);
        Senial savedSenial = senialRepository.save(newSenial);
        return new ResponseEntity<>(savedSenial.toJSON().toString(), responseHeaders, HttpStatus.CREATED);
    }
}
