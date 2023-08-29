package com.example.demo.model;

public class Materia {
    private Long idMateria;
    private String nombre;
    private Integer año;
    private Long idCarrera;
    private Long idProfesor;

    public Materia(Long idMateria, String nombre, Integer año, Long idCarrera, Long idProfesor) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.año = año;
        this.idCarrera = idCarrera;
        this.idProfesor = idProfesor;
    }

    public Long getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Long idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public Long getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Long idCarrera) {
        this.idCarrera = idCarrera;
    }

    public Long getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Long idProfesor) {
        this.idProfesor = idProfesor;
    }
}