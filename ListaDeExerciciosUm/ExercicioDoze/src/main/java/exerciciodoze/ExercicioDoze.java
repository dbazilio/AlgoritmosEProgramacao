package exerciciodoze;

import java.util.Scanner;

public class ExercicioDoze {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double numeroL, numeroR, areaCirculo, areaQuadrado, valorPI = 3.14159;

        System.out.println("Digite o numero L");
        numeroL = scan.nextDouble();

        System.out.println("Digite o numero R");
        numeroR = scan.nextDouble();

        areaQuadrado = numeroL * numeroL;
        areaCirculo = valorPI * (numeroR * numeroR);

        if (areaQuadrado > areaCirculo) {
            System.out.println("Quadrado maior do que circulo");
        } else {
            System.out.println("Circulo é maior do que quadrado");
        }

    }
}
