import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.celg.ecd.ajudante.ecd.Registro0000;
import br.com.celg.ecd.ajudante.ecd.Registro0001;
import br.com.celg.ecd.ajudante.ecd.Registro0007;
import br.com.celg.ecd.ajudante.ecd.Registro0990;
import br.com.celg.ecd.ajudante.ecd.Registro9001;
import br.com.celg.ecd.ajudante.ecd.Registro9900;
import br.com.celg.ecd.ajudante.ecd.Registro9990;
import br.com.celg.ecd.ajudante.ecd.Registro9999;
import br.com.celg.ecd.ajudante.ecd.RegistroI001;
import br.com.celg.ecd.ajudante.ecd.RegistroI010;
import br.com.celg.ecd.ajudante.ecd.RegistroI030;
import br.com.celg.ecd.ajudante.ecd.RegistroI050;
import br.com.celg.ecd.ajudante.ecd.RegistroI051;
import br.com.celg.ecd.ajudante.ecd.RegistroI200;
import br.com.celg.ecd.ajudante.ecd.RegistroI250;
import br.com.celg.ecd.ajudante.ecd.RegistroI990;
import br.com.celg.ecd.ajudante.ecd.RegistroJ001;
import br.com.celg.ecd.ajudante.ecd.RegistroJ900;
import br.com.celg.ecd.ajudante.ecd.RegistroJ930;
import br.com.celg.ecd.ajudante.ecd.RegistroJ990;
import br.com.celg.ecd.ajudante.fac.Arquivo;
import br.com.celg.ecd.ajudante.fac.Lote;
import br.com.celg.ecd.ajudante.fac.MovimentoContaContabil;
import br.com.celg.ecd.ajudante.fac.PlanoContas;
import br.com.celg.ecd.controlador.ProcessarArquivoECDPCONTASSoluma;
import br.com.celg.ecd.controlador.ProcessarArquivoECDSolumaCompleto;
import br.com.celg.ecd.util.Util;


public class Principal {

	private static int TOTAL_LINHAS_ARQUIVO = 0;
	
	private static int TOTAL_LINHAS_REG_0000 = 1;
	private static int TOTAL_LINHAS_REG_0001 = 1;
	private static int TOTAL_LINHAS_REG_0007 = 1;
	private static int TOTAL_LINHAS_REG_0990 = 1;
	
	private static int TOTAL_LINHAS_REG_I001 = 1;
	private static int TOTAL_LINHAS_REG_I010 = 1;
	private static int TOTAL_LINHAS_REG_I030 = 1;
	private static int TOTAL_LINHAS_REG_I050 = 0;
	private static int TOTAL_LINHAS_REG_I051 = 0;
	private static int TOTAL_LINHAS_REG_I200 = 0;
	private static int TOTAL_LINHAS_REG_I250 = 0;
	private static int TOTAL_LINHAS_REG_I990 = 1;
	
	private static int TOTAL_LINHAS_REG_J001 = 1;
	private static int TOTAL_LINHAS_REG_J900 = 1;
	private static int TOTAL_LINHAS_REG_J930 = 2;
	private static int TOTAL_LINHAS_REG_J990 = 1;
	
	private static int TOTAL_LINHAS_REG_9001 = 1;
	private static int TOTAL_LINHAS_REG_9900 = 20; 
	private static int TOTAL_LINHAS_REG_9990 = 1;
	private static int TOTAL_LINHAS_REG_9999 = 1;
	
	private final String I030_NUMERO_LIVRO = "99";
	private final String I030_QUANTIDADE_LINHAS_ARQUIVO = "TOTAL_LINHAS";
	
	private static StringBuffer txt = new StringBuffer("");
	
	private static StringBuilder txtReg0 = new StringBuilder("");
	private static StringBuilder txtRegI = new StringBuilder("");
	private static StringBuilder txtRegJ = new StringBuilder("");
	private static StringBuilder txtReg9 = new StringBuilder("");
	
	public void montarRegistro0000(Arquivo arquivoFac) {
		
		Registro0000 reg0000 = new Registro0000(arquivoFac);
		Registro0001 reg0001 = new Registro0001();
		Registro0007 reg0007 = new Registro0007();
		Registro0990 reg0990 = new Registro0990();

		txtReg0.append(reg0000.toString() + "\n");
		txtReg0.append(reg0001.toString() + "\n");
		txtReg0.append(reg0007.toString() + "\n");
		txtReg0.append(reg0990.toString() + "\n");
		
		
	}
	
	public void montarRegistroI(Arquivo arquivoFac, Map<String , PlanoContas> mapPlanoContas) {
		
		RegistroI001 regI001 = new RegistroI001();
		txtRegI.append(regI001.toString() + "\n");
		
		RegistroI010 regI010 = new RegistroI010(RegistroI010.FORMA_ESCRITURACAO_A, "1.00");
		txtRegI.append(regI010.toString() + "\n");
		
		RegistroI030 regI030 = new RegistroI030(this.I030_NUMERO_LIVRO, "Diário Geral", this.I030_QUANTIDADE_LINHAS_ARQUIVO);
		txtRegI.append(regI030.toString() + "\n");
		
		for (Map.Entry<String, PlanoContas> entry : mapPlanoContas.entrySet()) {
			PlanoContas pc = entry.getValue();

			//Data de Inclusão/Alteração				
			String dataInclusao = "01" + Util.preencherTextoComZeros(arquivoFac.getInicioArquivo().getMes(), 2) + arquivoFac.getInicioArquivo().getAno();
			
			RegistroI050 regI050 = new RegistroI050(
					dataInclusao, 
					Util.preencherTextoComZeros(pc.getNaturezaSPED(), 2), 
					pc.getTipoConta(), 
					pc.getNivelConta(), 
					pc.getContaContabil(), 
					Util.obterNivelSuperiorPlanoConta(pc.getContaContabil()), 
					pc.getDescricaoConta());
			
			txtRegI.append(regI050.toString() + "\n");
			TOTAL_LINHAS_REG_I050++;
			
			if (pc.getTipoConta().equals("A") 
					&& !pc.getNaturezaSPED().equals("4") 
					&& !pc.getNaturezaSPED().equals("5")) {
				RegistroI051 regI051 = new RegistroI051(pc.getContaContabilRefSPED());
				
				txtRegI.append(regI051.toString() + "\n");
				TOTAL_LINHAS_REG_I051++;
			}
		}
		
		for (Lote lote : arquivoFac.getLstLotes()) {

			String dataLancamento = lote.getInicioLote().getDiaMovimento() +
					arquivoFac.getInicioArquivo().getMes() + 
					arquivoFac.getInicioArquivo().getAno();
			
			String tipoLancamento = lote.getFimLote().getTipoMovimento().equals("3") ? "E" : "N";
			
			RegistroI200 regI200 = new RegistroI200(Util.preencherTextoComZeros((TOTAL_LINHAS_REG_I200 + 1), 6), 
					dataLancamento, lote.getFimLote().getValorTotal(), tipoLancamento);
			
			txtRegI.append(regI200.toString() + "\n");
			TOTAL_LINHAS_REG_I200++;
			
			for (MovimentoContaContabil movContabil : lote.getLstMovimentoContaContabil()) {
				RegistroI250 regI250 = new RegistroI250(movContabil.getContaContabil(), 
						movContabil.getValor(), 
						movContabil.getNatureza(), 
						"", 
						"", //movContabil.getCodigoHistorico(),						
						movContabil.getDescritivoHistorico());
				
				txtRegI.append(regI250.toString() + "\n");
				TOTAL_LINHAS_REG_I250++;
			}
		}
		
		RegistroI990 regI990 = new RegistroI990(
				TOTAL_LINHAS_REG_I001 +
				TOTAL_LINHAS_REG_I010 + 
				TOTAL_LINHAS_REG_I030 + 
				TOTAL_LINHAS_REG_I050 + 
				TOTAL_LINHAS_REG_I051 + 
				TOTAL_LINHAS_REG_I200 + 
				TOTAL_LINHAS_REG_I250 + 
				TOTAL_LINHAS_REG_I990);
		txtRegI.append(regI990.toString() + "\n");
		
	}
	
	public void montarRegistroJ(Arquivo arquivoFac) {
		
		TOTAL_LINHAS_ARQUIVO = TOTAL_LINHAS_REG_0000 +
				TOTAL_LINHAS_REG_0001 +
				TOTAL_LINHAS_REG_0007 +
				TOTAL_LINHAS_REG_0990 +
				TOTAL_LINHAS_REG_I001 +
				TOTAL_LINHAS_REG_I010 + 
				TOTAL_LINHAS_REG_I030 + 
				TOTAL_LINHAS_REG_I050 + 
				TOTAL_LINHAS_REG_I051 + 
				TOTAL_LINHAS_REG_I200 + 
				TOTAL_LINHAS_REG_I250 + 
				TOTAL_LINHAS_REG_I990 +
				TOTAL_LINHAS_REG_J001 +
				TOTAL_LINHAS_REG_J900 +
				TOTAL_LINHAS_REG_J930 + 
				TOTAL_LINHAS_REG_J990 +
				TOTAL_LINHAS_REG_9001 + 
				TOTAL_LINHAS_REG_9900 + 
				TOTAL_LINHAS_REG_9990 + 
				TOTAL_LINHAS_REG_9999;
		
		
		RegistroJ001 regJ001 = new RegistroJ001();
		
		RegistroJ900 regJ900 = new RegistroJ900(I030_NUMERO_LIVRO, 
				"Livro Auxiliar ao Diario com Escrituracao Resumida", 
				Integer.toString(TOTAL_LINHAS_ARQUIVO), 
				"0101"+arquivoFac.getInicioArquivo().getAno(),
				"3112"+arquivoFac.getInicioArquivo().getAno());
		
		RegistroJ930 regJ930Presidente = new RegistroJ930("JOSE FERNANDO NAVARRETE PENA", "30311870163", "Administrador", "205", "");
		RegistroJ930 regJ930Contador = new RegistroJ930("CLEITON SILVA FERREIRA", "96494492134", "Contabilista", "900", "018721/O-6");
		
		RegistroJ990 regJ990 = new RegistroJ990(
				TOTAL_LINHAS_REG_J001 +
				TOTAL_LINHAS_REG_J900 +
				TOTAL_LINHAS_REG_J930 + 
				TOTAL_LINHAS_REG_J990);

		
		txtRegJ.append(regJ001.toString() + "\n");
		txtRegJ.append(regJ900.toString() + "\n");
		txtRegJ.append(regJ930Presidente.toString() + "\n");
		txtRegJ.append(regJ930Contador.toString() + "\n");
		txtRegJ.append(regJ990.toString() + "\n");
		
		
		int indice = txtRegI.indexOf(I030_QUANTIDADE_LINHAS_ARQUIVO);
		txtRegI.delete(indice, txtRegI.indexOf(I030_QUANTIDADE_LINHAS_ARQUIVO) + I030_QUANTIDADE_LINHAS_ARQUIVO.length());
		txtRegI.insert(indice, TOTAL_LINHAS_ARQUIVO);
		
	}
	
	public void montarRegistro9() {
		
		txtReg9.append(new Registro9001().toString() + "\n");
		
		List<Registro9900> lst9900 = new ArrayList<Registro9900>();
		
		lst9900.add(new Registro9900("0000", Integer.toString(TOTAL_LINHAS_REG_0000)));
		lst9900.add(new Registro9900("0001", Integer.toString(TOTAL_LINHAS_REG_0001)));
		lst9900.add(new Registro9900("0007", Integer.toString(TOTAL_LINHAS_REG_0007)));
		lst9900.add(new Registro9900("0990", Integer.toString(TOTAL_LINHAS_REG_0990)));
		lst9900.add(new Registro9900("I001", Integer.toString(TOTAL_LINHAS_REG_I001)));
		lst9900.add(new Registro9900("I010", Integer.toString(TOTAL_LINHAS_REG_I010)));
		lst9900.add(new Registro9900("I030", Integer.toString(TOTAL_LINHAS_REG_I030)));
		lst9900.add(new Registro9900("I050", Integer.toString(TOTAL_LINHAS_REG_I050)));
		lst9900.add(new Registro9900("I051", Integer.toString(TOTAL_LINHAS_REG_I051)));
		lst9900.add(new Registro9900("I200", Integer.toString(TOTAL_LINHAS_REG_I200)));
		lst9900.add(new Registro9900("I250", Integer.toString(TOTAL_LINHAS_REG_I250)));
		lst9900.add(new Registro9900("I990", Integer.toString(TOTAL_LINHAS_REG_I990)));
		lst9900.add(new Registro9900("J001", Integer.toString(TOTAL_LINHAS_REG_J001)));
		lst9900.add(new Registro9900("J900", Integer.toString(TOTAL_LINHAS_REG_J900)));
		lst9900.add(new Registro9900("J930", Integer.toString(TOTAL_LINHAS_REG_J930)));
		lst9900.add(new Registro9900("J990", Integer.toString(TOTAL_LINHAS_REG_J990)));
		lst9900.add(new Registro9900("9001", Integer.toString(TOTAL_LINHAS_REG_9001)));
		lst9900.add(new Registro9900("9900", Integer.toString(TOTAL_LINHAS_REG_9900)));
		lst9900.add(new Registro9900("9990", Integer.toString(TOTAL_LINHAS_REG_9990)));
		lst9900.add(new Registro9900("9999", Integer.toString(TOTAL_LINHAS_REG_9999)));
		
		Registro9990 reg9990 = new Registro9990(
				TOTAL_LINHAS_REG_9001 + 
				TOTAL_LINHAS_REG_9900 + 
				TOTAL_LINHAS_REG_9990 + 
				TOTAL_LINHAS_REG_9999);
		
		
		for (Registro9900 reg9900 : lst9900) {
			txtReg9.append(reg9900.toString() + "\n");
		}
		txtReg9.append(reg9990.toString() + "\n");
		txtReg9.append(new Registro9999(TOTAL_LINHAS_ARQUIVO).toString() + "\n");
		
	}

	public static void main(String[] args) {
		
//		ProcessarArquivoECDSoluma paECD = new ProcessarArquivoECDSoluma();
		ProcessarArquivoECDSolumaCompleto paECD = new ProcessarArquivoECDSolumaCompleto();
		Arquivo arquivoFac = paECD.processar();
		
		ProcessarArquivoECDPCONTASSoluma paPC = new ProcessarArquivoECDPCONTASSoluma();
		Map<String , PlanoContas> mapPC = paPC.processar(); 
		
		
		
		Principal principal = new Principal();
		
		principal.montarRegistro0000(arquivoFac);
		principal.montarRegistroI(arquivoFac, mapPC);
		principal.montarRegistroJ(arquivoFac);
		principal.montarRegistro9();
		
		
		/*
		File arquivo;  
		
        arquivo = new File("C:\\Users\\guilherme\\Desktop\\SPED - CELG\\arquivo.txt");
        FileOutputStream fos;

        try {
			fos = new FileOutputStream(arquivo);			  
//			fos.write(txt.toString().getBytes());
			fos.write(txtReg0.toString().getBytes());
			fos.write(txtRegI.toString().getBytes());
			fos.write(txtRegJ.toString().getBytes());
			fos.write(txtReg9.toString().getBytes());
			fos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}  
        */
		
        final Charset ENCODING = StandardCharsets.UTF_8;
        Path path = Paths.get("C:\\Users\\guilherme\\Desktop\\SPED - CELG\\arquivo2.txt"); 
        try (BufferedWriter fos = Files.newBufferedWriter(path, ENCODING)){        	
        	fos.write(txtReg0.toString());
        	fos.write(txtRegI.substring(0, (txtRegI.length()/2)).toString());
        	fos.write(txtRegI.substring((txtRegI.length()/2)).toString());
			fos.write(txtRegJ.toString());
			fos.write(txtReg9.toString());
        } catch (IOException e) {
			e.printStackTrace();
		}

	}

}
