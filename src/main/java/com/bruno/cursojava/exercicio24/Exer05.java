package main.java.com.bruno.cursojava.exercicio24;

public class Exer05 {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123";
        conta.agencia = "123";
        conta.especial = true;
        conta.limiteEspecial = 200.00;
        conta.saldo = 150.00;

        System.out.println("Saldo: " + conta.saldo );
    }
}
