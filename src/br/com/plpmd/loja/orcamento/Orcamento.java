package br.com.plpmd.loja.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.plpmd.loja.orcamento.situacao.EmAnalise;
import br.com.plpmd.loja.orcamento.situacao.Finalizado;
import br.com.plpmd.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento implements Orcavel {

	private BigDecimal valor;
	private SituacaoOrcamento situacao;
	
	//Design Pattern Composite -> composicao de objetos que assinam a mesma interface
	private List<Orcavel> itens;

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

	public Orcamento() {
		this.valor = BigDecimal.ZERO;
		this.itens = new ArrayList<>();
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
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return valor;
	}
	
	public int getQuantidadeItens() {
		return itens.size();
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public boolean isFinalizado() {
		return situacao instanceof Finalizado;
	}
	
	public void adicionarItem(Orcavel item) {
		this.valor = valor.add(item.getValor());
		this.itens.add(item);
	}
	
	
}
