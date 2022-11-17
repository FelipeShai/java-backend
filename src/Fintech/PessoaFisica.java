package Fintech;

public class PessoaFisica extends Pessoa {
	//Declaração de atributos
	String nome;
	boolean genero;
	int dataNasc;

	//Construtor Padrão (nenhuma informação contida)
	public PessoaFisica() {
			
		}
	
	//Construtor de classe
	public PessoaFisica(String nome, boolean genero, int dataNasc) {
		this.nome = nome;
		this.genero = genero;
		this.dataNasc = dataNasc;
	}
	
	//Falta adicionar métodos

}
