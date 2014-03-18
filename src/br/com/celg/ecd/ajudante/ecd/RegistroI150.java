package br.com.celg.ecd.ajudante.ecd;

public class RegistroI150 {

	private final String registro = "I150";
	
	private String dataInicioPeriodo;
	
	private String dataFimPeriodo;
	
	
	public RegistroI150(String dataInicioPeriodo, String dataFimPeriodo) {	
		this.dataInicioPeriodo = dataInicioPeriodo;
		this.dataFimPeriodo = dataFimPeriodo;
	}

	@Override
	public String toString() {
		return "|" + registro 
				+ "|" + dataInicioPeriodo 
				+ "|" + dataFimPeriodo
				+ "|";
	}

	public String getDataInicioPeriodo() {
		return dataInicioPeriodo;
	}

	public void setDataInicioPeriodo(String dataInicioPeriodo) {
		this.dataInicioPeriodo = dataInicioPeriodo;
	}

	public String getDataFimPeriodo() {
		return dataFimPeriodo;
	}

	public void setDataFimPeriodo(String dataFimPeriodo) {
		this.dataFimPeriodo = dataFimPeriodo;
	}

	public String getRegistro() {
		return registro;
	}
	
	

}
