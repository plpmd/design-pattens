package br.com.plpmd.loja.desconto;

import java.math.BigDecimal;

import br.com.plpmd.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);
	}

	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return true;
	}

}
