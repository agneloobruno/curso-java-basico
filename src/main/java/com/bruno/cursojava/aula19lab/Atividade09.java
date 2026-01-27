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
public class Atividade09 {
    public static void main(String[] args){
        final int TAMANHO_VETOR = 10;
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[TAMANHO_VETOR];
        int[] vetorB = new int[TAMANHO_VETOR];
        int[] vetorC = new int[TAMANHO_VETOR];
        
        for(int count = 0; count < TAMANHO_VETOR;  count++){
            System.out.println("Valores a serem multiplicados: ");
            vetorA[count] = scan.nextInt();
            vetorB[count] = scan.nextInt();
            
            vetorC[count]= vetorA[count] / vetorB[count];
        }
        for(int count = 0; count < TAMANHO_VETOR;  count++){
            System.out.println(vetorC[count]);
        }
    }
}