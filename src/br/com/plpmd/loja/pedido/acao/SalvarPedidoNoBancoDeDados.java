package br.com.plpmd.loja.pedido.acao;

import br.com.plpmd.loja.pedido.Pedido;

//Design Pattern -> Observer
public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido{

	public void executarAcao(Pedido pedido) {
		System.out.println("Salvar pedido no banco");
	}
}
