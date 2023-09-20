package com.example.demo.model;

import javax.persistence.*;

@Table(name = "estudiante")
@Entity
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long idEstudiante;
    private Long idPersona;
    private Integer legajo;

}