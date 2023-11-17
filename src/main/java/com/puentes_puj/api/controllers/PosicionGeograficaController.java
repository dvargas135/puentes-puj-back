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

import com.puentes_puj.api.model.posicion_geografica.PosicionGeografica;
import com.puentes_puj.api.model.posicion_geografica.PosicionGeograficaRepository;

@RestController
public class PosicionGeograficaController {
    
    @Autowired
    private PosicionGeograficaRepository posicionGeograficaRepository;

    // create posicionGeografica
    @CrossOrigin
    @PostMapping(value = "/posicionesgeograficas/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createPosicionGeografica(@RequestBody PosicionGeografica newPosicionGeografica) throws Exception {
        HttpHeaders responseHeaders = new HttpHeaders();
        newPosicionGeografica.setId(null);
        PosicionGeografica savedPosicionGeografica = posicionGeograficaRepository.save(newPosicionGeografica);
        return new ResponseEntity<>(savedPosicionGeografica.toJSON().toString(), responseHeaders, HttpStatus.CREATED);
    }
}
