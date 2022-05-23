package exercicios;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		int x = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o número " + i + ": ");
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			if(n > x) {
				x = n;
			}
			
		}
		System.out.println("resultado: " + x);
	}

}
