package com.padroes.loja.orcamento.situacao;

import com.padroes.loja.DomainException;
import com.padroes.loja.orcamento.Orcamento;

import java.math.BigDecimal;

//metodos para transitar os estados

public abstract class  SituacaoOrcamento {

    public BigDecimal caucularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser aprovado");
    }

    public void finalizar(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser aprovado");
    }


}
