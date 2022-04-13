package ExercicioDois;

import java.util.Scanner;

/**
 *
 * @author debora.vbazilio
 */
public class ExercicioDois {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int opcao;

        System.out.println("1-Tomar remédio");
        System.out.println("2- Vai dormir");
        System.out.println("3 - Vai para o rolê");
        System.out.println("4 - Tomar uma cerveja");
        System.out.println("Palmeras não tem mundial");
        System.out.println("Opção:");
        opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Opção Um");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Opção 2, 3, 4 ou 5");

                break;
            default:
                System.out.println("Escolha um opção");

        }

    }
}
