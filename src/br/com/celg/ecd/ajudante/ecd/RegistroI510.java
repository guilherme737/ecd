package br.com.celg.ecd.ajudante.ecd;

public class RegistroI510 {

	public final String registro = "I510";
	
	public String nomeCampo;
	
	public String descricaoCampo;
	
	public String tipoCampo; // N - Numérico | C - Caracter
	
	public String tamanhoCampo;
	
	public String quantidadeCasasDecimais;
	
	public String larguraColuna;
	
	
	public RegistroI510(String nomeCampo, String descricaoCampo,
			String tipoCampo, String tamanhoCampo,
			String quantidadeCasasDecimais, String larguraColuna) {
		this.nomeCampo = nomeCampo;
		this.descricaoCampo = descricaoCampo;
		this.tipoCampo = tipoCampo;
		this.tamanhoCampo = tamanhoCampo;
		this.quantidadeCasasDecimais = quantidadeCasasDecimais;
		this.larguraColuna = larguraColuna;
	}

	@Override
	public String toString() {
		return "|" + registro 
				+ "|" + nomeCampo 
				+ "|" + descricaoCampo
				+ "|" + tipoCampo 
				+ "|" + tamanhoCampo
				+ "|" + quantidadeCasasDecimais
				+ "|" + larguraColuna 
				+ "|";
	}

	public String getNomeCampo() {
		return nomeCampo;
	}

	public void setNomeCampo(String nomeCampo) {
		this.nomeCampo = nomeCampo;
	}

	public String getDescricaoCampo() {
		return descricaoCampo;
	}

	public void setDescricaoCampo(String descricaoCampo) {
		this.descricaoCampo = descricaoCampo;
	}

	public String getTipoCampo() {
		return tipoCampo;
	}

	public void setTipoCampo(String tipoCampo) {
		this.tipoCampo = tipoCampo;
	}

	public String getTamanhoCampo() {
		return tamanhoCampo;
	}

	public void setTamanhoCampo(String tamanhoCampo) {
		this.tamanhoCampo = tamanhoCampo;
	}

	public String getQuantidadeCasasDecimais() {
		return quantidadeCasasDecimais;
	}

	public void setQuantidadeCasasDecimais(String quantidadeCasasDecimais) {
		this.quantidadeCasasDecimais = quantidadeCasasDecimais;
	}

	public String getLarguraColuna() {
		return larguraColuna;
	}

	public void setLarguraColuna(String larguraColuna) {
		this.larguraColuna = larguraColuna;
	}

	public String getRegistro() {
		return registro;
	}
	
	
	
}
