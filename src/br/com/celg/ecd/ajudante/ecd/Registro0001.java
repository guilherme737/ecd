package br.com.celg.ecd.ajudante.ecd;

public class Registro0001 {

	private final String registro = "0001";
	
	private Integer indicadorMovimento = 0;
	
	@Override
	public String toString() {
		return "|" + registro + "|" + indicadorMovimento + "|";
	}

	public String getRegistro() {
		return registro;
	}

	public Integer getIndicadorMovimento() {
		return indicadorMovimento;
	}

	public void setIndicadorMovimento(Integer indicadorMovimento) {
		this.indicadorMovimento = indicadorMovimento;
	}
	
	
}
