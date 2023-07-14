package com.example.OBSpringS456.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "laptops")
public class LaptopEntidad {

//atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    private Boolean wiFi;

    public LaptopEntidad() {
    }

    public LaptopEntidad(Long id, String marca, String modelo, Boolean wiFi) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.wiFi = wiFi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Boolean getWiFi() {
        return wiFi;
    }

    public void setWiFi(Boolean wiFi) {
        this.wiFi = wiFi;
    }

    @Override
    public String toString() {
        return "LaptopEntidad{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", wiFi=" + wiFi +
                '}';
    }
}
