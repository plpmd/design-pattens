package br.com.plpmd.loja.pedido.acao;

import br.com.plpmd.loja.pedido.Pedido;

public class LogDePedido implements AcaoAposGerarPedido {

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Pedido foi gerado: "+ pedido);
	}

}
