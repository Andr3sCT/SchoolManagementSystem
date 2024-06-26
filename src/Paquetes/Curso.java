package Paquetes;

import Interfaz.ServiciosAcademicosI;

public class Curso {
    private Integer id;
    private String nombre;
    private String descripcion;
    private String numeroCreditos;
    private String version;

    public Curso(Integer id, String nombre, String descripcion, String numeroCreditos, String version) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroCreditos = numeroCreditos;
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(String numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


}
