package br.com.celg.ecd.ajudante.fac;

import br.com.celg.ecd.anotacao.Posicao;

public class MovimentoCentroCusto {

	@Posicao(inicio=1, fim=1)
	private Integer tipoRegistro;
	
	@Posicao(inicio=2, fim=4)
	private Integer codigoEstabelecimentoLote;
	
	@Posicao(inicio=5, fim=6)
	private Integer diaMovimento;
	
	@Posicao(inicio=7, fim=7)
	private Integer tipoMovimento;
	
	@Posicao(inicio=8, fim=10)
	private Integer numeroLote;
	
	@Posicao(inicio=11, fim=15)
	private Integer sequencia;
	
	@Posicao(inicio=16, fim=16)
	private String natureza; // D-DEBITO | C-CREDITO
	
	@Posicao(inicio=17, fim=36)
	private String contaContabil;
	
	@Posicao(inicio=37, fim=40)
	private Integer sequenciaCentroCusto;
	
	@Posicao(inicio=41, fim=43)
	private String tabelaCentroCusto;
	
	@Posicao(inicio=44, fim=55)
	private String centroCusto;
	
	@Posicao(inicio=56, fim=56)
	private String tipoOperacao;
	
	@Posicao(inicio=57, fim=69)
	private String valor;

	public Integer getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(Integer tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public Integer getCodigoEstabelecimentoLote() {
		return codigoEstabelecimentoLote;
	}

	public void setCodigoEstabelecimentoLote(Integer codigoEstabelecimentoLote) {
		this.codigoEstabelecimentoLote = codigoEstabelecimentoLote;
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

	public Integer getSequencia() {
		return sequencia;
	}

	public void setSequencia(Integer sequencia) {
		this.sequencia = sequencia;
	}

	public String getNatureza() {
		return natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public String getContaContabil() {
		return contaContabil;
	}

	public void setContaContabil(String contaContabil) {
		this.contaContabil = contaContabil;
	}

	public Integer getSequenciaCentroCusto() {
		return sequenciaCentroCusto;
	}

	public void setSequenciaCentroCusto(Integer sequenciaCentroCusto) {
		this.sequenciaCentroCusto = sequenciaCentroCusto;
	}

	public String getTabelaCentroCusto() {
		return tabelaCentroCusto;
	}

	public void setTabelaCentroCusto(String tabelaCentroCusto) {
		this.tabelaCentroCusto = tabelaCentroCusto;
	}

	public String getCentroCusto() {
		return centroCusto;
	}

	public void setCentroCusto(String centroCusto) {
		this.centroCusto = centroCusto;
	}

	public String getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(String tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
}
