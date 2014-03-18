package br.com.celg.ecd.ajudante.ecd;

public class RegistroJ900 {

	public final String registro = "J900";
	
	public final String termoEncerramento = "TERMO DE ENCERRAMENTO";
	
	public String numeroOrdem;
	
	public String naturezaLivro;
	
	public final String nomeEmpresarial = "CELG GERACAO E TRANSMISSAO S.A.";
	
	public String quantidadeTotalLinhasArquivo;
	
	public String dataInicialEscrituracao;
	
	public String dataFinalEscrituracao;
	
	public RegistroJ900(String numeroOrdem, String naturezaLivro,
			String quantidadeTotalLinhasArquivo,
			String dataInicialEscrituracao, String dataFinalEscrituracao) {
		this.numeroOrdem = numeroOrdem;
		this.naturezaLivro = naturezaLivro;
		this.quantidadeTotalLinhasArquivo = quantidadeTotalLinhasArquivo;
		this.dataInicialEscrituracao = dataInicialEscrituracao;
		this.dataFinalEscrituracao = dataFinalEscrituracao;
	}


	@Override
	public String toString() {
		return "|" + registro 
				+ "|" + termoEncerramento 
				+ "|" + numeroOrdem
				+ "|" + naturezaLivro 
				+ "|" + nomeEmpresarial 
				+ "|" + quantidadeTotalLinhasArquivo 
				+ "|" + dataInicialEscrituracao 
				+ "|" + dataFinalEscrituracao 
				+ "|";
	}
	

	public String getNumeroOrdem() {
		return numeroOrdem;
	}

	public void setNumeroOrdem(String numeroOrdem) {
		this.numeroOrdem = numeroOrdem;
	}

	public String getNaturezaLivro() {
		return naturezaLivro;
	}

	public void setNaturezaLivro(String naturezaLivro) {
		this.naturezaLivro = naturezaLivro;
	}

	public String getQuantidadeTotalLinhasArquivo() {
		return quantidadeTotalLinhasArquivo;
	}

	public void setQuantidadeTotalLinhasArquivo(String quantidadeTotalLinhasArquivo) {
		this.quantidadeTotalLinhasArquivo = quantidadeTotalLinhasArquivo;
	}

	public String getDataInicialEscrituracao() {
		return dataInicialEscrituracao;
	}

	public void setDataInicialEscrituracao(String dataInicialEscrituracao) {
		this.dataInicialEscrituracao = dataInicialEscrituracao;
	}

	public String getDataFinalEscrituracao() {
		return dataFinalEscrituracao;
	}

	public void setDataFinalEscrituracao(String dataFinalEscrituracao) {
		this.dataFinalEscrituracao = dataFinalEscrituracao;
	}

	public String getRegistro() {
		return registro;
	}

	public String getTermoEncerramento() {
		return termoEncerramento;
	}

	public String getNomeEmpresarial() {
		return nomeEmpresarial;
	}

	
	
	
	
	
}
