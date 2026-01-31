package main.java.com.bruno.cursojava.aula31;

class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel; // Capacidade de Combustivel
    double consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro() {}

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é : " + capCombustivel * consumoCombustivel + "Km/L");
        System.out.println("O autonomia do carro foi exibido");
    }

    double obterAutonomia() {

        System.out.println("Método obterAutonomia foi chamado!");
        return capCombustivel * consumoCombustivel;
    }
}