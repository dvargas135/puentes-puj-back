package com.puentes_puj.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.puentes_puj.api.model.pila.Pila;
import com.puentes_puj.api.model.pila.PilaRepository;

public class PilaController {
    
    @Autowired
    private PilaRepository pilaRepository;

    // create pila
    @CrossOrigin
    @PostMapping(value = "/pilas/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createPila(@RequestBody Pila newPila) throws Exception {
        HttpHeaders responseHeaders = new HttpHeaders();
        newPila.setId(null);
        Pila savedPila = pilaRepository.save(newPila);
        return new ResponseEntity<>(savedPila.toJSON().toString(), responseHeaders, HttpStatus.CREATED);
    }
}
