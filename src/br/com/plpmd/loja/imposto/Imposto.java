package br.com.plpmd.loja.imposto;

import java.math.BigDecimal;

import br.com.plpmd.loja.orcamento.Orcamento;

public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);
}
