package br.com.celg.ecd.ajudante.ecd;

public class Registro9001 {

	private final String registro = "9001";

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
