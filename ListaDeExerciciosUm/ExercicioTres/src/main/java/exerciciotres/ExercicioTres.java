package exerciciotres;

import java.util.Scanner;


public class ExercicioTres {

    public static void main(String[] args) {
        
         Scanner scan = new Scanner(System.in); 
        double numeroUm, numeroDois, resultado;
        
        System.out.println("Digite o primeiro numero");
        numeroUm = scan.nextDouble();
        
        System.out.println("Digite o segundo número");
        numeroDois = scan.nextDouble();
        
        resultado = (numeroUm*numeroUm) + (numeroDois*numeroDois);
        
        System.out.println("A soma do quadrado de dois números é:  "+ resultado);
    }
}
