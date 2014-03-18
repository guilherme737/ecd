package br.com.celg.ecd.ajudante.ecd;

public class Registro9900 {

	private final String registro = "9900";

	private String tipoRegistro;

	private String totalRegistros;

	public Registro9900(String tipoRegistro, String totalRegistros) {
		this.tipoRegistro = tipoRegistro;
		this.totalRegistros = totalRegistros;
	}

	@Override
	public String toString() {
		return "|" + registro + "|" + tipoRegistro + "|" + totalRegistros + "|";
	}

	public String getRegistro() {
		return registro;
	}

	public String getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public String getTotalRegistros() {
		return totalRegistros;
	}

	public void setTotalRegistros(String totalRegistros) {
		this.totalRegistros = totalRegistros;
	}

}
