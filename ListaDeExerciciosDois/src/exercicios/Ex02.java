package exercicios;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Escolha o número: ");
		int n = sc.nextInt();
		int i = 1;
		int x = 0;
		while (i <= n) {
			x += i;
			i++;
			
		}
		System.out.println("resultado: " + x);
	}
}
