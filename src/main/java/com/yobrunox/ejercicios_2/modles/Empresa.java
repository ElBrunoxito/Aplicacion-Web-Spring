package com.yobrunox.ejercicios_2.modles;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String telefono;

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = false)
    private Double facturacionAnual;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "empresa")
    @JsonManagedReference
    private List<Bot> bots;

    public Empresa(String nombre, String telefono, String direccion, Double facturacionAnual) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.facturacionAnual = facturacionAnual;
    }
}
