package com.yobrunox.ejercicios_2.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.yobrunox.ejercicios_2.modles.Bot;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpresaDTO {

    private String nombre;
    private String telefono;
    private String direccion;
    private Double facturacionAnual;
}