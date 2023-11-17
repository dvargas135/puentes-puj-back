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

import com.puentes_puj.api.model.carga.Carga;
import com.puentes_puj.api.model.carga.CargaRepository;

@RestController
public class CargaController {

    @Autowired
    private CargaRepository cargaRepository;

    // create carga
    @CrossOrigin
    @PostMapping(value = "/cargas/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createCarga(@RequestBody Carga newCarga) throws Exception {
        HttpHeaders responseHeaders = new HttpHeaders();
        newCarga.setId(null);
        Carga savedCarga = cargaRepository.save(newCarga);
        return new ResponseEntity<>(savedCarga.toJSON().toString(), responseHeaders, HttpStatus.CREATED);
    }

}
