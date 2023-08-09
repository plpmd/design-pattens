package br.com.plpmd.loja.desconto;

import java.math.BigDecimal;

import br.com.plpmd.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		
		//Design Pattern chain of responsability
		//verifica se a l�gica deve ser aplicada, 
		//aplica ou chama a pr�xima regra da sequ�ncia
		Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaior500(
						new SemDesconto()));
		
		return cadeiaDeDescontos.efetuarCalculo(orcamento);
				
	}
}
