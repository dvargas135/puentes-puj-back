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

import com.puentes_puj.api.model.datos_administrativos.DatosAdministrativos;
import com.puentes_puj.api.model.datos_administrativos.DatosAdministrativosRepository;

@RestController
public class DatosAdministrativosController {
    
    @Autowired
    private DatosAdministrativosRepository datosAdministrativosRepository;

    // create datosAdministrativos
    @CrossOrigin
    @PostMapping(value = "/datosadministrativos/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createDatosAdministrativos(@RequestBody DatosAdministrativos newDatosAdministrativos) throws Exception {
        HttpHeaders responseHeaders = new HttpHeaders();
        newDatosAdministrativos.setId(null);
        DatosAdministrativos savedDatosAdministrativos = datosAdministrativosRepository.save(newDatosAdministrativos);
        return new ResponseEntity<>(savedDatosAdministrativos.toJSON().toString(), responseHeaders, HttpStatus.CREATED);
    }
}
