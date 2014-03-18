package br.com.celg.ecd.ajudante.ecd;

public class Registro9999 {

	private final String registro = "9999";

	private int quantidadeTotalLinhasArquivoDigital;
	
	public Registro9999(int quantidadeTotalLinhasArquivoDigital) {
		this.quantidadeTotalLinhasArquivoDigital = quantidadeTotalLinhasArquivoDigital;
	}

	@Override
	public String toString() {
		return "|" + registro + "|" + quantidadeTotalLinhasArquivoDigital + "|";
	}

	public String getRegistro() {
		return registro;
	}

	public int getQuantidadeTotalLinhasArquivoDigital() {
		return quantidadeTotalLinhasArquivoDigital;
	}

	public void setQuantidadeTotalLinhasArquivoDigital(
			int quantidadeTotalLinhasArquivoDigital) {
		this.quantidadeTotalLinhasArquivoDigital = quantidadeTotalLinhasArquivoDigital;
	}

}
