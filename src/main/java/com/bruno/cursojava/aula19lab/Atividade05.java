package com.bruno.cursojava.aula19lab;

import java.util.Scanner;

/**
 *
 * @author 3714194
 */
public class Atividade05 {
    public static void main(String[] args){

        final int TAMANHO_VETOR = 10;
        
        int[] vetorA = new int[TAMANHO_VETOR];
        
        int[] vetorB = new int[TAMANHO_VETOR];
        
        int[] vetorC = new int[TAMANHO_VETOR];
        
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Prencha a casa " + i + " do VetorA.");
            vetorA[i] = scan.nextInt();
            
            System.out.println("Prencha a casa " + i + " do VetorB.");
            vetorB[i] = scan.nextInt();
            
            vetorC[i] = vetorA[i]+vetorB[i];
        }
        
        for(int i = 0; i < vetorC.length; i++){
            System.out.println("Vetor C: " + vetorC[i] + " = vetorA "+ vetorA[i] +" + vetorB: " + vetorB[i]);
        }
    }
}
