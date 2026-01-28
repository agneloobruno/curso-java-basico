package main.java.com.bruno.cursojava.aula27;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
//        System.out.println("==========================================================");
//        van.exibirAutonomia();
//        System.out.println("==========================================================");
//        System.out.println("Método obterAutonomia foi chamado como valor da variável autonomia: ");
//        double autonomia = van.obterAutonomia();
//        System.out.println(autonomia);
//        System.out.println("==========================================================");
//        System.out.println("Método obterAutonomia chamado somente chamando o método:  ");
//        van.obterAutonomia();
        System.out.println("==========================================================");
        System.out.println("Método obterAutonomia chamado diretamente no sout:");
        System.out.println("A autonominia do carro é de " + van.obterAutonomia());

        double qtdCombustivel = van.calcularCombustivel(10);
        System.out.println("qtdCombustivel10 = " + qtdCombustivel);

        qtdCombustivel = van.calcularCombustivel(15);
        System.out.println("qtdCombustivel10 = " + qtdCombustivel);
    }
}
