package br.com.plpmd.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.plpmd.loja.orcamento.Orcamento;
import br.com.plpmd.loja.pedido.acao.AcaoAposGerarPedido;

//Design Pattern - Command Handler
public class GeraPedidoHandler {

	private List<AcaoAposGerarPedido> acoes;
	
	
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void executa(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

		//Design Pattern -> Observer -> Inversão de controle
		acoes.forEach(a -> a.executarAcao(pedido));
	}
}
