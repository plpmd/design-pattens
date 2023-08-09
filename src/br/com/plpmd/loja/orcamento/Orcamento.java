package br.com.plpmd.loja.orcamento;

import java.math.BigDecimal;

import br.com.plpmd.loja.orcamento.situacao.EmAnalise;
import br.com.plpmd.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {

	private BigDecimal valor;
	private int quantidadeItens;
	private SituacaoOrcamento situacao;

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		this.situacao = new EmAnalise();
	}
	
	//Design Pattern State
	public void aplicarDescontoExtra() {
		BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
		this.valor = this.valor.subtract(valorDoDescontoExtra);
	}

	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	public void finalizar() {
		this.situacao.finalizar(this);
	}
	public BigDecimal getValor() {
		return valor;
	}
	
	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
}
