package com.senai.calculator.services;


import com.senai.calculator.dto.EntradaDto;
import com.senai.calculator.dto.ResultadoDto;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public ResultadoDto operacao(EntradaDto dados){

        ResultadoDto resultado = new ResultadoDto();


        int resultadoOperacao  = 0;

        switch (dados.getOperacao()) {
            case "+":
                resultadoOperacao = dados.getNumero1() + dados.getNumero2();
                break;
            case "-":
                resultadoOperacao = dados.getNumero1() - dados.getNumero2();
                break;
            case "*":
                resultadoOperacao =  dados.getNumero1() * dados.getNumero2();
                break;
            case "/":
                resultadoOperacao = dados.getNumero1() / dados.getNumero2();
                break;
            default:
                throw new IllegalArgumentException("Operação inválida");

        }

        resultado.setResultado(resultadoOperacao);
        resultado.setNumero1(dados.getNumero1());
        resultado.setNumero2(dados.getNumero2());
        resultado.setOperacao(dados.getOperacao());

        return resultado;


    }

}
