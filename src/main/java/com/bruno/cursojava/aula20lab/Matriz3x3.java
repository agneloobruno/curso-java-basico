package com.bruno.cursojava.aula20lab;

import java.util.Scanner;

/**
 *
 * @author 3714194
 */
public class Matriz3x3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int TAMANHO_MAX = 3;
        int par = 0, impar = 0;
        int[][] matriz = new int[TAMANHO_MAX][TAMANHO_MAX];
        
        System.out.println("Insira nove valores aleatorios: ");
        for(int i =0; i < TAMANHO_MAX; i++){
            for(int j =0; j < TAMANHO_MAX; j++){
                
                matriz[i][j] = scan.nextInt();
            }
        }
        
        for(int i =0; i < TAMANHO_MAX; i++){
            for(int j=0; j < TAMANHO_MAX; j++){
                System.out.print("|"+matriz[i][j]+"|");
                
                if(matriz[i][j] % 2 == 0){
                    par = par + 1;
                } else {
                    impar = impar + 1;
                }
            }
            System.out.println("");
        }
        System.out.println("Quantidade de valores pares: "+ par);
        System.out.println("Quantidade de valores impares: "+impar);
    }
}
