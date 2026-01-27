package com.bruno.cursojava.aula19lab;

/**
 *
 * @author 3714194
 */
public class Atividade04 {
    public static void main(String[] args){
        
        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        
        double[] vetorB = new double[vetorA.length];
        
        for(int i = 0; i < vetorA.length; i++){
            vetorB[i] = Math.sqrt(vetorA[i]);
            System.out.println("Vetor A: " + vetorA[i] + " e vetor B: " + vetorB[i]);
        }
    }
}
