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

    @PostMapping("/somar")
    public ResponseEntity<ResultadoDto> somar (@RequestBody EntradaDto dados){

       ResultadoDto resultado = service.somar(dados);
       return ResponseEntity.ok().body(resultado);
    }

    @PostMapping("/subtrair")
    public ResponseEntity<ResultadoDto> subtrair (@RequestBody EntradaDto dados){
        ResultadoDto resultado = service.subtrair(dados);
        return ResponseEntity.ok().body(resultado);
    }

    @PostMapping("/dividir")
    public ResponseEntity<ResultadoDto> dividir (@RequestBody EntradaDto dados){
        ResultadoDto resultado = service.dividir(dados);
        return ResponseEntity.ok().body(resultado);
    }

    @PostMapping("/potencia")
    public ResponseEntity<ResultadoDto> potencia (@RequestBody EntradaDto dados){
        ResultadoDto resultado = service.potencia(dados);
        return  ResponseEntity.ok().body(resultado);
    }

    @PostMapping("/modulo")
    public ResponseEntity<ResultadoDto> modulo (@RequestBody EntradaDto dados){
        ResultadoDto resultado = service.modulo(dados);
        return ResponseEntity.ok().body(resultado);
    }


}
