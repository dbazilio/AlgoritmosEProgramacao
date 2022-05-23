package exercicios;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de numeros: ");
		int n = sc.nextInt();
		int i = 0;
		int x = 0;
		do  {
			System.out.println("Digite o numero: ");
			x = sc.nextInt();
			if(x > 0) {
				System.out.println("POSITIVO");
			}else if(x < 0) {
				System.out.println("NEGATIVO");
			}else {
				System.out.println("NULO");
			}
			i++;
		}while(i < n);
		System.out.println(x);

	}

}
