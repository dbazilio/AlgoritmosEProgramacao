/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package adocondicionais;

import java.util.Scanner;

/**
 *
 * @author alce
 */
public class AdoCondicionais {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int exercicio;
        boolean escolha = true;
        System.out.println("""
                           1. Dado um numero, verificar se ele é maior que 100. 
                            Se for, o algoritmo deve somar 150 a esse numero. No final, imprimir o resultado da soma. 
                           ""
                           2. Dados dois números, verificar se a divisão do primeiro número pelo
                            segundo é exata (o resto da divisão deve ser igual a 0). Se for, o
                            algoritmo deve imprimir a mensagem “A divisão de (número 1) por
                            (número 2) é exata
                           ""
                            3. Dada a altura e o peso de uma pessoa, determinar seu grau de obesidade. 
                            O grau de obesidade é determinado pelo índice da massa
                            corpórea (Massa = Peso / Altura2) através da tabela abaixo:
                            ""
                            4. Calcular a conta de consumo de energia elétrica de um consumidor, dado
                            o kWh consumido, de acordo com a tabela abaixo:
                            """);

        while (escolha) {
            System.out.println("\nEscolha um exercicio");
            exercicio = scan.nextInt();
            switch (exercicio) {
                case 1 -> {
                    System.out.println("Excercicio Um");

                    double numero,
                            resultado;
                    System.out.println("Digite um número");
                    numero = scan.nextDouble();
                    if (numero > 100) {

                        resultado = numero + 150;
                        System.out.println("O resultado é " + resultado);
                    } else {
                        System.out.println("Não há soma a ser informada ");
                    }
                    escolha = true;
                }

                case 2 -> {
                    System.out.println("Excercicio Dois");
                    double numeroUm,
                            numeroDois,
                            resto;
                    System.out.println("Digite o priomeiro número ");
                    numeroUm = scan.nextDouble();
                    System.out.println("Digite o segundo número ");
                    numeroDois = scan.nextDouble();
                    resto = numeroUm % numeroDois;
                    if (resto == 0) {
                        System.out.println("A divisão de" + numeroUm + "por " + numeroDois + " é exata");
                    } else {
                        System.out.println("Divisão não exata");
                    }
                    escolha = true;
                }

                case 3 -> {
                    System.out.println("Excercicio Três");
                    double altura,
                            peso,
                            massa;
                    System.out.println("Digite sua altura ");
                    altura = scan.nextDouble();
                    System.out.println("Digite seu peso  ");
                    peso = scan.nextDouble();
                    massa = peso / (altura * altura);
                    if (massa < 26) {
                        System.out.println("Peso normal  ");
                    } else if (massa >= 26 && massa < 30) {
                        System.out.println("Obeso");
                    } else {
                        System.out.print("Obesidade morbida");
                    }
                    escolha = true;
                }

                case 4 -> {
                    
                    System.out.println("Exercicio Quatro");
                    double consumo,
                            calculo;
                    System.out.println("Digite o seu consumo de água ");
                    consumo = scan.nextDouble();
                    if (consumo < 150) {
                        calculo = consumo * 0.20;
                        System.out.println("O valor da sua conta de energia é: R$" + calculo);
                    } else if (consumo >= 150 && consumo < 500) {
                        calculo = consumo * 0.25;
                        System.out.println("O valor da sua conta de energia é: R$" + calculo);
                    } else if (consumo >= 500) {
                        calculo = consumo * 0.30;
                        System.out.println("O valor da sua conta de energia é: R$" + calculo);
                    } else {
                        calculo = 11.90;
                        System.out.println("O valor da sua conta de energia é: R$" + calculo);
                    }
                    escolha = true;
                }
            }
        }
    }
}


