package br.com.plpmd.loja.pedido;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.plpmd.loja.pedido.acao.EnviarEmailPedido;
import br.com.plpmd.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestePedidos {

	public static void main(String[] args) {
		//Simula uma interface que manda os dados
		String cliente = "Pedro";
		BigDecimal valorOrcamento = new BigDecimal("200");
		int quantidadeItens = Integer.parseInt("2");
		
		//Design Pattern - Command e CommandHandler
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new SalvarPedidoNoBancoDeDados(),
				new EnviarEmailPedido()
				));
		handler.executa(gerador);

	}

}
