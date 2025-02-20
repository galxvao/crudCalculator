package com.senai.calculator.controller;

import com.senai.calculator.dto.EntradaDto;
import com.senai.calculator.dto.ResultadoDto;
import com.senai.calculator.services.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @Autowired
    CalculadoraService service;

    @PostMapping()
    public  ResponseEntity<ResultadoDto> calculadora (@RequestBody EntradaDto dados){
        ResultadoDto resultado = service.operacao(dados);
        return ResponseEntity.ok().body(resultado);
    }
}
