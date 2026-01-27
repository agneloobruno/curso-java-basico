package com.bruno.cursojava.exercicio1;

import java.util.Scanner;

/**
 *
 * @author 3714194
 */
public class AreaDoQuadrado {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor dos lados do quadrado: ");
        System.out.println("Base: ");
        float base = scan.nextFloat();
        
        System.out.println("Altura: ");
        float altura = scan.nextFloat();
        
        float area = (base * altura)*2;
        
        System.out.println("o dobro da area do quadrado é: "+ area);
    }
}
