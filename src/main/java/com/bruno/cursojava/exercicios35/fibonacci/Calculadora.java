package main.java.com.bruno.cursojava.exercicios35.fibonacci;

public class Calculadora {


    public static int fibonacci (int num){

        if (num < 2) {
            return num;
        }

        return fibonacci(num-1)
                +
                fibonacci(num-2);

    }

    public static int somatorio(int num) {

        if(num == 0) {
            return 0;
        }

        return num + somatorio(num - 1);
    }
}
