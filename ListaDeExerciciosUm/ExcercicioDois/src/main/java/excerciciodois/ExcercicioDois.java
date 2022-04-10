package excerciciodois;

import java.util.Scanner;


public class ExcercicioDois {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double base, expoente, resultado;

        System.out.println("Digite o numero base");
        base = scan.nextDouble();

        System.out.println("Digite o número expoente");
        expoente = scan.nextDouble();

        resultado = (double)Math.pow(base, expoente);

        System.out.println("O resultado da potênciação é: " + resultado);
    }
}
