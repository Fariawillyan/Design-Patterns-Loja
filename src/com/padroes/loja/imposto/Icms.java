package com.padroes.loja.imposto;

import com.padroes.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Icms implements Imposto{

    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("10"));
    }
}
