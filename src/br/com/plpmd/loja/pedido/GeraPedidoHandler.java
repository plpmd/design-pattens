package br.com.plpmd.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.plpmd.loja.orcamento.ItemOrcamento;
import br.com.plpmd.loja.orcamento.Orcamento;
import br.com.plpmd.loja.pedido.acao.AcaoAposGerarPedido;

//Design Pattern - Command Handler
public class GeraPedidoHandler {

	//Design Pattern -> Observer -> Inversão de controle
	private List<AcaoAposGerarPedido> acoesAposGerarPedido;
	
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		acoesAposGerarPedido = acoes;
	}

	public void executa(GeraPedido dados) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(dados.getValorOrcamento()));

		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

		//Design Pattern -> Facade
		this.acoesAposGerarPedido.forEach(a -> a.executarAcao(pedido));
	}
}
