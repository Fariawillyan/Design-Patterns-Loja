package com.padroes.loja;

import com.padroes.loja.orcamento.Orcamento;
import com.padroes.loja.pedido.GeraPedidosHandler;
import com.padroes.loja.pedido.GerarPedidos;
import com.padroes.loja.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GerarPedidos gerador = new GerarPedidos(cliente, valorOrcamento, quantidadeItens);
        GeraPedidosHandler handler = new GeraPedidosHandler(/* dependencias */);
        handler.executar(gerador);

    }


}
