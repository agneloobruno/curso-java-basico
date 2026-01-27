package com.bruno.cursojava.aula20lab;

import java.util.Random;

/**
 *
 * @author 3714194
 */
public class Matriz10x10 {
    public static void main(String[] args) {
        final int TAMANHO_MAX = 10, MAIOR_MENOR_VALOR = 2;
        int[][] matriz = new int[TAMANHO_MAX][TAMANHO_MAX];
        Random random = new Random();
        int maiorL5 = 0, menorL5 =101;
        
        for(int i=0; i < TAMANHO_MAX; i++){
            for(int j=0; j<TAMANHO_MAX; j++){
                matriz[i][j] = random.nextInt(100);
                System.out.print("|"+matriz[i][j]+"|");
            }
            System.out.println();
        }
        
        int linha5 = 5;
        for(int i=0; i<matriz[linha5].length; i++){
            if (matriz[linha5][i] > maiorL5){
                maiorL5 = matriz[linha5][i];
            }
            if(matriz[linha5][i]< menorL5){
                menorL5 = matriz[linha5][i];
            }
        }
        
        int coluna7 = 7;
        int maiorC7 = 0;
        int menorC7 =101;
        for(int i=0; i<matriz.length; i++){
            if (matriz[i][coluna7] > maiorC7){
                maiorC7 = matriz[i][coluna7];
            }
            if(matriz[i][coluna7]< menorC7){
                menorC7 = matriz[i][coluna7];
            }
        }
        
        System.out.println("Maior valor da linha 5: "+maiorL5+"\nMenor valor da linha 5: "+menorL5);
        System.out.println();
        System.out.println("Maior valor da coluna 7: "+maiorC7+"\nMenor valor da coluna 7: "+menorC7);

    }
}
