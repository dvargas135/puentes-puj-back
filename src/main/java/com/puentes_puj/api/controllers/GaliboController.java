package com.puentes_puj.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.puentes_puj.api.model.galibo.Galibo;
import com.puentes_puj.api.model.galibo.GaliboRepository;

public class GaliboController {
    
    @Autowired
    private GaliboRepository galiboRepository;

    // create galibo
    @CrossOrigin
    @PostMapping(value = "/galibos/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createGalibo(@RequestBody Galibo newGalibo) throws Exception {
        HttpHeaders responseHeaders = new HttpHeaders();
        newGalibo.setId(null);
        Galibo savedGalibo = galiboRepository.save(newGalibo);
        return new ResponseEntity<>(savedGalibo.toJSON().toString(), responseHeaders, HttpStatus.CREATED);
    }
}
