package br.com.plpmd.loja.http;

import br.com.plpmd.loja.orcamento.Orcamento;
import br.com.plpmd.loja.orcamento.RegistroDeOrcamento;

public class AdapterMainTeste {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpCliente());
		registro.registrar(orcamento);
	}
}
