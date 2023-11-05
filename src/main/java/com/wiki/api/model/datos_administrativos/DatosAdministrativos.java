package com.wiki.api.model.datos_administrativos;

import java.util.Iterator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.amazonaws.util.json.JSONArray;
import com.amazonaws.util.json.JSONObject;

@Entity
public class DatosAdministrativos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long anio_construccion;
    private String anio_reconstruccion;
    private String direccion_absc_carretera;
    private String requisitos_inspeccion;
    private String numero_secciones_inspeccion;
    private String estacion_conteo;
    private String recha_recoleccion_datos;
    private String iniciales_inspector;
    private Long puenteid;

    public DatosAdministrativos() {
        super();
        this.id = null;
        this.anio_construccion = null;
        this.anio_reconstruccion = null;
        this.direccion_absc_carretera = null;
        this.requisitos_inspeccion = null;
        this.numero_secciones_inspeccion = null;
        this.estacion_conteo = null;
        this.recha_recoleccion_datos = null;
        this.iniciales_inspector = null;
        this.puenteid = null;
    }
    
    public DatosAdministrativos(Long id, Long anio_construccion, String anio_reconstruccion,
            String direccion_absc_carretera, String requisitos_inspeccion, String numero_secciones_inspeccion,
            String estacion_conteo, String recha_recoleccion_datos, String iniciales_inspector, Long puenteid) {
        super();
        this.id = id;
        this.anio_construccion = anio_construccion;
        this.anio_reconstruccion = anio_reconstruccion;
        this.direccion_absc_carretera = direccion_absc_carretera;
        this.requisitos_inspeccion = requisitos_inspeccion;
        this.numero_secciones_inspeccion = numero_secciones_inspeccion;
        this.estacion_conteo = estacion_conteo;
        this.recha_recoleccion_datos = recha_recoleccion_datos;
        this.iniciales_inspector = iniciales_inspector;
        this.puenteid = puenteid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAnio_construccion() {
        return anio_construccion;
    }

    public void setAnio_construccion(Long anio_construccion) {
        this.anio_construccion = anio_construccion;
    }

    public String getAnio_reconstruccion() {
        return anio_reconstruccion;
    }

    public void setAnio_reconstruccion(String anio_reconstruccion) {
        this.anio_reconstruccion = anio_reconstruccion;
    }

    public String getDireccion_absc_carretera() {
        return direccion_absc_carretera;
    }

    public void setDireccion_absc_carretera(String direccion_absc_carretera) {
        this.direccion_absc_carretera = direccion_absc_carretera;
    }

    public String getRequisitos_inspeccion() {
        return requisitos_inspeccion;
    }

    public void setRequisitos_inspeccion(String requisitos_inspeccion) {
        this.requisitos_inspeccion = requisitos_inspeccion;
    }

    public String getNumero_secciones_inspeccion() {
        return numero_secciones_inspeccion;
    }

    public void setNumero_secciones_inspeccion(String numero_secciones_inspeccion) {
        this.numero_secciones_inspeccion = numero_secciones_inspeccion;
    }

    public String getEstacion_conteo() {
        return estacion_conteo;
    }

    public void setEstacion_conteo(String estacion_conteo) {
        this.estacion_conteo = estacion_conteo;
    }

    public String getRecha_recoleccion_datos() {
        return recha_recoleccion_datos;
    }

    public void setRecha_recoleccion_datos(String recha_recoleccion_datos) {
        this.recha_recoleccion_datos = recha_recoleccion_datos;
    }

    public String getIniciales_inspector() {
        return iniciales_inspector;
    }

    public void setIniciales_inspector(String iniciales_inspector) {
        this.iniciales_inspector = iniciales_inspector;
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
        japplication.put("anio_construccion", getAnio_construccion());
        japplication.put("anio_reconstruccion", getAnio_reconstruccion());
        japplication.put("direccion_absc_carretera", getDireccion_absc_carretera());
        japplication.put("requisitos_inspeccion", getRequisitos_inspeccion());
        japplication.put("numero_secciones_inspeccion", getNumero_secciones_inspeccion());
        japplication.put("estacion_conteo", getEstacion_conteo());
        japplication.put("recha_recoleccion_datos", getRecha_recoleccion_datos());
        japplication.put("iniciales_inspector", getIniciales_inspector());
        japplication.put("puenteid", getPuenteid());

        return japplication;
    }
    
    public static JSONArray toJSONArray( Iterable<DatosAdministrativos> datos_administrativos ) throws Exception {
		JSONArray jdatos_administrativos = new JSONArray();
        Iterator<DatosAdministrativos> idatos_administrativos = datos_administrativos.iterator();
        while(idatos_administrativos.hasNext()) {
            DatosAdministrativos da = idatos_administrativos.next();
            jdatos_administrativos.put(da.toJSON());
        }

        return jdatos_administrativos;
    }
}
