package br.com.celg.ecd.ajudante.ecd;

public class Registro0990 {

	private final String registro = "0990";
	
	private final String quantidadeLinhasBloco = "4";

	
	@Override
	public String toString() {
		return "|" + registro + "|" + quantidadeLinhasBloco + "|";
	}

	public String getRegistro() {
		return registro;
	}

	public String getQuantidadeLinhasBloco() {
		return quantidadeLinhasBloco;
	}
	
}
