package br.com.plpmd.loja.desconto;

import java.math.BigDecimal;

import br.com.plpmd.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		
		//Design Pattern chain of responsability
		//verifica se a lógica deve ser aplicada, 
		//aplica ou chama a próxima regra da sequência
		Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaior500(
						new SemDesconto()));
		
		return cadeiaDeDescontos.efetuarCalculo(orcamento);
				
	}
}
