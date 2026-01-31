package main.java.com.bruno.cursojava.exercicio28a33;

import java.util.Scanner;

public class exer02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente();

        conta.saldo = 1000;
        conta.numeroConta = "2586";
        conta.especial = true;
        conta.limite = 500;

        int opcao = 0;
        double valor = 0;
        do {
            System.out.println("Bem vindo ao BB Banco do Bruno!");
            System.out.println("===============================");
            System.out.println("Saldo: R$" + conta.saldo);
            if (conta.saldo == 0){
                System.out.println("Limite: R$" + conta.limite);
            }
            System.out.println("Escolha o que gostaria de faze: ");
            System.out.println("  1 - Saque");
            System.out.println("  2 - Depositar");
            System.out.println("  0 - Sair");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor que deseja sacar: ");
                    valor = scan.nextDouble();
                    conta.sacar(valor);
                    break;

                case 2:
                    System.out.println("Digite o valor que deseja depositar: ");
                    valor = scan.nextDouble();
                    conta.depositar(valor);
                    break;


                case 0:
                    System.out.println("Saindo...");
                    break;
            }
        } while (opcao != 0);
    }
}
