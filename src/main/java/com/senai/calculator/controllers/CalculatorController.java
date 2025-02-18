package com.senai.calculator.controllers;

import com.senai.calculator.dtos.RequestDto;
import com.senai.calculator.dtos.ResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculatorController {

    @PostMapping("/somar")
    public ResponseEntity<ResponseDto> somar (@RequestBody RequestDto dados){

        ResponseDto resultado =  new ResponseDto();

        resultado.setResultado(dados.getNumero1() + dados.getNumero2());

        return ResponseEntity.ok().body(resultado);
    }


}
