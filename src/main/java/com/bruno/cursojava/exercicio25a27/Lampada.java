package main.java.com.bruno.cursojava.exercicio25a27;

public class Lampada {
    //Escreva uma classe para representar uma lâmpada.
    // Desenvolva métodos para ligar, desligar a lampada.

    String modelo;
    String marca;
    int potenciaWatts;
    String cor;
    int voltagem;
    boolean ligada;

    boolean ligarLampada() {
        if (ligada){
            System.out.println("A lampada já está ligada.");
        } else {
            System.out.println("Ligando lampada.");
            ligada = true;
        }

        return ligada;
    }

    boolean desligarLampada() {
        if (!ligada) {
            System.out.println("A lampada já está desligada.");
        } else {
            System.out.println("Desligando lampada.");
            ligada = false;
        }

        return ligada;
    }

}
