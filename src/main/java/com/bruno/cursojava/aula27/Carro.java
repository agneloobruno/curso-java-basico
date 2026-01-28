package main.java.com.bruno.cursojava.aula27;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel; // Capacidade de Combustivel
    double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é : " + capCombustivel * consumoCombustivel + "Km/L");
        System.out.println("O autonomia do carro foi exibido");
    }

    double obterAutonomia() {

        System.out.println("Método obterAutonomia foi chamado!");
        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km) {

        double qtdCombustivel = km/consumoCombustivel;

        return qtdCombustivel;
    }
}
