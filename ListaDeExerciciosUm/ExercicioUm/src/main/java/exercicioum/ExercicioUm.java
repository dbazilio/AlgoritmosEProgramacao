package exercicioum;

import java.util.Scanner;

public class ExercicioUm {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); 
        double numeroUm, numeroDois, resultado;
        
        System.out.println("Digite o primeiro numero");
        numeroUm = scan.nextDouble();
        
        System.out.println("Digite o segundo número");
        numeroDois = scan.nextDouble();
        
        resultado = numeroUm * numeroDois;
        
        System.out.println("O produto da mutiplicação é: "+ resultado);
            
            
    }
}
