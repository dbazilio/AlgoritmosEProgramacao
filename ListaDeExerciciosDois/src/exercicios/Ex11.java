package exercicios;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		double x = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de numeros: ");
		int n = sc.nextInt();
		for (int i = 2; i <= n; i++) {
			
			x = x + (1.0/i);
		}
		System.out.println(x);

	}

}
