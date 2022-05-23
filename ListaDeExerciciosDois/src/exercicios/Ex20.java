package exercicios;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o saldo: ");
		double saldo = sc.nextDouble();
		int i = 0;
		boolean loop = true;
		do {
			
			System.out.print("Escolha a opcao: 1 - depositar / 2 - sacar / 3 - parar");
			int op = sc.nextInt();
			if(op == 1) {
				System.out.println("Digite o valor:");
				double valor = sc.nextDouble();
				saldo = saldo + valor;
				
			} else if(op == 2) {
				System.out.println("Digite o valor:");
				double valor = sc.nextDouble();
				saldo = saldo - valor;
			} else if(op == 3) {
				loop = false;
			}
			
		}while(loop);
		if(saldo > 0) {
			System.out.println("CONTA PREFERENCIAL");
		}else if(saldo < 0) {
			System.out.println("CONTA ESTOURADA");
		}else {
			System.out.println("CONTA ZERADA");
		}
	}

}
