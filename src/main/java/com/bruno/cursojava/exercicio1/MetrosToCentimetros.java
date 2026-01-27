package com.bruno.cursojava.exercicio1;

import java.util.Scanner;

/**
 *
 * @author 3714194
 */
public class MetrosToCentimetros {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor em metros que deseja converter: ");
        float metros = scan.nextFloat();
        
        float centimetros = metros * 100;
        
        System.out.println(metros + "M em centimentros: " + centimetros + "cm");
    }
}
