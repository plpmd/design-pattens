package br.com.plpmd.loja.desconto;

import java.math.BigDecimal;

import br.com.plpmd.loja.orcamento.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	//Design Pattern Template method -> 
	//reaproveitar trechos comuns nas classes filhas
	//implementando m�todo concreto na classe m�e
	//e a classe filha implementa apenas o que � especifico dela
	public BigDecimal calcular(Orcamento orcamento) {
		if (deveAplicar(orcamento)) {
			return efetuarCalculo(orcamento);
		} else {
			return proximo.calcular(orcamento);
		}
	}

	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

	protected abstract boolean deveAplicar(Orcamento orcamento);

}
