package main.java.com.bruno.cursojava.aula33;


public class TesteCarro {
    public static void main(String[] args) {

        // --- CENÁRIO 1: Usando o Construtor vázio (cria e depois configura) -----
        System.out.println(" --- Carro 1 ---");
        Carro van = new Carro();

        //PARA ESCREVER (Setters):
        //Em vez de van.marca = "Fiat"; usamos:
        van.setMarca("Fiat");
        van.setModelo("Uno");
        van.setNumPassageiros(5);
        van.setCapCombustivel(45);
        van.setConsumoCombustivel(0.2);

        //PARA LER (Getters):
        //Em vez de System.out.Println(van.marca); usamos:
        System.out.println("Marca: " + van.getMarca());
        System.out.println("Modelo: " + van.getModelo());
        System.out.println("NumPassageiros: " + van.getNumPassageiros());
        System.out.println("CapCombustivel: " + van.getCapCombustivel());

        van.exibirAutonomia();

        // --- CENÁRIO 2: Usando o Construtor com Parâmetros (já nasce pronto) ---
        System.out.println("\n---- Carro 2 ----");
        // Aqui passamos os valores DIRETO na criação, graças ao construtor
        Carro fusca = new Carro();

        //Se quisermos ler algo, continua usando o Getter:
        System.out.println("Carro criado: " + fusca.getMarca() + "\n" + fusca.getModelo() + "\n" + fusca.getNumPassageiros());

        //Se quisermos mudar algo DEPOIS de criado (ex: trocaram o motor):
        fusca.setConsumoCombustivel(0.30);

        System.out.println("Nova autonomia do Fusca: " + fusca.obterAutonomia());
    }
}
