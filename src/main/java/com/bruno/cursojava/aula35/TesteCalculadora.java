package main.java.com.bruno.cursojava.aula35;

import static main.java.com.bruno.cursojava.exercicios34.imprimirtela.ImprimirTela.imprimirTela;

public class TesteCalculadora {

    public static void main(String[] args) {
        System.out.println("Fatorial não recursivo: ");
        imprimirTela(Calculadora.fatorialNaoRecursivo(5));
        System.out.println("+++++++++++++++++++++++++++++++++");


        System.out.println("Fatorial recursivo: ");
        imprimirTela(Calculadora.fatorial(5));
    }
}
