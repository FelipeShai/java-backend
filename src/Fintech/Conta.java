package Fintech;

import java.util.Scanner;

public class Conta {
	//Declaração de atributos
	double saldoAtual;
	double despesas;
	double receita;
	String meusObjetivos;
	double proximasTransacoes;

	//Construtor Padrão (nenhuma informação contida)
	public Conta() {
	}
	
	//Construtor de classe
	public Conta(double saldoAtual, double despesas, double receita, String meusObjetivos, double proximasTransacoes){
		this.saldoAtual = saldoAtual;
		this.despesas = despesas;
		this.receita = receita;	
		this.meusObjetivos = meusObjetivos;	
		this.proximasTransacoes = proximasTransacoes;
		}
	
	public double exibeSaldoAtual() {
		saldoAtual = receita - despesas;
		return saldoAtual;
	}
	
	public double exibeDespesas() {
		return despesas;
	}
	
	public double exibeReceita() {
		return receita;
	}
	
	public double exibeProximasTransacoes() {
		return proximasTransacoes;
	}
	
	public String exibeMeusObjetivos() {
		return meusObjetivos;
	}
	
	public String alterarMeusObjetivos() {
		System.out.println("Digite seu novo objetivo");
		Scanner Scan = new Scanner (System.in);
		meusObjetivos = Scan.nextLine();
		Scan.close();
		return meusObjetivos;
	}
}


