package com.padroes.loja;

import com.padroes.loja.orcamento.Orcamento;
import com.padroes.loja.pedido.GeraPedidosHandler;
import com.padroes.loja.pedido.GerarPedidos;
import com.padroes.loja.pedido.Pedido;
import com.padroes.loja.pedido.acao.EnviarEmailPedido;
import com.padroes.loja.pedido.acao.SalvasPedidoBancioDeDados;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = "Rodrigo";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("2");

        GerarPedidos gerador = new GerarPedidos(cliente, valorOrcamento, quantidadeItens);
        GeraPedidosHandler handler = new GeraPedidosHandler(
                Arrays.asList(new SalvasPedidoBancioDeDados(),
                        new EnviarEmailPedido())
        );

        handler.executar(gerador);

    }


}
