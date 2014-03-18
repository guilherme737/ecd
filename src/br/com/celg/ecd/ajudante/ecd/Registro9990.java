package br.com.celg.ecd.ajudante.ecd;

public class Registro9990 {

	private final String registro = "9990";

	private int quantidadeLinhasBloco;

	public Registro9990(int quantidadeLinhasBloco) {
		this.quantidadeLinhasBloco = quantidadeLinhasBloco;
	}

	@Override
	public String toString() {
		return "|" + registro + "|" + quantidadeLinhasBloco + "|";
	}

	public String getRegistro() {
		return registro;
	}

	public int getQuantidadeLinhasBloco() {
		return quantidadeLinhasBloco;
	}

	public void setQuantidadeLinhasBloco(int quantidadeLinhasBloco) {
		this.quantidadeLinhasBloco = quantidadeLinhasBloco;
	}

}
