package com.padroes.loja.orcamento;

import com.padroes.loja.orcamento.situacao.EmAnalise;
import com.padroes.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private SituacaoOrcamento situacao;

    private final int quantidadeItens;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
    }
    public void aplicarDescontoExtra(){
        BigDecimal valorDescontoExtra = this.situacao.caucularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void Aprovar(){
        this.situacao.aprovar(this);
    }

    public void Reprovar(){
        this.situacao.reprovar(this);
    }

    public void Finalizar(){
        this.situacao.finalizar(this);
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }
}
