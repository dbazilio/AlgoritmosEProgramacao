package exercicios;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o numero: ");
		int n = sc.nextInt();
		for (int i = n; i >= 1; i--) {
			if (n % i == 0) {
				System.out.println(n/i);
			}
		}
		

	}

}
