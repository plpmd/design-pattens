package br.com.plpmd.loja.orcamento.situacao;

import br.com.plpmd.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
