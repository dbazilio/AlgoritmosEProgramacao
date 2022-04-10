
package exerciciocinco;

import java.util.Scanner;

public class ExercicioCinco {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double valorL, resultado;

        System.out.println("Digite o valor do L");
        valorL = scan.nextDouble();

        resultado = valorL * valorL;
        System.out.println("A área de um quadrado L é:  " + resultado);
    }
}
