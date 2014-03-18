package br.com.celg.ecd.ajudante.ecd;

public class RegistroI500 {

	private final String registro = "I500";
	
	private final String tamanhoFonte = "10";
	

	@Override
	public String toString() {
		return "|" + registro 
				+ "|" + tamanhoFonte 
				+ "|";
	}

	public String getRegistro() {
		return registro;
	}

	public String getTamanhoFonte() {
		return tamanhoFonte;
	}
	
	
}
