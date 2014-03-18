package br.com.celg.ecd.controlador;

import java.lang.reflect.Field;

import br.com.celg.ecd.anotacao.Posicao;

public class ProcessarArquivoSoluma {

	private static int CONTADOR = 1;
	
	protected Object processar(Class<?> tipoRegistro, String linhaInicioArquivo) {
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
	        			campo.set(registro, (linhaInicioArquivo.substring(posicao.inicio()-1, posicao.fim())).trim());
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
	
}
