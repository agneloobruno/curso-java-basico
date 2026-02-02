package main.java.com.bruno.cursojava.aula35;

public class Calculadora {

    private double resultado;

    public static double somar(double a, double b){
        return a + b;
    }

    public static double subtrair(double a, double b){
        return a - b;
    }

    public static double multiplicar(double a, double b){
        return a * b;
    }

    public static double dividir(double a, double b){
        return a / b;
    }

    public static double pontecia(double a, double b){
        return Math.pow(a,b);
    }

    /**
     * Exercicio03 - Fatorial
     * O fatorial de um número
     * é calculado pela multiplicação desse número
     * por todos os seus antecessores até chegar ao número 1
     * n! = n . (n – 1) . (n – 2) . ... . (n – (n-1))!
     */
    public static int fatorialNaoRecursivo(int num){
        if (num == 0) {
            return 1;
        }

        int total = 1;
        for (int i = num; i > 1; i--){
           total *= i;
        }

        return total;
    }

    public static int fatorial(int num){

        if(num == 0){
            return 1;
        }

        return num * fatorial(num - 1);
    }


}
