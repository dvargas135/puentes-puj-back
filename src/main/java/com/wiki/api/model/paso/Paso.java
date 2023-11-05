package com.wiki.api.model.paso;

import java.util.Iterator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.amazonaws.util.json.JSONArray;
import com.amazonaws.util.json.JSONObject;

@Entity
public class Paso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long numero;
    private String tipo_paso;
    private boolean primero;
    private String sup_inf;

    public Paso() {
        super();
        this.id = null;
        this.numero = null;
        this.tipo_paso = null;
        this.primero = false;
        this.sup_inf = null;
    }

    public Paso(Long id, Long numero, String tipo_paso, boolean primero, String sup_inf) {
        super();
        this.id = id;
        this.numero = numero;
        this.tipo_paso = tipo_paso;
        this.primero = primero;
        this.sup_inf = sup_inf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getTipo_paso() {
        return tipo_paso;
    }

    public void setTipo_paso(String tipo_paso) {
        this.tipo_paso = tipo_paso;
    }

    public boolean isPrimero() {
        return primero;
    }

    public void setPrimero(boolean primero) {
        this.primero = primero;
    }

    public String getSup_inf() {
        return sup_inf;
    }

    public void setSup_inf(String sup_inf) {
        this.sup_inf = sup_inf;
    }

    public JSONObject toJSON() throws Exception {
        JSONObject japplication = new JSONObject();
        japplication.put("id", getId());
        japplication.put("numero", getNumero());
        japplication.put("tipo_paso", getTipo_paso());
        japplication.put("primero", isPrimero());
        japplication.put("sup_inf", getSup_inf());

        return japplication;
    }
    
    public static JSONArray toJSONArray( Iterable<Paso> pasos ) throws Exception {
		JSONArray jpasos = new JSONArray();
        Iterator<Paso> ipasos = pasos.iterator();
        while(ipasos.hasNext()) {
            Paso paso = ipasos.next();
            jpasos.put(paso.toJSON());
        }

        return jpasos;
    }
}
