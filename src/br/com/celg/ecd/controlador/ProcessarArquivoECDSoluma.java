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

public class ProcessarArquivoECDSoluma extends ProcessarArquivoSoluma {
	
	private final String TIPO_REGISTRO_INICIO_LOTE = "1";
	private final String TIPO_REGISTRO_MOVIMENTO_CONTA_CONTABIL = "2";
	private final String TIPO_REGISTRO_MOVIMENTO_CENTRO_CUSTO = "3";
	private final String TIPO_REGISTRO_FIM_LOTE = "4";
	private final String TIPO_REGISTRO_FIM_ARQUIVO = "9";

	private static int CONTADOR = 1;

	public Arquivo processar() {
		File arqTexto = new File("C:\\Users\\guilherme\\Desktop\\SPED - CELG\\ECD-201309.txt");
		
		Arquivo arquivo = new Arquivo();
		
		InicioArquivo inicioArquivo;
		
		List<Lote> lstLotes = new ArrayList<Lote>();
		

		try {
			FileReader fileReader = new FileReader(arqTexto);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
	
	        String linha = "";
	        
	        //ARQUIVO INICIO
	        inicioArquivo = (InicioArquivo) processar(InicioArquivo.class, bufferedReader.readLine());
	        
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
	        
	        FimArquivo fimArquivo = new FimArquivo();
	        
	        if (ehTipoRegistroFimArquivo(linha)) {
	        	fimArquivo = (FimArquivo) processar(FimArquivo.class, linha);	        	
	        }
	        
	        arquivo.setInicioArquivo(inicioArquivo);
	        arquivo.setLstLotes(lstLotes);
	        arquivo.setFimArquivo(fimArquivo);
	        
	        	        
	        fileReader.close();
	        bufferedReader.close();
	        
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();		
		}
		
		return arquivo;
	}
	/*
	private Object processar(Class<?> tipoRegistro, String linhaInicioArquivo) {
		CONTADOR++;		
		if (CONTADOR%10000 == 0) 
			System.out.println(" LINHA -> " + CONTADOR);
		
		Object registro = null;
		
		try {
			registro = tipoRegistro.newInstance();

			Field[] campos =  registro.getClass().getDeclaredFields();
	        
	        for(Field campo: campos){
	        	Posicao posicao = campo.getAnnotation(Posicao.class);
	        	
	        	if (posicao != null) {	
	        		campo.setAccessible(true);
	        		
	        		if (campo.getType() == Integer.class) {
	        			campo.set(registro, (Integer.parseInt(linhaInicioArquivo.substring(posicao.inicio()-1, posicao.fim()))));
	        		} else {
	        			campo.set(registro, (linhaInicioArquivo.substring(posicao.inicio()-1, posicao.fim()).trim()));
	        		}	        		
	        	}
	        }
        
		} catch (NumberFormatException e) {
			e.printStackTrace();			
		} catch (IllegalArgumentException e) {			
			e.printStackTrace();
		} catch (IllegalAccessException e) {			
			e.printStackTrace();
		} catch (InstantiationException e) {			
			e.printStackTrace();
		}
		
		return registro;	
	}
	
	*/
	
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
