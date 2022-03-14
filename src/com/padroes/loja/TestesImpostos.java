package com.padroes.loja;

import com.padroes.loja.imposto.CalculadoraImpostos;
import com.padroes.loja.imposto.Icms;
import com.padroes.loja.orcamento.Orcamento;

import java.math.BigDecimal;


public class TestesImpostos {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraImpostos calculadora = new CalculadoraImpostos();
        System.out.println(calculadora.calcular(orcamento, new Icms()));
    }
}
