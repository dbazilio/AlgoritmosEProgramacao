package exerciciodezoito;

import java.util.Scanner;

public class ExercicioDezoito {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double numeroA, numeroB, numeroC;

        System.out.println("Digite o primeiro numero");
        numeroA = scan.nextDouble();

        System.out.println("Digite o segundo número");
        numeroB = scan.nextDouble();

        System.out.println("Digite o segundo número");
        numeroC = scan.nextDouble();

 
        if (numeroA >= numeroB + numeroC) {
            System.out.println("não forma triângulo");
        } else if (numeroA * numeroA == numeroB * numeroB + numeroC * numeroC) {
            System.out.println("TRIÂNGULO RETÂNGULO");
        } else if (numeroA * numeroA > numeroB * numeroB + numeroC * numeroC) {
            System.out.println("TRIÂNGULO OBTUSÂNGULO");
        } else if (numeroA * numeroA < numeroB * numeroB + numeroC * numeroC) {
            System.out.println("TRIANGULO ACUTÂNGULO");
        } else if (numeroA == numeroB & numeroA == numeroC & numeroC == numeroB) {
            System.out.println("TRIÂNGULO EQUILÁTERO");
        } else if(numeroA == numeroB & numeroA == numeroC || numeroB == numeroA & numeroB == numeroC || numeroC == numeroA & numeroC == numeroB) {
            System.out.println("TRIÂNGULO ISÓSCELES");

        }
    }
}
