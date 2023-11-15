package com.puentes_puj.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.puentes_puj.api.model.paso.Paso;
import com.puentes_puj.api.model.paso.PasoRepository;

public class PasoController {
    
    @Autowired
    private PasoRepository pasoRepository;

    // create paso
    @CrossOrigin
    @PostMapping(value = "/pasos/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createPaso(@RequestBody Paso newPaso) throws Exception {
        HttpHeaders responseHeaders = new HttpHeaders();
        newPaso.setId(null);
        Paso savedPaso = pasoRepository.save(newPaso);
        return new ResponseEntity<>(savedPaso.toJSON().toString(), responseHeaders, HttpStatus.CREATED);
    }
}
