package br.com.celg.ecd.ajudante.ecd;

public class RegistroI310 {

	private final String registro = "I310";
	
	private String codigoContaAnalitica;
	
	private final String codigoCentroCusto = ""; //NAO UTILIZADO
	
	private String totalDebitosDoDia;
	
	private String totalCreditosDoDia;
	
	public RegistroI310(String codigoContaAnalitica, String totalDebitosDoDia,
			String totalCreditosDoDia) {
		this.codigoContaAnalitica = codigoContaAnalitica;
		this.totalDebitosDoDia = totalDebitosDoDia;
		this.totalCreditosDoDia = totalCreditosDoDia;
	}

	@Override
	public String toString() {
		return "|" + registro 
				+ "|" + codigoContaAnalitica 
				+ "|" + codigoCentroCusto 
				+ "|" + totalDebitosDoDia 
				+ "|" + totalCreditosDoDia 
				+ "|";
	}

	public String getCodigoContaAnalitica() {
		return codigoContaAnalitica;
	}

	public void setCodigoContaAnalitica(String codigoContaAnalitica) {
		this.codigoContaAnalitica = codigoContaAnalitica;
	}

	public String getTotalDebitosDoDia() {
		return totalDebitosDoDia;
	}

	public void setTotalDebitosDoDia(String totalDebitosDoDia) {
		this.totalDebitosDoDia = totalDebitosDoDia;
	}

	public String getTotalCreditosDoDia() {
		return totalCreditosDoDia;
	}

	public void setTotalCreditosDoDia(String totalCreditosDoDia) {
		this.totalCreditosDoDia = totalCreditosDoDia;
	}

	public String getRegistro() {
		return registro;
	}

	public String getCodigoCentroCusto() {
		return codigoCentroCusto;
	}
	
	
	
	
}
