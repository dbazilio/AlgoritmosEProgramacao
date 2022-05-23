package exercicios;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		String senha = "2002";
		boolean loop = true;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Digite a senha: ");
			String n = sc.next();
			System.out.println(n);
			if (senha.equals(n)){
				System.out.println("Acesso Permitido");
				loop = false;
			}else {
				System.out.println("Senha Invalida");
			}
		} while (loop);
		

	}

}
