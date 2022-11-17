package Fintech;

import java.util.Scanner;

public class Teste {
	char resposta;
	
	public static void main(String[] args) {
		
		Conta Teste1 = new Conta();
		Usuario Teste2 = new Usuario();

		
//		System.out.println("Para efeitos de teste, foi atribuido o valor de 5000 a sua conta");
//		Teste1.saldoAtual = 5000;
//		System.out.println("Seu saldo atual é " + Teste1.exibeSaldoAtual());
		System.out.println("INFORMAÇÕES DE CONTA");
		System.out.println("___________________________________________");
		System.out.println("Atribuido 2500 de Despesas");
		Teste1.despesas = 2500;
		System.out.println("  Suas despesas totalizam: " + Teste1.exibeDespesas());
		System.out.println("___________________________________________");
		
		System.out.println("Para efeitos de teste, também foi atribuido o valor de 7500 a sua conta");
		Teste1.receita = 7500;
		System.out.println("  A receita atual é: " + Teste1.exibeReceita());
		System.out.println("___________________________________________");
		System.out.println("  Logo, seu saldo atual é: " + Teste1.exibeSaldoAtual());
		System.out.println("___________________________________________");

		//SALDO ATUAL IRÁ CORRESPONDER A RECEITA - DESPESA
		
		System.out.println("Atribuido objetivo padrão");
		Teste1.meusObjetivos = "Economizar 1000 reais";
		System.out.println("  Objetivo padrão: " + Teste1.exibeMeusObjetivos());
		System.out.println("\nDeseja alterar seu objetivo? 1 para sim, 2 para não");		
		Scanner Scan = new Scanner (System.in);
		int resposta;
		resposta = Scan.nextInt();
		if(resposta == 1) {
		Teste1.alterarMeusObjetivos();;
		Scan.close();
		}
		else if(resposta == 2) {
			System.out.println("Seu objetivo atual continua sendo o mesmo");
		} else {
		System.out.println("Alternativa inválida");
		}
		System.out.println("\n  Meu objetivo atual é: " + Teste1.exibeMeusObjetivos());
		System.out.println("___________________________________________");
		System.out.println("Dados Usuário");
		Teste2.email = "rm96045@fiap.com.br";
		System.out.println("Email atual: " + Teste2.email);
		System.out.println("\nDeseja alterar seu email? 1 para sim, 2 para não");		
		int resposta1;
		resposta1 = Scan.nextInt();
		if(resposta1 == 1) {
		Teste2.alterarEmail();
		}else if(resposta1 == 2) {
			System.out.println("Seu email continua sendo " + Teste2.email);
		} else {
		System.out.println("Alternativa inválida");
		}
		System.out.println("Email atual: " + Teste2.email);

	}
}
