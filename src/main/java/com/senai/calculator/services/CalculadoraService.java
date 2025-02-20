package com.senai.calculator.services;


import com.senai.calculator.dto.EntradaDto;
import com.senai.calculator.dto.ResultadoDto;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public ResultadoDto somar (EntradaDto dados){

        ResultadoDto resultado = new ResultadoDto();

        resultado.setResultado(dados.getNumero1() + dados.getNumero2());

        return resultado;
    }

   public ResultadoDto subtrair (EntradaDto dados){

        ResultadoDto resultado = new ResultadoDto();

        resultado.setResultado(dados.getNumero1() - dados.getNumero2());

        return resultado;
    }

    public ResultadoDto multiplicar (EntradaDto dados) {

        ResultadoDto resultado = new ResultadoDto();
        resultado.setResultado(dados.getNumero1() * dados.getNumero2());

        return resultado;
    }

    public ResultadoDto dividir (EntradaDto dados){

        ResultadoDto resultado = new ResultadoDto();

        resultado.setResultado(dados.getNumero1() / dados.getNumero2());

        return resultado;
    }


    public ResultadoDto potencia (EntradaDto dados){

        ResultadoDto resultado = new ResultadoDto();

        int resultadoPotencia = 1;

        for (int i = 0; i < dados.getNumero2(); i++) {
            resultadoPotencia *= dados.getNumero1();
        }

       resultado.setResultado(resultadoPotencia);

        return resultado;
    }

    public ResultadoDto modulo (EntradaDto dados){

        ResultadoDto resultado = new ResultadoDto();

        resultado.setResultado(dados.getNumero1() % dados.getNumero2());

        return resultado;
    }





}
