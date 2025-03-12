package com.energylook.backend.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String constrasena;
    private Date fecha_creacion;
    private Date ultima_entrada;

    public Usuario() {}

    public Usuario(String name, String email,String constrasena, Date fecha_creacion, Date ultima_entrada) {
        this.name = name;
        this.email = email;
        this.constrasena = constrasena;
        this.fecha_creacion = fecha_creacion;
        this.ultima_entrada = ultima_entrada;

    }

    // Getters and Setters
}
