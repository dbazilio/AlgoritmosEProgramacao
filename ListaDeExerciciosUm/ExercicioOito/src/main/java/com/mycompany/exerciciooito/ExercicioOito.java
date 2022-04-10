package com.mycompany.exerciciooito;

import java.util.Scanner;


public class ExercicioOito {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double numeroUm, numeroDois, numeroTres, numeroQuatro, resultado;

        System.out.println("Digite o número Um");
        numeroUm = scan.nextDouble();

        System.out.println("Digite o número Dois");
        numeroDois = scan.nextDouble();

        System.out.println("Digite o número Três");
        numeroTres = scan.nextDouble();

        System.out.println("Digite o número Quatro");
        numeroQuatro = scan.nextDouble();

        resultado = (numeroUm + numeroDois + numeroTres + numeroQuatro) / 4;

        System.out.println("A média aritmética é: "+ resultado);
    }
}
