package br.com.celg.ecd.ajudante.ecd;

public class RegistroI200 {

	private final String registro= "I200";
	
	private String numeroIdUnicoLancamento;
	
	private String dataLancamento;
	
	private String valorLancamento;
	
	private String tipoLancamento;
	
	public RegistroI200(String numeroIdUnicoLancamento, String dataLancamento,
			String valorLancamento, String tipoLancamento) {
		this.numeroIdUnicoLancamento = numeroIdUnicoLancamento;
		this.dataLancamento = dataLancamento;
		this.valorLancamento = valorLancamento;
		this.tipoLancamento = tipoLancamento;
	}

	@Override
	public String toString() {
		return "|" + registro
				+ "|" + numeroIdUnicoLancamento
				+ "|" + dataLancamento 
				+ "|" + valorLancamento 
				+ "|" + tipoLancamento 
				+ "|";
	}

	public String getNumeroIdUnicoLancamento() {
		return numeroIdUnicoLancamento;
	}

	public void setNumeroIdUnicoLancamento(String numeroIdUnicoLancamento) {
		this.numeroIdUnicoLancamento = numeroIdUnicoLancamento;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getValorLancamento() {
		return valorLancamento;
	}

	public void setValorLancamento(String valorLancamento) {
		this.valorLancamento = valorLancamento;
	}

	public String getTipoLancamento() {
		return tipoLancamento;
	}

	public void setTipoLancamento(String tipoLancamento) {
		this.tipoLancamento = tipoLancamento;
	}

	public String getRegistro() {
		return registro;
	}
	
	
}
