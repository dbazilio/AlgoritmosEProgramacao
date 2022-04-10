package com.mycompany.exercicioquatorze;

import java.util.Scanner;

public class ExercicioQuatorze {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double numeroUm, numeroDois;

        System.out.println("Digite o primeiro numero");
        numeroUm = scan.nextDouble();

        System.out.println("Digite o segundo número");
        numeroDois = scan.nextDouble();

        if (numeroUm > numeroDois) {
            System.out.println("A divisao do maior para o menor é:  " + numeroUm / numeroDois);
        } else {
            System.out.println("A divisao do maior para o menor é:  " + numeroDois / numeroUm);
        }
    }
}
