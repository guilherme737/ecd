package br.com.celg.ecd.ajudante.ecd;

public class RegistroJ005 {
	
	private final String registro = "J005";
	
	private String dataInicialDemonstracoes;
	
	private String dataFinalDemonstracoes;
	
	private String identificacaoDemonstracoes;
	
	private String cabecalhoDemonstracoes;
	
	public RegistroJ005(String dataInicialDemonstracoes,
			String dataFinalDemonstracoes, String identificacaoDemonstracoes,
			String cabecalhoDemonstracoes) {
		this.dataInicialDemonstracoes = dataInicialDemonstracoes;
		this.dataFinalDemonstracoes = dataFinalDemonstracoes;
		this.identificacaoDemonstracoes = identificacaoDemonstracoes;
		this.cabecalhoDemonstracoes = cabecalhoDemonstracoes;
	}

	@Override
	public String toString() {
		return "|" + registro
				+ "|" + dataInicialDemonstracoes
				+ "|" + dataFinalDemonstracoes
				+ "|" + identificacaoDemonstracoes
				+ "|" + cabecalhoDemonstracoes 
				+ "|";
	}

	public String getRegistro() {
		return registro;
	}

	public String getDataInicialDemonstracoes() {
		return dataInicialDemonstracoes;
	}

	public void setDataInicialDemonstracoes(String dataInicialDemonstracoes) {
		this.dataInicialDemonstracoes = dataInicialDemonstracoes;
	}

	public String getDataFinalDemonstracoes() {
		return dataFinalDemonstracoes;
	}

	public void setDataFinalDemonstracoes(String dataFinalDemonstracoes) {
		this.dataFinalDemonstracoes = dataFinalDemonstracoes;
	}

	public String getIdentificacaoDemonstracoes() {
		return identificacaoDemonstracoes;
	}

	public void setIdentificacaoDemonstracoes(String identificacaoDemonstracoes) {
		this.identificacaoDemonstracoes = identificacaoDemonstracoes;
	}

	public String getCabecalhoDemonstracoes() {
		return cabecalhoDemonstracoes;
	}

	public void setCabecalhoDemonstracoes(String cabecalhoDemonstracoes) {
		this.cabecalhoDemonstracoes = cabecalhoDemonstracoes;
	}

	
	
	
	
}
