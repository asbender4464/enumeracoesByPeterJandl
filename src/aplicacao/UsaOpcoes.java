package aplicacao;

import enumeracoes.EnumeracaoOpcoes;

public class UsaOpcoes {

	public static void main(String[] args) {

		//Exemplo JAVA, by Peter Jandl, p.164-165, 3.49 and 3.50.
		
		for (EnumeracaoOpcoes constante: EnumeracaoOpcoes.values()) {
			System.out.printf("%-25s #%02d: %-20s\n", constante, constante.getValor(), constante.getNome());
			switch(constante) {
			case COMPACTAR:
				System.out.println("Opção de COMPACTAÇÃO");
				break;
			case DESCOMPACTAR:
				System.out.println("Opção de DESCOMPACTAÇÃO");
				break;
			case COPIA_DE_SEGURANCA:
				System.out.println("Opção de BACKUP");
				break;
			case RESTAURACAO:
				System.out.println("Opção de RESTORE");
				break;
				
				
				
				
			}
		}

	}

}
