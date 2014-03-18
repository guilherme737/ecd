package br.com.celg.ecd.controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import br.com.celg.ecd.ajudante.fac.PlanoContas;

public class ProcessarArquivoECDPCONTASSoluma extends ProcessarArquivoSoluma {

	public Map<String, PlanoContas> processar() {
		File arqTexto = new File("C:\\Users\\guilherme\\Desktop\\SPED - CELG\\ECD-2012\\ECD-PCONTAS.txt");
		Map<String, PlanoContas> mapPlanoContas = new HashMap<String, PlanoContas>();

		try {
			FileReader fileReader = new FileReader(arqTexto);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
	
			
			
	        String linha = "";
	        
	        while ( ( linha = bufferedReader.readLine() ) != null ) {
	        	PlanoContas pc = (PlanoContas) super.processar(PlanoContas.class, linha);	        	
	        	mapPlanoContas.put(pc.getContaContabil(), pc);	        	
	        }
	        	        	        
	        fileReader.close();
	        bufferedReader.close();
	        
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();		
		}
		
		return mapPlanoContas;
		
	}	
	
}
