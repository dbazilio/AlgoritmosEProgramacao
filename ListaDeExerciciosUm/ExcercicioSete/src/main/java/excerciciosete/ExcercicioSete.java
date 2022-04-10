package excerciciosete;

import java.util.Scanner;

public class ExcercicioSete {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double valorLA,valorLB, resultado;

        System.out.println("Digite o valor do Lado A");
        valorLA = scan.nextDouble();
        
         System.out.println("Digite o valor do Lado B");
        valorLB = scan.nextDouble();

        resultado = (double)Math.sqrt(valorLA*valorLA + valorLB*valorLB);
        System.out.println("A hipotenusa do triângulo é:  " + resultado);
    }
}
