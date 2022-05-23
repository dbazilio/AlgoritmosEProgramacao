package exercicios;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o numero: ");
		int n = sc.nextInt();
		int x1 = 0;
		int x2 = 1;
		int x = 0;
		if(n < 46) {
			System.out.println(0);
			for (int i = 0; i < n; i++) {
				x = x1 + x2;
				x1 = x2;
				x2 = x;
				System.out.println(x);
			}
			
		}		

	}
}
