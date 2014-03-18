package br.com.celg.ecd.ajudante.ecd;

public class RegistroJ990 {

	private final String registro = "J990";
	
	private int quantidadeLinhasBloco;

	
	public RegistroJ990(int quantidadeLinhasBloco) {
		this.quantidadeLinhasBloco = quantidadeLinhasBloco;
	}

	@Override
	public String toString() {
		return "|" + registro + "|" + quantidadeLinhasBloco + "|";
	}

	public int getQuantidadeLinhasBloco() {
		return quantidadeLinhasBloco;
	}

	public void setQuantidadeLinhasBloco(int quantidadeLinhasBloco) {
		this.quantidadeLinhasBloco = quantidadeLinhasBloco;
	}

	public String getRegistro() {
		return registro;
	}
	
	
}
