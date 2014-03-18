package br.com.celg.ecd.ajudante.ecd;

public class RegistroI050 {
	
	private final String registro = "I050";
	
	private String dataAlteracaoInclusao;
	
	private String codigoNaturezaConta;
	
	private String tipoConta; // S - Sintética | A - Analitica
	
	private String nivelContaAnalitica;
	
	private String codigoContaAnalitica;
	
	private String codigoContaSinteticaSuperior;
	
	private String nomeContaAnalitica;
	
	

	public RegistroI050(String dataAlteracaoInclusao,
			String codigoNaturezaConta, String tipoConta,
			String nivelContaAnalitica, String codigoContaAnalitica,
			String codigoContaSinteticaSuperior, String nomeContaAnalitica) {
		
		this.dataAlteracaoInclusao = dataAlteracaoInclusao;
		this.codigoNaturezaConta = codigoNaturezaConta;
		this.tipoConta = tipoConta;
		this.nivelContaAnalitica = nivelContaAnalitica;
		this.codigoContaAnalitica = codigoContaAnalitica;
		this.codigoContaSinteticaSuperior = codigoContaSinteticaSuperior;
		this.nomeContaAnalitica = nomeContaAnalitica;
	}

	@Override
	public String toString() {
		return 	  "|" + registro
				+ "|" + dataAlteracaoInclusao
				+ "|" + codigoNaturezaConta
				+ "|" + tipoConta 
				+ "|" + nivelContaAnalitica 
				+ "|" + codigoContaAnalitica 
				+ "|" + codigoContaSinteticaSuperior 
				+ "|" + nomeContaAnalitica + "|";
	}

	public String getDataAlteracaoInclusao() {
		return dataAlteracaoInclusao;
	}

	public void setDataAlteracaoInclusao(String dataAlteracaoInclusao) {
		this.dataAlteracaoInclusao = dataAlteracaoInclusao;
	}

	public String getCodigoNaturezaConta() {
		return codigoNaturezaConta;
	}

	public void setCodigoNaturezaConta(String codigoNaturezaConta) {
		this.codigoNaturezaConta = codigoNaturezaConta;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getNivelContaAnalitica() {
		return nivelContaAnalitica;
	}

	public void setNivelContaAnalitica(String nivelContaAnalitica) {
		this.nivelContaAnalitica = nivelContaAnalitica;
	}

	public String getCodigoContaAnalitica() {
		return codigoContaAnalitica;
	}

	public void setCodigoContaAnalitica(String codigoContaAnalitica) {
		this.codigoContaAnalitica = codigoContaAnalitica;
	}

	public String getCodigoContaSinteticaSuperior() {
		return codigoContaSinteticaSuperior;
	}

	public void setCodigoContaSinteticaSuperior(String codigoContaSinteticaSuperior) {
		this.codigoContaSinteticaSuperior = codigoContaSinteticaSuperior;
	}

	public String getNomeContaAnalitica() {
		return nomeContaAnalitica;
	}

	public void setNomeContaAnalitica(String nomeContaAnalitica) {
		this.nomeContaAnalitica = nomeContaAnalitica;
	}

	public String getRegistro() {
		return registro;
	}
	
	
	

}
