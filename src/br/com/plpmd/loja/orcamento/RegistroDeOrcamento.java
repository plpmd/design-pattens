package br.com.plpmd.loja.orcamento;

import java.util.Map;

import br.com.plpmd.loja.DomainException;
import br.com.plpmd.loja.http.HttpAdapter;

public class RegistroDeOrcamento {

	//Depender de abstrações
	private HttpAdapter http;

	public RegistroDeOrcamento(HttpAdapter http) {
		this.http = http;
	}

	public void registrar(Orcamento orcamento) {

		if(!orcamento.isFinalizado()) {
			throw new DomainException("Orcamento não finalizado");
		}
		String url = "http://api.externa/orcamento";
		Map<String, Object> dados = Map.of("valor", orcamento.getValor(), "quantidadeItens",
				orcamento.getQuantidadeItens());

		http.post(url, dados);

	}
}
