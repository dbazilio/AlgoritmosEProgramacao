package exercicios;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o numero: ");
		int n = sc.nextInt();
		int x = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				x = x + i;
			}
		}
		if(x == n) {
			System.out.println("Perfeito");
		}else {
			System.out.println("Não perfeito");
		}

	}

}
