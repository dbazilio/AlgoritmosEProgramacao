package ExercicioUm;


import java.util.Scanner;

/**
 *
 * @author debora.vbazilio
 */
public class ExercicioUm {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char grade;
        double notaUm, notaDois, resultado;

        System.out.println("Digite a primeira nota");
        notaUm = scan.nextDouble();
        System.out.println("Digite a segunda nota");
        notaDois = scan.nextDouble();

        resultado = (notaUm + notaDois) / 2;

         if (resultado >= 9 & resultado <10) {
            grade = 'A';

        } else if (resultado >= 8 & resultado < 9) {
            grade = 'B';

        } else if (resultado >= 7 & resultado < 8) {
            grade = 'C';

        } else if (resultado >= 6 & resultado < 7) {
            grade = 'D';

        } else {
            grade = 'E';
        }

        switch (grade) {
            case 'A':
                System.out.println("Conceito A");
                break;
            case 'B':
                System.out.println("Conceito B");
                break;
            case 'C':
                System.out.println("Conceito C");
                break;
            case 'D':
                System.out.println("Conceito D");
                break;
            case 'E':
                System.out.println("Conceito E");
                break;
            default:
                System.out.println("Nota digitada inválida");

        }
    }
}
