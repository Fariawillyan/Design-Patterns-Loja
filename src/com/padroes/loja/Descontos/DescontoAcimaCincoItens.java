package com.padroes.loja.Descontos;

import com.padroes.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoAcimaCincoItens extends Desconto{

    public DescontoAcimaCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {

        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        return proximo.calcular(orcamento);
    }
}
