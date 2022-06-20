package com.cmardones.pruebauno.models;

import javax.annotation.Generated;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Indexed;


@Entity
@Table(name="barcos")
public class Barco {
    @Id 
    @GeneratedValue(strategy = GeneratedType.IDENTITY)

    private Long id;
    private String nombre;
    private String color;
    private String tipo;
    public Barco(){
        super();
    }
    public Barco(Long id, String nombre, String color, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.tipo = tipo;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    

}
