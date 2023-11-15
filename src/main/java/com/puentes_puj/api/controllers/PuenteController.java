package com.puentes_puj.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.puentes_puj.api.model.puente.Puente;
import com.puentes_puj.api.model.puente.PuenteRepository;

@RestController
public class PuenteController {

    @Autowired
    private PuenteRepository puenteRepository;

    // create puente
    @CrossOrigin
    @PostMapping(value = "/puentes/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createPuente(@RequestBody Puente newPuente) throws Exception {
        HttpHeaders responseHeaders = new HttpHeaders();
        newPuente.setId(null);
        Puente savedPuente = puenteRepository.save(newPuente);
        return new ResponseEntity<>(savedPuente.toJSON().toString(), responseHeaders, HttpStatus.CREATED);
    }
}
