package main.java.com.bruno.cursojava.exercicio28a33;

public class Lampada {
    //Escreva uma classe para representar uma lâmpada.
    // Desenvolva métodos para ligar, desligar a lampada.

    private String modelo;
    private String marca;
    private int potenciaWatts;
    private String cor;
    private int voltagem;
    private boolean ligada;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotenciaWatts() {
        return potenciaWatts;
    }

    public void setPotenciaWatts(int potenciaWatts) {
        this.potenciaWatts = potenciaWatts;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    boolean ligarLampada() {
        if (isLigada()){
            System.out.println("A lampada já está ligada.");
        } else {
            System.out.println("Ligando lampada.");
            setLigada(true);
        }

        return ligada;
    }

    boolean desligarLampada() {
        if (!isLigada()) {
            System.out.println("A lampada já está desligada.");
        } else {
            System.out.println("Desligando lampada.");
            setLigada(false);
        }

        return ligada;
    }

}
