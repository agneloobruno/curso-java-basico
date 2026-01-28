package main.java.com.bruno.cursojava.exercicio25a27;

public class ContaCorrente {

    String numeroConta;
    double saldo;
    boolean especial;
    double limite;

    double sacar(double valor){
        if (valor > saldo){
            if(especial && limite >= 0){
                limite -= valor;
                System.out.println(
                        "Sacando " + valor + " reais do Cheque Especial.\n" + "Saldo atual do Cheque Especial: R$" + limite
                );
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            saldo = saldo - valor;
            System.out.println(
                    "Sacando " + valor + " reais.\n" +
                    "Saldo atual: R$" + saldo
            );
        }
        return saldo;
    }

    double depositar(double valor) {
        saldo += valor;
        System.out.println(
                "Valor depositado: R$" + valor + "\n" +
                "Saldo atual: R$" + saldo
        );
        return saldo;
    }


}
