package main.java.com.bruno.cursojava.aula24;

public class Teste {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.capCombustivel = 100;
        fusca.consumoCombustivel = 0.2;

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);

    }
}
