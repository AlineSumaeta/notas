package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Entre com o numero da conta: ");
		int number = sc.nextInt();
		System.out.print("Titular da conta: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Tem deposito inicial? [s/n] ");
		char response = sc.next().charAt(0);
		
		if(response == 's') {
			System.out.print("Deposito inicial: ");
			double initialDeposit = sc.nextDouble();
			conta = new Conta(number, holder, initialDeposit);
		}
		else {
			conta = new Conta(number, holder);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Valor para deposito: ");
		double depositValue = sc.nextDouble();
		conta.deposit(depositValue);
		System.out.println("Dados atualizados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Valor para saque: ");
		double withdrawValue = sc.nextDouble();
		conta.withdraw(withdrawValue);
		System.out.println("Dados atualizados da conta: ");
		System.out.println(conta);
		
		
		sc.close();

	}

}
