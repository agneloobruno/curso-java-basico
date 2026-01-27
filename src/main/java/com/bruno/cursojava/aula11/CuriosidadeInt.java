/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.cursojava.aula11;

/**
 *
 * @author 3714194
 */
public class CuriosidadeInt {
    public static void main(String[] args){
        
        int var01 = 2147483647;//Limite máximo do tipo int
        
        int var02 = 1;
        
        System.out.println(var01 + var02);//Soma mais 100 ao limite máximo
        
        
        //Saída: -2147483648
        //Por que a saída é de -2147483648?
        //Porque os tipos em Java são como uma roleta, ao atingirmos seu limite
        //os números voltam para o maior contrário
    }
    
}
