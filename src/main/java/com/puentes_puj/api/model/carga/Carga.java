package com.puentes_puj.api.model.carga;

import java.util.Iterator;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.amazonaws.util.json.JSONArray;
import com.amazonaws.util.json.JSONObject;

public class Carga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long longitud_luz_critica;
    private String factor_clasificacion;
    private String fuerza_cortante;
    private String momento;
    private String linea_carga_por_rueda;
    private String observaciones;
    private Long puenteid;

    public Carga() {
        super();
        this.id = null;
        this.longitud_luz_critica = null;
        this.factor_clasificacion = null;
        this.fuerza_cortante = null;
        this.momento = null;
        this.linea_carga_por_rueda = null;
        this.observaciones = null;
        this.puenteid = null;
    }

    public Carga(Long id, Long longitud_luz_critica, String factor_clasificacion, String fuerza_cortante,
            String momento, String linea_carga_por_rueda, String observaciones, Long puenteid) {
        super();
        this.id = id;
        this.longitud_luz_critica = longitud_luz_critica;
        this.factor_clasificacion = factor_clasificacion;
        this.fuerza_cortante = fuerza_cortante;
        this.momento = momento;
        this.linea_carga_por_rueda = linea_carga_por_rueda;
        this.observaciones = observaciones;
        this.puenteid = puenteid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLongitud_luz_critica() {
        return longitud_luz_critica;
    }

    public void setLongitud_luz_critica(Long longitud_luz_critica) {
        this.longitud_luz_critica = longitud_luz_critica;
    }

    public String getFactor_clasificacion() {
        return factor_clasificacion;
    }

    public void setFactor_clasificacion(String factor_clasificacion) {
        this.factor_clasificacion = factor_clasificacion;
    }

    public String getFuerza_cortante() {
        return fuerza_cortante;
    }

    public void setFuerza_cortante(String fuerza_cortante) {
        this.fuerza_cortante = fuerza_cortante;
    }

    public String getMomento() {
        return momento;
    }

    public void setMomento(String momento) {
        this.momento = momento;
    }

    public String getLinea_carga_por_rueda() {
        return linea_carga_por_rueda;
    }

    public void setLinea_carga_por_rueda(String linea_carga_por_rueda) {
        this.linea_carga_por_rueda = linea_carga_por_rueda;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Long getPuenteid() {
        return puenteid;
    }

    public void setPuenteid(Long puenteid) {
        this.puenteid = puenteid;
    }

    public JSONObject toJSON() throws Exception {
        JSONObject japplication = new JSONObject();
        japplication.put("id", getId());
        japplication.put("longitud_luz_critica", getLongitud_luz_critica());
        japplication.put("factor_clasificacion", getFactor_clasificacion());
        japplication.put("fuerza_cortante", getFuerza_cortante());
        japplication.put("momento", getMomento());
        japplication.put("linea_carga_por_rueda", getLinea_carga_por_rueda());
        japplication.put("observaciones", getObservaciones());
        japplication.put("puenteid", getPuenteid());

        return japplication;
    }
    
    public static JSONArray toJSONArray( Iterable<Carga> cargas ) throws Exception {
		JSONArray jcargas = new JSONArray();
        Iterator<Carga> icargas = cargas.iterator();
        while(icargas.hasNext()) {
            Carga carga = icargas.next();
            jcargas.put(carga.toJSON());
        }

        return jcargas;
    }
}
