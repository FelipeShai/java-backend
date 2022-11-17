package Fintech;

import java.util.Scanner;

public class Usuario {
	//Declaração de atributos
	String email;
	String telefone;
	String senha;
	
	//Construtor Padrão (nenhuma informação contida)
	public Usuario() {
		
	}
	
	//Construtor de classe
	public Usuario(String email, String telefone, String senha) {
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
	}
	
	public String alterarEmail() {
		System.out.println("Digite seu novo email");
		Scanner Scan2 = new Scanner (System.in);
		email = Scan2.nextLine();
		Scan2.close();
		return email;
	}
//Falta desenvolver mais os métodos
	

}
