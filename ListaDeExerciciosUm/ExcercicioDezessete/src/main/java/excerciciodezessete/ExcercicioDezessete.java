package excerciciodezessete;

import java.util.Scanner;

public class ExcercicioDezessete {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double numeroA, numeroB, numeroC, numeroD, somaUm, somaDois;

        System.out.println("Digite o primeiro numero");
        numeroA = scan.nextDouble();

        System.out.println("Digite o segundo número");
        numeroB = scan.nextDouble();

        System.out.println("Digite o terceiro número");
        numeroC = scan.nextDouble();

        System.out.println("Digite o quarto número");
        numeroD = scan.nextDouble();

        somaUm = numeroC + numeroD;
        somaDois = numeroA + numeroB;

        if (numeroB > numeroC & numeroD > numeroA & somaUm > somaDois & numeroC > 0 & numeroD > 0 & numeroA % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores não aceitos");

        }
    }
}
