package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "estudiante")
@Entity
@Getter
@Setter

public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long idEstudiante;

    private Long idPersona;

    private Integer legajo;

}