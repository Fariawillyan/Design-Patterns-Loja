package com.padroes.loja.pedido;

import com.padroes.loja.orcamento.Orcamento;
import com.padroes.loja.pedido.acao.AcaoAposGerarPedido;
import com.padroes.loja.pedido.acao.EnviarEmailPedido;
import com.padroes.loja.pedido.acao.SalvasPedidoBancioDeDados;

import java.time.LocalDateTime;
import java.util.List;

//metodos commands
public class GeraPedidosHandler {

    private List<AcaoAposGerarPedido> acoes;
    public GeraPedidosHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void executar(GerarPedidos dados){

        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
        acoes.forEach(a ->a.executarAcao(pedido));
    }


}
