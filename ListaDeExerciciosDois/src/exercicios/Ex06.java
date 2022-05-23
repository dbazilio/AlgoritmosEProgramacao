package exercicios;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		String nome = "";
		int idade = 0;
		String sexo = "";
		int i = 1;
		
		do {
			System.out.print("Digite o nome do aluno " + i + ": ");
			Scanner sc = new Scanner(System.in);
			String n = sc.next();
			System.out.print("Digite a idade do aluno " + i + ": ");			
			int id = sc.nextInt();
			System.out.print("Digite o sexo do aluno " + i + ": ");			
			String sx = sc.next();
			if(id > idade) {
				nome = n;
				idade = id;
				sexo = sx;
			}
			i++;
			
		}while( i <= 5);
		System.out.println("O mais velho é: ");
		System.out.println("nome: " + i);
		System.out.println("idade: " + idade);
		System.out.println("sexo: " + sexo);
		

	}

}
