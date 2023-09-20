package com.example.demo.model;

import javax.persistence.*;

@Table(name = "carrera")
@Entity
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long idCarrera;
    private String nombre;
}

