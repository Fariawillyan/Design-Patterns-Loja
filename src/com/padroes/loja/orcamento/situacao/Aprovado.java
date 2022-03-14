package com.padroes.loja.orcamento.situacao;

import com.padroes.loja.DomainException;
import com.padroes.loja.orcamento.Orcamento;
import com.padroes.loja.orcamento.situacao.Finalizado;
import com.padroes.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento {
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
