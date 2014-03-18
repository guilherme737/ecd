package br.com.celg.ecd.controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.celg.ecd.ajudante.fac.Arquivo;
import br.com.celg.ecd.ajudante.fac.FimArquivo;
import br.com.celg.ecd.ajudante.fac.FimLote;
import br.com.celg.ecd.ajudante.fac.InicioArquivo;
import br.com.celg.ecd.ajudante.fac.InicioLote;
import br.com.celg.ecd.ajudante.fac.Lote;
import br.com.celg.ecd.ajudante.fac.MovimentoCentroCusto;
import br.com.celg.ecd.ajudante.fac.MovimentoContaContabil;
import br.com.celg.ecd.util.Util;

public class ProcessarArquivoECDSolumaCompleto extends ProcessarArquivoSoluma {
	
	private final String TIPO_REGISTRO_INICIO_LOTE = "1";
	private final String TIPO_REGISTRO_MOVIMENTO_CONTA_CONTABIL = "2";
	private final String TIPO_REGISTRO_MOVIMENTO_CENTRO_CUSTO = "3";
	private final String TIPO_REGISTRO_FIM_LOTE = "4";
	private final String TIPO_REGISTRO_FIM_ARQUIVO = "9";
	
	private final String CAMINHO_ARQUIVO = "C:\\Users\\guilherme\\Desktop\\SPED - CELG\\";
	
	private final String PREFIXO_ANO = "ECD-2012";

	private static int CONTADOR = 1;

	public Arquivo processar() {
		
		Arquivo arquivo = new Arquivo();
		
		arquivo.setLstLotes(new ArrayList<Lote>());
		
		InicioArquivo inicioArquivo = new InicioArquivo();
		
		List<Lote> lstLotes = new ArrayList<Lote>();
		
		String diretorioArquivos = CAMINHO_ARQUIVO + PREFIXO_ANO + File.separator;

		try {
			
			for (int i = 0; i < 12; i++) {
				int mes = (i + 1);
				
				//LEITURA DO ARQUIVO FISICO
				File arqTexto = new File(diretorioArquivos + PREFIXO_ANO + Util.preencherTextoComZeros(mes, 2) + ".txt");
			
				FileReader fileReader = new FileReader(arqTexto);
				
				BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		        
				String linha = "";
		        
		        //ARQUIVO INICIO
				if (i == 0) { //PRIMEIRO ARQUIVO
					inicioArquivo = (InicioArquivo) processar(InicioArquivo.class, bufferedReader.readLine());
					arquivo.setInicioArquivo(inicioArquivo);
				} else {
					bufferedReader.readLine();
				}
		        
		        //INICIO LOTE
		        while ( ( linha = bufferedReader.readLine() ) != null && this.ehTipoRegistroInicioLote(linha) ) {
		        	
		    		Lote lote = new Lote();
		    		
		    		lote.setLstMovimentoContaContabil( new ArrayList<MovimentoContaContabil>() );
		    		lote.setLstMovimentoceCentroCusto( new ArrayList<MovimentoCentroCusto>() );
		        	
		        	lote.setInicioLote( (InicioLote) processar( InicioLote.class, linha ) );
	
		        	//MOVIMENTO CONTA CONTABIL
		        	while ( ( linha = bufferedReader.readLine() ) != null && this.ehTipoRegistroMovimentoContaContabil(linha) ) {	            
		        		lote.getLstMovimentoContaContabil().add( (MovimentoContaContabil) processar( MovimentoContaContabil.class, linha ) );	            
		        	}
		        	
		        	/******** MOVIMENTO CENTRO DE CUSTO *******	*/	        	
		        	if (ehTipoRegistroMovimentoCentroCusto(linha)) {	 
		        		lote.getLstMovimentoceCentroCusto().add( (MovimentoCentroCusto) processar( MovimentoCentroCusto.class, linha ) );
	
		        		while ( ( linha = bufferedReader.readLine() ) != null && this.ehTipoRegistroMovimentoCentroCusto(linha)) {
		        			lote.getLstMovimentoceCentroCusto().add( (MovimentoCentroCusto) processar( MovimentoCentroCusto.class, linha ) );	        		
		        		}
		        	}
			        		        	
		        	/********* FIM LOTE *********/
		        	if (ehTipoRegistroFimLote(linha)) {
		        		lote.setFimLote( (FimLote) processar(FimLote.class, linha));
		        	} else {
		        		lote.setFimLote( (FimLote) processar(FimLote.class, bufferedReader.readLine()));	        		
		        	}
		        	
		        	lstLotes.add(lote);
		        	
		        	
		        	CONTADOR++;		
		    		if (CONTADOR%10000 == 0) 
		    			System.out.println(" LINHA -> " + CONTADOR);
		        }

		        arquivo.getLstLotes().addAll(lstLotes);
		        
		        if (i == 0) { //PRIMEIRO ARQUIVO FISICO
		        	
		        	FimArquivo fimArquivo = new FimArquivo();
		        	
		        	if (ehTipoRegistroFimArquivo(linha)) {
		        		fimArquivo = (FimArquivo) processar(FimArquivo.class, linha);	        	
		        	}

		        	arquivo.setFimArquivo(fimArquivo);
		        }
		        
		        fileReader.close();
		        bufferedReader.close();
			}
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();		
		}
		
		return arquivo;
	}
	
	
	public boolean ehTipoRegistroInicioLote(String linha) {		
		return linha.substring(0, 1).equals(this.TIPO_REGISTRO_INICIO_LOTE);
	}
	
	public boolean ehTipoRegistroMovimentoContaContabil(String linha) {		
		return linha.substring(0, 1).equals(this.TIPO_REGISTRO_MOVIMENTO_CONTA_CONTABIL);
	}
	
	public boolean ehTipoRegistroMovimentoCentroCusto(String linha) {		
		return linha.substring(0, 1).equals(this.TIPO_REGISTRO_MOVIMENTO_CENTRO_CUSTO);
	}
	
	public boolean ehTipoRegistroFimLote(String linha) {		
		return linha.substring(0, 1).equals(this.TIPO_REGISTRO_FIM_LOTE);
	}

	public boolean ehTipoRegistroFimArquivo(String linha) {		
		return linha.substring(0, 1).equals(this.TIPO_REGISTRO_FIM_ARQUIVO);
	}
	
}
