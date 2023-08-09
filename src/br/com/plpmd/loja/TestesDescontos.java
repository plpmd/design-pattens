package br.com.plpmd.loja;

import java.math.BigDecimal;

import br.com.plpmd.loja.desconto.CalculadoraDeDescontos;
import br.com.plpmd.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(orcamento));
	}

}
