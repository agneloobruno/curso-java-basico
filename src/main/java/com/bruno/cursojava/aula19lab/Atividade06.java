package com.bruno.cursojava.aula19lab;

import java.util.Scanner;

/**
 *
 * @author 3714194
 */
public class Atividade06 {
    public static void main(String[] args){
        
        final int TAMANHO_VETOR = 10;
        
        int[] vetorA = new int[TAMANHO_VETOR];
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorB = new int[TAMANHO_VETOR];
        int[] vetorC = new int[TAMANHO_VETOR];
        
        for(int count = 0; count < TAMANHO_VETOR; count ++){
            System.out.println("Digite o valor que será adicionado ao vetor A: ");
            vetorA[count] = scan.nextInt();
            
            System.out.println("Digite o valor que será adicionado ao vetor B: ");
            vetorB[count] = scan.nextInt();
            
            vetorC[count] = vetorA[count] + vetorB[count];
        }
        
        for(int count = 0; count < TAMANHO_VETOR; count++){
            System.out.println("Soma dos valores: " + vetorC[count]);
        }
        
    }
}
