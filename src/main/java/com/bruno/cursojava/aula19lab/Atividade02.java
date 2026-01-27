package com.bruno.cursojava.aula19lab;

/**
 *
 * @author 3714194
 */
public class Atividade02{
    public static void main(String[] args){
        
        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8};
        
        int[] vetorB = new int[vetorA.length];
        
        for(int i = 0; i < vetorA.length; i++){
            vetorB[i] = vetorA[i] * 2;
            System.out.println("Vetor A: " + vetorA[i] + " e vetor B: " + vetorB[i]);
        }
        
        
    }
}
