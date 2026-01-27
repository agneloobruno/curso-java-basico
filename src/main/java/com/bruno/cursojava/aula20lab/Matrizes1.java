/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.cursojava.aula20lab;

import java.util.Random;

/**
 *
 * @author 3714194
 */
public class Matrizes1 {
    public static void main(String[] args) {
        final int TAMANHO_MAX = 4;
        
        int[][] matriz= new int[TAMANHO_MAX][TAMANHO_MAX];
        int maiorValor = 0, linha =0,coluna=0;
        
        Random random = new Random();
        
        for(int i = 0; i < TAMANHO_MAX; i++){
            for(int j = 0; j < TAMANHO_MAX; j++){
                matriz[i][j] = random.nextInt(33);
                System.out.print("|" + matriz[i][j] +"|");
                
                if(matriz[i][j] != matriz [0][0]){
                    if(matriz[i][j]> maiorValor){
                        maiorValor = matriz[i][j];
                        linha = i;
                        coluna=j;
                    }
                    
                }
            }
            System.out.println("");
        }
        
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Linha: " + linha + " Coluna: " + coluna);
        
    }
}
