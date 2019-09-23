package enumeracoes;

public enum EnumeracaoOpcoes {
	
	COMPACTAR ("Compactação",0),
	DESCOMPACTAR("Descompactação",1),
	COPIA_DE_SEGURANCA ("Copia de segurança",2),
	RESTAURACAO ("Restauração",3);

	private final String nome;
	private final int valor;
	
	EnumeracaoOpcoes (String n, int v) {nome = n; valor = v;}
	
	public int getValor() {return valor;}
	public String getNome() {return nome;}
	public String toString() {return nome + "(" + valor + ")";}
}
