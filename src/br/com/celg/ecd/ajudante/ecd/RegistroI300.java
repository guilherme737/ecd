package br.com.celg.ecd.ajudante.ecd;

public class RegistroI300 {

	public final String registro = "I300";;
	
	public String dataBalancete;

	
	public RegistroI300(String dataBalancete) {
		this.dataBalancete = dataBalancete;
	}

	@Override
	public String toString() {
		return "|" + registro 
				+ "|" + dataBalancete 
				+ "|";
	}

	public String getDataBalancete() {
		return dataBalancete;
	}

	public void setDataBalancete(String dataBalancete) {
		this.dataBalancete = dataBalancete;
	}

	public String getRegistro() {
		return registro;
	}
	
	
	
}
