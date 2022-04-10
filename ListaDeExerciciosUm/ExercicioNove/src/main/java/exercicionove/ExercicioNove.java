package exercicionove;

import java.util.Scanner;

public class ExercicioNove {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int numeroCadastro;
        double numeroHrTrabalhada, valorHora, resultado;
        
        System.out.println("Digite o número do cadastro");
        numeroCadastro = scan.nextInt();

        System.out.println("Digite a quantidade de horas trabalhadas");
        numeroHrTrabalhada = scan.nextDouble();

        System.out.println("Digite o valor da hora trabalhada");
        valorHora = scan.nextDouble();

        resultado = valorHora * numeroHrTrabalhada;
        
        System.out.println("Número do cadastro: "+ numeroCadastro + "\nSalário do profisional: R$" + resultado );
    }
}
