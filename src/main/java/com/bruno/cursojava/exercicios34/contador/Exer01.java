package main.java.com.bruno.cursojava.exercicios34.contador;

public class Exer01 {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        System.out.println(Contador.getQtdContador());

        c3.incrementarContador(4);
    }
}
