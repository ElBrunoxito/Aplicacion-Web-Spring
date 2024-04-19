package com.yobrunox.ejercicios_2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpresaCantidadDineroInvertidoDTO {
    private String Nombre_empresa;
    private Double Dinero_invertido;
}
