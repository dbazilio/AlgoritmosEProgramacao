package exercicios;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de numeros: ");
		int n = sc.nextInt();
		double x = 1.0;
		double r1 = 1;
		double r2 = 1;
		for (int i = 1; i < n; i++) {
			r1 = r1 * (i + 1);
			r2 = r2 * (i + 2);
			x = x + (r1/ r2);
		}
		x = x + (r1 * n) / (2*n - 1);
		System.out.println(x);


	}

}
