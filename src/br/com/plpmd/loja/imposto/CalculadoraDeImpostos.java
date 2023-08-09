package br.com.plpmd.loja.imposto;

import java.math.BigDecimal;

import br.com.plpmd.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		
		//Design Pattern strategy: trocar if/else/enum por classes com polimorfismo
		//quando sabemos qual regra será aplicada de acordo com o parametro
		return imposto.calcular(orcamento);
		
	}
}
