package br.com.celg.ecd.ajudante.fac;

import br.com.celg.ecd.anotacao.Posicao;

public class InicioArquivo {

	@Posicao(inicio=1, fim=1)
	private Integer tipoRegistro;
	
	@Posicao(inicio=2, fim=4)
	private Integer codigoEmpresa;
	
	@Posicao(inicio=5, fim=6)
	private String mes;
	
	@Posicao(inicio=7, fim=10)
	private String ano;
	
	@Posicao(inicio=11, fim=12)
	private Integer versao;

	public Integer getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(Integer tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public Integer getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(Integer codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public Integer getVersao() {
		return versao;
	}

	public void setVersao(Integer versao) {
		this.versao = versao;
	}
	
	
	

}
