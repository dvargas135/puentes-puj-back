package com.puentes_puj.api.model.posicion_geografica;

import java.util.Iterator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.amazonaws.util.json.JSONArray;
import com.amazonaws.util.json.JSONObject;

@Entity
public class PosicionGeografica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long altitud;
    private String coeficiente_aceleracion_sismica;
    private boolean paso_cauce;
    private boolean existe_variante;
    private Long longitud_variante;
    private String estado;
    private Long puenteid;

    public PosicionGeografica() {
        this.id = null;
        this.altitud = null;
        this.coeficiente_aceleracion_sismica = null;
        this.paso_cauce = false;
        this.existe_variante = false;
        this.longitud_variante = null;
        this.estado = null;
        this.puenteid = null;
    }

    public PosicionGeografica(Long id, Long altitud, String coeficiente_aceleracion_sismica, boolean paso_cauce,
            boolean existe_variante, Long longitud_variante, String estado, Long puenteid) {
        this.id = id;
        this.altitud = altitud;
        this.coeficiente_aceleracion_sismica = coeficiente_aceleracion_sismica;
        this.paso_cauce = paso_cauce;
        this.existe_variante = existe_variante;
        this.longitud_variante = longitud_variante;
        this.estado = estado;
        this.puenteid = puenteid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAltitud() {
        return altitud;
    }

    public void setAltitud(Long altitud) {
        this.altitud = altitud;
    }

    public String getCoeficiente_aceleracion_sismica() {
        return coeficiente_aceleracion_sismica;
    }

    public void setCoeficiente_aceleracion_sismica(String coeficiente_aceleracion_sismica) {
        this.coeficiente_aceleracion_sismica = coeficiente_aceleracion_sismica;
    }

    public boolean isPaso_cauce() {
        return paso_cauce;
    }

    public void setPaso_cauce(boolean paso_cauce) {
        this.paso_cauce = paso_cauce;
    }

    public boolean isExiste_variante() {
        return existe_variante;
    }

    public void setExiste_variante(boolean existe_variante) {
        this.existe_variante = existe_variante;
    }

    public Long getLongitud_variante() {
        return longitud_variante;
    }

    public void setLongitud_variante(Long longitud_variante) {
        this.longitud_variante = longitud_variante;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
        japplication.put("altitud", getAltitud());
        japplication.put("coeficiente_aceleracion_sismica", getCoeficiente_aceleracion_sismica());
        japplication.put("paso_cauce", isPaso_cauce());
        japplication.put("existe_variante", isExiste_variante());
        japplication.put("longitud_variante", getLongitud_variante());
        japplication.put("estado", getEstado());
        japplication.put("puenteid", getPuenteid());

        return japplication;
    }
    
    public static JSONArray toJSONArray( Iterable<PosicionGeografica> posiciongeografica ) throws Exception {
		JSONArray jposiciongeografica = new JSONArray();
        Iterator<PosicionGeografica> iposiciongeografica = posiciongeografica.iterator();
        while(iposiciongeografica.hasNext()) {
            PosicionGeografica pg = iposiciongeografica.next();
            jposiciongeografica.put(pg.toJSON());
        }

        return jposiciongeografica;
    }
}
