package exercicios;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de numeros: ");
		int n = sc.nextInt();
		double x = 1.0;
		for (int i = 1; i < n; i++) {
			x = x + ((2.0*i)/ (2.0*i+1.0));
		}
		x = x + (2.0*n)/(2.0*n+1.0);
		System.out.println(x);


	}

}
