package br.com.celg.ecd.ajudante.ecd;

public class RegistroI010 {
	
	public static final String FORMA_ESCRITURACAO_G = "G";
	public static final String FORMA_ESCRITURACAO_R = "R";
	public static final String FORMA_ESCRITURACAO_A = "A";
	public static final String FORMA_ESCRITURACAO_B = "B";
	public static final String FORMA_ESCRITURACAO_Z = "Z";
	
	private final String registro = "I010";

	private String formaEscrituracaoContabil; // G - R - A - B - Z

	private String versaoLayout;

	
	public RegistroI010(String formaEscrituracaoContabil, String versaoLayout) {
		this.formaEscrituracaoContabil = formaEscrituracaoContabil;
		this.versaoLayout = versaoLayout;
	}
	
	@Override
	public String toString() {
		return "|" + registro + "|" + formaEscrituracaoContabil + "|" + versaoLayout + "|";
	}

	public String getRegistro() {
		return registro;
	}

	public String getFormaEscrituracaoContabil() {
		return formaEscrituracaoContabil;
	}

	public void setFormaEscrituracaoContabil(String formaEscrituracaoContabil) {
		this.formaEscrituracaoContabil = formaEscrituracaoContabil;
	}

	public String getVersaoLayout() {
		return versaoLayout;
	}

	public void setVersaoLayout(String versaoLayout) {
		this.versaoLayout = versaoLayout;
	}

}
