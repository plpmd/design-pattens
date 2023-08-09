package br.com.plpmd.loja;

import java.math.BigDecimal;

import br.com.plpmd.loja.imposto.CalculadoraDeImpostos;
import br.com.plpmd.loja.imposto.ICMS;
import br.com.plpmd.loja.imposto.ISS;
import br.com.plpmd.loja.orcamento.ItemOrcamento;
import br.com.plpmd.loja.orcamento.Orcamento;

public class TesteImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("10")));
		
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		//Design Pattern Decorator
		System.out.println(calculadora.calcular(orcamento, new ICMS(new ISS(null))));
	}

}
