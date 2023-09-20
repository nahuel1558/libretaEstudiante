package com.example.demo.model;

import javax.persistence.*;

@Table(name = "persona")
@Entity
public class Persona {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long idPersona;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String mail;
    private String direccion;

}