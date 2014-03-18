package br.com.celg.ecd.ajudante.ecd;

public class RegistroI075 {

	private final String registro = "I075";
	
	private String codigoHistorico;
	
	private String descricaoHistorico;
	
	public RegistroI075(String codigoHistorico, String descricaoHistorico) {	
		this.codigoHistorico = codigoHistorico;
		this.descricaoHistorico = descricaoHistorico;
	}

	@Override
	public String toString() {
		return "|" + registro 
				+ "|" + codigoHistorico 
				+ "|" + descricaoHistorico 
				+ "|";
	}

	public String getCodigoHistorico() {
		return codigoHistorico;
	}

	public void setCodigoHistorico(String codigoHistorico) {
		this.codigoHistorico = codigoHistorico;
	}

	public String getDescricaoHistorico() {
		return descricaoHistorico;
	}

	public void setDescricaoHistorico(String descricaoHistorico) {
		this.descricaoHistorico = descricaoHistorico;
	}

	public String getRegistro() {
		return registro;
	}
	
	
	
}
