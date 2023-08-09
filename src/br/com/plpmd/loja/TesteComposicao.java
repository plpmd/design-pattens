package br.com.plpmd.loja;

import java.math.BigDecimal;

import br.com.plpmd.loja.orcamento.ItemOrcamento;
import br.com.plpmd.loja.orcamento.Orcamento;
import br.com.plpmd.loja.orcamento.OrcamentoProxy;

public class TesteComposicao {

	public static void main(String[] args) {
		Orcamento antigo = new Orcamento();
		antigo.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
		antigo.reprovar();
		
		Orcamento novo = new Orcamento();
		novo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		novo.adicionarItem(antigo);
		
		//Design Pattern - Proxy
		//Simulamos getValor() como uma chamada lenta
		//fizemos um proxy para armazenar o resultado
		//e agilizar novas chamadas
		OrcamentoProxy proxy = new OrcamentoProxy(novo);
		System.out.println(proxy.getValor());
	}
}
