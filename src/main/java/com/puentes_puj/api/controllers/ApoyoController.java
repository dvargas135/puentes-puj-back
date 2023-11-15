package com.puentes_puj.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.puentes_puj.api.model.apoyo.Apoyo;
import com.puentes_puj.api.model.apoyo.ApoyoRepository;

public class ApoyoController {

    @Autowired
    private ApoyoRepository apoyoRepository;

    // create apoyo
    @CrossOrigin
    @PostMapping(value = "/apoyos/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createApoyo(@RequestBody Apoyo newApoyo) throws Exception {
        HttpHeaders responseHeaders = new HttpHeaders();
        newApoyo.setId(null);
        Apoyo savedApoyo = apoyoRepository.save(newApoyo);
        return new ResponseEntity<>(savedApoyo.toJSON().toString(), responseHeaders, HttpStatus.CREATED);
    }
    
}
