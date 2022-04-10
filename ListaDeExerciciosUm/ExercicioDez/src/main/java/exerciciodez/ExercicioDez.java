package exerciciodez;

import java.util.Scanner;

public class ExercicioDez {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nomeFuncionario;
        double salarioFixo, totalVendaMes, resultado, percentual;

        System.out.println("Digite o seu nome ");
        nomeFuncionario = scan.next();

        System.out.println("Digite o seu salario fixo");
        salarioFixo = scan.nextDouble();

        System.out.println("Digite o total de vendas feitas no mês");
        totalVendaMes = scan.nextDouble();

        resultado = salarioFixo + totalVendaMes*15/100;

        System.out.println("Olá " + nomeFuncionario + " você receberá o total de: R$" + resultado);
    }
}
