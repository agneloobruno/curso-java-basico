package com.bruno.cursojava.exercicio1;

import java.util.Scanner;

/**
 *
 * @author 3714194
 */
public class NotaBimestre {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite as notas dos 4 bimestre: ");
        
        
        System.out.println("1 Bimestre: ");
        float b1 = scan.nextFloat();//float pois tem a precisão menor e por sua vez usa menos espaço na memoria 
        
        System.out.println("2 Bimestre: ");
        float b2 = scan.nextFloat();
        
        System.out.println("3 Bimestre: ");
        float b3 = scan.nextFloat();
        
        System.out.println("4 Bimestre: ");
        float b4 = scan.nextFloat();
        
        float media = (b1+b2+b3+b4)/4;
        
        System.out.println("A media anual do aluno foi " + media);
    }
}
