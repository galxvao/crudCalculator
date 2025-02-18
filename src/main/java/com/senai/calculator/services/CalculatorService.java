package com.senai.calculator.services;


import com.senai.calculator.dtos.RequestDto;
import com.senai.calculator.dtos.ResponseDto;

public class CalculatorService {

    public ResponseDto somar (RequestDto dados){

        ResponseDto resultado = new ResponseDto();

        resultado.setResultado(dados.getNumero1() + dados.getNumero2());

        return resultado;
    }



}
