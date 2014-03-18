package br.com.celg.ecd.ajudante.fac;

import br.com.celg.ecd.anotacao.Posicao;

public class MovimentoContaContabil {

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
	
	@Posicao(inicio=11, fim=16)
	private Integer sequencia;
	
	@Posicao(inicio=17, fim=17)
	private String natureza; // D-DEBITO | C-CREDITO
	
	@Posicao(inicio=18, fim=37)
	private String contaContabil;
	
	@Posicao(inicio=38, fim=50)
	private String valor;
	
	@Posicao(inicio=51, fim=54)
	private String codigoHistorico;
	
	@Posicao(inicio=55, fim=98)
	private String complementoHistorico;
	
	@Posicao(inicio=99, fim=101)
	private Integer codigoEstabelecimentoMovimento;
	
	@Posicao(inicio=102, fim=109)
	private Integer numeroDocumento;
	
	@Posicao(inicio=110, fim=114)
	private String serieDocumento;
	
	@Posicao(inicio=115, fim=117)
	private Integer codigoRecurso;
	
	@Posicao(inicio=118, fim=417)
	private String descritivoHistorico;

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

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getCodigoHistorico() {
		return codigoHistorico;
	}

	public void setCodigoHistorico(String codigoHistorico) {
		this.codigoHistorico = codigoHistorico;
	}

	public String getComplementoHistorico() {
		return complementoHistorico;
	}

	public void setComplementoHistorico(String complementoHistorico) {
		this.complementoHistorico = complementoHistorico;
	}

	public Integer getCodigoEstabelecimentoMovimento() {
		return codigoEstabelecimentoMovimento;
	}

	public void setCodigoEstabelecimentoMovimento(
			Integer codigoEstabelecimentoMovimento) {
		this.codigoEstabelecimentoMovimento = codigoEstabelecimentoMovimento;
	}

	public Integer getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(Integer numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getSerieDocumento() {
		return serieDocumento;
	}

	public void setSerieDocumento(String serieDocumento) {
		this.serieDocumento = serieDocumento;
	}

	public Integer getCodigoRecurso() {
		return codigoRecurso;
	}

	public void setCodigoRecurso(Integer codigoRecurso) {
		this.codigoRecurso = codigoRecurso;
	}

	public String getDescritivoHistorico() {
		return descritivoHistorico;
	}

	public void setDescritivoHistorico(String descritivoHistorico) {
		this.descritivoHistorico = descritivoHistorico;
	}
	
	

}
