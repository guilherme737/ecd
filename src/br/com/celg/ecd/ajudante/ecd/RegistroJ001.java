package br.com.celg.ecd.ajudante.ecd;

public class RegistroJ001 {

	private final String registro = "J001";
	
	private final String indicadorMovimento = "0";

	
	
	@Override
	public String toString() {
		return "|" + registro + "|" + indicadorMovimento + "|";
	}

	public String getRegistro() {
		return registro;
	}

	public String getIndicadorMovimento() {
		return indicadorMovimento;
	}
	
}
