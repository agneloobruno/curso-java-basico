/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.cursojava.aula19lab;

import java.util.Scanner;

/**
 *
 * @author 3714194
 */
public class Atividade10 {
    public static void main(String[] args){
        final int TAMANHO_VETOR = 10;
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[TAMANHO_VETOR];
        int[] vetorB = new int[TAMANHO_VETOR];
        
        for(int count = 0; count < TAMANHO_VETOR;  count++){
            System.out.println("Valores a serem multiplicados: ");
            vetorA[count] = scan.nextInt();
            
            vetorB[count]= vetorA[count] % 2;
        }
        for(int count = 0; count < TAMANHO_VETOR;  count++){
            System.out.println(vetorB[count]);
        }
    }
}