package com.bruno.cursojava.aula19lab;

/**
 *
 * @author 3714194
 */
public class Atividade01 {
    public static void main(String[] args){
        
        int[] vetorA = {15, 23, 38, 40, 75};
        
        int[] vetorB = new int[vetorA.length];
        
        for(int i = 0; i < vetorA.length; i++){
            vetorB[i] = vetorA[i];
            System.out.println("Vetor A: " + vetorA[i] + " e vetor B: " + vetorB[i]);
        }
        
        
    }
}
