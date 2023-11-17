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

import com.puentes_puj.api.model.estribo.Estribo;
import com.puentes_puj.api.model.estribo.EstriboRepository;

@RestController
public class EstriboController {
    
    @Autowired
    private EstriboRepository estriboRepository;

    // create estribo
    @CrossOrigin
    @PostMapping(value = "/estribos/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createEstribo(@RequestBody Estribo newEstribo) throws Exception {
        HttpHeaders responseHeaders = new HttpHeaders();
        newEstribo.setId(null);
        Estribo savedEstribo = estriboRepository.save(newEstribo);
        return new ResponseEntity<>(savedEstribo.toJSON().toString(), responseHeaders, HttpStatus.CREATED);
    }
}
