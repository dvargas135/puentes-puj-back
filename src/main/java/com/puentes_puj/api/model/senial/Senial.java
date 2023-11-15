package com.puentes_puj.api.model.senial;

import java.util.Iterator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.amazonaws.util.json.JSONArray;
import com.amazonaws.util.json.JSONObject;
import com.puentes_puj.api.model.senial.Senial;

@Entity
public class Senial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String carga_maxima;
    public String velocidad_maxima;
    public String otra;
    public Long puenteid;

    public Senial() {
        this.id = null;
        this.carga_maxima = null;
        this.velocidad_maxima = null;
        this.otra = null;
        this.puenteid = null;
    }

    public Senial(Long id, String carga_maxima, String velocidad_maxima, String otra, Long puenteid) {
        this.id = id;
        this.carga_maxima = carga_maxima;
        this.velocidad_maxima = velocidad_maxima;
        this.otra = otra;
        this.puenteid = puenteid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarga_maxima() {
        return carga_maxima;
    }

    public void setCarga_maxima(String carga_maxima) {
        this.carga_maxima = carga_maxima;
    }

    public String getVelocidad_maxima() {
        return velocidad_maxima;
    }

    public void setVelocidad_maxima(String velocidad_maxima) {
        this.velocidad_maxima = velocidad_maxima;
    }

    public String getOtra() {
        return otra;
    }

    public void setOtra(String otra) {
        this.otra = otra;
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
        japplication.put("carga_maxima", getCarga_maxima());
        japplication.put("velocidad_maxima", getVelocidad_maxima());
        japplication.put("otra", getOtra());
        japplication.put("puenteid", getPuenteid());

        return japplication;
    }
    
    public static JSONArray toJSONArray( Iterable<Senial> senials ) throws Exception {
		JSONArray jsenials = new JSONArray();
        Iterator<Senial> isenials = senials.iterator();
        while(isenials.hasNext()) {
            Senial senial = isenials.next();
            jsenials.put(senial.toJSON());
        }

        return jsenials;
    }
}
