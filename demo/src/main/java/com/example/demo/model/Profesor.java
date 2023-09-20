package com.example.demo.model;

import javax.persistence.*;

@Table(name = "profesor")
@Entity
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProfesor;
    private Long persona;

    public Profesor(Long idProfesor, Long persona) {
        this.idProfesor = idProfesor;
        this.persona = persona;
    }

    public Long getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Long idProfesor) {
        this.idProfesor = idProfesor;
    }

    public Long getPersona() {
        return persona;
    }

    public void setPersona(Long persona) {
        this.persona = persona;
    }
}