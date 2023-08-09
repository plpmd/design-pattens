package br.com.plpmd.loja.desconto;

import java.math.BigDecimal;

import br.com.plpmd.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComValorMaior500 extends Desconto {

	public DescontoParaOrcamentoComValorMaior500(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {

		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}
}
