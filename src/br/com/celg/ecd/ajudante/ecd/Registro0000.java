package br.com.celg.ecd.ajudante.ecd;

import java.util.GregorianCalendar;

import br.com.celg.ecd.ajudante.fac.Arquivo;
import br.com.celg.ecd.util.Util;

public class Registro0000 {

	private final String registro = "0000";
	
	private final String lecd = "LECD";
	
	private String dataInicial;
	
	private String dataFinal;
	
	private final String nomeEmpresaJuridica = "CELG GERACAO E TRANSMISSAO S.A.";
	
	private final String cnpj = "07779299000173";
	
	private final String ufEmpresa = "GO";
	
	private final String InscricaoEstadual = "103992804";
	
	private final String codigoMunicipio = "5208707";
	
	private final String inscricaoMunicipal = "2243131";
	
	private String indicadorSituacaoEspecial;
	
	
	public Registro0000(Arquivo arquivoFac) {
		
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(GregorianCalendar.MONTH, Integer.parseInt(arquivoFac.getInicioArquivo().getMes()) -1);
		gc.set(GregorianCalendar.YEAR, Integer.parseInt(arquivoFac.getInicioArquivo().getAno()));
		
		this.setDataInicial("0101" 
				//+ Util.preencherTextoComZeros(arquivoFac.getInicioArquivo().getMes(), 2) 
				+ Util.preencherTextoComZeros(arquivoFac.getInicioArquivo().getAno(), 2) );
		this.setDataFinal("3112"//gc.getActualMaximum(GregorianCalendar.DAY_OF_MONTH)
				//+ Util.preencherTextoComZeros(arquivoFac.getInicioArquivo().getMes(), 2) 
				+ Util.preencherTextoComZeros(arquivoFac.getInicioArquivo().getAno(), 2) );		
		this.setIndicadorSituacaoEspecial("");
	}

	@Override
	public String toString() {
		return    "|" + registro + "|" + lecd + "|" + dataInicial + "|" + dataFinal
				+ "|" + nomeEmpresaJuridica + "|" + cnpj + "|" + ufEmpresa + "|" + InscricaoEstadual 
				+ "|" + codigoMunicipio + "|" + inscricaoMunicipal + "|" + indicadorSituacaoEspecial
				+ "|";
	}

	public String getRegistro() {
		return registro;
	}

	public String getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(String dataInicial) {
		this.dataInicial = dataInicial;
	}

	public String getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getNomeEmpresaJuridica() {
		return nomeEmpresaJuridica;
	}

	public String getCnpj() {
		return cnpj;
	}
	
	public String getUfEmpresa() {
		return ufEmpresa;
	}

	public String getInscricaoEstadual() {
		return InscricaoEstadual;
	}

	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public String getIndicadorSituacaoEspecial() {
		return indicadorSituacaoEspecial;
	}

	public void setIndicadorSituacaoEspecial(String indicadorSituacaoEspecial) {
		this.indicadorSituacaoEspecial = indicadorSituacaoEspecial;
	}

	public String getLecd() {
		return lecd;
	}

	
	
}
