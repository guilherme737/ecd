package br.com.celg.ecd.ajudante.ecd;

public class RegistroI555 {

	
	public final String registro = "I555";
	
	public String conteudoCampoTotalizadores;

	
	public RegistroI555(String conteudoCampoTotalizadores) {
		this.conteudoCampoTotalizadores = conteudoCampoTotalizadores;
	}

	@Override
	public String toString() {
		return "|" + registro
				+ "|" + conteudoCampoTotalizadores
				+ "|";
	}

	public String getRegistro() {
		return registro;
	}

	public String getConteudoCampoTotalizadores() {
		return conteudoCampoTotalizadores;
	}

	public void setConteudoCampoTotalizadores(String conteudoCampoTotalizadores) {
		this.conteudoCampoTotalizadores = conteudoCampoTotalizadores;
	}

	
	
}
