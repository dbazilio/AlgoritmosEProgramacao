package exercicios;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de numeros: ");
		int n = sc.nextInt();
		double x = 1.0/n;
		for (int i = 1; i < n; i++) {
			x = x + ((i+1) / (n - i));
		}
		System.out.println(x);
	}

}
