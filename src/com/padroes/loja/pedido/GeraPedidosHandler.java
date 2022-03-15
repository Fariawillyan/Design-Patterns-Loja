package com.padroes.loja.pedido;

import com.padroes.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

//metodos commands
public class GeraPedidosHandler {

    //construtor com injecao de dependencia: repository, service, etc.

    public void executar(GerarPedidos dados){

        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        String cliente = " Ana da Silva";
        LocalDateTime data = LocalDateTime.now();

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Salvar pedido no banco de dados");
        System.out.println("Enviar email com dados do novo pedido");



    }


}
