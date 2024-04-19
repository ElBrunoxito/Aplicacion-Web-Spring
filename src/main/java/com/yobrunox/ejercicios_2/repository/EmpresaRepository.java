package com.yobrunox.ejercicios_2.repository;

import com.yobrunox.ejercicios_2.dto.EmpresaCantidadDineroInvertidoDTO;
import com.yobrunox.ejercicios_2.dto.EmpresaFacturacionTotalDTO;
import com.yobrunox.ejercicios_2.modles.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa,Integer> {

    @Query("SELECT NEW com.yobrunox.ejercicios_2.dto.EmpresaCantidadDineroInvertidoDTO(E.nombre,SUM(B.precio)) " +
            "FROM Empresa E " +
            "INNER JOIN Bot B ON E.id = B.empresa.id WHERE B.lenguaje = :lenguaje GROUP BY E.id")
    List<EmpresaCantidadDineroInvertidoDTO> getPorEmpresaDineroInvertido(@Param("lenguaje") String lenguaje);

    @Query("SELECT NEW com.yobrunox.ejercicios_2.dto.EmpresaFacturacionTotalDTO(SUM(E.facturacionAnual)) " +
            "FROM Empresa E")
    EmpresaFacturacionTotalDTO getPorFacturacion();

}
