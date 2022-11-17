package Fintech;

public class Pessoa {
	//Declaração de atributos
	int codPessoa;

	//Construtor Padrão (nenhuma informação contida)
	public Pessoa() {
		
	}

	//Construtor de classe
	public Pessoa(int codPessoa) {
		this.codPessoa = codPessoa;
	}
	
	public int gerarCodigoPessoa() {
		return codPessoa;
				
	}
}


