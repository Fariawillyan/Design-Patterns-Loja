package com.padroes.loja.Descontos;

import com.padroes.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalcularaDescontos {

    public BigDecimal calcular(Orcamento orcamento){

        Desconto cadeiaDeDesconstos = new DescontoAcimaCincoItens(
                new DescontoAcimaQuinhentos(
                        new SemDesconto()
                )
        );
        return cadeiaDeDesconstos.efetuarCalculo(orcamento);
    }


}
