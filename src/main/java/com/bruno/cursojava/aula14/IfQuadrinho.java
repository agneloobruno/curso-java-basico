package com.bruno.cursojava.aula14;

import java.util.Scanner;

/**
 *
 * @author 3714194
 */
public class IfQuadrinho {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("Entre com sua idade: ");
        
        int idade = scan.nextInt();
        
        if(idade >= 18){
            System.out.println("Você é maior de idade.");
        } else { 
            System.out.println("Você não é maior de idade.");
        }
        */
        System.out.println("Entre com o preço: ");
        double valor = scan.nextDouble();
        
        if(valor <= 10){
            System.out.println("Está barato.");
        } else if(valor > 10 && valor < 15){
            System.out.println("Voce pode pedir um desconto.");
        } else if(valor >= 15 && valor < 17){
            System.out.println("Pode pesquisar um preco melhor.");
        } else if (valor >= 17){
            System.out.println("Muito caro");
        }
        
    }
}
