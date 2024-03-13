package revisao;

import java.util.Scanner;

public class Main {
	
	public static void mostrarQuantContas() {
		System.out.println("Quantidade de contas "
						+ Conta.getQuantContas());
	}
	
	public static void mostrarInformacoes(Conta c) {
		System.out.println("-------------------");
		System.out.println("Número: " + c.getNumero());
		System.out.println("Saldo: " + c.getSaldo());
		
		if (c instanceof ContaCorrente) {
			ContaCorrente cr = (ContaCorrente) c;
			System.out.println("Limite: " + cr.getLimite());
			System.out.println("Saldo Total: " + cr.obterSaldoTotal());
		}
		
		System.out.println("-------------------");
	}
	
	public static void realizarCredito(Conta c) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor a ser creditado: ");
		double valor = scan.nextDouble();
		
		if (c.creditar(valor)) {
			System.out.println("Crédito realizado com sucesso.");
			System.out.println("Saldo atual: " + c.getSaldo());
		}else {
			System.out.println("Não foi possível realizar o crédito");
		}
	}

	public static void realizarDebito(Conta c) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor a ser debitado: ");
		double valor = scan.nextDouble();
		
		if (c.debi	tar(valor)) {
			System.out.println(c.getMensagemOp());
			System.out.println("Saldo atual: " + c.getSaldo());
		}else {
			System.out.println(c.getMensagemOp());
		}
	}
	
	public static void main(String[] args) {
		//ContaCorrente cc1 = new ContaCorrente(400);
		
		//mostrarInformacoes(cc1);
		
		ContaCorrente cc2 = new ContaCorrente(300, 200);
		realizarDebito(cc2);
		
		mostrarInformacoes(cc2);
		
		//Conta c1 = new Conta(1000);
		//mostrarInformacoes(c1);
		
	}

}
