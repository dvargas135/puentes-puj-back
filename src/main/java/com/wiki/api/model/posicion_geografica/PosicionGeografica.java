package com.wiki.api.model.posicion_geografica;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class PosicionGeografica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    /*
     * public id?: number,
        public altitud?: number,
        public coeficiente_aceleracion_sismica?: string,
        public paso_cauce?: boolean,
        public existe_variante?: boolean,
        public longitud_variante?: number,
        public estado?: string,
        public puenteid?: number,
     */
    
}
