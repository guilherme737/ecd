package br.com.celg.ecd.ajudante.ecd;

public class RegistroI051 {

	public final String registro = "I051";
	
	public final String instituicaoResponsavelPCReferencial = "10"; //10 - Receita Federal 20 - Banco Central do Brasil 
	
	public final String codigoCentroCusto = "";
	
	public String codigoContaPlanoContaReferencial;
	
	public RegistroI051(String codigoContaPlanoContaReferencial) {
		this.codigoContaPlanoContaReferencial = codigoContaPlanoContaReferencial;
	}

	@Override
	public String toString() {
		return "|" + registro
				+ "|" + instituicaoResponsavelPCReferencial 
				+ "|" + codigoCentroCusto 
				+ "|" + codigoContaPlanoContaReferencial + "|";
	}

	public String getCodigoCentroCusto() {
		return codigoCentroCusto;
	}

	public String getCodigoContaPlanoContaReferencial() {
		return codigoContaPlanoContaReferencial;
	}

	public void setCodigoContaPlanoContaReferencial(
			String codigoContaPlanoContaReferencial) {
		this.codigoContaPlanoContaReferencial = codigoContaPlanoContaReferencial;
	}

	public String getRegistro() {
		return registro;
	}

	public String getInstituicaoResponsavelPCReferencial() {
		return instituicaoResponsavelPCReferencial;
	}
	
	
	

}
