package com.yobrunox.ejercicios_2.modles;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String lenguaje;

    @Column(nullable = false)
    private Double precio;

    @Column(nullable = false)
    private Float version;

    @Column(nullable = false)
    private Date fechaLanzamiento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idEmpresa", nullable = false)
    @JsonBackReference
    private Empresa empresa;

    public Bot(String nombre, String lenguaje, Double precio, Float version, Date fechaLanzamiento,Empresa empresa) {
        this.nombre = nombre;
        this.lenguaje = lenguaje;
        this.precio = precio;
        this.version = version;
        this.fechaLanzamiento = fechaLanzamiento;
        this.empresa = empresa;
    }
}
