package main.java.com.bruno.cursojava.aula34;

public class TesteMinhaCalculadora {

    public static void main(String[] args) {

        int soma1 = MinhaCalculadora.soma(1, 2);
        System.out.println(soma1);

        int soma2 = MinhaCalculadora.soma(2, 3, 4);
        System.out.println(soma2);

        double soma3 = MinhaCalculadora.soma(3, 4);
        System.out.println(soma3);
    }
}
