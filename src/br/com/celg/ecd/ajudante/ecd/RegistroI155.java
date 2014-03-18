package br.com.celg.ecd.ajudante.ecd;

public class RegistroI155 {

	private final String registro = "I155";
	
	private String codigoContaAnalitica;
	
	private String codigoCentroCusto;
	
	private String valorSaldoInicialPeriodo;
	
	private String saldoInicial; // D - Devedor | C - Credor
	
	private String valorTotalDebitosPeriodo;
	
	private String valorTotalCreditosPeriodo;

	private String valorSaldoFinalPeriodo;
	
	private String saldoFinal; // D - Devedor | C - Credor
	

	public RegistroI155(String codigoContaAnalitica, String codigoCentroCusto,
			String valorSaldoInicialPeriodo, String saldoInicial,
			String valorTotalDebitosPeriodo, String valorTotalCreditosPeriodo,
			String valorSaldoFinalPeriodo, String saldoFinal) {
		
		this.codigoContaAnalitica = codigoContaAnalitica;
		this.codigoCentroCusto = codigoCentroCusto;
		this.valorSaldoInicialPeriodo = valorSaldoInicialPeriodo;
		this.saldoInicial = saldoInicial;
		this.valorTotalDebitosPeriodo = valorTotalDebitosPeriodo;
		this.valorTotalCreditosPeriodo = valorTotalCreditosPeriodo;
		this.valorSaldoFinalPeriodo = valorSaldoFinalPeriodo;
		this.saldoFinal = saldoFinal;
	}

	@Override
	public String toString() {
		return "|" + registro 
				+ "|" + codigoContaAnalitica 
				+ "|" + codigoCentroCusto 
				+ "|" + valorSaldoInicialPeriodo 
				+ "|" + saldoInicial
				+ "|" + valorTotalDebitosPeriodo
				+ "|" + valorTotalCreditosPeriodo
				+ "|" + valorSaldoFinalPeriodo
				+ "|" + saldoFinal 
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

	public void setCodigoCentroCusto(String codigoCentroCusto) {
		this.codigoCentroCusto = codigoCentroCusto;
	}

	public String getValorSaldoInicialPeriodo() {
		return valorSaldoInicialPeriodo;
	}

	public void setValorSaldoInicialPeriodo(String valorSaldoInicialPeriodo) {
		this.valorSaldoInicialPeriodo = valorSaldoInicialPeriodo;
	}

	public String getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(String saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public String getValorTotalDebitosPeriodo() {
		return valorTotalDebitosPeriodo;
	}

	public void setValorTotalDebitosPeriodo(String valorTotalDebitosPeriodo) {
		this.valorTotalDebitosPeriodo = valorTotalDebitosPeriodo;
	}

	public String getValorTotalCreditosPeriodo() {
		return valorTotalCreditosPeriodo;
	}

	public void setValorTotalCreditosPeriodo(String valorTotalCreditosPeriodo) {
		this.valorTotalCreditosPeriodo = valorTotalCreditosPeriodo;
	}

	public String getValorSaldoFinalPeriodo() {
		return valorSaldoFinalPeriodo;
	}

	public void setValorSaldoFinalPeriodo(String valorSaldoFinalPeriodo) {
		this.valorSaldoFinalPeriodo = valorSaldoFinalPeriodo;
	}

	public String getSaldoFinal() {
		return saldoFinal;
	}

	public void setSaldoFinal(String saldoFinal) {
		this.saldoFinal = saldoFinal;
	}

	public String getRegistro() {
		return registro;
	}
	
	
}