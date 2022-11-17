package Fintech;

public class Transacoes {
	//Declaração de atributos
	int idTransacao;
	String descricao;
	int dataTransacao;
	String categoria;
	double valor;
	
	//Construtor Padrão (nenhuma informação contida)
	public Transacoes() {
		
	}

	//Construtor de classe
	public Transacoes(int idTransacao, String descricao, int dataTransacao, String categoria, double valor) {
		this.idTransacao = idTransacao;
		this.descricao = descricao;
		this.dataTransacao = dataTransacao;
		this.categoria = categoria;
		this.valor = valor;
	}
	
	//Falta desenvolver os métodos
	
}
