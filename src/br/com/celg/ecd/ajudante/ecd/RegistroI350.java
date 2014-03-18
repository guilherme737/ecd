package br.com.celg.ecd.ajudante.ecd;

public class RegistroI350 {

	private final String registro = "I350";
	
	private String dataApuracaoResultado;

	public RegistroI350(String dataApuracaoResultado) {
		this.dataApuracaoResultado = dataApuracaoResultado;
	}

	@Override
	public String toString() {
		return "|" + registro
				+ "|" + dataApuracaoResultado 
				+ "|";
	}

	public String getRegistro() {
		return registro;
	}
	
	public String getDataApuracaoResultado() {
		return dataApuracaoResultado;
	}

	public void setDataApuracaoResultado(String dataApuracaoResultado) {
		this.dataApuracaoResultado = dataApuracaoResultado;
	}

	
	
	
}
