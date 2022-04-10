package com.mycompany.excercicioquinze;

import java.util.Scanner;

public class ExcercicioQuinze {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double numeroA, numeroB, numeroC, resultado;

        System.out.println("Digite o primeiro numero");
        numeroA = scan.nextDouble();

        System.out.println("Digite o segundo número");
        numeroB = scan.nextDouble();

        System.out.println("Digite o segundo número");
        numeroC = scan.nextDouble();

        resultado = Math.pow(numeroB, 2) - (4*numeroA*numeroC);
        
        
        if (resultado <0) {
            System.out.println("Impossivel calcular");
        } else {
        }

    }
}
