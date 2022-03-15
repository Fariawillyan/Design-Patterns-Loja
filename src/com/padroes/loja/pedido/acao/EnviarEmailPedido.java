package com.padroes.loja.pedido.acao;

import com.padroes.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{

    public void executarAcao(Pedido pedido){

        System.out.println("Envikando email com dados do pedido");
    }
}
