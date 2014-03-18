package br.com.celg.ecd.ajudante.ecd;

public class RegistroI001 {

	private final String registro = "I001";
	
	private final String indicadorMovimento = "0";
	
	@Override
	public String toString() {
		return "|" + registro + "|" + indicadorMovimento + "|";
	}

	public String getIndicadorMovimento() {
		return indicadorMovimento;
	}

	public String getRegistro() {
		return registro;
	}
	
	

}
