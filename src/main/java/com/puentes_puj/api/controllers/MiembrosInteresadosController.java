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

import com.puentes_puj.api.model.miembros_interesados.MiembrosInteresados;
import com.puentes_puj.api.model.miembros_interesados.MiembrosInteresadosRepository;

@RestController
public class MiembrosInteresadosController {
    
    @Autowired
    private MiembrosInteresadosRepository miembrosInteresadosRepository;

    // create miembrosInteresados
    @CrossOrigin
    @PostMapping(value = "/miembrosinteresadoss/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createMiembrosInteresados(@RequestBody MiembrosInteresados newMiembrosInteresados) throws Exception {
        HttpHeaders responseHeaders = new HttpHeaders();
        newMiembrosInteresados.setId(null);
        MiembrosInteresados savedMiembrosInteresados = miembrosInteresadosRepository.save(newMiembrosInteresados);
        return new ResponseEntity<>(savedMiembrosInteresados.toJSON().toString(), responseHeaders, HttpStatus.CREATED);
    }
}
