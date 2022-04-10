package exercicioquatro;

import java.util.Scanner;


public class ExercicioQuatro {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numeroUm, numeroDois, resultadoUm, resultadoDois;

        System.out.println("Digite o primeiro numero");
        numeroUm = scan.nextInt();

        System.out.println("Digite o segundo número");
        numeroDois = scan.nextInt();

        resultadoUm = numeroUm+1;
        resultadoDois = numeroDois+1;
        System.out.println("O números consecutivos respectivamente são:  " + resultadoUm +" e "+ resultadoDois);
    }
}
