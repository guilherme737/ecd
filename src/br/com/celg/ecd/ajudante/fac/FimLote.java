package br.com.celg.ecd.ajudante.fac;

import br.com.celg.ecd.anotacao.Posicao;

public class FimLote {

	@Posicao(inicio=1, fim=1)
	private Integer tipoRegistro;
	
	@Posicao(inicio=2, fim=4)
	private Integer codigoEstabelecimento;
	
	@Posicao(inicio=5, fim=6)
	private Integer diaMovimento;
	
	@Posicao(inicio=7, fim=7)
	private Integer tipoMovimento; // 1-ABERTURA | 2-NORMAL | 3-ENCERRAMENTO
	
	@Posicao(inicio=8, fim=10)
	private Integer numeroLote; 
	
	@Posicao(inicio=11, fim=23)
	private String valorTotal;
	
	@Posicao(inicio=24, fim=28)
	private Integer quantidadeMovimentosContas;
	
	@Posicao(inicio=29, fim=34)
	private Integer quantidadeMovimentosCentroCusto;

	public Integer getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(Integer tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public Integer getCodigoEstabelecimento() {
		return codigoEstabelecimento;
	}

	public void setCodigoEstabelecimento(Integer codigoEstabelecimento) {
		this.codigoEstabelecimento = codigoEstabelecimento;
	}

	public Integer getDiaMovimento() {
		return diaMovimento;
	}

	public void setDiaMovimento(Integer diaMovimento) {
		this.diaMovimento = diaMovimento;
	}

	public Integer getTipoMovimento() {
		return tipoMovimento;
	}

	public void setTipoMovimento(Integer tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

	public Integer getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(Integer numeroLote) {
		this.numeroLote = numeroLote;
	}

	public String getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Integer getQuantidadeMovimentosContas() {
		return quantidadeMovimentosContas;
	}

	public void setQuantidadeMovimentosContas(Integer quantidadeMovimentosContas) {
		this.quantidadeMovimentosContas = quantidadeMovimentosContas;
	}

	public Integer getQuantidadeMovimentosCentroCusto() {
		return quantidadeMovimentosCentroCusto;
	}

	public void setQuantidadeMovimentosCentroCusto(
			Integer quantidadeMovimentosCentroCusto) {
		this.quantidadeMovimentosCentroCusto = quantidadeMovimentosCentroCusto;
	}
	
	
	
}
