package br.com.celg.ecd.ajudante.fac;

import java.util.List;

public class Arquivo {

	private InicioArquivo inicioArquivo;
	
	private List<Lote> lstLotes;
	
	private FimArquivo fimArquivo;

	public InicioArquivo getInicioArquivo() {
		return inicioArquivo;
	}

	public void setInicioArquivo(InicioArquivo inicioArquivo) {
		this.inicioArquivo = inicioArquivo;
	}
	
	public List<Lote> getLstLotes() {
		return lstLotes;
	}

	public void setLstLotes(List<Lote> lstLotes) {
		this.lstLotes = lstLotes;
	}

	public FimArquivo getFimArquivo() {
		return fimArquivo;
	}

	public void setFimArquivo(FimArquivo fimArquivo) {
		this.fimArquivo = fimArquivo;
	}
	
	
	
}
