package br.com.celg.ecd.ajudante.ecd;

public class RegistroI250 {

	private final String registro = "I250";
	
	private String codigoContaAnalitica;
	
	private final String codigoCentroCusto = "";
	
	private String valorPartida;
	
	private String naturezaPartida; // D - Débito | C - Crédito
	
	private String codigoLocalizacaoDocumentosArquivados;
	
	private String codigoHistoricoPadronizado;
	
	private String historicoCompletoPartida;
	
	private final String codigoParticipante = ""; // NAO SERÁ UTILIZADO
	
	public RegistroI250(String codigoContaAnalitica, 
			String valorPartida, String naturezaPartida,
			String codigoLocalizacaoDocumentosArquivados,
			String codigoHistoricoPadronizado, String historicoCompletoPartida) {
		this.codigoContaAnalitica = codigoContaAnalitica;
		this.valorPartida = valorPartida;
		this.naturezaPartida = naturezaPartida;
		this.codigoLocalizacaoDocumentosArquivados = codigoLocalizacaoDocumentosArquivados;
		this.codigoHistoricoPadronizado = codigoHistoricoPadronizado;
		this.historicoCompletoPartida = historicoCompletoPartida;
	}

	@Override
	public String toString() {
		return "|" + registro 
				+ "|" + codigoContaAnalitica 
				+ "|" + codigoCentroCusto 
				+ "|" + valorPartida
				+ "|" + naturezaPartida
				+ "|" + codigoLocalizacaoDocumentosArquivados
				+ "|" + codigoHistoricoPadronizado
				+ "|" + historicoCompletoPartida
				+ "|" + codigoParticipante 
				+ "|";
	}

	public String getCodigoContaAnalitica() {
		return codigoContaAnalitica;
	}

	public void setCodigoContaAnalitica(String codigoContaAnalitica) {
		this.codigoContaAnalitica = codigoContaAnalitica;
	}

	public String getCodigoCentroCusto() {
		return codigoCentroCusto;
	}

	public String getValorPartida() {
		return valorPartida;
	}

	public void setValorPartida(String valorPartida) {
		this.valorPartida = valorPartida;
	}

	public String getNaturezaPartida() {
		return naturezaPartida;
	}

	public void setNaturezaPartida(String naturezaPartida) {
		this.naturezaPartida = naturezaPartida;
	}

	public String getCodigoLocalizacaoDocumentosArquivados() {
		return codigoLocalizacaoDocumentosArquivados;
	}

	public void setCodigoLocalizacaoDocumentosArquivados(
			String codigoLocalizacaoDocumentosArquivados) {
		this.codigoLocalizacaoDocumentosArquivados = codigoLocalizacaoDocumentosArquivados;
	}

	public String getCodigoHistoricoPadronizado() {
		return codigoHistoricoPadronizado;
	}

	public void setCodigoHistoricoPadronizado(String codigoHistoricoPadronizado) {
		this.codigoHistoricoPadronizado = codigoHistoricoPadronizado;
	}

	public String getHistoricoCompletoPartida() {
		return historicoCompletoPartida;
	}

	public void setHistoricoCompletoPartida(String historicoCompletoPartida) {
		this.historicoCompletoPartida = historicoCompletoPartida;
	}

	public String getCodigoParticipante() {
		return codigoParticipante;
	}

	public String getRegistro() {
		return registro;
	}
	
	
	
	
}
