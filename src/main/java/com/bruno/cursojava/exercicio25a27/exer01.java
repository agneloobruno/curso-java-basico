package main.java.com.bruno.cursojava.exercicio25a27;

public class exer01 {
    //Escreva uma classe para representar uma lâmpada.
    // Desenvolva métodos para ligar, desligar a lampada.
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.ligada = true;

        boolean estadoLampada = lampada.ligarLampada();

        estadoLampada = lampada.desligarLampada();
    }


}
