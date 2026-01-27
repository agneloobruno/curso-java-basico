package com.bruno.cursojava.exercicio1;

import java.util.Scanner;

/**
 *
 * @author 3714194
 */
public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o raio do circulo:");
        float raio = scan.nextFloat();
        
        double area = Math.pow(raio, 2) * 3.14;
     
        System.out.println("A área do círculo é: " + area);
    }
}
