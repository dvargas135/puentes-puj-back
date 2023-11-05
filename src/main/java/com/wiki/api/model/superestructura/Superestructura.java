package com.wiki.api.model.superestructura;

import java.util.Iterator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.amazonaws.util.json.JSONArray;
import com.amazonaws.util.json.JSONObject;

@Entity
public class Superestructura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long tipo;
    private boolean disenio_tipo;
    private String tipo_estructuracion_transversal;
    private String tipo_estructuracion_longitudinal;
    private String material;
    private Long puenteid;

    public Superestructura() {
        super();
        this.id = null;
        this.tipo = null;
        this.disenio_tipo = false;
        this.tipo_estructuracion_transversal = null;
        this.tipo_estructuracion_longitudinal = null;
        this.material = null;
        this.puenteid = null;
    }

    public Superestructura(Long id, Long tipo, boolean disenio_tipo, String tipo_estructuracion_transversal,
            String tipo_estructuracion_longitudinal, String material, Long puenteid) {
        super();
        this.id = id;
        this.tipo = tipo;
        this.disenio_tipo = disenio_tipo;
        this.tipo_estructuracion_transversal = tipo_estructuracion_transversal;
        this.tipo_estructuracion_longitudinal = tipo_estructuracion_longitudinal;
        this.material = material;
        this.puenteid = puenteid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTipo() {
        return tipo;
    }

    public void setTipo(Long tipo) {
        this.tipo = tipo;
    }

    public boolean isDisenio_tipo() {
        return disenio_tipo;
    }

    public void setDisenio_tipo(boolean disenio_tipo) {
        this.disenio_tipo = disenio_tipo;
    }

    public String getTipo_estructuracion_transversal() {
        return tipo_estructuracion_transversal;
    }

    public void setTipo_estructuracion_transversal(String tipo_estructuracion_transversal) {
        this.tipo_estructuracion_transversal = tipo_estructuracion_transversal;
    }

    public String getTipo_estructuracion_longitudinal() {
        return tipo_estructuracion_longitudinal;
    }

    public void setTipo_estructuracion_longitudinal(String tipo_estructuracion_longitudinal) {
        this.tipo_estructuracion_longitudinal = tipo_estructuracion_longitudinal;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Long getPuenteid() {
        return puenteid;
    }

    public void setPuenteid(Long puenteid) {
        this.puenteid = puenteid;
    }

    /*
     * private Long tipo;
    private boolean disenio_tipo;
    private String tipo_estructuracion_transversal;
    private String tipo_estructuracion_longitudinal;
    private String material;
    private Long puenteid;
     */

    public JSONObject toJSON() throws Exception {
        JSONObject japplication = new JSONObject();
        japplication.put("id", getId());
        japplication.put("tipo", getTipo());
        japplication.put("disenio_tipo", isDisenio_tipo());
        japplication.put("tipo_estructuracion_transversal", getTipo_estructuracion_transversal());
        japplication.put("tipo_estructuracion_longitudinal", getTipo_estructuracion_longitudinal());
        japplication.put("puenteid", getPuenteid());

        return japplication;
    }
    
    public static JSONArray toJSONArray( Iterable<Superestructura> superestructuras ) throws Exception {
		JSONArray jsuperestructuras = new JSONArray();
        Iterator<Superestructura> isuperestructuras = superestructuras.iterator();
        while(isuperestructuras.hasNext()) {
            Superestructura superestructura = isuperestructuras.next();
            jsuperestructuras.put(superestructura.toJSON());
        }

        return jsuperestructuras;
    }
}
