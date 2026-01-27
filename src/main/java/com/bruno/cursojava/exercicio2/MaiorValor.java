package com.bruno.cursojava.exercicio2;

import java.util.Scanner;

/**
 *
 * @author 3714194
 */
public class MaiorValor {
    public static void main(String[] args){ 
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um valor: ");
        int valor1 = scan.nextInt();
        
        System.out.println("Digite outro valor: ");
        int valor2 = scan.nextInt();
        
        System.out.println("O maior valor é:");
        if(valor1 > valor2){
            System.out.println(valor1);
        } else if(valor2 > valor1){
            System.out.println(valor2);
        } else {
            System.out.println("Os valores são iguais.");
        }
    }
}
