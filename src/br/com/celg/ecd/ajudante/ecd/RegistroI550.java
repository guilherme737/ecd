package br.com.celg.ecd.ajudante.ecd;

public class RegistroI550 {

	private final String registro = "I550";
	
	private String conteudoCampo;
	
	public RegistroI550(String conteudoCampo) {
		this.conteudoCampo = conteudoCampo;
	}

	@Override
	public String toString() {
		return "|" + registro 
				+ "|" + conteudoCampo 
				+ "|";
	}

	public String getRegistro() {
		return registro;
	}

	public String getConteudoCampo() {
		return conteudoCampo;
	}

	public void setConteudoCampo(String conteudoCampo) {
		this.conteudoCampo = conteudoCampo;
	}

	
	
	
}
