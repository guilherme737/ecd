package br.com.celg.ecd.ajudante.fac;

import br.com.celg.ecd.anotacao.Posicao;

public class InicioLote {

	@Posicao(inicio=1, fim=1)
	private Integer tipoRegistro;
	
	@Posicao(inicio=2, fim=4)
	private String codigoEstabelecimento;
	
	@Posicao(inicio=5, fim=6)
	private String diaMovimento;
	
	@Posicao(inicio=7, fim=7)
	private String tipoMovimento; //1-ABERTURA | 2-NORMAL | 3-ENCERRAMENTO
	
	@Posicao(inicio=8, fim=10)
	private String numeroLote; 
	
	@Posicao(inicio=11, fim=11)
	private String tipoLote; // C-CAIXA | E-EXTRA-CAIXA

	public Integer getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(Integer tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public String getCodigoEstabelecimento() {
		return codigoEstabelecimento;
	}

	public void setCodigoEstabelecimento(String codigoEstabelecimento) {
		this.codigoEstabelecimento = codigoEstabelecimento;
	}

	public String getDiaMovimento() {
		return diaMovimento;
	}

	public void setDiaMovimento(String diaMovimento) {
		this.diaMovimento = diaMovimento;
	}

	public String getTipoMovimento() {
		return tipoMovimento;
	}

	public void setTipoMovimento(String tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

	public String getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(String numeroLote) {
		this.numeroLote = numeroLote;
	}

	public String getTipoLote() {
		return tipoLote;
	}

	public void setTipoLote(String tipoLote) {
		this.tipoLote = tipoLote;
	}
	

}
