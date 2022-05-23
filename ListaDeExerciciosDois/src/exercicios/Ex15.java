package exercicios;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de numeros: ");
		int n = sc.nextInt();
		int x = n;
		for (int i = 1; i < n; i++) {
			x = x * (n - i);
		}
		System.out.println(x);
	}

}
