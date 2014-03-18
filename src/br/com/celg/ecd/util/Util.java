package br.com.celg.ecd.util;

public class Util {

	public static String preencherTextoComZeros(String palavra, Integer tamanho) {
		int delta = tamanho - palavra.length();

		if (delta > 0) {
			for (int i = 0; i < delta; ++i)
				palavra = "0" + palavra;
		}
		return palavra;
	}

	public static String preencherTextoComZeros(Number numero, Integer tamanho) {
		String palavra = numero.toString();

		int delta = tamanho - palavra.length();

		if (delta > 0) {
			for (int i = 0; i < delta; ++i)
				palavra = "0" + palavra;
		}
		return palavra;
	}
	
	
	public static String obterNivelSuperiorPlanoConta(String contaContabil) {
		
		int NIVEL1 = 1;
		int NIVEL2 = 2;
		int NIVEL3 = 3;
		int NIVEL4 = 5;
		int NIVEL5 = 6;
		int NIVEL6 = 7;
		int NIVEL7 = 9;
		int NIVEL8 = 11;
		
		String nivelSuperior = "";
		int tamCC = contaContabil.length();
		
		if (tamCC <= NIVEL1) {
			return "";
		} else if (tamCC <= NIVEL2) {
			nivelSuperior = contaContabil.substring(0, NIVEL1);
		} else if (tamCC <= NIVEL3) {
			nivelSuperior = contaContabil.substring(0, NIVEL2);
		} else if (tamCC <= NIVEL4) {
			nivelSuperior = contaContabil.substring(0, NIVEL3);
		} else if (tamCC <= NIVEL5) {
			nivelSuperior = contaContabil.substring(0, NIVEL4);
		} else if (tamCC <= NIVEL6) {
			nivelSuperior = contaContabil.substring(0, NIVEL5);
		} else if (tamCC <= NIVEL7) {
			nivelSuperior = contaContabil.substring(0, NIVEL6);
		} else if (tamCC <= NIVEL8) {
			nivelSuperior = contaContabil.substring(0, NIVEL7);
		}  
		
		
		return nivelSuperior;
	}

}
