package br.com.celg.ecd.ajudante.ecd;

public class RegistroI355 {

	public final String registro = "I355";
	
	public String codigoContaAnaliticaResultado;
	
	public String codigoCentroCusto; //NAO UTILIZADO
	
	public String valorSaldoFinal;
	
	public String situacaoSaldoFinal; // D - Devedor | C - Credor
	

	public RegistroI355(String codigoContaAnaliticaResultado,
			String codigoCentroCusto, String valorSaldoFinal,
			String situacaoSaldoFinal) {
		this.codigoContaAnaliticaResultado = codigoContaAnaliticaResultado;
		this.codigoCentroCusto = codigoCentroCusto;
		this.valorSaldoFinal = valorSaldoFinal;
		this.situacaoSaldoFinal = situacaoSaldoFinal;
	}

	@Override
	public String toString() {
		return "|" + registro
				+ "|" + codigoContaAnaliticaResultado 
				+ "|" + codigoCentroCusto 
				+ "|" + valorSaldoFinal
				+ "|" + situacaoSaldoFinal 
				+ "|";
	}

	public String getCodigoContaAnaliticaResultado() {
		return codigoContaAnaliticaResultado;
	}

	public void setCodigoContaAnaliticaResultado(
			String codigoContaAnaliticaResultado) {
		this.codigoContaAnaliticaResultado = codigoContaAnaliticaResultado;
	}

	public String getCodigoCentroCusto() {
		return codigoCentroCusto;
	}

	public void setCodigoCentroCusto(String codigoCentroCusto) {
		this.codigoCentroCusto = codigoCentroCusto;
	}

	public String getValorSaldoFinal() {
		return valorSaldoFinal;
	}

	public void setValorSaldoFinal(String valorSaldoFinal) {
		this.valorSaldoFinal = valorSaldoFinal;
	}

	public String getSituacaoSaldoFinal() {
		return situacaoSaldoFinal;
	}

	public void setSituacaoSaldoFinal(String situacaoSaldoFinal) {
		this.situacaoSaldoFinal = situacaoSaldoFinal;
	}

	public String getRegistro() {
		return registro;
	}
	
	
}
