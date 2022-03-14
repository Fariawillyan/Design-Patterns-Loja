package com.padroes.loja.Descontos;

import com.padroes.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalcularaDescontos {

    public BigDecimal calcular(Orcamento orcamento){

        Desconto desconto = new DescontoAcimaCincoItens(
                new DescontoAcimaQuinhentos(
                        new SemDesconto()
                )
        );
        return desconto.calcular(orcamento);
    }


}
