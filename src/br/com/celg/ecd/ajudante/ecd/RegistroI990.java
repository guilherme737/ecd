package br.com.celg.ecd.ajudante.ecd;

public class RegistroI990 {

	public final String registro = "I990";
	
	public Integer quantidadeLinhasBloco;

	public RegistroI990(Integer quantidadeLinhasBloco) {
		this.quantidadeLinhasBloco = quantidadeLinhasBloco;
	}

	@Override
	public String toString() {
		return "|" + registro
				+ "|" + quantidadeLinhasBloco 
				+ "|";
	}

	public String getRegistro() {
		return registro;
	}

	public Integer getQuantidadeLinhasBloco() {
		return quantidadeLinhasBloco;
	}

	public void setQuantidadeLinhasBloco(Integer quantidadeLinhasBloco) {
		this.quantidadeLinhasBloco = quantidadeLinhasBloco;
	}

	
	
}
