package com.padroes.loja.pedido;

import com.padroes.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class Pedido {

    private String cliente;
    private LocalDateTime data;
    private Orcamento orcamento;

    public Pedido(String cliente, LocalDateTime data, Orcamento orcamento) {
        this.cliente = cliente;
        this.data = data;
        this.orcamento = orcamento;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }
}
