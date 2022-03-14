package com.padroes.loja;

import com.padroes.loja.Descontos.CalcularaDescontos;
import com.padroes.loja.orcamento.Orcamento;

import java.math.BigDecimal;


public class TestesDescontos {

    public static void main(String[] args) {

        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);

        CalcularaDescontos calculadora = new CalcularaDescontos();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
    }
}
