package com.padroes.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private final BigDecimal valor;

    private final int quantidadeItens;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public BigDecimal getValor() {
        return valor;
    }


}