package br.com.plpmd.loja.imposto;

import java.math.BigDecimal;

import br.com.plpmd.loja.orcamento.Orcamento;

public class ICMS extends Imposto {
	
	public ICMS(Imposto outro) {
		super(outro);
	}

	public BigDecimal realizarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}
}
