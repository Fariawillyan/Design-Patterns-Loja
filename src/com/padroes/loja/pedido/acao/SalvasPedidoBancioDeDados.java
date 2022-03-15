package com.padroes.loja.pedido.acao;

import com.padroes.loja.pedido.Pedido;

public class SalvasPedidoBancioDeDados implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido){

        System.out.println("Enviando pedido para o banco de dados ");
    }
}
