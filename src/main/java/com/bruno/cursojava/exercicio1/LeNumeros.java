/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.cursojava.exercicio1;

import java.util.Scanner;

/**
 *
 * @author 3714194
 */
public class LeNumeros {
    public static void main(String[] args){
        System.out.println("Escreva um número: ");
        Scanner scan = new Scanner(System.in);
        
        int numero = scan.nextInt();
        
        System.out.println("O número informado foi " + numero);
    }
}
