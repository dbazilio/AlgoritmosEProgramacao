package com.mycompany.exerciciotreze;

import java.util.Scanner;

public class ExercicioTreze {

    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in); 
        double numeroUm, numeroDois, numeroTres;
        
        System.out.println("Digite o primeiro numero");
        numeroUm = scan.nextDouble();
        
        System.out.println("Digite o segundo número");
        numeroDois = scan.nextDouble();
        
         System.out.println("Digite o terceiro número");
        numeroTres = scan.nextDouble();
        
        
        if(numeroUm > numeroDois & numeroUm > numeroTres){
            System.out.println("Numero um é o maior: " +numeroUm);
        }else if(numeroDois>numeroUm & numeroDois >numeroTres){
            System.out.println("Numero dois é o maior: " +numeroDois);
        }else{
            System.out.println("Numero três é o maior: " +numeroTres);
        }
    }
}
