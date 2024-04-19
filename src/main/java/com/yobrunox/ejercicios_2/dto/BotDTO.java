package com.yobrunox.ejercicios_2.dto;

import com.yobrunox.ejercicios_2.modles.Empresa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BotDTO{

    private String Nombre;
    private String Lenguaje;
    private Double Precio;
    private Float Version;
    private Date fechaLanzamiento;
    private Integer idEmpresa;

}