package com.bruno.cursojava.aula10;

/**
 *
 * @author Bruno Almeida
 */
public class Variaveis {
    public static void main(String[] args){
        
        //conveção Java
        int idade = 20;
        String nome = "Bruno";
        String nomeDoMeuCachorro = "Thor";
        String ano2014;
        
        //aceito, mas não utilizado
        int _idade;
        int $idade;
        
        //não é convenção Java
      
        String nome_do_meu_cachorro;
        
        idade = 25;
        nome = "Brunão";
        
        System.out.println("Idade = " + idade);
        System.out.println("Nome = " + nome);
        
        //Má prática
        int a = 10;
        String b = "Almeida";
        
        
    }
}
