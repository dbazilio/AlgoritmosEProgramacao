
package excercicioseis;

import java.util.Scanner;

public class ExcercicioSeis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double numeroA, numeroB, numeroC, resultado, valorPI = 3.14159;

        System.out.println("Digite o número A");
        numeroA = scan.nextDouble();

        System.out.println("Digite o número B");
        numeroB = scan.nextDouble();

        System.out.println("Digite o número C");
        numeroC = scan.nextDouble();

        System.out.println("Área do triângulo retânguilo quer tem A por base e C por altura");
        resultado = numeroA * numeroC;
        System.out.println(resultado+"\n");

        System.out.println("Área do circulo de raio C");
        resultado = valorPI * (numeroC*numeroC);
        System.out.println(resultado+"\n");

        System.out.println("Área do trapézeo que tem A e B por bases e C por altura");
        resultado = ((numeroA+numeroB)*numeroC)/2;
        System.out.println(resultado+"\n");

        System.out.println("Área do quadrado que tem lado B");
        resultado = numeroB * numeroB;
        System.out.println(resultado+"\n");

        System.out.println("Área do retângulo que tem lado A e lado B");
        resultado = numeroA * numeroB;
        System.out.println(resultado+"\n");
        
        System.out.println("O perimetro do ratângulo que tem lado A e B");
        resultado = numeroA*2 + numeroB*2;
        System.out.println(resultado+"\n");

    }
}
