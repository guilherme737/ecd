package br.com.celg.ecd.ajudante.ecd;

public class RegistroI030 {

	private final String registro = "I030";

	private final String termoAbertura = "TERMO DE ABERTURA";

	private String numeroLivroEscrituracao;

	private String descricaoNaturezaLivro;

	private String quantidadeLinhasArquivo;

	private final String nomeEmpresaJuridica = "CELG GERACAO E TRANSMISSAO S.A.";

	private final String NIRE = "52300010276";

	private final String cnpj = "07779299000173";

	private final String dataArquivamentoAtos = "26122005";

	private final String dataArquivamentoAtosConversao = "";

	private final String municipio = "GOIANIA";
	
	public RegistroI030(String numeroLivroEscrituracao,
			String descricaoNaturezaLivro, String quantidadeLinhasArquivo) {
		this.numeroLivroEscrituracao = numeroLivroEscrituracao;
		this.descricaoNaturezaLivro = descricaoNaturezaLivro;
		this.quantidadeLinhasArquivo = quantidadeLinhasArquivo;
	}

	@Override
	public String toString() {
		return 	"|" + registro + 
				"|" + termoAbertura + 
				"|" + numeroLivroEscrituracao + 
				"|" + descricaoNaturezaLivro  + 
				"|" + quantidadeLinhasArquivo + 
				"|" + nomeEmpresaJuridica +
				"|" + NIRE +
				"|" + cnpj +
				"|" + dataArquivamentoAtos + 
				"|" + dataArquivamentoAtosConversao + 
				"|" + municipio + 
				"|";
	}

	public String getRegistro() {
		return registro;
	}

	public String getNumeroLivroEscrituracao() {
		return numeroLivroEscrituracao;
	}

	public void setNumeroLivroEscrituracao(String numeroLivroEscrituracao) {
		this.numeroLivroEscrituracao = numeroLivroEscrituracao;
	}

	public String getDescricaoNaturezaLivro() {
		return descricaoNaturezaLivro;
	}

	public void setDescricaoNaturezaLivro(String descricaoNaturezaLivro) {
		this.descricaoNaturezaLivro = descricaoNaturezaLivro;
	}

	public String getQuantidadeLinhasArquivo() {
		return quantidadeLinhasArquivo;
	}

	public void setQuantidadeLinhasArquivo(String quantidadeLinhasArquivo) {
		this.quantidadeLinhasArquivo = quantidadeLinhasArquivo;
	}

	public String getNomeEmpresaJuridica() {
		return nomeEmpresaJuridica;
	}

	public String getDataArquivamentoAtos() {
		return dataArquivamentoAtos;
	}
	
	public String getDataArquivamentoAtosConversao() {
		return dataArquivamentoAtosConversao;
	}

	public String getTermoAbertura() {
		return termoAbertura;
	}

	public String getNIRE() {
		return NIRE;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getMunicipio() {
		return municipio;
	}

}
