package enumeracoes;

public enum EnumeracaoOpcoes {
	
	COMPACTAR ("Compacta��o",0),
	DESCOMPACTAR("Descompacta��o",1),
	COPIA_DE_SEGURANCA ("Copia de seguran�a",2),
	RESTAURACAO ("Restaura��o",3);

	private final String nome;
	private final int valor;
	
	EnumeracaoOpcoes (String n, int v) {nome = n; valor = v;}
	
	public int getValor() {return valor;}
	public String getNome() {return nome;}
	public String toString() {return nome + "(" + valor + ")";}
}
