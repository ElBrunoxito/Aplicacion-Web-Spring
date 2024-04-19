package com.yobrunox.ejercicios_2.servic;

import com.yobrunox.ejercicios_2.dto.EmpresaCantidadDineroInvertidoDTO;
import com.yobrunox.ejercicios_2.dto.EmpresaDTO;
import com.yobrunox.ejercicios_2.dto.EmpresaFacturacionTotalDTO;
import com.yobrunox.ejercicios_2.modles.Empresa;
import com.yobrunox.ejercicios_2.repository.EmpresaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmpresaService {
    private final EmpresaRepository empresaRepository;

    public Empresa addEmpresa(EmpresaDTO empresaDTO){
        Empresa empresa = new Empresa(empresaDTO.getNombre(),empresaDTO.getTelefono(),empresaDTO.getDireccion(),empresaDTO.getFacturacionAnual());
        return empresaRepository.save(empresa);
    }

    public List<EmpresaCantidadDineroInvertidoDTO> getEmpresasPorCantidadDeDineroInvertido(String lenguaje){
        return empresaRepository.getPorEmpresaDineroInvertido(lenguaje);
    }

    public List<Empresa> getAll(){
        return empresaRepository.findAll();
    }
    public EmpresaFacturacionTotalDTO getFacturacionTotal(){
        return empresaRepository.getPorFacturacion();
    }

}
