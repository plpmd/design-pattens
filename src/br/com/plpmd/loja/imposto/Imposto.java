package br.com.plpmd.loja.imposto;

import java.math.BigDecimal;

import br.com.plpmd.loja.orcamento.Orcamento;

public abstract class Imposto {

	//Design Pattern Decorator 
	//Adiciona novas caracteristicas sem alterar o código existente
	private Imposto outro;
	
	public Imposto(Imposto outro) {
		this.outro = outro;
	}

	protected abstract BigDecimal realizarCalculo(Orcamento orcamento);
	
	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal valorImposto = realizarCalculo(orcamento);
		BigDecimal valorDoOutroImposto = BigDecimal.ZERO;
		if( outro != null) {
			valorDoOutroImposto = outro.realizarCalculo(orcamento);
		}
		return valorImposto.add(valorDoOutroImposto);
	}
}
