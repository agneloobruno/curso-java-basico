/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.cursojava.aula13;

/**
 *
 * @author 3714194
 */
public class OperadoresAritmeticos {
    public static void main(String[] args){
        int resultado = 1 + 2;
        System.out.println(resultado);
        
        resultado = resultado - 1;
        System.out.println(resultado);
        
        resultado = resultado * 2;
        System.out.println(resultado);
        
        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);
        
        resultado = resultado % 7;
        System.out.println(resultado);
        
        String primeiraString = "Esta é";
        String segundaString = "uma string concatenada";
        String terceiraString = primeiraString + segundaString;
        System.out.println(terceiraString);
        
        resultado = resultado + 1;
        System.out.println(resultado);
        
        resultado++;
        System.out.println(resultado);
        
        //5
        System.out.println(resultado++);
        /*
            Mesma coisa que eu imprimir 
            System.out.println(resultado);
            resultado = resultado + 1;
            resultado += 1;
        */
        
        System.out.println(++resultado);
        /*
            mesma coisa que
            resultado += 1;
            System.out.println(resultado);
        */
        
        resultado--;
        System.out.println(resultado);
        
        System.out.println(resultado--);
        System.out.println(--resultado);
        
    }
    
}
