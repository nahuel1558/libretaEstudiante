package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "materia")
@Entity
@Getter
@Setter

public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long idMateria;

    private String nombre;

    private Integer año;

    private Long idCarrera;

    private Long idProfesor;

}