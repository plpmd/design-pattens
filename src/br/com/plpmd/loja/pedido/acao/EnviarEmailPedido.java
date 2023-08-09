package br.com.plpmd.loja.pedido.acao;

import br.com.plpmd.loja.pedido.Pedido;


//Design Pattern -> Observer
public class EnviarEmailPedido implements AcaoAposGerarPedido {

	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando email com dados do pedido");
	}
}
