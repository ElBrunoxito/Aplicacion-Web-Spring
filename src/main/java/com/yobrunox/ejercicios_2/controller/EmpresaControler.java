package com.yobrunox.ejercicios_2.controller;

import com.yobrunox.ejercicios_2.dto.BotDTO;
import com.yobrunox.ejercicios_2.dto.EmpresaCantidadDineroInvertidoDTO;
import com.yobrunox.ejercicios_2.dto.EmpresaDTO;
import com.yobrunox.ejercicios_2.dto.EmpresaFacturacionTotalDTO;
import com.yobrunox.ejercicios_2.modles.Bot;
import com.yobrunox.ejercicios_2.modles.Empresa;
import com.yobrunox.ejercicios_2.servic.BotService;
import com.yobrunox.ejercicios_2.servic.EmpresaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/AguilarEmpresa")
public class EmpresaControler {
    private final EmpresaService empresaService;

    public EmpresaControler(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }


    @PostMapping("/EspinozaAdd")
    public ResponseEntity<Empresa> addBot(@RequestBody EmpresaDTO empresaDTO){
        return new ResponseEntity<>(empresaService.addEmpresa(empresaDTO), HttpStatus.CREATED);
    }

    @GetMapping("/EspinozaGetPorEmpresaYInvertido/{lenguaje}")
    public ResponseEntity<List<EmpresaCantidadDineroInvertidoDTO>> getEmpresasPorCantidadDeDineroInvertido(@PathVariable String lenguaje){
        return new ResponseEntity<>(empresaService.getEmpresasPorCantidadDeDineroInvertido(lenguaje),HttpStatus.OK);
    }

    @GetMapping("/EspinozaGetAllEmpresas")
    public ResponseEntity<List<Empresa>> getAllEmpresas(){
        return new ResponseEntity<>(empresaService.getAll(),HttpStatus.OK);
    }
    @GetMapping("/EspinozagetFacturacionTotal")
    public ResponseEntity<EmpresaFacturacionTotalDTO> getFacturacionTotal(){
        return new ResponseEntity<>(empresaService.getFacturacionTotal(),HttpStatus.OK);
    }
}
