package br.com.celg.ecd.ajudante.fac;

import br.com.celg.ecd.anotacao.Posicao;

public class PlanoContas {

	@Posicao(inicio=4, fim=23)
	private String contaContabil;
	
	@Posicao(inicio=25, fim=64)
	private String descricaoConta;
	
	@Posicao(inicio=65, fim=65)
	private String tipoConta; // A - Analítica | S - Sintética
	
	@Posicao(inicio=66, fim=66)
	private String nivelConta;
	
	@Posicao(inicio=73, fim=92)
	private String contaContabilRefSPED;
	
	@Posicao(inicio=93, fim=93)
	private String naturezaSPED;
	
	
	@Override
	public String toString() {
		return "PlanoContas [contaContabil=" + contaContabil
				+ ", descricaoConta=" + descricaoConta + ", tipoConta="
				+ tipoConta + ", nivelConta=" + nivelConta
				+ ", contaContabilRefSPED=" + contaContabilRefSPED
				+ ", naturezaSPED=" + naturezaSPED + "]";
	}

	public String getContaContabil() {
		return contaContabil;
	}

	public void setContaContabil(String contaContabil) {
		this.contaContabil = contaContabil;
	}

	public String getDescricaoConta() {
		return descricaoConta;
	}

	public void setDescricaoConta(String descricaoConta) {
		this.descricaoConta = descricaoConta;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getNivelConta() {
		if (nivelConta.equals("Z")) {
			return "8";
		}
		return nivelConta;
	}

	public void setNivelConta(String nivelConta) {
		this.nivelConta = nivelConta;
	}

	public String getContaContabilRefSPED() {
		return contaContabilRefSPED;
	}

	public void setContaContabilRefSPED(String contaContabilRefSPED) {
		this.contaContabilRefSPED = contaContabilRefSPED;
	}

	public String getNaturezaSPED() {
		return naturezaSPED;
	}

	public void setNaturezaSPED(String naturezaSPED) {
		this.naturezaSPED = naturezaSPED;
	}
	
	
}
