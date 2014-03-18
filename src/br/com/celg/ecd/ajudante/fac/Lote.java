package br.com.celg.ecd.ajudante.fac;

import java.util.List;

public class Lote {

	private InicioLote inicioLote;
	
	private FimLote fimLote;
	
	private List<MovimentoContaContabil> lstMovimentoContaContabil;
	
	private List<MovimentoCentroCusto> lstMovimentoceCentroCusto;

	public InicioLote getInicioLote() {
		return inicioLote;
	}

	public void setInicioLote(InicioLote inicioLote) {
		this.inicioLote = inicioLote;
	}

	public FimLote getFimLote() {
		return fimLote;
	}

	public void setFimLote(FimLote fimLote) {
		this.fimLote = fimLote;
	}

	public List<MovimentoContaContabil> getLstMovimentoContaContabil() {
		return lstMovimentoContaContabil;
	}

	public void setLstMovimentoContaContabil(
			List<MovimentoContaContabil> lstMovimentoContaContabil) {
		this.lstMovimentoContaContabil = lstMovimentoContaContabil;
	}

	public List<MovimentoCentroCusto> getLstMovimentoceCentroCusto() {
		return lstMovimentoceCentroCusto;
	}

	public void setLstMovimentoceCentroCusto(
			List<MovimentoCentroCusto> lstMovimentoceCentroCusto) {
		this.lstMovimentoceCentroCusto = lstMovimentoceCentroCusto;
	}
	
	

}
