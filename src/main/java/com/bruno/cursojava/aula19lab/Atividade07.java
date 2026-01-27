package com.bruno.cursojava.aula19lab;

import java.util.Scanner;

/**
 *
 * @author 3714194
 */
public class Atividade07 {
    public static void main(String[] args){
        final int TAMANHO_VETOR = 10;
        
        int[] vetorA = new int[TAMANHO_VETOR];
        int[] vetorB = new int[TAMANHO_VETOR];
        int[] vetorC = new int[TAMANHO_VETOR];
        
        Scanner scan = new Scanner(System.in);
        
        for(int count = 0; count < TAMANHO_VETOR; count++){
            System.out.println("Digite dois valores: (de um enter após digitar cada numero)");
            
            vetorA[count]= scan.nextInt();
            vetorB[count] = scan.nextInt();
            
            vetorC[count] = vetorA[count] - vetorB[count];
        }
        
        for(int count = 0; count < TAMANHO_VETOR; count++){
            System.out.println(vetorA[count] + " - " + vetorB[count] + " = "+ vetorC[count ]);
        }
    }
}
