package br.com.celg.ecd.ajudante.ecd;

public class RegistroJ930 {

	private final String registro = "J930";
	
	private String nomeSignatario;
	
	private String cpfSignatario;
	
	private String qualificacaoSignatario;
	
	private String codigoQualificacaoSignatario;
	
	private String numeroCRC;

	public RegistroJ930(String nomeSignatario, String cpfSignatario,
			String qualificacaoSignatario, String codigoQualificacaoSignatario,
			String numeroCRC) {
		this.nomeSignatario = nomeSignatario;
		this.cpfSignatario = cpfSignatario;
		this.qualificacaoSignatario = qualificacaoSignatario;
		this.codigoQualificacaoSignatario = codigoQualificacaoSignatario;
		this.numeroCRC = numeroCRC;
	}

	@Override
	public String toString() {
		return "|" + registro 
				+ "|" + nomeSignatario 
				+ "|" + cpfSignatario
				+ "|" + qualificacaoSignatario
				+ "|" + codigoQualificacaoSignatario 
				+ "|" + numeroCRC
				+ "|";
	}

	public String getNomeSignatario() {
		return nomeSignatario;
	}

	public void setNomeSignatario(String nomeSignatario) {
		this.nomeSignatario = nomeSignatario;
	}

	public String getCpfSignatario() {
		return cpfSignatario;
	}

	public void setCpfSignatario(String cpfSignatario) {
		this.cpfSignatario = cpfSignatario;
	}

	public String getQualificacaoSignatario() {
		return qualificacaoSignatario;
	}

	public void setQualificacaoSignatario(String qualificacaoSignatario) {
		this.qualificacaoSignatario = qualificacaoSignatario;
	}

	public String getCodigoQualificacaoSignatario() {
		return codigoQualificacaoSignatario;
	}

	public void setCodigoQualificacaoSignatario(String codigoQualificacaoSignatario) {
		this.codigoQualificacaoSignatario = codigoQualificacaoSignatario;
	}

	public String getNumeroCRC() {
		return numeroCRC;
	}

	public void setNumeroCRC(String numeroCRC) {
		this.numeroCRC = numeroCRC;
	}

	public String getRegistro() {
		return registro;
	}
	
	
}
