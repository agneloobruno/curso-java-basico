/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.cursojava.aula19lab;

/**
 *
 * @author 3714194
 */
public class Atividade03 {
    public static void main(String[] args){
        
        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        
        int[] vetorB = new int[vetorA.length];
        
        for(int i = 0; i < vetorA.length; i++){
            vetorB[i] = (int)Math.pow(vetorA[i], 2);
            System.out.println("Vetor A: " + vetorA[i] + " e vetor B: " + vetorB[i]);
        }
        
        
    }
}
