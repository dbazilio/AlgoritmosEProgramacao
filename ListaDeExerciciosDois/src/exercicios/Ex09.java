package exercicios;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		int x = 0;
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.print("Digite a quantidade de alunos: ");
		int n = sc.nextInt();
		while(i < n) {
			System.out.print("Digite a note do aluno " + (i+1) + ": ");
			int nota = sc.nextInt();
			x += nota;
			i ++;
		}
		System.out.println(x / n);
	}

}
