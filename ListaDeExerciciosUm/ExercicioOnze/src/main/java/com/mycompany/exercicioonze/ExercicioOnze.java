package com.mycompany.exercicioonze;

import java.util.Scanner;

public class ExercicioOnze {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double numero;

        System.out.println("Digite um número");
        numero = scan.nextInt();

        if (numero < 0) {
            System.out.println("Numero negativo");

        } else {
            System.out.println("Numero positivo");
        }
    }
}
