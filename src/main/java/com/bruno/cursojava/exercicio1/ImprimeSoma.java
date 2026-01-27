package com.bruno.cursojava.exercicio1;

import java.util.Scanner;

/**
 *
 * @author 3714194
 */
public class ImprimeSoma {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        int numero1 = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        int numero2 = scan.nextInt();
        
        int soma = numero1 + numero2;
        
        System.out.println("A soma dos valores é " + soma);
       
        
    }
}
